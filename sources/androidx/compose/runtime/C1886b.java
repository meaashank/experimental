package androidx.compose.runtime;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1886b {
    public static /* synthetic */ void a() {
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    @NotNull
    public static final String c() {
        return Thread.currentThread().getName();
    }

    public static final void d(@NotNull Object obj) {
    }

    public static final int e(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void f(@NotNull InterfaceC1946s interfaceC1946s, @NotNull ed.p<? super InterfaceC1946s, ? super Integer, kotlin.L0> pVar) {
        kotlin.jvm.internal.G.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        kotlin.jvm.internal.Y.q(pVar, 2);
        pVar.invoke(interfaceC1946s, 1);
    }

    public static final <T> T g(@NotNull InterfaceC1946s interfaceC1946s, @NotNull ed.p<? super InterfaceC1946s, ? super Integer, ? extends T> pVar) {
        kotlin.jvm.internal.G.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        kotlin.jvm.internal.Y.q(pVar, 2);
        return pVar.invoke(interfaceC1946s, 1);
    }

    @InterfaceC4850b0
    public static final <R> R h(@NotNull Object obj, @NotNull InterfaceC4376a<? extends R> interfaceC4376a) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = interfaceC4376a.invoke();
        }
        return rInvoke;
    }
}
