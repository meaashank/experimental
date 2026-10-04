package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 4)
public final class C1591j<T, V extends AbstractC1603p> implements X1<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88133g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final H0<T, V> f88134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f88135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public V f88136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f88137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f88138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88139f;

    public C1591j(@NotNull H0<T, V> h02, T t10, @Nullable V v10, long j10, long j11, boolean z10) {
        this.f88134a = h02;
        this.f88135b = M1.g(t10, null, 2, null);
        this.f88136c = v10 != null ? (V) C1605q.e(v10) : (V) C1593k.i(h02, t10);
        this.f88137d = j10;
        this.f88138e = j11;
        this.f88139f = z10;
    }

    public final long d() {
        return this.f88138e;
    }

    @Override // androidx.compose.runtime.X1
    public T getValue() {
        return this.f88135b.getValue();
    }

    public final long h() {
        return this.f88137d;
    }

    @NotNull
    public final H0<T, V> i() {
        return this.f88134a;
    }

    public final T j() {
        return this.f88134a.b().invoke(this.f88136c);
    }

    @NotNull
    public final V k() {
        return this.f88136c;
    }

    public final boolean l() {
        return this.f88139f;
    }

    public final void m(long j10) {
        this.f88138e = j10;
    }

    public final void n(long j10) {
        this.f88137d = j10;
    }

    public final void o(boolean z10) {
        this.f88139f = z10;
    }

    public void p(T t10) {
        this.f88135b.setValue(t10);
    }

    public final void q(@NotNull V v10) {
        this.f88136c = v10;
    }

    @NotNull
    public String toString() {
        return "AnimationState(value=" + this.f88135b.getValue() + ", velocity=" + j() + ", isRunning=" + this.f88139f + ", lastFrameTimeNanos=" + this.f88137d + ", finishedTimeNanos=" + this.f88138e + ')';
    }

    public /* synthetic */ C1591j(H0 h02, Object obj, AbstractC1603p abstractC1603p, long j10, long j11, boolean z10, int i10, C4969v c4969v) {
        this(h02, obj, (i10 & 4) != 0 ? null : abstractC1603p, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
