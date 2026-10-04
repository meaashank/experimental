package Xc;

import ed.InterfaceC4376a;
import java.io.InvalidObjectException;
import kotlin.L0;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class r {
    @f
    public static final Void a() throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @f
    public static final void b(InterfaceC4376a<L0> action) throws Throwable {
        G.p(action, "action");
        try {
            action.invoke();
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            G.o(thInitCause, "initCause(...)");
            throw thInitCause;
        }
    }
}
