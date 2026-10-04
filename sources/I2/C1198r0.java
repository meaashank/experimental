package I2;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* JADX INFO: renamed from: I2.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1198r0 implements ServiceWorkerClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.j f51028a;

    public C1198r0(@NonNull H2.j jVar) {
        this.f51028a = jVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.f51028a.a(webResourceRequest);
    }
}
