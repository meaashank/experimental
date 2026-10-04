package androidx.compose.animation.core;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1621y0<T> implements InterfaceC1587h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1587h<T> f88256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88257b;

    public C1621y0(@NotNull InterfaceC1587h<T> interfaceC1587h, long j10) {
        this.f88256a = interfaceC1587h;
        this.f88257b = j10;
    }

    @Override // androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    public <V extends AbstractC1603p> K0<V> a(@NotNull H0<T, V> h02) {
        return new C1623z0(this.f88256a.a(h02), this.f88257b);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1621y0)) {
            return false;
        }
        C1621y0 c1621y0 = (C1621y0) obj;
        return c1621y0.f88257b == this.f88257b && kotlin.jvm.internal.G.g(c1621y0.f88256a, this.f88256a);
    }

    @NotNull
    public final InterfaceC1587h<T> f() {
        return this.f88256a;
    }

    public final long g() {
        return this.f88257b;
    }

    public int hashCode() {
        return C1550p.a(this.f88257b) + (this.f88256a.hashCode() * 31);
    }
}
