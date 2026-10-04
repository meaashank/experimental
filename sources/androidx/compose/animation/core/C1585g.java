package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import androidx.compose.runtime.M1;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1585g<T, V extends AbstractC1603p> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88110j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final H0<T, V> f88111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f88112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<kotlin.L0> f88114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f88115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public V f88116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f88117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88118h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f88119i;

    public C1585g(T t10, @NotNull H0<T, V> h02, @NotNull V v10, long j10, T t11, long j11, boolean z10, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        this.f88111a = h02;
        this.f88112b = t11;
        this.f88113c = j11;
        this.f88114d = interfaceC4376a;
        this.f88115e = M1.g(t10, null, 2, null);
        this.f88116f = (V) C1605q.e(v10);
        this.f88117g = j10;
        this.f88119i = M1.g(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        m(false);
        this.f88114d.invoke();
    }

    public final long b() {
        return this.f88118h;
    }

    public final long c() {
        return this.f88117g;
    }

    public final long d() {
        return this.f88113c;
    }

    public final T e() {
        return this.f88112b;
    }

    @NotNull
    public final H0<T, V> f() {
        return this.f88111a;
    }

    public final T g() {
        return this.f88115e.getValue();
    }

    public final T h() {
        return this.f88111a.b().invoke(this.f88116f);
    }

    @NotNull
    public final V i() {
        return this.f88116f;
    }

    public final boolean j() {
        return ((Boolean) this.f88119i.getValue()).booleanValue();
    }

    public final void k(long j10) {
        this.f88118h = j10;
    }

    public final void l(long j10) {
        this.f88117g = j10;
    }

    public final void m(boolean z10) {
        this.f88119i.setValue(Boolean.valueOf(z10));
    }

    public final void n(T t10) {
        this.f88115e.setValue(t10);
    }

    public final void o(@NotNull V v10) {
        this.f88116f = v10;
    }

    @NotNull
    public final C1591j<T, V> p() {
        return new C1591j<>(this.f88111a, this.f88115e.getValue(), this.f88116f, this.f88117g, this.f88118h, j());
    }
}
