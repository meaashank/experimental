package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class Y<T> implements i2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99403b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L0<T> f99404a;

    public Y(@NotNull L0<T> l02) {
        this.f99404a = l02;
    }

    public static Y e(Y y10, L0 l02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l02 = y10.f99404a;
        }
        y10.getClass();
        return new Y(l02);
    }

    @Override // androidx.compose.runtime.i2
    @NotNull
    public C1888b1<T> a(@NotNull A<T> a10) {
        return new C1888b1<>(a10, null, false, null, this.f99404a, null, true);
    }

    @Override // androidx.compose.runtime.i2
    public T b(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f99404a.getValue();
    }

    @NotNull
    public final L0<T> c() {
        return this.f99404a;
    }

    @NotNull
    public final Y<T> d(@NotNull L0<T> l02) {
        return new Y<>(l02);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && kotlin.jvm.internal.G.g(this.f99404a, ((Y) obj).f99404a);
    }

    @NotNull
    public final L0<T> f() {
        return this.f99404a;
    }

    public int hashCode() {
        return this.f99404a.hashCode();
    }

    @NotNull
    public String toString() {
        return "DynamicValueHolder(state=" + this.f99404a + ')';
    }
}
