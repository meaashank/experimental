package S1;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,57:1\n23#2:58\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n37#1:58\n*E\n"})
public final class f {
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
