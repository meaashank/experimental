package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {379}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
public final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f90080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f90081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f90082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f90083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f90084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90085f;

    public SnapFlingBehaviorKt$animateWithTarget$1(kotlin.coroutines.e<? super SnapFlingBehaviorKt$animateWithTarget$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90084e = obj;
        this.f90085f |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.h(null, 0.0f, 0.0f, null, null, null, this);
    }
}
