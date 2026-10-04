package androidx.compose.ui.platform;

import androidx.compose.runtime.ActualAndroid_androidKt;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,444:1\n79#2:445\n112#2,2:446\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n442#1:445\n442#1:446,2\n*E\n"})
public final class C2292x0 implements androidx.compose.ui.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f103946a = ActualAndroid_androidKt.b(1.0f);

    @Override // androidx.compose.ui.t
    public float G1() {
        return this.f103946a.getFloatValue();
    }

    public void d(float f10) {
        this.f103946a.setFloatValue(f10);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // androidx.compose.ui.t, kotlin.coroutines.i.b
    public i.c getKey() {
        return androidx.compose.ui.t.f104180N2;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }
}
