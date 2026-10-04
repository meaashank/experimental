package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
public final class FlowKt__CollectKt$collectIndexed$2<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.q<Integer, T, kotlin.coroutines.e<? super L0>, Object> f219410b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(ed.q<? super Integer, ? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar) {
        this.f219410b = qVar;
    }

    @Nullable
    public Object a(T t10, @NotNull final kotlin.coroutines.e<? super L0> eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219411a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f219413c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219411a = obj;
                this.f219413c |= Integer.MIN_VALUE;
                return this.f219412b.emit(null, this);
            }
        };
        ed.q<Integer, T, kotlin.coroutines.e<? super L0>, Object> qVar = this.f219410b;
        int i10 = this.f219409a;
        this.f219409a = i10 + 1;
        if (i10 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        qVar.invoke(Integer.valueOf(i10), t10, eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        ed.q<Integer, T, kotlin.coroutines.e<? super L0>, Object> qVar = this.f219410b;
        int i10 = this.f219409a;
        this.f219409a = i10 + 1;
        if (i10 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object objInvoke = qVar.invoke(new Integer(i10), t10, eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }
}
