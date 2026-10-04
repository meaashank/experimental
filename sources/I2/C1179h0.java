package I2;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: I2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(24)
public class C1179h0 extends ServiceWorkerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.j f51016a;

    public C1179h0(@NonNull H2.j jVar) {
        this.f51016a = jVar;
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.f51016a.a(webResourceRequest);
    }
}
