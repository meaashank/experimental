package androidx.room;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class z0 implements v2.f, v2.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f117329j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f117330k = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f117332m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f117333n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f117334o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f117335p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f117336q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.f0
    public final int f117337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile String f117338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final long[] f117339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public final double[] f117340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public final String[] f117341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @NotNull
    public final byte[][] f117342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final int[] f117343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f117328i = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final TreeMap<Integer, z0> f117331l = new TreeMap<>();

    @Lc.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        public static final class a implements v2.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z0 f117345a;

            public a(z0 z0Var) {
                this.f117345a = z0Var;
            }

            @Override // v2.e
            public void E1(int i10, long j10) {
                this.f117345a.E1(i10, j10);
            }

            @Override // v2.e
            public void J1(int i10, @NotNull byte[] value) {
                kotlin.jvm.internal.G.p(value, "value");
                this.f117345a.J1(i10, value);
            }

            @Override // v2.e
            public void T3() {
                this.f117345a.T3();
            }

            @Override // v2.e
            public void X1(int i10) {
                this.f117345a.X1(i10);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f117345a.getClass();
            }

            @Override // v2.e
            public void t1(int i10, @NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                this.f117345a.t1(i10, value);
            }

            @Override // v2.e
            public void t2(int i10, double d10) {
                this.f117345a.t2(i10, d10);
            }
        }

        public b() {
        }

        @e.f0
        public static /* synthetic */ void c() {
        }

        @e.f0
        public static /* synthetic */ void d() {
        }

        @e.f0
        public static /* synthetic */ void e() {
        }

        @dd.o
        @NotNull
        public final z0 a(@NotNull String query, int i10) {
            kotlin.jvm.internal.G.p(query, "query");
            TreeMap<Integer, z0> treeMap = z0.f117331l;
            synchronized (treeMap) {
                Map.Entry<Integer, z0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    z0 z0Var = new z0(i10);
                    z0Var.s(query, i10);
                    return z0Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                z0 value = entryCeilingEntry.getValue();
                value.s(query, i10);
                return value;
            }
        }

        @dd.o
        @NotNull
        public final z0 b(@NotNull v2.f supportSQLiteQuery) {
            kotlin.jvm.internal.G.p(supportSQLiteQuery, "supportSQLiteQuery");
            z0 z0VarA = a(supportSQLiteQuery.k(), supportSQLiteQuery.d());
            supportSQLiteQuery.l(new a(z0VarA));
            return z0VarA;
        }

        public final void f() {
            TreeMap<Integer, z0> treeMap = z0.f117331l;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.G.o(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        public b(C4969v c4969v) {
        }
    }

    public /* synthetic */ z0(int i10, C4969v c4969v) {
        this(i10);
    }

    @dd.o
    @NotNull
    public static final z0 a(@NotNull String str, int i10) {
        return f117328i.a(str, i10);
    }

    @dd.o
    @NotNull
    public static final z0 c(@NotNull v2.f fVar) {
        return f117328i.b(fVar);
    }

    public static /* synthetic */ void m() {
    }

    @e.f0
    public static /* synthetic */ void n() {
    }

    @e.f0
    public static /* synthetic */ void p() {
    }

    @e.f0
    public static /* synthetic */ void q() {
    }

    @e.f0
    public static /* synthetic */ void r() {
    }

    @Override // v2.e
    public void E1(int i10, long j10) {
        this.f117343g[i10] = 2;
        this.f117339c[i10] = j10;
    }

    @Override // v2.e
    public void J1(int i10, @NotNull byte[] value) {
        kotlin.jvm.internal.G.p(value, "value");
        this.f117343g[i10] = 5;
        this.f117342f[i10] = value;
    }

    @Override // v2.e
    public void T3() {
        Arrays.fill(this.f117343g, 1);
        Arrays.fill(this.f117341e, (Object) null);
        Arrays.fill(this.f117342f, (Object) null);
        this.f117338b = null;
    }

    @Override // v2.e
    public void X1(int i10) {
        this.f117343g[i10] = 1;
    }

    public final void b(@NotNull z0 other) {
        kotlin.jvm.internal.G.p(other, "other");
        int i10 = other.f117344h + 1;
        System.arraycopy(other.f117343g, 0, this.f117343g, 0, i10);
        System.arraycopy(other.f117339c, 0, this.f117339c, 0, i10);
        System.arraycopy(other.f117341e, 0, this.f117341e, 0, i10);
        System.arraycopy(other.f117342f, 0, this.f117342f, 0, i10);
        System.arraycopy(other.f117340d, 0, this.f117340d, 0, i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // v2.f
    public int d() {
        return this.f117344h;
    }

    @Override // v2.f
    @NotNull
    public String k() {
        String str = this.f117338b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // v2.f
    public void l(@NotNull v2.e statement) {
        kotlin.jvm.internal.G.p(statement, "statement");
        int i10 = this.f117344h;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f117343g[i11];
            if (i12 == 1) {
                statement.X1(i11);
            } else if (i12 == 2) {
                statement.E1(i11, this.f117339c[i11]);
            } else if (i12 == 3) {
                statement.t2(i11, this.f117340d[i11]);
            } else if (i12 == 4) {
                String str = this.f117341e[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.t1(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f117342f[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.J1(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final int o() {
        return this.f117337a;
    }

    public final void release() {
        TreeMap<Integer, z0> treeMap = f117331l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f117337a), this);
            f117328i.f();
        }
    }

    public final void s(@NotNull String query, int i10) {
        kotlin.jvm.internal.G.p(query, "query");
        this.f117338b = query;
        this.f117344h = i10;
    }

    @Override // v2.e
    public void t1(int i10, @NotNull String value) {
        kotlin.jvm.internal.G.p(value, "value");
        this.f117343g[i10] = 4;
        this.f117341e[i10] = value;
    }

    @Override // v2.e
    public void t2(int i10, double d10) {
        this.f117343g[i10] = 3;
        this.f117340d[i10] = d10;
    }

    public z0(int i10) {
        this.f117337a = i10;
        int i11 = i10 + 1;
        this.f117343g = new int[i11];
        this.f117339c = new long[i11];
        this.f117340d = new double[i11];
        this.f117341e = new String[i11];
        this.f117342f = new byte[i11][];
    }
}
