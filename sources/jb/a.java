package Jb;

import java.util.List;
import kotlin.collections.B;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public double[] f58151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f58153f;

    @dd.k
    public a() {
        this(0, 1, null);
    }

    public static /* synthetic */ double k(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.c();
        }
        return aVar.j(i10);
    }

    public static /* synthetic */ double n(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.c();
        }
        return aVar.m(i10);
    }

    public final void a(double d10) {
        if (this.f58148a > 0 && c() == this.f58148a) {
            this.f58152e++;
        }
        if (this.f58153f == this.f58151d.length - 1) {
            d();
        }
        int i10 = this.f58153f + 1;
        this.f58153f = i10;
        if (i10 == 0) {
            this.f58152e = 0;
        }
        this.f58151d[i10] = d10;
    }

    public final void b() {
        this.f58151d = new double[this.f58149b];
        int i10 = this.f58150c;
        this.f58152e = i10;
        this.f58153f = i10;
    }

    public final int c() {
        return (this.f58153f - this.f58152e) + 1;
    }

    public final void d() {
        double[] dArr = new double[this.f58151d.length * 2];
        int iC = c();
        System.arraycopy(this.f58151d, this.f58152e, dArr, 0, iC);
        this.f58151d = dArr;
        this.f58152e = 0;
        this.f58153f = iC - 1;
    }

    public final double e() {
        int i10 = this.f58152e;
        int i11 = this.f58153f;
        double d10 = 0.0d;
        if (i10 <= i11) {
            while (true) {
                d10 += this.f58151d[i10];
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        return d10 / ((double) c());
    }

    public final double f(int i10) {
        double d10 = 0.0d;
        int i11 = 1;
        if (1 <= i10) {
            while (true) {
                d10 += (double) i11;
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return d10;
    }

    public final double g() {
        if (c() >= 1) {
            return this.f58151d[this.f58152e];
        }
        throw new ArrayIndexOutOfBoundsException("value array is empty");
    }

    public final double h() {
        if (c() >= 1) {
            return this.f58151d[this.f58153f];
        }
        throw new ArrayIndexOutOfBoundsException("value array is empty");
    }

    @dd.k
    public final double i() {
        return k(this, 0, 1, null);
    }

    @dd.k
    public final double j(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("inclusionCount cannot be less than 1.");
        }
        if (i10 > c()) {
            throw new IllegalArgumentException("inclusionCount cannot be greater than the inserted value count.");
        }
        double dF = f(i10);
        int i11 = this.f58152e;
        int i12 = (i10 - 1) + i11;
        double d10 = 0.0d;
        if (i11 <= i12) {
            while (true) {
                d10 += (((double) i10) / dF) * this.f58151d[i11];
                i10--;
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return d10;
    }

    @dd.k
    public final double l() {
        return n(this, 0, 1, null);
    }

    @dd.k
    public final double m(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("inclusionCount cannot be less than 1.");
        }
        if (i10 > c()) {
            throw new IllegalArgumentException("inclusionCount cannot be greater than the inserted value count.");
        }
        double dF = f(i10);
        int i11 = this.f58153f;
        int i12 = i11 - (i10 - 1);
        double d10 = 0.0d;
        if (i12 <= i11) {
            while (true) {
                d10 += (((double) i10) / dF) * this.f58151d[i11];
                i10--;
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return d10;
    }

    @NotNull
    public final List<Double> o() {
        return B.Zy(this.f58151d);
    }

    public final boolean p(double d10) {
        return B.Zy(this.f58151d).contains(Double.valueOf(d10));
    }

    @dd.k
    public a(int i10) {
        this.f58148a = i10;
        this.f58149b = 16;
        this.f58150c = -1;
        this.f58151d = new double[16];
        this.f58152e = -1;
        this.f58153f = -1;
    }

    public /* synthetic */ a(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
