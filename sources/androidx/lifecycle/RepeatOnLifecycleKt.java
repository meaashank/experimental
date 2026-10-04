package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {
    @Nullable
    public static final Object a(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.d() == Lifecycle.State.DESTROYED) {
            return L0.f217464a;
        }
        Object objG = kotlinx.coroutines.M.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    @Nullable
    public static final Object b(@NotNull B b10, @NotNull Lifecycle.State state, @NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objA = a(b10.getLifecycle(), state, pVar, eVar);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : L0.f217464a;
    }
}
