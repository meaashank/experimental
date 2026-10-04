package androidx.compose.foundation.gestures;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableKt$NoOpOnDragStopped$1 extends SuspendLambda implements ed.q<L, Float, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89626a;

    public DraggableKt$NoOpOnDragStopped$1(kotlin.coroutines.e<? super DraggableKt$NoOpOnDragStopped$1> eVar) {
        super(3, eVar);
    }

    @Nullable
    public final Object e(@NotNull L l10, float f10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return new DraggableKt$NoOpOnDragStopped$1(3, eVar).invokeSuspend(L0.f217464a);
    }

    @Override // ed.q
    public /* bridge */ /* synthetic */ Object invoke(L l10, Float f10, kotlin.coroutines.e<? super L0> eVar) {
        return e(l10, f10.floatValue(), eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f89626a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return L0.f217464a;
    }
}
