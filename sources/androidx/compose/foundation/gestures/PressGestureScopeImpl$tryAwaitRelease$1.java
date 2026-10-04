package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {370}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f89686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.e<? super PressGestureScopeImpl$tryAwaitRelease$1> eVar) {
        super(eVar);
        this.f89686c = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89685b = obj;
        this.f89687d |= Integer.MIN_VALUE;
        return this.f89686c.J1(this);
    }
}
