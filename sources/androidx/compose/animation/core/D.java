package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class D<T> implements C<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X f87654a;

    public D(@NotNull X x10) {
        this.f87654a = x10;
    }

    @Override // androidx.compose.animation.core.C
    @NotNull
    public <V extends AbstractC1603p> M0<V> a(@NotNull H0<T, V> h02) {
        return new S0(this.f87654a);
    }
}
