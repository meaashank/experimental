package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 3)
public final class B<T, V extends AbstractC1603p> implements InterfaceC1579d<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f87630j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final M0<V> f87631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final H0<T, V> f87632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f87633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final V f87634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final V f87635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final V f87636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f87637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f87638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f87639i;

    public B(@NotNull M0<V> m02, @NotNull H0<T, V> h02, T t10, @NotNull V v10) {
        this.f87631a = m02;
        this.f87632b = h02;
        this.f87633c = t10;
        V vInvoke = h02.a().invoke(t10);
        this.f87634d = vInvoke;
        this.f87635e = (V) C1605q.e(v10);
        this.f87637g = (T) h02.b().invoke(m02.d(vInvoke, v10));
        long jC = m02.c(vInvoke, v10);
        this.f87638h = jC;
        V v11 = (V) C1605q.e(m02.b(jC, vInvoke, v10));
        this.f87636f = v11;
        int iB = v11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v12 = this.f87636f;
            v12.e(i10, md.u.J(v12.a(i10), -this.f87631a.a(), this.f87631a.a()));
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public boolean a() {
        return this.f87639i;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public /* synthetic */ boolean b(long j10) {
        return C1577c.a(this, j10);
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public long c() {
        return this.f87638h;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    @NotNull
    public H0<T, V> d() {
        return this.f87632b;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public T e(long j10) {
        return !C1577c.a(this, j10) ? (T) this.f87632b.b().invoke(this.f87631a.e(j10, this.f87634d, this.f87635e)) : this.f87637g;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    public T f() {
        return this.f87637g;
    }

    @Override // androidx.compose.animation.core.InterfaceC1579d
    @NotNull
    public V g(long j10) {
        return !C1577c.a(this, j10) ? (V) this.f87631a.b(j10, this.f87634d, this.f87635e) : this.f87636f;
    }

    public final T h() {
        return this.f87633c;
    }

    @NotNull
    public final V i() {
        return this.f87635e;
    }

    public B(@NotNull C<T> c10, @NotNull H0<T, V> h02, T t10, @NotNull V v10) {
        this(c10.a(h02), h02, t10, v10);
    }

    public B(@NotNull C<T> c10, @NotNull H0<T, V> h02, T t10, T t11) {
        this(c10.a(h02), h02, t10, h02.a().invoke(t11));
    }
}
