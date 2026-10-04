package io.reactivex.rxjava3.internal.functions;

import Bc.d;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d<Object, Object> f207392a = new C0778a();

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.functions.a$a, reason: collision with other inner class name */
    public static final class C0778a implements d<Object, Object> {
        @Override // Bc.d
        public boolean test(Object o12, Object o22) {
            return Objects.equals(o12, o22);
        }
    }

    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> d<T, T> a() {
        return (d<T, T>) f207392a;
    }

    public static int b(int value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }

    public static long c(long value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }
}
