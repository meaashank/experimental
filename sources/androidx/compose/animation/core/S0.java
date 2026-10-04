package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class S0<V extends AbstractC1603p> implements M0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X f87785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f87786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f87787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f87788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f87789e;

    public S0(@NotNull X x10) {
        this.f87785a = x10;
        this.f87789e = x10.a();
    }

    @Override // androidx.compose.animation.core.M0
    public float a() {
        return this.f87789e;
    }

    @Override // androidx.compose.animation.core.M0
    @NotNull
    public V b(long j10, @NotNull V v10, @NotNull V v11) {
        if (this.f87787c == null) {
            this.f87787c = (V) v10.c();
        }
        V v12 = this.f87787c;
        if (v12 == null) {
            kotlin.jvm.internal.G.S("velocityVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f87787c;
            if (v13 == null) {
                kotlin.jvm.internal.G.S("velocityVector");
                throw null;
            }
            v13.e(i10, this.f87785a.b(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f87787c;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.G.S("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.M0
    public long c(@NotNull V v10, @NotNull V v11) {
        if (this.f87787c == null) {
            this.f87787c = (V) v10.c();
        }
        V v12 = this.f87787c;
        if (v12 == null) {
            kotlin.jvm.internal.G.S("velocityVector");
            throw null;
        }
        int iB = v12.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f87785a.c(v10.a(i10), v11.a(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.M0
    @NotNull
    public V d(@NotNull V v10, @NotNull V v11) {
        if (this.f87788d == null) {
            this.f87788d = (V) v10.c();
        }
        V v12 = this.f87788d;
        if (v12 == null) {
            kotlin.jvm.internal.G.S("targetVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f87788d;
            if (v13 == null) {
                kotlin.jvm.internal.G.S("targetVector");
                throw null;
            }
            v13.e(i10, this.f87785a.d(v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f87788d;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.G.S("targetVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.M0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11) {
        if (this.f87786b == null) {
            this.f87786b = (V) v10.c();
        }
        V v12 = this.f87786b;
        if (v12 == null) {
            kotlin.jvm.internal.G.S("valueVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f87786b;
            if (v13 == null) {
                kotlin.jvm.internal.G.S("valueVector");
                throw null;
            }
            v13.e(i10, this.f87785a.e(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f87786b;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.G.S("valueVector");
        throw null;
    }

    @NotNull
    public final X f() {
        return this.f87785a;
    }
}
