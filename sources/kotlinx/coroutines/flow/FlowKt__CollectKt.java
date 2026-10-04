package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FlowKt__CollectKt {
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final <T> Object a(e<? extends T> eVar, ed.p<? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super L0> eVar2) {
        Object objCollect = eVar.collect(new FlowKt__CollectKt$collect$3(pVar), eVar2);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    @Nullable
    public static final Object b(@NotNull e<?> eVar, @NotNull kotlin.coroutines.e<? super L0> eVar2) {
        Object objCollect = eVar.collect(kotlinx.coroutines.flow.internal.k.f220221a, eVar2);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object c(e<? extends T> eVar, ed.p<? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super L0> eVar2) {
        eVar.collect(new FlowKt__CollectKt$collect$3(pVar), eVar2);
        return L0.f217464a;
    }

    @Nullable
    public static final <T> Object d(@NotNull e<? extends T> eVar, @NotNull ed.q<? super Integer, ? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, @NotNull kotlin.coroutines.e<? super L0> eVar2) {
        Object objCollect = eVar.collect(new FlowKt__CollectKt$collectIndexed$2(qVar), eVar2);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    public static final <T> Object e(e<? extends T> eVar, ed.q<? super Integer, ? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, kotlin.coroutines.e<? super L0> eVar2) {
        eVar.collect(new FlowKt__CollectKt$collectIndexed$2(qVar), eVar2);
        return L0.f217464a;
    }

    @Nullable
    public static final <T> Object f(@NotNull e<? extends T> eVar, @NotNull ed.p<? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar2) {
        Object objB = b(h.d(FlowKt__MergeKt.k(eVar, pVar), 0, null, 2, null), eVar2);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : L0.f217464a;
    }

    @Nullable
    public static final <T> Object g(@NotNull f<? super T> fVar, @NotNull e<? extends T> eVar, @NotNull kotlin.coroutines.e<? super L0> eVar2) {
        FlowKt__EmittersKt.b(fVar);
        Object objCollect = eVar.collect(fVar, eVar2);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }

    @NotNull
    public static final <T> A0 h(@NotNull e<? extends T> eVar, @NotNull L l10) {
        return C5092j.f(l10, null, null, new FlowKt__CollectKt$launchIn$1(eVar, null), 3, null);
    }
}
