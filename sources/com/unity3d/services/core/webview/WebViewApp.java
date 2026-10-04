package com.unity3d.services.core.webview;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import androidx.compose.animation.core.E0;
import com.android.launcher3.IconCache;
import com.google.android.gms.auth.a;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private Configuration _configuration;
    private WebView _webView;
    private static final AtomicReference<Boolean> _initialized = new AtomicReference<>(Boolean.FALSE);
    private static final AtomicReference<String> _webAppFailureMessage = new AtomicReference<>();
    private static final AtomicReference<Integer> _webAppFailureCode = new AtomicReference<>();
    private boolean _webAppLoaded = false;
    private final HashMap<String, NativeCallback> _nativeCallbacks = new HashMap<>();

    public static class WebAppClient extends WebViewClient {
        private WebAppClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceError != null) {
                DeviceLog.error("Unity Ads SDK encountered an error (code: " + webResourceError.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest.getUrl());
                return;
            }
            if (webResourceRequest == null) {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
                return;
            }
            DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            SDKMetrics.getInstance().sendEvent("native_webview_render_process_gone", new HashMap<String, String>(renderProcessGoneDetail) { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.2
                final /* synthetic */ RenderProcessGoneDetail val$detail;

                {
                    this.val$detail = renderProcessGoneDetail;
                    if (Build.VERSION.SDK_INT >= 26) {
                        put("dc", "" + renderProcessGoneDetail.didCrash());
                        put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + str);
            return false;
        }
    }

    public WebViewApp(Configuration configuration, boolean z10, boolean z11) {
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        WebView webViewWithCache = z10 ? new WebViewWithCache(ClientProperties.getApplicationContext(), z11) : new WebView(ClientProperties.getApplicationContext(), z11);
        this._webView = webViewWithCache;
        webViewWithCache.setWebViewClient(new WebAppClient());
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) {
        String string = jSONArray.toString();
        return E0.a(a.a(string.length() + str2.length() + str.length() + 22, "javascript:window.", str, IconCache.EMPTY_CLASS_NAME, str2), "(", string, ");");
    }

    public static ErrorState create(Configuration configuration) throws IllegalThreadStateException {
        return create(configuration, false);
    }

    private static ErrorState createWithRemoteUrl(final Configuration configuration) {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Configuration configuration2 = configuration;
                    WebViewApp webViewApp = new WebViewApp(configuration2, true, configuration2.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(configuration.getWebViewUrl(), configuration).getUrlWithQueryString());
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception unused) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z10 = false;
        boolean z11 = getCurrentApp() != null;
        if (z11 && getCurrentApp().isWebAppInitialized()) {
            z10 = true;
        }
        if (zBlock && z11 && z10) {
            return null;
        }
        return !zBlock ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) {
        String strBuildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", strBuildInvokeJavascript);
        getWebView().invokeJavascript(strBuildInvokeJavascript);
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public void addCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        return webAppFailureCode == 1 ? ErrorState.CreateWebviewGameIdDisabled : webAppFailureCode == 2 ? ErrorState.CreateWebviewConfigError : webAppFailureCode == 3 ? ErrorState.CreateWebviewInvalidArgument : ErrorState.CreateWebview;
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            int size = responses.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList<Object> arrayList = responses.get(i10);
                i10++;
                ArrayList<Object> arrayList2 = arrayList;
                CallbackStatus callbackStatus = (CallbackStatus) arrayList2.get(0);
                Enum r72 = (Enum) arrayList2.get(1);
                Object[] objArr = (Object[]) arrayList2.get(2);
                String str = (String) objArr[0];
                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(str);
                arrayList3.add(callbackStatus.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r72 != null) {
                    jSONArray2.put(r72.name());
                }
                for (Object obj : objArrCopyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList3.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    jSONArray3.put(obj2);
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Exception e10) {
            DeviceLog.exception("Error while invoking batch response for WebView", e10);
        }
        return true;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Exception e10) {
            DeviceLog.exception("Error invoking javascript method", e10);
            return false;
        }
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(Boolean.FALSE);
    }

    public boolean sendEvent(Enum r42, Enum r52, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r42.name());
        jSONArray.put(r52.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Exception e10) {
            DeviceLog.exception("Error while sending event to WebView", e10);
            return false;
        }
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    public void setWebAppFailureCode(int i10) {
        _webAppFailureCode.set(Integer.valueOf(i10));
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppInitialized(boolean z10) {
        _initialized.set(Boolean.valueOf(z10));
        _conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z10) {
        this._webAppLoaded = z10;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    public static ErrorState create(final Configuration configuration, boolean z10) throws IllegalThreadStateException {
        DeviceLog.entered();
        if (z10) {
            return createWithRemoteUrl(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Configuration configuration2 = configuration;
                    WebViewApp webViewApp = new WebViewApp(configuration2, configuration2.getExperiments().isWebAssetAdCaching(), configuration.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadDataWithBaseURL(new WebViewUrlBuilder(R3.a.f67727e + SdkProperties.getLocalWebViewFile(), configuration).getUrlWithQueryString(), configuration.getWebViewData(), "text/html", "UTF-8", null);
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception unused) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z11 = false;
        boolean z12 = getCurrentApp() != null;
        if (z12 && getCurrentApp().isWebAppInitialized()) {
            z11 = true;
        }
        if (zBlock && z12 && z11) {
            return null;
        }
        return !zBlock ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    public WebViewApp() {
    }
}
