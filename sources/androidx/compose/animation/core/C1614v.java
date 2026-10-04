package androidx.compose.animation.core;

import i.C4541d;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@S
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1614v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f88202c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88203d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88204e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88205f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88206g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f88207h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f88208i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88209j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f88210k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f88211l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f88212m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f88213n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f88214o = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a[][] f88215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88216b = true;

    /* JADX INFO: renamed from: androidx.compose.animation.core.v$a */
    @kotlin.jvm.internal.V({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,388:1\n21#2:389\n26#2:390\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n322#1:389\n340#1:390\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public static final C0178a f88217s = new C0178a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f88218t = 8;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public static float[] f88219u = null;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final float f88220v = 0.001f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f88221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f88222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f88223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f88224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f88225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f88226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f88227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f88228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f88229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final float[] f88230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f88231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f88232l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f88233m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final float f88234n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final float f88235o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f88236p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f88237q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f88238r;

        /* JADX INFO: renamed from: androidx.compose.animation.core.v$a$a, reason: collision with other inner class name */
        public static final class C0178a {
            public C0178a() {
            }

            public final float[] b() {
                float[] fArr = a.f88219u;
                if (fArr != null) {
                    kotlin.jvm.internal.G.m(fArr);
                    return fArr;
                }
                float[] fArr2 = new float[91];
                a.f88219u = fArr2;
                return fArr2;
            }

            public C0178a(C4969v c4969v) {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f88221a = f10;
            this.f88222b = f11;
            this.f88223c = f12;
            this.f88224d = f13;
            this.f88225e = f14;
            this.f88226f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            this.f88237q = z11;
            float f18 = 1 / (f11 - f10);
            this.f88231k = f18;
            boolean z12 = 3 == i10;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f88227g = fHypot;
                this.f88236p = fHypot * f18;
                this.f88234n = f16 / (f11 - f10);
                this.f88235o = f17 / (f11 - f10);
                this.f88230j = new float[101];
                this.f88232l = Float.NaN;
                this.f88233m = Float.NaN;
            } else {
                this.f88230j = new float[101];
                this.f88232l = f16 * (z11 ? -1 : 1);
                this.f88233m = f17 * (z11 ? 1 : -1);
                this.f88234n = z11 ? f14 : f12;
                this.f88235o = z11 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.f88236p = this.f88227g * f18;
                z10 = z12;
            }
            this.f88238r = z10;
        }

        public final void c(float f10, float f11, float f12, float f13) {
            float f14 = f12 - f10;
            float f15 = f11 - f13;
            int length = f88217s.b().length;
            float fHypot = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                C0178a c0178a = f88217s;
                double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) (c0178a.b().length - 1)));
                float fSin = ((float) Math.sin(radians)) * f14;
                float fCos = ((float) Math.cos(radians)) * f15;
                if (i10 > 0) {
                    fHypot += (float) Math.hypot(fSin - f16, fCos - f17);
                    c0178a.b()[i10] = fHypot;
                }
                i10++;
                f17 = fCos;
                f16 = fSin;
            }
            this.f88227g = fHypot;
            int length2 = f88217s.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArrB = f88217s.b();
                fArrB[i11] = fArrB[i11] / fHypot;
            }
            int length3 = this.f88230j.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = i12 / (this.f88230j.length - 1);
                C0178a c0178a2 = f88217s;
                int I10 = C4875q.I(c0178a2.b(), length4, 0, 0, 6, null);
                if (I10 >= 0) {
                    this.f88230j[i12] = I10 / (c0178a2.b().length - 1);
                } else if (I10 == -1) {
                    this.f88230j[i12] = 0.0f;
                } else {
                    int i13 = -I10;
                    int i14 = i13 - 2;
                    this.f88230j[i12] = (((length4 - c0178a2.b()[i14]) / (c0178a2.b()[i13 - 1] - c0178a2.b()[i14])) + i14) / (c0178a2.b().length - 1);
                }
            }
        }

        public final float d() {
            float f10 = this.f88232l * this.f88229i;
            float fHypot = this.f88236p / ((float) Math.hypot(f10, (-this.f88233m) * this.f88228h));
            return this.f88237q ? (-f10) * fHypot : f10 * fHypot;
        }

        public final float e() {
            float f10 = this.f88232l * this.f88229i;
            float f11 = (-this.f88233m) * this.f88228h;
            float fHypot = this.f88236p / ((float) Math.hypot(f10, f11));
            return this.f88237q ? (-f11) * fHypot : f11 * fHypot;
        }

        public final float f() {
            return (this.f88232l * this.f88228h) + this.f88234n;
        }

        public final float g() {
            return (this.f88233m * this.f88229i) + this.f88235o;
        }

        public final float h() {
            return this.f88234n;
        }

        public final float i() {
            return this.f88235o;
        }

        public final float j(float f10) {
            float f11 = (f10 - this.f88221a) * this.f88231k;
            float f12 = this.f88223c;
            return C4541d.a(this.f88225e, f12, f11, f12);
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f88221a) * this.f88231k;
            float f12 = this.f88224d;
            return C4541d.a(this.f88226f, f12, f11, f12);
        }

        public final float l() {
            return this.f88221a;
        }

        public final float m() {
            return this.f88222b;
        }

        public final boolean n() {
            return this.f88238r;
        }

        public final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f88230j;
            float length = f10 * (fArr.length - 1);
            int i10 = (int) length;
            float f11 = length - i10;
            float f12 = fArr[i10];
            return C4541d.a(fArr[i10 + 1], f12, f11, f12);
        }

        public final void p(float f10) {
            double dO = o((this.f88237q ? this.f88222b - f10 : f10 - this.f88221a) * this.f88231k) * 1.5707964f;
            this.f88228h = (float) Math.sin(dO);
            this.f88229i = (float) Math.cos(dO);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.v$b */
    public static final class b {
        public b() {
        }

        public b(C4969v c4969v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1614v(@org.jetbrains.annotations.NotNull int[] r21, @org.jetbrains.annotations.NotNull float[] r22, @org.jetbrains.annotations.NotNull float[][] r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r0.<init>()
            r2 = 1
            r0.f88216b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.compose.animation.core.v$a[][] r4 = new androidx.compose.animation.core.C1614v.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6b
            r9 = r21[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r23[r6]
            int r9 = r8.length
            int r9 = r9 / r11
            int r8 = r8.length
            int r8 = r8 % r11
            int r8 = r8 + r9
            androidx.compose.animation.core.v$a[] r9 = new androidx.compose.animation.core.C1614v.a[r8]
            r10 = r5
        L3d:
            if (r10 >= r8) goto L65
            int r11 = r10 * 2
            androidx.compose.animation.core.v$a r12 = new androidx.compose.animation.core.v$a
            r14 = r1[r6]
            int r15 = r6 + 1
            r16 = r15
            r15 = r1[r16]
            r17 = r23[r6]
            r18 = r16
            r16 = r17[r11]
            int r19 = r11 + 1
            r17 = r17[r19]
            r18 = r23[r18]
            r11 = r18[r11]
            r19 = r18[r19]
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r10] = r12
            int r10 = r10 + 1
            goto L3d
        L65:
            r4[r6] = r9
            int r6 = r6 + 1
            r8 = r13
            goto L12
        L6b:
            r0.f88215a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C1614v.<init>(int[], float[], float[][]):void");
    }

    public final void a(float f10, @NotNull float[] fArr) {
        int i10;
        int i11 = 0;
        if (this.f88216b) {
            a[][] aVarArr = this.f88215a;
            float f11 = aVarArr[0][0].f88221a;
            if (f10 < f11 || f10 > aVarArr[aVarArr.length - 1][0].f88222b) {
                if (f10 > aVarArr[aVarArr.length - 1][0].f88222b) {
                    int length = aVarArr.length - 1;
                    f11 = aVarArr[aVarArr.length - 1][0].f88222b;
                    i10 = length;
                } else {
                    i10 = 0;
                }
                float f12 = f10 - f11;
                int i12 = 0;
                while (i11 < fArr.length) {
                    a aVar = this.f88215a[i10][i12];
                    if (aVar.f88238r) {
                        float fJ = aVar.j(f11);
                        a aVar2 = this.f88215a[i10][i12];
                        fArr[i11] = (aVar2.f88234n * f12) + fJ;
                        fArr[i11 + 1] = (this.f88215a[i10][i12].f88235o * f12) + aVar2.k(f11);
                    } else {
                        aVar.p(f11);
                        fArr[i11] = (this.f88215a[i10][i12].d() * f12) + this.f88215a[i10][i12].f();
                        fArr[i11 + 1] = (this.f88215a[i10][i12].e() * f12) + this.f88215a[i10][i12].g();
                    }
                    i11 += 2;
                    i12++;
                }
                return;
            }
        } else {
            a[][] aVarArr2 = this.f88215a;
            float f13 = aVarArr2[0][0].f88221a;
            if (f10 < f13) {
                f10 = f13;
            }
            if (f10 > aVarArr2[aVarArr2.length - 1][0].f88222b) {
                f10 = aVarArr2[aVarArr2.length - 1][0].f88222b;
            }
        }
        int length2 = this.f88215a.length;
        boolean z10 = false;
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (i14 < fArr.length) {
                a aVar3 = this.f88215a[i13][i15];
                if (f10 <= aVar3.f88222b) {
                    if (aVar3.f88238r) {
                        fArr[i14] = aVar3.j(f10);
                        fArr[i14 + 1] = this.f88215a[i13][i15].k(f10);
                    } else {
                        aVar3.p(f10);
                        fArr[i14] = this.f88215a[i13][i15].f();
                        fArr[i14 + 1] = this.f88215a[i13][i15].g();
                    }
                    z10 = true;
                }
                i14 += 2;
                i15++;
            }
            if (z10) {
                return;
            }
        }
    }

    public final void b(float f10, @NotNull float[] fArr) {
        a[][] aVarArr = this.f88215a;
        float f11 = aVarArr[0][0].f88221a;
        if (f10 < f11) {
            f10 = f11;
        } else if (f10 > aVarArr[aVarArr.length - 1][0].f88222b) {
            f10 = aVarArr[aVarArr.length - 1][0].f88222b;
        }
        int length = aVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                a aVar = this.f88215a[i10][i12];
                if (f10 <= aVar.f88222b) {
                    if (aVar.f88238r) {
                        fArr[i11] = aVar.f88234n;
                        fArr[i11 + 1] = aVar.f88235o;
                    } else {
                        aVar.p(f10);
                        fArr[i11] = this.f88215a[i10][i12].d();
                        fArr[i11 + 1] = this.f88215a[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z10) {
                return;
            }
        }
    }
}
