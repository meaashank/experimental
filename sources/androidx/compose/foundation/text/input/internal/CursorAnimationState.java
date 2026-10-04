package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.ActualAndroid_androidKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.A0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,97:1\n79#2:98\n112#2,2:99\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:98\n44#1:99,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class CursorAnimationState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93695c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public AtomicReference<kotlinx.coroutines.A0> f93696a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f93697b = ActualAndroid_androidKt.b(0.0f);

    public final void c() {
        kotlinx.coroutines.A0 andSet = this.f93696a.getAndSet(null);
        if (andSet != null) {
            A0.a.b(andSet, null, 1, null);
        }
    }

    public final float d() {
        return this.f93697b.getFloatValue();
    }

    public final void e(float f10) {
        this.f93697b.setFloatValue(f10);
    }

    @Nullable
    public final Object f(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objG = kotlinx.coroutines.M.g(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }
}
