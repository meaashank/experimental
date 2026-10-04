package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class K<T> implements i2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99124b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<B, T> f99125a;

    /* JADX WARN: Multi-variable type inference failed */
    public K(@NotNull ed.l<? super B, ? extends T> lVar) {
        this.f99125a = lVar;
    }

    public static K e(K k10, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = k10.f99125a;
        }
        k10.getClass();
        return new K(lVar);
    }

    @Override // androidx.compose.runtime.i2
    @NotNull
    public C1888b1<T> a(@NotNull A<T> a10) {
        return new C1888b1<>(a10, null, false, null, null, this.f99125a, false);
    }

    @Override // androidx.compose.runtime.i2
    public T b(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f99125a.invoke(persistentCompositionLocalMap);
    }

    @NotNull
    public final ed.l<B, T> c() {
        return this.f99125a;
    }

    @NotNull
    public final K<T> d(@NotNull ed.l<? super B, ? extends T> lVar) {
        return new K<>(lVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && kotlin.jvm.internal.G.g(this.f99125a, ((K) obj).f99125a);
    }

    @NotNull
    public final ed.l<B, T> f() {
        return this.f99125a;
    }

    public int hashCode() {
        return this.f99125a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComputedValueHolder(compute=" + this.f99125a + ')';
    }
}
