package kotlinx.coroutines.flow;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class FlowKt__DistinctKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.l<Object, Object> f219492a = new ed.l<Object, Object>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // ed.l
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ed.p<Object, Object, Boolean> f219493b = new ed.p<Object, Object, Boolean>() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // ed.p
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@Nullable Object obj, @Nullable Object obj2) {
            return Boolean.valueOf(G.g(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> e<T> a(@NotNull e<? extends T> eVar) {
        return eVar instanceof u ? eVar : d(eVar, f219492a, f219493b);
    }

    @NotNull
    public static final <T> e<T> b(@NotNull e<? extends T> eVar, @NotNull ed.p<? super T, ? super T, Boolean> pVar) {
        ed.l<Object, Object> lVar = f219492a;
        G.n(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        Y.q(pVar, 2);
        return d(eVar, lVar, pVar);
    }

    @NotNull
    public static final <T, K> e<T> c(@NotNull e<? extends T> eVar, @NotNull ed.l<? super T, ? extends K> lVar) {
        return d(eVar, lVar, f219493b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> d(e<? extends T> eVar, ed.l<? super T, ? extends Object> lVar, ed.p<Object, Object, Boolean> pVar) {
        if (eVar instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) eVar;
            if (distinctFlowImpl.f219321b == lVar && distinctFlowImpl.f219322c == pVar) {
                return eVar;
            }
        }
        return new DistinctFlowImpl(eVar, lVar, pVar);
    }
}
