package I2;

import I2.AbstractC1164a;
import I2.I0;
import android.webkit.SafeBrowsingResponse;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1195p0 extends H2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f51025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f51026b;

    public C1195p0(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        this.f51025a = safeBrowsingResponse;
    }

    @Override // H2.h
    public void a(boolean z10) {
        AbstractC1164a.f fVar = H0.f50981x;
        if (fVar.c()) {
            e().backToSafety(z10);
        } else {
            if (!fVar.d()) {
                throw H0.a();
            }
            d().backToSafety(z10);
        }
    }

    @Override // H2.h
    public void b(boolean z10) {
        AbstractC1164a.f fVar = H0.f50982y;
        if (fVar.c()) {
            e().proceed(z10);
        } else {
            if (!fVar.d()) {
                throw H0.a();
            }
            d().proceed(z10);
        }
    }

    @Override // H2.h
    public void c(boolean z10) {
        AbstractC1164a.f fVar = H0.f50983z;
        if (fVar.c()) {
            e().showInterstitial(z10);
        } else {
            if (!fVar.d()) {
                throw H0.a();
            }
            d().showInterstitial(z10);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface d() {
        if (this.f51026b == null) {
            this.f51026b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, I0.a.f50987a.c(this.f51025a));
        }
        return this.f51026b;
    }

    @e.T(27)
    public final SafeBrowsingResponse e() {
        if (this.f51025a == null) {
            this.f51025a = I0.a.f50987a.b(Proxy.getInvocationHandler(this.f51026b));
        }
        return this.f51025a;
    }

    public C1195p0(@NonNull InvocationHandler invocationHandler) {
        this.f51026b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }
}
