package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jacoco.core.runtime.AgentOptions;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f112795a = Logger.getLogger(a1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f112796b = R();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f112797c = C2518d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f112798d = q(Long.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f112799e = q(Integer.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f112800f = N();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f112801g = t0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f112802h = s0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f112803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f112804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f112805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f112806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f112807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f112808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f112809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f112810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f112811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f112812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f112813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f112814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f112815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f112816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f112817w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f112818x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f112819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f112820z;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f112821b = -1;

        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public static int A(long j10) {
            return (int) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean e(Object obj, long j10) {
            return a1.f112820z ? a1.w(obj, j10) : a1.x(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte g(Object obj, long j10) {
            return a1.f112820z ? a1.B(obj, j10) : a1.C(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public int j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public long l(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public Object o(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void q(Object obj, long j10, boolean z10) {
            if (a1.f112820z) {
                a1.e0(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                a1.f0(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void r(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void s(Object obj, long j10, byte b10) {
            if (a1.f112820z) {
                a1.e0(obj, j10, b10);
            } else {
                a1.f0(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void t(Object obj, long j10, double d10) {
            y(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void u(Object obj, long j10, float f10) {
            w(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void v(long j10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void x(long j10, long j11) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean e(Object obj, long j10) {
            return a1.f112820z ? a1.w(obj, j10) : a1.x(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte g(Object obj, long j10) {
            return a1.f112820z ? a1.B(obj, j10) : a1.C(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double h(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public int j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public long l(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public Object o(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void q(Object obj, long j10, boolean z10) {
            if (a1.f112820z) {
                a1.e0(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                a1.f0(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void r(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void s(Object obj, long j10, byte b10) {
            if (a1.f112820z) {
                a1.e0(obj, j10, b10);
            } else {
                a1.f0(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void t(Object obj, long j10, double d10) {
            y(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void u(Object obj, long j10, float f10) {
            w(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void v(long j10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void x(long j10, long j11) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f112822a.copyMemory((Object) null, j10, bArr, a1.f112803i + j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void d(byte[] bArr, long j10, long j11, long j12) {
            this.f112822a.copyMemory(bArr, a1.f112803i + j10, (Object) null, j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean e(Object obj, long j10) {
            return this.f112822a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte f(long j10) {
            return this.f112822a.getByte(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte g(Object obj, long j10) {
            return this.f112822a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double h(Object obj, long j10) {
            return this.f112822a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float i(Object obj, long j10) {
            return this.f112822a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public int j(long j10) {
            return this.f112822a.getInt(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public long l(long j10) {
            return this.f112822a.getLong(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public Object o(java.lang.reflect.Field field) {
            return n(this.f112822a.staticFieldBase(field), this.f112822a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void q(Object obj, long j10, boolean z10) {
            this.f112822a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void r(long j10, byte b10) {
            this.f112822a.putByte(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void s(Object obj, long j10, byte b10) {
            this.f112822a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void t(Object obj, long j10, double d10) {
            this.f112822a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void u(Object obj, long j10, float f10) {
            this.f112822a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void v(long j10, int i10) {
            this.f112822a.putInt(j10, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void x(long j10, long j11) {
            this.f112822a.putLong(j10, j11);
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f112822a;

        public e(Unsafe unsafe) {
            this.f112822a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f112822a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f112822a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(Object obj, long j10);

        public abstract byte f(long j10);

        public abstract byte g(Object obj, long j10);

        public abstract double h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public abstract int j(long j10);

        public final int k(Object obj, long j10) {
            return this.f112822a.getInt(obj, j10);
        }

        public abstract long l(long j10);

        public final long m(Object obj, long j10) {
            return this.f112822a.getLong(obj, j10);
        }

        public final Object n(Object obj, long j10) {
            return this.f112822a.getObject(obj, j10);
        }

        public abstract Object o(java.lang.reflect.Field field);

        public final long p(java.lang.reflect.Field field) {
            return this.f112822a.objectFieldOffset(field);
        }

        public abstract void q(Object obj, long j10, boolean z10);

        public abstract void r(long j10, byte b10);

        public abstract void s(Object obj, long j10, byte b10);

        public abstract void t(Object obj, long j10, double d10);

        public abstract void u(Object obj, long j10, float f10);

        public abstract void v(long j10, int i10);

        public final void w(Object obj, long j10, int i10) {
            this.f112822a.putInt(obj, j10, i10);
        }

        public abstract void x(long j10, long j11);

        public final void y(Object obj, long j10, long j11) {
            this.f112822a.putLong(obj, j10, j11);
        }

        public final void z(Object obj, long j10, Object obj2) {
            this.f112822a.putObject(obj, j10, obj2);
        }
    }

    static {
        long jK = k(byte[].class);
        f112803i = jK;
        f112804j = k(boolean[].class);
        f112805k = l(boolean[].class);
        f112806l = k(int[].class);
        f112807m = l(int[].class);
        f112808n = k(long[].class);
        f112809o = l(long[].class);
        f112810p = k(float[].class);
        f112811q = l(float[].class);
        f112812r = k(double[].class);
        f112813s = l(double[].class);
        f112814t = k(Object[].class);
        f112815u = l(Object[].class);
        f112816v = s(m());
        f112819y = (int) (jK & 7);
        f112820z = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte A(byte[] bArr, long j10) {
        return f112800f.g(bArr, f112803i + j10);
    }

    public static byte B(Object obj, long j10) {
        return (byte) ((f112800f.k(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte C(Object obj, long j10) {
        return (byte) ((f112800f.k(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double D(Object obj, long j10) {
        return f112800f.h(obj, j10);
    }

    public static double E(double[] dArr, long j10) {
        return f112800f.h(dArr, (j10 * f112813s) + f112812r);
    }

    public static float F(Object obj, long j10) {
        return f112800f.i(obj, j10);
    }

    public static float G(float[] fArr, long j10) {
        return f112800f.i(fArr, (j10 * f112811q) + f112810p);
    }

    public static int H(long j10) {
        return f112800f.j(j10);
    }

    public static int I(Object obj, long j10) {
        return f112800f.k(obj, j10);
    }

    public static int J(int[] iArr, long j10) {
        return f112800f.k(iArr, (j10 * f112807m) + f112806l);
    }

    public static long K(long j10) {
        return f112800f.l(j10);
    }

    public static long L(Object obj, long j10) {
        return f112800f.m(obj, j10);
    }

    public static long M(long[] jArr, long j10) {
        return f112800f.m(jArr, (j10 * f112809o) + f112808n);
    }

    public static e N() {
        Unsafe unsafe = f112796b;
        if (unsafe == null) {
            return null;
        }
        if (!C2518d.c()) {
            return new d(unsafe);
        }
        if (f112798d) {
            return new c(unsafe);
        }
        if (f112799e) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object O(Object obj, long j10) {
        return f112800f.n(obj, j10);
    }

    public static Object P(Object[] objArr, long j10) {
        return f112800f.n(objArr, (j10 * f112815u) + f112814t);
    }

    public static Object Q(java.lang.reflect.Field field) {
        return f112800f.o(field);
    }

    public static Unsafe R() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean S() {
        return f112802h;
    }

    public static boolean T() {
        return f112801g;
    }

    public static boolean U() {
        return f112798d;
    }

    public static int V(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i10 < 0 || i11 < 0 || i12 < 0 || i10 + i12 > bArr.length || i11 + i12 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i13 = 0;
        if (f112802h) {
            for (int i14 = (f112819y + i10) & 7; i13 < i12 && (i14 & 7) != 0; i14++) {
                if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                    return i13;
                }
                i13++;
            }
            int i15 = ((i12 - i13) & (-8)) + i13;
            while (i13 < i15) {
                long j10 = f112803i;
                long j11 = i13;
                e eVar = f112800f;
                long jM = eVar.m(bArr, ((long) i10) + j10 + j11);
                long jM2 = eVar.m(bArr2, j10 + ((long) i11) + j11);
                if (jM != jM2) {
                    return t(jM, jM2) + i13;
                }
                i13 += 8;
            }
        }
        while (i13 < i12) {
            if (bArr[i10 + i13] != bArr2[i11 + i13]) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static long W(java.lang.reflect.Field field) {
        return f112800f.p(field);
    }

    public static void X(Object obj, long j10, boolean z10) {
        f112800f.q(obj, j10, z10);
    }

    public static void Y(boolean[] zArr, long j10, boolean z10) {
        f112800f.q(zArr, (j10 * f112805k) + f112804j, z10);
    }

    public static void Z(Object obj, long j10, boolean z10) {
        e0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void a0(Object obj, long j10, boolean z10) {
        f0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void b0(long j10, byte b10) {
        f112800f.r(j10, b10);
    }

    public static void c0(Object obj, long j10, byte b10) {
        f112800f.s(obj, j10, b10);
    }

    public static void d0(byte[] bArr, long j10, byte b10) {
        f112800f.s(bArr, f112803i + j10, b10);
    }

    public static void e0(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iK = f112800f.k(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        l0(obj, j11, ((255 & b10) << i10) | (iK & (~(255 << i10))));
    }

    public static void f0(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        l0(obj, j11, ((255 & b10) << i10) | (f112800f.k(obj, j11) & (~(255 << i10))));
    }

    public static void g(Object obj, long j10, boolean z10) {
        e0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void g0(Object obj, long j10, double d10) {
        f112800f.t(obj, j10, d10);
    }

    public static void h(Object obj, long j10, boolean z10) {
        f0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void h0(double[] dArr, long j10, double d10) {
        f112800f.t(dArr, (j10 * f112813s) + f112812r, d10);
    }

    public static long i(ByteBuffer byteBuffer) {
        return f112800f.m(byteBuffer, f112816v);
    }

    public static void i0(Object obj, long j10, float f10) {
        f112800f.u(obj, j10, f10);
    }

    public static <T> T j(Class<T> cls) {
        try {
            return (T) f112796b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void j0(float[] fArr, long j10, float f10) {
        f112800f.u(fArr, (j10 * f112811q) + f112810p, f10);
    }

    public static int k(Class<?> cls) {
        if (f112802h) {
            return f112800f.a(cls);
        }
        return -1;
    }

    public static void k0(long j10, int i10) {
        f112800f.v(j10, i10);
    }

    public static int l(Class<?> cls) {
        if (f112802h) {
            return f112800f.b(cls);
        }
        return -1;
    }

    public static void l0(Object obj, long j10, int i10) {
        f112800f.w(obj, j10, i10);
    }

    public static java.lang.reflect.Field m() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (C2518d.c()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(AgentOptions.ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void m0(int[] iArr, long j10, int i10) {
        f112800f.w(iArr, (j10 * f112807m) + f112806l, i10);
    }

    public static void n(long j10, byte[] bArr, long j11, long j12) {
        f112800f.c(j10, bArr, j11, j12);
    }

    public static void n0(long j10, long j11) {
        f112800f.x(j10, j11);
    }

    public static void o(byte[] bArr, long j10, long j11, long j12) {
        f112800f.d(bArr, j10, j11, j12);
    }

    public static void o0(Object obj, long j10, long j11) {
        f112800f.y(obj, j10, j11);
    }

    public static void p(byte[] bArr, long j10, byte[] bArr2, long j11, long j12) {
        System.arraycopy(bArr, (int) j10, bArr2, (int) j11, (int) j12);
    }

    public static void p0(long[] jArr, long j10, long j11) {
        f112800f.y(jArr, (j10 * f112809o) + f112808n, j11);
    }

    public static boolean q(Class<?> cls) {
        if (!C2518d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f112797c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void q0(Object obj, long j10, Object obj2) {
        f112800f.z(obj, j10, obj2);
    }

    public static java.lang.reflect.Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r0(Object[] objArr, long j10, Object obj) {
        f112800f.z(objArr, (j10 * f112815u) + f112814t, obj);
    }

    public static long s(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f112800f) == null) {
            return -1L;
        }
        return eVar.p(field);
    }

    public static boolean s0() {
        Unsafe unsafe = f112796b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (C2518d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f112795a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static int t(long j10, long j11) {
        return (f112820z ? Long.numberOfLeadingZeros(j10 ^ j11) : Long.numberOfTrailingZeros(j10 ^ j11)) >> 3;
    }

    public static boolean t0() {
        Unsafe unsafe = f112796b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m() == null) {
                return false;
            }
            if (C2518d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f112795a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean u(Object obj, long j10) {
        return f112800f.e(obj, j10);
    }

    public static boolean v(boolean[] zArr, long j10) {
        return f112800f.e(zArr, (j10 * f112805k) + f112804j);
    }

    public static boolean w(Object obj, long j10) {
        return B(obj, j10) != 0;
    }

    public static boolean x(Object obj, long j10) {
        return C(obj, j10) != 0;
    }

    public static byte y(long j10) {
        return f112800f.f(j10);
    }

    public static byte z(Object obj, long j10) {
        return f112800f.g(obj, j10);
    }
}
