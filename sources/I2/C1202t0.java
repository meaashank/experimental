package I2;

import I2.AbstractC1164a;
import I2.I0;
import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1202t0 extends H2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceWorkerWebSettings f51032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceWorkerWebSettingsBoundaryInterface f51033b;

    public C1202t0(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f51032a = serviceWorkerWebSettings;
    }

    @Override // H2.l
    public boolean a() {
        AbstractC1164a.c cVar = H0.f50970m;
        if (cVar.c()) {
            return l().getAllowContentAccess();
        }
        if (cVar.d()) {
            return k().getAllowContentAccess();
        }
        throw H0.a();
    }

    @Override // H2.l
    public boolean b() {
        AbstractC1164a.c cVar = H0.f50971n;
        if (cVar.c()) {
            return l().getAllowFileAccess();
        }
        if (cVar.d()) {
            return k().getAllowFileAccess();
        }
        throw H0.a();
    }

    @Override // H2.l
    public boolean c() {
        AbstractC1164a.c cVar = H0.f50972o;
        if (cVar.c()) {
            return l().getBlockNetworkLoads();
        }
        if (cVar.d()) {
            return k().getBlockNetworkLoads();
        }
        throw H0.a();
    }

    @Override // H2.l
    public int d() {
        AbstractC1164a.c cVar = H0.f50969l;
        if (cVar.c()) {
            return l().getCacheMode();
        }
        if (cVar.d()) {
            return k().getCacheMode();
        }
        throw H0.a();
    }

    @Override // H2.l
    @NonNull
    public Set<String> e() {
        if (H0.f50950a0.d()) {
            return k().getRequestedWithHeaderOriginAllowList();
        }
        throw H0.a();
    }

    @Override // H2.l
    public void f(boolean z10) {
        AbstractC1164a.c cVar = H0.f50970m;
        if (cVar.c()) {
            l().setAllowContentAccess(z10);
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            k().setAllowContentAccess(z10);
        }
    }

    @Override // H2.l
    public void g(boolean z10) {
        AbstractC1164a.c cVar = H0.f50971n;
        if (cVar.c()) {
            l().setAllowFileAccess(z10);
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            k().setAllowFileAccess(z10);
        }
    }

    @Override // H2.l
    public void h(boolean z10) {
        AbstractC1164a.c cVar = H0.f50972o;
        if (cVar.c()) {
            l().setBlockNetworkLoads(z10);
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            k().setBlockNetworkLoads(z10);
        }
    }

    @Override // H2.l
    public void i(int i10) {
        AbstractC1164a.c cVar = H0.f50969l;
        if (cVar.c()) {
            l().setCacheMode(i10);
        } else {
            if (!cVar.d()) {
                throw H0.a();
            }
            k().setCacheMode(i10);
        }
    }

    @Override // H2.l
    public void j(@NonNull Set<String> set) {
        if (!H0.f50950a0.d()) {
            throw H0.a();
        }
        k().setRequestedWithHeaderOriginAllowList(set);
    }

    public final ServiceWorkerWebSettingsBoundaryInterface k() {
        if (this.f51033b == null) {
            this.f51033b = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, I0.a.f50987a.e(this.f51032a));
        }
        return this.f51033b;
    }

    @e.T(24)
    public final ServiceWorkerWebSettings l() {
        if (this.f51032a == null) {
            this.f51032a = I0.a.f50987a.d(Proxy.getInvocationHandler(this.f51033b));
        }
        return this.f51032a;
    }

    public C1202t0(@NonNull InvocationHandler invocationHandler) {
        this.f51033b = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
