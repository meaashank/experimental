package A;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
public final class c {
    public static final <T> T a(@NotNull b bVar, @NotNull InterfaceC4376a<? extends T> block) {
        T tInvoke;
        G.p(bVar, "<this>");
        G.p(block, "block");
        synchronized (bVar) {
            tInvoke = block.invoke();
        }
        return tInvoke;
    }
}
