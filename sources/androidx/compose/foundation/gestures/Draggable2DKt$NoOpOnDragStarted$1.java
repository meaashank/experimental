package androidx.compose.foundation.gestures;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStarted$1", f = "Draggable2D.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Draggable2DKt$NoOpOnDragStarted$1 extends SuspendLambda implements ed.q<L, P.g, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89585a;

    public Draggable2DKt$NoOpOnDragStarted$1(kotlin.coroutines.e<? super Draggable2DKt$NoOpOnDragStarted$1> eVar) {
        super(3, eVar);
    }

    @Nullable
    public final Object e(@NotNull L l10, long j10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return new Draggable2DKt$NoOpOnDragStarted$1(3, eVar).invokeSuspend(L0.f217464a);
    }

    @Override // ed.q
    public /* synthetic */ Object invoke(L l10, P.g gVar, kotlin.coroutines.e<? super L0> eVar) {
        return e(l10, gVar.f65507a, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f89585a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return L0.f217464a;
    }
}
