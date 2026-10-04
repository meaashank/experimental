package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", i = {}, l = {383}, m = "performFling", n = {}, s = {})
public final class PagerWrapperFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerWrapperFlingBehavior f92457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, kotlin.coroutines.e<? super PagerWrapperFlingBehavior$performFling$1> eVar) {
        super(eVar);
        this.f92457b = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f92456a = obj;
        this.f92458c |= Integer.MIN_VALUE;
        return this.f92457b.a(null, 0.0f, this);
    }
}
