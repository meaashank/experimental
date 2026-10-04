package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
public final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89661c;

    public ForEachGestureKt$awaitAllPointersUp$3(kotlin.coroutines.e<? super ForEachGestureKt$awaitAllPointersUp$3> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89660b = obj;
        this.f89661c |= Integer.MIN_VALUE;
        return ForEachGestureKt.b(null, this);
    }
}
