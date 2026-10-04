package I2;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1185k0 extends H2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f51020a;

    public C1185k0(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f51020a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new C1185k0(jsReplyProxyBoundaryInterface);
    }

    @NonNull
    public static C1185k0 d(@NonNull InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C1185k0) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: I2.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1185k0(jsReplyProxyBoundaryInterface);
            }
        });
    }

    @Override // H2.c
    public void a(@NonNull String str) {
        if (!H0.f50943U.d()) {
            throw H0.a();
        }
        this.f51020a.postMessage(str);
    }

    @Override // H2.c
    public void b(@NonNull byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!H0.f50925C.d()) {
            throw H0.a();
        }
        this.f51020a.postMessageWithPayload(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new C0(bArr)));
    }
}
