package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {357}, m = "reset", n = {"this"}, s = {"L$0"})
public final class PressGestureScopeImpl$reset$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f89682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.e<? super PressGestureScopeImpl$reset$1> eVar) {
        super(eVar);
        this.f89682c = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89681b = obj;
        this.f89683d |= Integer.MIN_VALUE;
        return this.f89682c.E(this);
    }
}
