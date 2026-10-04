package com.unity3d.services.core.domain.task;

import Vc.d;
import com.unity3d.services.core.request.WebRequest;
import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends SuspendLambda implements p<L, e<? super String>, Object> {
    final /* synthetic */ Ref.ObjectRef $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(Ref.ObjectRef objectRef, e eVar) {
        super(2, eVar);
        this.$request = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final e<L0> create(@Nullable Object obj, @NotNull e<?> completion) {
        G.p(completion, "completion");
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.$request, completion);
    }

    @Override // ed.p
    public final Object invoke(L l10, e<? super String> eVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return ((WebRequest) this.$request.f217904a).makeRequest();
    }
}
