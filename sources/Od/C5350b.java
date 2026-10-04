package od;

import dd.j;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: od.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "TimingKt")
public final class C5350b {
    public static final long a(@NotNull InterfaceC4376a<L0> block) {
        G.p(block, "block");
        long jNanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long b(@NotNull InterfaceC4376a<L0> block) {
        G.p(block, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
