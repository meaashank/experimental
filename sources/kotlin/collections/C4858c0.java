package kotlin.collections;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4858c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f217602b;

    public C4858c0(int i10, T t10) {
        this.f217601a = i10;
        this.f217602b = t10;
    }

    public static C4858c0 d(C4858c0 c4858c0, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = c4858c0.f217601a;
        }
        if ((i11 & 2) != 0) {
            obj = c4858c0.f217602b;
        }
        c4858c0.getClass();
        return new C4858c0(i10, obj);
    }

    public final int a() {
        return this.f217601a;
    }

    public final T b() {
        return this.f217602b;
    }

    @NotNull
    public final C4858c0<T> c(int i10, T t10) {
        return new C4858c0<>(i10, t10);
    }

    public final int e() {
        return this.f217601a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858c0)) {
            return false;
        }
        C4858c0 c4858c0 = (C4858c0) obj;
        return this.f217601a == c4858c0.f217601a && kotlin.jvm.internal.G.g(this.f217602b, c4858c0.f217602b);
    }

    public final T f() {
        return this.f217602b;
    }

    public int hashCode() {
        int i10 = this.f217601a * 31;
        T t10 = this.f217602b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.f217601a + ", value=" + this.f217602b + ')';
    }
}
