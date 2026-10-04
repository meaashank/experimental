package s0;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p0.C5378b;
import p0.C5382f;
import s0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f238127f = "SplineSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC5561c f238128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f238129b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f238130c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f238131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f238132e;

    public static class a extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f238133g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f238134h;

        public a(String str, long j10) {
            this.f238133g = str;
            this.f238134h = j10;
        }

        @Override // s0.p
        public void h(x xVar, float f10) {
            xVar.b(xVar.e(this.f238133g), a(f10));
        }
    }

    public static class b extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f238135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public j.a f238136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f238137i;

        public b(String str, j.a aVar) {
            this.f238135g = str.split(",")[1];
            this.f238136h = aVar;
        }

        @Override // s0.p
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // s0.p
        public void j(int i10) {
            int iF = this.f238136h.f();
            int iH = this.f238136h.g(0).h();
            double[] dArr = new double[iF];
            this.f238137i = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iH);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f238136h.d(i11);
                CustomAttribute customAttributeG = this.f238136h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                customAttributeG.e(this.f238137i);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f238137i.length) {
                        dArr2[i11][i12] = r6[i12];
                        i12++;
                    }
                }
            }
            this.f238128a = AbstractC5561c.a(i10, dArr, dArr2);
        }

        public void k(int i10, CustomAttribute customAttribute) {
            this.f238136h.a(i10, customAttribute);
        }

        public void l(androidx.constraintlayout.core.state.o oVar, float f10) {
            this.f238128a.e(f10, this.f238137i);
            this.f238136h.g(0);
            oVar.getClass();
        }
    }

    public static class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f238138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public j.b f238139h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f238140i;

        public c(String str, j.b bVar) {
            this.f238138g = str.split(",")[1];
            this.f238139h = bVar;
        }

        @Override // s0.p
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // s0.p
        public void h(x xVar, float f10) {
            l((C5382f) xVar, f10);
        }

        @Override // s0.p
        public void j(int i10) {
            int iF = this.f238139h.f();
            int iR = this.f238139h.g(0).r();
            double[] dArr = new double[iF];
            this.f238140i = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iR);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f238139h.d(i11);
                C5378b c5378bG = this.f238139h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                c5378bG.o(this.f238140i);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f238140i.length) {
                        dArr2[i11][i12] = r6[i12];
                        i12++;
                    }
                }
            }
            this.f238128a = AbstractC5561c.a(i10, dArr, dArr2);
        }

        public void k(int i10, C5378b c5378b) {
            this.f238139h.a(i10, c5378b);
        }

        public void l(C5382f c5382f, float f10) {
            this.f238128a.e(f10, this.f238140i);
            this.f238139h.g(0).w(c5382f, this.f238140i);
        }
    }

    public static class d {
        public static void a(int[] iArr, float[] fArr, int i10, int i11) {
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

        public static int b(int[] iArr, float[] fArr, int i10, int i11) {
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

        public static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static p d(String str, j.a aVar) {
        return new b(str, aVar);
    }

    public static p e(String str, j.b bVar) {
        return new c(str, bVar);
    }

    public static p f(String str, long j10) {
        return new a(str, j10);
    }

    public float a(float f10) {
        return (float) this.f238128a.c(f10, 0);
    }

    public AbstractC5561c b() {
        return this.f238128a;
    }

    public float c(float f10) {
        return (float) this.f238128a.f(f10, 0);
    }

    public void g(int i10, float f10) {
        int[] iArr = this.f238129b;
        if (iArr.length < this.f238131d + 1) {
            this.f238129b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f238130c;
            this.f238130c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f238129b;
        int i11 = this.f238131d;
        iArr2[i11] = i10;
        this.f238130c[i11] = f10;
        this.f238131d = i11 + 1;
    }

    public void h(x xVar, float f10) {
        xVar.b(w.a(this.f238132e), a(f10));
    }

    public void i(String str) {
        this.f238132e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r10) {
        /*
            r9 = this;
            int r0 = r9.f238131d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f238129b
            float[] r2 = r9.f238130c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            s0.p.d.a(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f238131d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f238129b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f238131d
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f238129b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f238129b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f238130c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            s0.c r10 = s0.AbstractC5561c.a(r10, r0, r1)
            r9.f238128a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.p.j(int):void");
    }

    public String toString() {
        String string = this.f238132e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f238131d; i10++) {
            StringBuilder sbA = android.support.v4.media.f.a(string, "[");
            sbA.append(this.f238129b[i10]);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(this.f238130c[i10]));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }
}
