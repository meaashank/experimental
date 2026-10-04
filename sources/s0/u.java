package s0;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p0.C5378b;
import p0.C5382f;
import s0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f238171k = "SplineSet";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f238172l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f238173m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f238174n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static float f238175o = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC5561c f238176a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f238180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f238181f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f238184i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f238177b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f238178c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f238179d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f238182g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f238183h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f238185j = Float.NaN;

    public static class a extends u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f238186p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public j.a f238187q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public j.c f238188r = new j.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float[] f238189s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f238190t;

        public a(String str, j.a aVar) {
            this.f238186p = str.split(",")[1];
            this.f238187q = aVar;
        }

        @Override // s0.u
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // s0.u
        public void f(int i10) {
            int iF = this.f238187q.f();
            int iH = this.f238187q.g(0).h();
            double[] dArr = new double[iF];
            int i11 = iH + 2;
            this.f238189s = new float[i11];
            this.f238190t = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f238187q.d(i12);
                CustomAttribute customAttributeG = this.f238187q.g(i12);
                float[] fArrG = this.f238188r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                customAttributeG.e(this.f238189s);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f238189s.length) {
                        dArr2[i12][i13] = r8[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iH] = fArrG[0];
                dArr3[iH + 1] = fArrG[1];
            }
            this.f238176a = AbstractC5561c.a(i10, dArr, dArr2);
        }

        public void g(int i10, CustomAttribute customAttribute, float f10, int i11, float f11) {
            this.f238187q.a(i10, customAttribute);
            this.f238188r.a(i10, new float[]{f10, f11});
            this.f238177b = Math.max(this.f238177b, i11);
        }

        public boolean h(C5382f c5382f, float f10, long j10, C5566h c5566h) {
            this.f238176a.e(f10, this.f238189s);
            float[] fArr = this.f238189s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f238184i;
            if (Float.isNaN(this.f238185j)) {
                float fA = c5566h.a(c5382f, this.f238186p, 0);
                this.f238185j = fA;
                if (Float.isNaN(fA)) {
                    this.f238185j = 0.0f;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * ((double) f11)) + ((double) this.f238185j)) % 1.0d);
            this.f238185j = f13;
            this.f238184i = j10;
            float fA2 = a(f13);
            this.f238183h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f238190t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f238183h;
                float f14 = this.f238189s[i10];
                this.f238183h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            c5382f.M(this.f238187q.g(0), this.f238190t);
            if (f11 != 0.0f) {
                this.f238183h = true;
            }
            return this.f238183h;
        }
    }

    public static class b extends u {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f238191p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public j.b f238192q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public j.c f238193r = new j.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float[] f238194s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f238195t;

        public b(String str, j.b bVar) {
            this.f238191p = str.split(",")[1];
            this.f238192q = bVar;
        }

        @Override // s0.u
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // s0.u
        public void f(int i10) {
            int iF = this.f238192q.f();
            int iR = this.f238192q.g(0).r();
            double[] dArr = new double[iF];
            int i11 = iR + 2;
            this.f238194s = new float[i11];
            this.f238195t = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f238192q.d(i12);
                C5378b c5378bG = this.f238192q.g(i12);
                float[] fArrG = this.f238193r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                c5378bG.o(this.f238194s);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f238194s.length) {
                        dArr2[i12][i13] = r8[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iR] = fArrG[0];
                dArr3[iR + 1] = fArrG[1];
            }
            this.f238176a = AbstractC5561c.a(i10, dArr, dArr2);
        }

        public void g(int i10, C5378b c5378b, float f10, int i11, float f11) {
            this.f238192q.a(i10, c5378b);
            this.f238193r.a(i10, new float[]{f10, f11});
            this.f238177b = Math.max(this.f238177b, i11);
        }

        public boolean h(C5382f c5382f, float f10, long j10, C5566h c5566h) {
            this.f238176a.e(f10, this.f238194s);
            float[] fArr = this.f238194s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f238184i;
            if (Float.isNaN(this.f238185j)) {
                float fA = c5566h.a(c5382f, this.f238191p, 0);
                this.f238185j = fA;
                if (Float.isNaN(fA)) {
                    this.f238185j = 0.0f;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * ((double) f11)) + ((double) this.f238185j)) % 1.0d);
            this.f238185j = f13;
            this.f238184i = j10;
            float fA2 = a(f13);
            this.f238183h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f238195t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f238183h;
                float f14 = this.f238194s[i10];
                this.f238183h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f238192q.g(0).w(c5382f, this.f238195t);
            if (f11 != 0.0f) {
                this.f238183h = true;
            }
            return this.f238183h;
        }
    }

    public static class c {
        public static void a(int[] iArr, float[][] fArr, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int iB = b(iArr, fArr, i13, i15);
                    iArr2[i14] = iB - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = iB + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        public static int b(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        public static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    public float a(float f10) {
        float fAbs;
        switch (this.f238177b) {
            case 1:
                return Math.signum(f10 * f238175o);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * f238175o);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * f238175o);
        }
        return 1.0f - fAbs;
    }

    public AbstractC5561c b() {
        return this.f238176a;
    }

    public void c(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f238178c;
        int i12 = this.f238180e;
        iArr[i12] = i10;
        float[] fArr = this.f238179d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f238177b = Math.max(this.f238177b, i11);
        this.f238180e++;
    }

    public void d(long j10) {
        this.f238184i = j10;
    }

    public void e(String str) {
        this.f238181f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(int r12) {
        /*
            r11 = this;
            int r0 = r11.f238180e
            if (r0 != 0) goto L1a
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error no points added to "
            r0.<init>(r1)
            java.lang.String r1 = r11.f238181f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L1a:
            int[] r1 = r11.f238178c
            float[][] r2 = r11.f238179d
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            s0.u.c.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L26:
            int[] r2 = r11.f238178c
            int r5 = r2.length
            if (r0 >= r5) goto L38
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L35
            int r1 = r1 + 1
        L35:
            int r0 = r0 + 1
            goto L26
        L38:
            if (r1 != 0) goto L3b
            r1 = r3
        L3b:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L4f:
            int r7 = r11.f238180e
            if (r5 >= r7) goto L87
            if (r5 <= 0) goto L60
            int[] r7 = r11.f238178c
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L60
            goto L84
        L60:
            int[] r7 = r11.f238178c
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f238179d
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L84:
            int r5 = r5 + 1
            goto L4f
        L87:
            s0.c r12 = s0.AbstractC5561c.a(r12, r0, r1)
            r11.f238176a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.u.f(int):void");
    }

    public String toString() {
        String string = this.f238181f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f238180e; i10++) {
            StringBuilder sbA = android.support.v4.media.f.a(string, "[");
            sbA.append(this.f238178c[i10]);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(this.f238179d[i10]));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }
}
