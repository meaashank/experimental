package I2;

import I2.I0;
import android.webkit.WebResourceError;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class E0 extends H2.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebResourceError f50919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f50920b;

    public E0(@NonNull WebResourceError webResourceError) {
        this.f50919a = webResourceError;
    }

    @Override // H2.q
    @NonNull
    public CharSequence a() {
        H0.f50979v.getClass();
        return d().getDescription();
    }

    @Override // H2.q
    public int b() {
        H0.f50980w.getClass();
        return d().getErrorCode();
    }

    public final WebResourceErrorBoundaryInterface c() {
        if (this.f50920b == null) {
            this.f50920b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, I0.a.f50987a.j(this.f50919a));
        }
        return this.f50920b;
    }

    @e.T(23)
    public final WebResourceError d() {
        if (this.f50919a == null) {
            this.f50919a = I0.a.f50987a.i(Proxy.getInvocationHandler(this.f50920b));
        }
        return this.f50919a;
    }

    public E0(@NonNull InvocationHandler invocationHandler) {
        this.f50920b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }
}
