package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n*L\n1#1,111:1\n*E\n"})
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements kotlinx.coroutines.flow.e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.e<? super L0>, Object> f220202a;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(p<? super kotlinx.coroutines.flow.f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f220202a = pVar;
    }

    @Nullable
    public Object c(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull final kotlin.coroutines.e<? super L0> eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f220203a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f220205c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f220203a = obj;
                this.f220205c |= Integer.MIN_VALUE;
                return this.f220204b.collect(null, this);
            }
        };
        this.f220202a.invoke(fVar, eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objInvoke = this.f220202a.invoke(fVar, eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }
}
