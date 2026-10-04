package kotlinx.coroutines.internal;

import ed.InterfaceC4376a;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,29:1\n16#2:30\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n27#1:30\n*E\n"})
public final class T {
    @InterfaceC5120x0
    public static final <T> T a(@NotNull Object obj, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T tInvoke;
        synchronized (obj) {
            tInvoke = interfaceC4376a.invoke();
        }
        return tInvoke;
    }
}
