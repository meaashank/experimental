package I2;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1197q0 implements H2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScriptHandlerBoundaryInterface f51027a;

    public C1197q0(@NonNull ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f51027a = scriptHandlerBoundaryInterface;
    }

    @NonNull
    public static C1197q0 a(@NonNull InvocationHandler invocationHandler) {
        return new C1197q0((ScriptHandlerBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // H2.i
    public void remove() {
        this.f51027a.remove();
    }
}
