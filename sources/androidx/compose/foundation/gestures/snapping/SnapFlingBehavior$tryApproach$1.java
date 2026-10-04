package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {Opcodes.NEW}, m = "tryApproach", n = {}, s = {})
public final class SnapFlingBehavior$tryApproach$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f90064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f90065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.e<? super SnapFlingBehavior$tryApproach$1> eVar) {
        super(eVar);
        this.f90065b = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90064a = obj;
        this.f90066c |= Integer.MIN_VALUE;
        return this.f90065b.n(null, 0.0f, 0.0f, null, this);
    }
}
