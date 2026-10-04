package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class Z1<T> implements i2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99407b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f99408a;

    public Z1(T t10) {
        this.f99408a = t10;
    }

    public static Z1 e(Z1 z12, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = z12.f99408a;
        }
        z12.getClass();
        return new Z1(obj);
    }

    @Override // androidx.compose.runtime.i2
    @NotNull
    public C1888b1<T> a(@NotNull A<T> a10) {
        T t10 = this.f99408a;
        return new C1888b1<>(a10, t10, t10 == null, null, null, null, false);
    }

    @Override // androidx.compose.runtime.i2
    public T b(@NotNull PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f99408a;
    }

    public final T c() {
        return this.f99408a;
    }

    @NotNull
    public final Z1<T> d(T t10) {
        return new Z1<>(t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z1) && kotlin.jvm.internal.G.g(this.f99408a, ((Z1) obj).f99408a);
    }

    public final T f() {
        return this.f99408a;
    }

    public int hashCode() {
        T t10 = this.f99408a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @NotNull
    public String toString() {
        return "StaticValueHolder(value=" + this.f99408a + ')';
    }
}
