package androidx.compose.material.ripple;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {77, 79, 80}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
public final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f98807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f98808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f98809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, kotlin.coroutines.e<? super RippleAnimation$animate$1> eVar) {
        super(eVar);
        this.f98809c = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f98808b = obj;
        this.f98810d |= Integer.MIN_VALUE;
        return this.f98809c.f(this);
    }
}
