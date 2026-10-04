package androidx.compose.foundation.text.handwriting;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", f = "HandwritingHandler.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HandwritingHandlerNode$onFocusEvent$1 extends SuspendLambda implements p<L, e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandwritingHandlerNode f93582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingHandlerNode$onFocusEvent$1(HandwritingHandlerNode handwritingHandlerNode, e<? super HandwritingHandlerNode$onFocusEvent$1> eVar) {
        super(2, eVar);
        this.f93582b = handwritingHandlerNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final e<L0> create(@Nullable Object obj, @NotNull e<?> eVar) {
        return new HandwritingHandlerNode$onFocusEvent$1(this.f93582b, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f93581a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        this.f93582b.f3().h();
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable e<? super L0> eVar) {
        return ((HandwritingHandlerNode$onFocusEvent$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
