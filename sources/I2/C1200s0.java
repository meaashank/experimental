package I2;

import I2.AbstractC1164a;
import I2.I0;
import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1200s0 extends H2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceWorkerController f51029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceWorkerControllerBoundaryInterface f51030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.l f51031c;

    public C1200s0() {
        AbstractC1164a.c cVar = H0.f50968k;
        if (cVar.c()) {
            this.f51029a = ServiceWorkerController.getInstance();
            this.f51030b = null;
            this.f51031c = r.i(e());
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            this.f51029a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = I0.b.f50988a.getServiceWorkerController();
            this.f51030b = serviceWorkerController;
            this.f51031c = new C1202t0(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    @Override // H2.k
    @NonNull
    public H2.l b() {
        return this.f51031c;
    }

    @Override // H2.k
    public void c(@Nullable H2.j jVar) {
        AbstractC1164a.c cVar = H0.f50968k;
        if (cVar.c()) {
            if (jVar == null) {
                e().setServiceWorkerClient(null);
                return;
            } else {
                r.q(e(), jVar);
                return;
            }
        }
        if (!cVar.d()) {
            throw H0.a();
        }
        if (jVar == null) {
            d().setServiceWorkerClient(null);
        } else {
            d().setServiceWorkerClient(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new C1198r0(jVar)));
        }
    }

    public final ServiceWorkerControllerBoundaryInterface d() {
        if (this.f51030b == null) {
            this.f51030b = I0.b.f50988a.getServiceWorkerController();
        }
        return this.f51030b;
    }

    @e.T(24)
    public final ServiceWorkerController e() {
        if (this.f51029a == null) {
            this.f51029a = ServiceWorkerController.getInstance();
        }
        return this.f51029a;
    }
}
