package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {110}, m = "performFling", n = {}, s = {})
public final class SnapFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f90061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f90062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$performFling$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.e<? super SnapFlingBehavior$performFling$1> eVar) {
        super(eVar);
        this.f90062b = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90061a = obj;
        this.f90063c |= Integer.MIN_VALUE;
        return this.f90062b.b(null, 0.0f, null, this);
    }
}
