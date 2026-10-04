package androidx.compose.animation.core;

import androidx.compose.runtime.M1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2185:1\n81#2:2186\n107#2,2:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n127#1:2186\n127#1:2187,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 2)
public abstract class F0<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87664b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87665a;

    public /* synthetic */ F0(C4969v c4969v) {
        this();
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f87665a.getValue()).booleanValue();
    }

    public abstract void d(S s10);

    public final void e(boolean z10) {
        this.f87665a.setValue(Boolean.valueOf(z10));
    }

    public abstract void f(S s10);

    public abstract void g(@NotNull Transition<S> transition);

    public abstract void h();

    public F0() {
        this.f87665a = M1.g(Boolean.FALSE, null, 2, null);
    }
}
