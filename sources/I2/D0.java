package I2;

import H2.p;
import I2.AbstractC1164a;
import I2.I0;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class D0 extends H2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebMessagePort f50917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f50918b;

    public D0(@NonNull WebMessagePort webMessagePort) {
        this.f50917a = webMessagePort;
    }

    @NonNull
    @e.T(23)
    public static WebMessage g(@NonNull H2.o oVar) {
        return C1166b.b(oVar);
    }

    @Nullable
    @e.T(23)
    public static WebMessagePort[] h(@Nullable H2.p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        int length = pVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = pVarArr[i10].b();
        }
        return webMessagePortArr;
    }

    @NonNull
    @e.T(23)
    public static H2.o i(@NonNull WebMessage webMessage) {
        return C1166b.d(webMessage);
    }

    @Nullable
    public static H2.p[] l(@Nullable WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        H2.p[] pVarArr = new H2.p[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            pVarArr[i10] = new D0(webMessagePortArr[i10]);
        }
        return pVarArr;
    }

    @Override // H2.p
    public void a() {
        H0.f50924B.getClass();
        k().close();
    }

    @Override // H2.p
    @NonNull
    @e.T(23)
    public WebMessagePort b() {
        return k();
    }

    @Override // H2.p
    @NonNull
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(j());
    }

    @Override // H2.p
    public void d(@NonNull H2.o oVar) {
        AbstractC1164a.b bVar = H0.f50923A;
        bVar.getClass();
        if (oVar.e() == 0) {
            k().postMessage(C1166b.b(oVar));
        } else {
            if (!bVar.d() || !z0.a(oVar.e())) {
                throw H0.a();
            }
            j().postMessage(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new z0(oVar)));
        }
    }

    @Override // H2.p
    public void e(@NonNull p.a aVar) {
        if (H0.f50926D.d()) {
            j().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new A0(aVar)));
        } else {
            C1166b.l(k(), aVar);
        }
    }

    @Override // H2.p
    public void f(@Nullable Handler handler, @NonNull p.a aVar) {
        if (H0.f50927E.d()) {
            j().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new A0(aVar)), handler);
        } else {
            C1166b.m(k(), aVar, handler);
        }
    }

    public final WebMessagePortBoundaryInterface j() {
        if (this.f50918b == null) {
            this.f50918b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, I0.a.f50987a.h(this.f50917a));
        }
        return this.f50918b;
    }

    @e.T(23)
    public final WebMessagePort k() {
        if (this.f50917a == null) {
            this.f50917a = I0.a.f50987a.g(Proxy.getInvocationHandler(this.f50918b));
        }
        return this.f50917a;
    }

    public D0(@NonNull InvocationHandler invocationHandler) {
        this.f50918b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
