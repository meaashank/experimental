package S1;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static final <T> T a(@NotNull e lock, @NotNull InterfaceC4376a<? extends T> action) {
        T tInvoke;
        G.p(lock, "lock");
        G.p(action, "action");
        synchronized (lock) {
            tInvoke = action.invoke();
        }
        return tInvoke;
    }
}
