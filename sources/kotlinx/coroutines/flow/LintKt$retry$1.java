package kotlinx.coroutines.flow;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nLint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lint.kt\nkotlinx/coroutines/flow/LintKt$retry$1\n*L\n1#1,189:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LintKt$retry$1 extends SuspendLambda implements ed.p<Throwable, kotlin.coroutines.e<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220008a;

    public LintKt$retry$1(kotlin.coroutines.e<? super LintKt$retry$1> eVar) {
        super(2, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new LintKt$retry$1(2, eVar);
    }

    @Nullable
    public final Object e(@NotNull Throwable th, @Nullable kotlin.coroutines.e<? super Boolean> eVar) throws Throwable {
        ((LintKt$retry$1) create(th, eVar)).invokeSuspend(L0.f217464a);
        return Boolean.TRUE;
    }

    @Override // ed.p
    public /* bridge */ /* synthetic */ Object invoke(Throwable th, kotlin.coroutines.e<? super Boolean> eVar) throws Throwable {
        e(th, eVar);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f220008a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return Boolean.TRUE;
    }
}
