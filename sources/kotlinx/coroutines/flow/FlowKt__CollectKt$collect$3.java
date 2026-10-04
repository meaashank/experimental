package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,114:1\n*E\n"})
public final class FlowKt__CollectKt$collect$3<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ed.p<T, kotlin.coroutines.e<? super L0>, Object> f219405a;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(ed.p<? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f219405a = pVar;
    }

    @Nullable
    public Object a(T t10, @NotNull final kotlin.coroutines.e<? super L0> eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219406a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f219408c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219406a = obj;
                this.f219408c |= Integer.MIN_VALUE;
                return this.f219407b.emit(null, this);
            }
        };
        this.f219405a.invoke(t10, eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objInvoke = this.f219405a.invoke(t10, eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }
}
