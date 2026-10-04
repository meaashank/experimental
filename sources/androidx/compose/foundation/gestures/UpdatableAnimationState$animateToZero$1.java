package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, Opcodes.I2S}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
public final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f90010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f90011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f90012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f90013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f90014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f90015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, kotlin.coroutines.e<? super UpdatableAnimationState$animateToZero$1> eVar) {
        super(eVar);
        this.f90015f = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90014e = obj;
        this.f90016g |= Integer.MIN_VALUE;
        return this.f90015f.h(null, null, this);
    }
}
