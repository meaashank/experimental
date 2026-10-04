package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.DeviceInfoReaderBuilder;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class TokenStorage {
    private static TokenStorage _instance;
    private ConcurrentLinkedQueue<String> _queue;
    private final Object _lock = new Object();
    private int _accessCounter = 0;
    private boolean _peekMode = false;
    private String _initToken = null;
    private final ExecutorService _executorService = Executors.newSingleThreadExecutor();

    private TokenStorage() {
    }

    public static TokenStorage getInstance() {
        if (_instance == null) {
            _instance = new TokenStorage();
        }
        return _instance;
    }

    private void triggerTokenAvailable(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }

    public void appendTokens(JSONArray jSONArray) throws JSONException {
        boolean zIsEmpty;
        synchronized (this._lock) {
            try {
                if (this._queue == null) {
                    this._queue = new ConcurrentLinkedQueue<>();
                    this._accessCounter = 0;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this._queue.add(jSONArray.getString(i10));
                }
                zIsEmpty = this._queue.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsEmpty) {
            return;
        }
        triggerTokenAvailable(Boolean.FALSE);
        AsyncTokenStorage.getInstance().onTokenAvailable();
    }

    public void createTokens(JSONArray jSONArray) throws JSONException {
        boolean zIsEmpty;
        synchronized (this._lock) {
            try {
                this._queue = new ConcurrentLinkedQueue<>();
                this._accessCounter = 0;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this._queue.add(jSONArray.getString(i10));
                }
                zIsEmpty = this._queue.isEmpty();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsEmpty) {
            return;
        }
        triggerTokenAvailable(Boolean.FALSE);
        AsyncTokenStorage.getInstance().onTokenAvailable();
    }

    public void deleteTokens() {
        synchronized (this._lock) {
            this._queue = null;
            this._accessCounter = 0;
        }
    }

    public void getNativeGeneratedToken() {
        new NativeTokenGenerator(this._executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.TokenStorage.1
            @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
            public void onReady(String str) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
            }
        });
    }

    public String getToken() {
        synchronized (this._lock) {
            try {
                ConcurrentLinkedQueue<String> concurrentLinkedQueue = this._queue;
                if (concurrentLinkedQueue == null) {
                    return this._initToken;
                }
                if (concurrentLinkedQueue.isEmpty()) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
                    return null;
                }
                if (this._peekMode) {
                    WebViewApp currentApp = WebViewApp.getCurrentApp();
                    WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOKEN;
                    TokenEvent tokenEvent = TokenEvent.TOKEN_ACCESS;
                    int i10 = this._accessCounter;
                    this._accessCounter = i10 + 1;
                    currentApp.sendEvent(webViewEventCategory, tokenEvent, Integer.valueOf(i10));
                    return this._queue.peek();
                }
                WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent2 = TokenEvent.TOKEN_ACCESS;
                int i11 = this._accessCounter;
                this._accessCounter = i11 + 1;
                currentApp2.sendEvent(webViewEventCategory2, tokenEvent2, Integer.valueOf(i11));
                return this._queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setInitToken(String str) {
        boolean z10;
        synchronized (this._lock) {
            this._initToken = str;
            z10 = str != null;
        }
        if (z10) {
            triggerTokenAvailable(Boolean.TRUE);
            AsyncTokenStorage.getInstance().onTokenAvailable();
        }
    }

    public void setPeekMode(boolean z10) {
        synchronized (this._lock) {
            this._peekMode = z10;
        }
    }
}
