package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {363}, m = "awaitRelease", n = {}, s = {})
public final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f89677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f89678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.e<? super PressGestureScopeImpl$awaitRelease$1> eVar) {
        super(eVar);
        this.f89678b = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89677a = obj;
        this.f89679c |= Integer.MIN_VALUE;
        return this.f89678b.b2(this);
    }
}
