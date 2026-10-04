package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A {
    @SuppressLint({"MissingNullability"})
    public static B a(final B b10, @SuppressLint({"MissingNullability"}) final B b11) {
        Objects.requireNonNull(b11);
        return new B() { // from class: androidx.core.util.y
            @Override // androidx.core.util.B
            public /* synthetic */ B a(B b12) {
                return A.a(this, b12);
            }

            @Override // androidx.core.util.B
            public /* synthetic */ B b(B b12) {
                return A.c(this, b12);
            }

            @Override // androidx.core.util.B
            public B negate() {
                return new z(this);
            }

            @Override // androidx.core.util.B
            public final boolean test(Object obj) {
                return A.d(b10, b11, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    public static B b(B b10) {
        return new z(b10);
    }

    @SuppressLint({"MissingNullability"})
    public static B c(final B b10, @SuppressLint({"MissingNullability"}) final B b11) {
        Objects.requireNonNull(b11);
        return new B() { // from class: androidx.core.util.v
            @Override // androidx.core.util.B
            public /* synthetic */ B a(B b12) {
                return A.a(this, b12);
            }

            @Override // androidx.core.util.B
            public /* synthetic */ B b(B b12) {
                return A.c(this, b12);
            }

            @Override // androidx.core.util.B
            public B negate() {
                return new z(this);
            }

            @Override // androidx.core.util.B
            public final boolean test(Object obj) {
                return A.f(b10, b11, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(B b10, B b11, Object obj) {
        return b10.test(obj) && b11.test(obj);
    }

    public static /* synthetic */ boolean e(B b10, Object obj) {
        return !b10.test(obj);
    }

    public static /* synthetic */ boolean f(B b10, B b11, Object obj) {
        return b10.test(obj) || b11.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    public static <T> B<T> g(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new w() : new B() { // from class: androidx.core.util.x
            @Override // androidx.core.util.B
            public /* synthetic */ B a(B b10) {
                return A.a(this, b10);
            }

            @Override // androidx.core.util.B
            public /* synthetic */ B b(B b10) {
                return A.c(this, b10);
            }

            @Override // androidx.core.util.B
            public B negate() {
                return new z(this);
            }

            @Override // androidx.core.util.B
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    public static /* synthetic */ boolean h(Object obj) {
        return obj == null;
    }

    @SuppressLint({"MissingNullability"})
    public static <T> B<T> j(@SuppressLint({"MissingNullability"}) B<? super T> b10) {
        Objects.requireNonNull(b10);
        return b10.negate();
    }
}
