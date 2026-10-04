package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {334}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
public final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f90071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f90072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f90073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f90074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90075e;

    public SnapFlingBehaviorKt$animateDecay$1(kotlin.coroutines.e<? super SnapFlingBehaviorKt$animateDecay$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90074d = obj;
        this.f90075e |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.f(null, 0.0f, null, null, null, this);
    }
}
