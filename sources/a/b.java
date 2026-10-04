package A;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final <T> T a(@NotNull InterfaceC4376a<? extends T> block) {
        T tInvoke;
        G.p(block, "block");
        synchronized (this) {
            tInvoke = block.invoke();
        }
        return tInvoke;
    }
}
