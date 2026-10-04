package s0;

import java.util.Arrays;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5560b extends AbstractC5561c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f237970g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f237971h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f237972i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f237973j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f237974k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f237975l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f237976m = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f237977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f237978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f237979f = true;

    /* JADX INFO: renamed from: s0.b$a */
    public static class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f237980s = "Arc";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static double[] f237981t = new double[91];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final double f237982u = 0.001d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f237983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f237984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f237985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f237986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f237987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f237988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f237989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f237990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f237991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f237992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f237993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f237994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f237995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f237996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f237997o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f237998p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f237999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f238000r;

        public a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f238000r = false;
            this.f237999q = i10 == 1;
            this.f237985c = d10;
            this.f237986d = d11;
            this.f237991i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f238000r = true;
            }
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (!this.f238000r && Math.abs(d16) >= 0.001d && Math.abs(d17) >= 0.001d) {
                this.f237983a = new double[101];
                boolean z10 = this.f237999q;
                this.f237992j = d16 * ((double) (z10 ? -1 : 1));
                this.f237993k = d17 * ((double) (z10 ? 1 : -1));
                this.f237994l = z10 ? d14 : d12;
                this.f237995m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f237996n = this.f237984b * this.f237991i;
                return;
            }
            this.f238000r = true;
            this.f237987e = d12;
            this.f237988f = d14;
            this.f237989g = d13;
            this.f237990h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f237984b = dHypot;
            this.f237996n = dHypot * this.f237991i;
            double d18 = this.f237986d;
            double d19 = this.f237985c;
            this.f237994l = d16 / (d18 - d19);
            this.f237995m = d17 / (d18 - d19);
        }

        public final void a(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double dHypot = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                if (i10 >= f237981t.length) {
                    break;
                }
                int i11 = i10;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i11 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    f237981t[i11] = dHypot;
                }
                i10 = i11 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.f237984b = dHypot;
            int i12 = 0;
            while (true) {
                double[] dArr = f237981t;
                if (i12 >= dArr.length) {
                    break;
                }
                dArr[i12] = dArr[i12] / dHypot;
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= this.f237983a.length) {
                    return;
                }
                double length = ((double) i13) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f237981t, length);
                if (iBinarySearch >= 0) {
                    this.f237983a[i13] = ((double) iBinarySearch) / ((double) (f237981t.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f237983a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double[] dArr2 = f237981t;
                    double d18 = dArr2[i15];
                    this.f237983a[i13] = (((length - d18) / (dArr2[i14 - 1] - d18)) + ((double) i15)) / ((double) (dArr2.length - 1));
                }
                i13++;
            }
        }

        public double b() {
            double d10 = this.f237992j * this.f237998p;
            double dHypot = this.f237996n / Math.hypot(d10, (-this.f237993k) * this.f237997o);
            return this.f237999q ? (-d10) * dHypot : d10 * dHypot;
        }

        public double c() {
            double d10 = this.f237992j * this.f237998p;
            double d11 = (-this.f237993k) * this.f237997o;
            double dHypot = this.f237996n / Math.hypot(d10, d11);
            return this.f237999q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f237994l;
        }

        public double e(double d10) {
            return this.f237995m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f237985c) * this.f237991i;
            double d12 = this.f237987e;
            return C5559a.a(this.f237988f, d12, d11, d12);
        }

        public double g(double d10) {
            double d11 = (d10 - this.f237985c) * this.f237991i;
            double d12 = this.f237989g;
            return C5559a.a(this.f237990h, d12, d11, d12);
        }

        public double h() {
            return (this.f237992j * this.f237997o) + this.f237994l;
        }

        public double i() {
            return (this.f237993k * this.f237998p) + this.f237995m;
        }

        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f237983a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return C5559a.a(dArr[i10 + 1], d12, d11, d12);
        }

        public void k(double d10) {
            double dJ = j((this.f237999q ? this.f237986d - d10 : d10 - this.f237985c) * this.f237991i) * 1.5707963267948966d;
            this.f237997o = Math.sin(dJ);
            this.f237998p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5560b(int[] r24, double[] r25, double[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.f237979f = r2
            r0.f237977d = r1
            int r3 = r1.length
            int r3 = r3 - r2
            s0.b$a[] r3 = new s0.C5560b.a[r3]
            r0.f237978e = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            s0.b$a[] r7 = r0.f237978e
            int r8 = r7.length
            if (r4 >= r8) goto L55
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L32
            if (r8 == r2) goto L30
            r10 = 2
            if (r8 == r10) goto L2e
            if (r8 == r9) goto L29
            r9 = r6
            goto L32
        L29:
            if (r5 != r2) goto L30
            goto L2e
        L2c:
            r9 = r5
            goto L32
        L2e:
            r5 = r10
            goto L2c
        L30:
            r5 = r2
            goto L2c
        L32:
            s0.b$a r8 = new s0.b$a
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r3]
            r17 = r14[r2]
            r14 = r26[r6]
            r19 = r14[r3]
            r21 = r14[r2]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C5560b.<init>(int[], double[], double[][]):void");
    }

    @Override // s0.AbstractC5561c
    public double c(double d10, int i10) {
        int i11 = 0;
        if (this.f237979f) {
            a[] aVarArr = this.f237978e;
            a aVar = aVarArr[0];
            double d11 = aVar.f237985c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f238000r) {
                    if (i10 == 0) {
                        return (this.f237978e[0].d(d11) * d12) + aVar.f(d11);
                    }
                    return (this.f237978e[0].e(d11) * d12) + aVar.g(d11);
                }
                aVar.k(d11);
                if (i10 == 0) {
                    return (this.f237978e[0].b() * d12) + this.f237978e[0].h();
                }
                return (this.f237978e[0].c() * d12) + this.f237978e[0].i();
            }
            if (d10 > aVarArr[aVarArr.length - 1].f237986d) {
                double d13 = aVarArr[aVarArr.length - 1].f237986d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                if (i10 == 0) {
                    return (this.f237978e[length].d(d13) * d14) + aVarArr[length].f(d13);
                }
                return (this.f237978e[length].e(d13) * d14) + aVarArr[length].g(d13);
            }
        } else {
            a[] aVarArr2 = this.f237978e;
            double d15 = aVarArr2[0].f237985c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f237986d) {
                d10 = aVarArr2[aVarArr2.length - 1].f237986d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.f237978e;
            if (i11 >= aVarArr3.length) {
                return Double.NaN;
            }
            a aVar2 = aVarArr3[i11];
            if (d10 <= aVar2.f237986d) {
                if (aVar2.f238000r) {
                    return i10 == 0 ? aVar2.f(d10) : aVar2.g(d10);
                }
                aVar2.k(d10);
                return i10 == 0 ? this.f237978e[i11].h() : this.f237978e[i11].i();
            }
            i11++;
        }
    }

    @Override // s0.AbstractC5561c
    public void d(double d10, double[] dArr) {
        if (this.f237979f) {
            a[] aVarArr = this.f237978e;
            a aVar = aVarArr[0];
            double d11 = aVar.f237985c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f238000r) {
                    dArr[0] = (this.f237978e[0].d(d11) * d12) + aVar.f(d11);
                    dArr[1] = (this.f237978e[0].e(d11) * d12) + this.f237978e[0].g(d11);
                    return;
                }
                aVar.k(d11);
                dArr[0] = (this.f237978e[0].b() * d12) + this.f237978e[0].h();
                dArr[1] = (this.f237978e[0].c() * d12) + this.f237978e[0].i();
                return;
            }
            if (d10 > aVarArr[aVarArr.length - 1].f237986d) {
                double d13 = aVarArr[aVarArr.length - 1].f237986d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f238000r) {
                    dArr[0] = (this.f237978e[length].d(d13) * d14) + aVar2.f(d13);
                    dArr[1] = (this.f237978e[length].e(d13) * d14) + this.f237978e[length].g(d13);
                    return;
                }
                aVar2.k(d10);
                dArr[0] = (this.f237978e[length].b() * d14) + this.f237978e[length].h();
                dArr[1] = (this.f237978e[length].c() * d14) + this.f237978e[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.f237978e;
            double d15 = aVarArr2[0].f237985c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > aVarArr2[aVarArr2.length - 1].f237986d) {
                d10 = aVarArr2[aVarArr2.length - 1].f237986d;
            }
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr3 = this.f237978e;
            if (i10 >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i10];
            if (d10 <= aVar3.f237986d) {
                if (aVar3.f238000r) {
                    dArr[0] = aVar3.f(d10);
                    dArr[1] = this.f237978e[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    dArr[0] = this.f237978e[i10].h();
                    dArr[1] = this.f237978e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // s0.AbstractC5561c
    public void e(double d10, float[] fArr) {
        if (this.f237979f) {
            a[] aVarArr = this.f237978e;
            a aVar = aVarArr[0];
            double d11 = aVar.f237985c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f238000r) {
                    fArr[0] = (float) ((this.f237978e[0].d(d11) * d12) + aVar.f(d11));
                    fArr[1] = (float) ((this.f237978e[0].e(d11) * d12) + this.f237978e[0].g(d11));
                    return;
                }
                aVar.k(d11);
                fArr[0] = (float) ((this.f237978e[0].b() * d12) + this.f237978e[0].h());
                fArr[1] = (float) ((this.f237978e[0].c() * d12) + this.f237978e[0].i());
                return;
            }
            if (d10 > aVarArr[aVarArr.length - 1].f237986d) {
                double d13 = aVarArr[aVarArr.length - 1].f237986d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (!aVar2.f238000r) {
                    aVar2.k(d10);
                    fArr[0] = (float) this.f237978e[length].h();
                    fArr[1] = (float) this.f237978e[length].i();
                    return;
                } else {
                    fArr[0] = (float) ((this.f237978e[length].d(d13) * d14) + aVar2.f(d13));
                    fArr[1] = (float) ((this.f237978e[length].e(d13) * d14) + this.f237978e[length].g(d13));
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f237978e;
            double d15 = aVarArr2[0].f237985c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f237986d) {
                d10 = aVarArr2[aVarArr2.length - 1].f237986d;
            }
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr3 = this.f237978e;
            if (i10 >= aVarArr3.length) {
                return;
            }
            a aVar3 = aVarArr3[i10];
            if (d10 <= aVar3.f237986d) {
                if (aVar3.f238000r) {
                    fArr[0] = (float) aVar3.f(d10);
                    fArr[1] = (float) this.f237978e[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    fArr[0] = (float) this.f237978e[i10].h();
                    fArr[1] = (float) this.f237978e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // s0.AbstractC5561c
    public double f(double d10, int i10) {
        a[] aVarArr = this.f237978e;
        int i11 = 0;
        double d11 = aVarArr[0].f237985c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > aVarArr[aVarArr.length - 1].f237986d) {
            d10 = aVarArr[aVarArr.length - 1].f237986d;
        }
        while (true) {
            a[] aVarArr2 = this.f237978e;
            if (i11 >= aVarArr2.length) {
                return Double.NaN;
            }
            a aVar = aVarArr2[i11];
            if (d10 <= aVar.f237986d) {
                if (aVar.f238000r) {
                    return i10 == 0 ? aVar.d(d10) : aVar.e(d10);
                }
                aVar.k(d10);
                return i10 == 0 ? this.f237978e[i11].b() : this.f237978e[i11].c();
            }
            i11++;
        }
    }

    @Override // s0.AbstractC5561c
    public void g(double d10, double[] dArr) {
        a[] aVarArr = this.f237978e;
        double d11 = aVarArr[0].f237985c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f237986d) {
            d10 = aVarArr[aVarArr.length - 1].f237986d;
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr2 = this.f237978e;
            if (i10 >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i10];
            if (d10 <= aVar.f237986d) {
                if (aVar.f238000r) {
                    dArr[0] = aVar.d(d10);
                    dArr[1] = this.f237978e[i10].e(d10);
                    return;
                } else {
                    aVar.k(d10);
                    dArr[0] = this.f237978e[i10].b();
                    dArr[1] = this.f237978e[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // s0.AbstractC5561c
    public double[] h() {
        return this.f237977d;
    }
}
