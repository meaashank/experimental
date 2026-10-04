package io.reactivex.internal.functions;

import nc.InterfaceC5268d;
import w.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC5268d<Object, Object> f202988a = new C0757a();

    /* JADX INFO: renamed from: io.reactivex.internal.functions.a$a, reason: collision with other inner class name */
    public static final class C0757a implements InterfaceC5268d<Object, Object> {
        @Override // nc.InterfaceC5268d
        public boolean test(Object obj, Object obj2) {
            return a.c(obj, obj2);
        }
    }

    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int b(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> InterfaceC5268d<T, T> d() {
        return (InterfaceC5268d<T, T>) f202988a;
    }

    public static int e(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @Deprecated
    public static long f(long j10, String str) {
        throw new InternalError(y.a("Null check on a primitive: ", str));
    }

    public static <T> T g(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int h(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }

    public static long i(long j10, String str) {
        if (j10 > 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j10);
    }
}
