package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f219536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.q f219537b;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(e eVar, ed.q qVar) {
        this.f219536a = eVar;
        this.f219537b = qVar;
    }

    @Nullable
    public Object c(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219539b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219538a = obj;
                this.f219539b |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        this.f219536a.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f219537b, fVar), eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super R> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objCollect = this.f219536a.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f219537b, fVar), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }
}
