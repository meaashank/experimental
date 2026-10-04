package androidx.compose.foundation.gestures;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollExtensionsKt$stopScroll$2 extends SuspendLambda implements ed.p<w, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89705a;

    public ScrollExtensionsKt$stopScroll$2(kotlin.coroutines.e<? super ScrollExtensionsKt$stopScroll$2> eVar) {
        super(2, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new ScrollExtensionsKt$stopScroll$2(2, eVar);
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull w wVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(wVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f89705a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return L0.f217464a;
    }
}
