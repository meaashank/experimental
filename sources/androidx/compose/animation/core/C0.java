package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,491:1\n54#2,7:492\n1#3:499\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n271#1:492,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C0<T, V extends AbstractC1603p> implements InterfaceC1579d<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f87644j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final K0<V> f87645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final H0<T, V> f87646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f87647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f87648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public V f87649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public V f87650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final V f87651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f87652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public V f87653i;

    public C0(@NotNull K0<V> k02, @NotNull H0<T, V> h02, T t10, T t11, @Nullable V v10) {
        this.f87645a = k02;
        this.f87646b = h02;
        this.f87647c = t11;
        this.f87648d = t10;
        this.f87649e = h02.a().invoke(t10);
        this.f87650f = h02.a().invoke(t11);
        this.f87651g = v10 != null ? (V) C1605q.e(v10) : (V) h02.a().invoke(t10).c();
        this.f87652h = -1L;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public boolean a() {
        return this.f87645a.a();
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public /* synthetic */ boolean b(long j10) {
        return C1577c.a(this, j10);
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public long c() {
        if (this.f87652h < 0) {
            this.f87652h = this.f87645a.b(this.f87649e, this.f87650f, this.f87651g);
        }
        return this.f87652h;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    @NotNull
    public H0<T, V> d() {
        return this.f87646b;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public T e(long j10) {
        if (C1577c.a(this, j10)) {
            return this.f87647c;
        }
        AbstractC1603p abstractC1603pE = this.f87645a.e(j10, this.f87649e, this.f87650f, this.f87651g);
        int iB = abstractC1603pE.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC1603pE.a(i10))) {
                C1602o0.e("AnimationVector cannot contain a NaN. " + abstractC1603pE + ". Animation: " + this + ", playTimeNanos: " + j10);
                throw null;
            }
        }
        return (T) this.f87646b.b().invoke(abstractC1603pE);
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public T f() {
        return this.f87647c;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    @NotNull
    public V g(long j10) {
        return !C1577c.a(this, j10) ? (V) this.f87645a.d(j10, this.f87649e, this.f87650f, this.f87651g) : (V) i();
    }

    @NotNull
    public final K0<V> h() {
        return this.f87645a;
    }

    public final V i() {
        V v10 = this.f87653i;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.f87645a.c(this.f87649e, this.f87650f, this.f87651g);
        this.f87653i = v11;
        return v11;
    }

    public final T j() {
        return this.f87648d;
    }

    public final T k() {
        return this.f87648d;
    }

    public final T l() {
        return this.f87647c;
    }

    public final void m(T t10) {
        if (kotlin.jvm.internal.G.g(t10, this.f87648d)) {
            return;
        }
        this.f87648d = t10;
        this.f87649e = this.f87646b.a().invoke(t10);
        this.f87653i = null;
        this.f87652h = -1L;
    }

    public final void n(T t10) {
        if (kotlin.jvm.internal.G.g(this.f87647c, t10)) {
            return;
        }
        this.f87647c = t10;
        this.f87650f = this.f87646b.a().invoke(t10);
        this.f87653i = null;
        this.f87652h = -1L;
    }

    @NotNull
    public String toString() {
        return "TargetBasedAnimation: " + this.f87648d + " -> " + this.f87647c + ",initial velocity: " + this.f87651g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f87645a;
    }

    public /* synthetic */ C0(K0 k02, H0 h02, Object obj, Object obj2, AbstractC1603p abstractC1603p, int i10, C4969v c4969v) {
        this((K0<AbstractC1603p>) k02, (H0<Object, AbstractC1603p>) h02, obj, obj2, (i10 & 16) != 0 ? null : abstractC1603p);
    }

    public /* synthetic */ C0(InterfaceC1587h interfaceC1587h, H0 h02, Object obj, Object obj2, AbstractC1603p abstractC1603p, int i10, C4969v c4969v) {
        this((InterfaceC1587h<Object>) interfaceC1587h, (H0<Object, AbstractC1603p>) h02, obj, obj2, (i10 & 16) != 0 ? null : abstractC1603p);
    }

    public C0(@NotNull InterfaceC1587h<T> interfaceC1587h, @NotNull H0<T, V> h02, T t10, T t11, @Nullable V v10) {
        this(interfaceC1587h.a(h02), h02, t10, t11, v10);
    }
}
