package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {123}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
public final class SnapFlingBehavior$fling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f90047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f90048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f90049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.e<? super SnapFlingBehavior$fling$1> eVar) {
        super(eVar);
        this.f90049c = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90048b = obj;
        this.f90050d |= Integer.MIN_VALUE;
        return this.f90049c.i(null, 0.0f, null, this);
    }
}
