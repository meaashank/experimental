package I2;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: I2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1181i0 implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f51017a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51018b = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @Override // I2.K0
    @NonNull
    public String[] a() {
        return f51017a;
    }

    @Override // I2.K0
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(f51018b);
    }

    @Override // I2.K0
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(f51018b);
    }
}
