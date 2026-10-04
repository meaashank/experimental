package I2;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f51005a;

    public V0(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f51005a = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public C1177g0 a(@NonNull CookieManager cookieManager) {
        return new C1177g0((WebViewCookieManagerBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewCookieManagerBoundaryInterface.class, this.f51005a.convertCookieManager(cookieManager)));
    }

    @NonNull
    @e.T(27)
    public SafeBrowsingResponse b(@NonNull InvocationHandler invocationHandler) {
        return T0.a(this.f51005a.convertSafeBrowsingResponse(invocationHandler));
    }

    @NonNull
    public InvocationHandler c(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.f51005a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @NonNull
    @e.T(24)
    public ServiceWorkerWebSettings d(@NonNull InvocationHandler invocationHandler) {
        return U0.a(this.f51005a.convertServiceWorkerSettings(invocationHandler));
    }

    @NonNull
    public InvocationHandler e(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f51005a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @NonNull
    public G0 f(@NonNull WebSettings webSettings) {
        return new G0((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, this.f51005a.convertSettings(webSettings)));
    }

    @NonNull
    @e.T(23)
    public WebMessagePort g(@NonNull InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f51005a.convertWebMessagePort(invocationHandler);
    }

    @NonNull
    public InvocationHandler h(@NonNull WebMessagePort webMessagePort) {
        return this.f51005a.convertWebMessagePort(webMessagePort);
    }

    @NonNull
    @e.T(23)
    public WebResourceError i(@NonNull InvocationHandler invocationHandler) {
        return (WebResourceError) this.f51005a.convertWebResourceError(invocationHandler);
    }

    @NonNull
    public InvocationHandler j(@NonNull WebResourceError webResourceError) {
        return this.f51005a.convertWebResourceError(webResourceError);
    }

    @NonNull
    public F0 k(@NonNull WebResourceRequest webResourceRequest) {
        return new F0((WebResourceRequestBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, this.f51005a.convertWebResourceRequest(webResourceRequest)));
    }
}
