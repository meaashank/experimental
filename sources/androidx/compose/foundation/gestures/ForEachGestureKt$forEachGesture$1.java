package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f89668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f89669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89670e;

    public ForEachGestureKt$forEachGesture$1(kotlin.coroutines.e<? super ForEachGestureKt$forEachGesture$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89669d = obj;
        this.f89670e |= Integer.MIN_VALUE;
        return ForEachGestureKt.e(null, null, this);
    }
}
