package androidx.compose.animation.core;

import androidx.collection.C1550p;
import androidx.compose.animation.core.AbstractC1603p;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1623z0<V extends AbstractC1603p> implements K0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final K0<V> f88258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88259b;

    public C1623z0(@NotNull K0<V> k02, long j10) {
        this.f88258a = k02;
        this.f88259b = j10;
    }

    @Override // androidx.compose.animation.core.K0
    public boolean a() {
        return this.f88258a.a();
    }

    @Override // androidx.compose.animation.core.K0
    public long b(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f88258a.b(v10, v11, v12) + this.f88259b;
    }

    @Override // androidx.compose.animation.core.K0
    public AbstractC1603p c(AbstractC1603p abstractC1603p, AbstractC1603p abstractC1603p2, AbstractC1603p abstractC1603p3) {
        return d(b(abstractC1603p, abstractC1603p2, abstractC1603p3), abstractC1603p, abstractC1603p2, abstractC1603p3);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        long j11 = this.f88259b;
        return j10 < j11 ? v12 : (V) this.f88258a.d(j10 - j11, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        long j11 = this.f88259b;
        return j10 < j11 ? v10 : (V) this.f88258a.e(j10 - j11, v10, v11, v12);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1623z0)) {
            return false;
        }
        C1623z0 c1623z0 = (C1623z0) obj;
        return c1623z0.f88259b == this.f88259b && kotlin.jvm.internal.G.g(c1623z0.f88258a, this.f88258a);
    }

    public final long h() {
        return this.f88259b;
    }

    public int hashCode() {
        return C1550p.a(this.f88259b) + (this.f88258a.hashCode() * 31);
    }

    @NotNull
    public final K0<V> i() {
        return this.f88258a;
    }
}
