package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class I0<T, V extends AbstractC1603p> implements H0<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<T, V> f87670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<V, T> f87671b;

    /* JADX WARN: Multi-variable type inference failed */
    public I0(@NotNull ed.l<? super T, ? extends V> lVar, @NotNull ed.l<? super V, ? extends T> lVar2) {
        this.f87670a = lVar;
        this.f87671b = lVar2;
    }

    @Override // androidx.compose.animation.core.H0
    @NotNull
    public ed.l<T, V> a() {
        return this.f87670a;
    }

    @Override // androidx.compose.animation.core.H0
    @NotNull
    public ed.l<V, T> b() {
        return this.f87671b;
    }
}
