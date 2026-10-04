package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.C4969v;
import kotlin.text.C5032y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
@dd.h
public final class C2086n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101351b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101352c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101353d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101354e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f101355f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f101356g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f101357h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f101358i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f101359j = 12;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f101360k = 13;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f101361l = 14;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f101362m = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f101363a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.n2$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2086n2(float[] fArr) {
        this.f101363a = fArr;
    }

    public static final /* synthetic */ C2086n2 a(float[] fArr) {
        return new C2086n2(fArr);
    }

    @NotNull
    public static float[] b(@NotNull float[] fArr) {
        return fArr;
    }

    public static float[] c(float[] fArr, int i10, C4969v c4969v) {
        return (i10 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f} : fArr;
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof C2086n2) && kotlin.jvm.internal.G.g(fArr, ((C2086n2) obj).f101363a);
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.G.g(fArr, fArr2);
    }

    public static final float f(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    public static int h(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void i(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return;
        }
        float f39 = 1.0f / f38;
        fArr[0] = androidx.compose.animation.X.a(f17, f35, (f15 * f37) - (f16 * f36), f39);
        fArr[1] = C2082m2.a(f13, f35, (f12 * f36) + ((-f11) * f37), f39);
        fArr[2] = androidx.compose.animation.X.a(f25, f29, (f23 * f31) - (f24 * f30), f39);
        fArr[3] = C2082m2.a(f21, f29, (f20 * f30) + ((-f19) * f31), f39);
        float f40 = -f14;
        fArr[4] = C2082m2.a(f17, f33, (f16 * f34) + (f40 * f37), f39);
        fArr[5] = androidx.compose.animation.X.a(f13, f33, (f37 * f10) - (f12 * f34), f39);
        float f41 = -f22;
        fArr[6] = C2082m2.a(f25, f27, (f24 * f28) + (f41 * f31), f39);
        fArr[7] = androidx.compose.animation.X.a(f21, f27, (f18 * f31) - (f20 * f28), f39);
        fArr[8] = androidx.compose.animation.X.a(f17, f32, (f14 * f36) - (f15 * f34), f39);
        fArr[9] = C2082m2.a(f13, f32, (f34 * f11) + ((-f10) * f36), f39);
        fArr[10] = androidx.compose.animation.X.a(f25, f26, (f22 * f30) - (f23 * f28), f39);
        fArr[11] = C2082m2.a(f21, f26, (f19 * f28) + ((-f18) * f30), f39);
        fArr[12] = C2082m2.a(f16, f32, (f15 * f33) + (f40 * f35), f39);
        fArr[13] = androidx.compose.animation.X.a(f12, f32, (f10 * f35) - (f11 * f33), f39);
        fArr[14] = C2082m2.a(f24, f26, (f23 * f27) + (f41 * f29), f39);
        fArr[15] = androidx.compose.animation.X.a(f20, f26, (f18 * f29) - (f19 * f27), f39);
    }

    public static final long j(float[] fArr, long j10) {
        float fP = P.g.p(j10);
        float fR = P.g.r(j10);
        float f10 = 1 / (((fArr[7] * fR) + (fArr[3] * fP)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return P.h.a(((fArr[4] * fR) + (fArr[0] * fP) + fArr[12]) * f10, ((fArr[5] * fR) + (fArr[1] * fP) + fArr[13]) * f10);
    }

    @NotNull
    public static final P.j k(float[] fArr, @NotNull P.j jVar) {
        long j10 = j(fArr, P.h.a(jVar.f65511a, jVar.f65512b));
        long j11 = j(fArr, P.h.a(jVar.f65511a, jVar.f65514d));
        long j12 = j(fArr, P.h.a(jVar.f65513c, jVar.f65512b));
        long j13 = j(fArr, P.h.a(jVar.f65513c, jVar.f65514d));
        return new P.j(Math.min(Math.min(P.g.p(j10), P.g.p(j11)), Math.min(P.g.p(j12), P.g.p(j13))), Math.min(Math.min(P.g.r(j10), P.g.r(j11)), Math.min(P.g.r(j12), P.g.r(j13))), Math.max(Math.max(P.g.p(j10), P.g.p(j11)), Math.max(P.g.p(j12), P.g.p(j13))), Math.max(Math.max(P.g.r(j10), P.g.r(j11)), Math.max(P.g.r(j12), P.g.r(j13))));
    }

    public static final void l(float[] fArr, @NotNull P.e eVar) {
        long j10 = j(fArr, P.h.a(eVar.f65499a, eVar.f65500b));
        long j11 = j(fArr, P.h.a(eVar.f65499a, eVar.f65502d));
        long j12 = j(fArr, P.h.a(eVar.f65501c, eVar.f65500b));
        long j13 = j(fArr, P.h.a(eVar.f65501c, eVar.f65502d));
        eVar.f65499a = Math.min(Math.min(P.g.p(j10), P.g.p(j11)), Math.min(P.g.p(j12), P.g.p(j13)));
        eVar.f65500b = Math.min(Math.min(P.g.r(j10), P.g.r(j11)), Math.min(P.g.r(j12), P.g.r(j13)));
        eVar.f65501c = Math.max(Math.max(P.g.p(j10), P.g.p(j11)), Math.max(P.g.p(j12), P.g.p(j13)));
        eVar.f65502d = Math.max(Math.max(P.g.r(j10), P.g.r(j11)), Math.max(P.g.r(j12), P.g.r(j13)));
    }

    public static final void m(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void n(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = (f11 * fCos) - (f12 * fSin);
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = (f14 * fCos) - (f15 * fSin);
        float f17 = fArr[9];
        float f18 = fArr[10];
        float f19 = (f17 * fCos) - (f18 * fSin);
        float f20 = fArr[13];
        float f21 = fArr[14];
        float f22 = (f20 * fCos) - (f21 * fSin);
        fArr[1] = f13;
        fArr[2] = (f12 * fCos) + (f11 * fSin);
        fArr[5] = f16;
        fArr[6] = (f15 * fCos) + (f14 * fSin);
        fArr[9] = f19;
        fArr[10] = (f18 * fCos) + (f17 * fSin);
        fArr[13] = f22;
        fArr[14] = (f21 * fCos) + (f20 * fSin);
    }

    public static final void o(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = (f12 * fSin) + (f11 * fCos);
        float f14 = fArr[4];
        float f15 = fArr[6];
        float f16 = (f15 * fSin) + (f14 * fCos);
        float f17 = fArr[8];
        float f18 = fArr[10];
        float f19 = (f18 * fSin) + (f17 * fCos);
        float f20 = fArr[12];
        float f21 = fArr[14];
        float f22 = (f21 * fSin) + (f20 * fCos);
        fArr[0] = f13;
        fArr[2] = (f12 * fCos) + ((-f11) * fSin);
        fArr[4] = f16;
        fArr[6] = (f15 * fCos) + ((-f14) * fSin);
        fArr[8] = f19;
        fArr[10] = (f18 * fCos) + ((-f17) * fSin);
        fArr[12] = f22;
        fArr[14] = (f21 * fCos) + ((-f20) * fSin);
    }

    public static final void p(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = -fSin;
        float f15 = (f12 * fCos) + (f11 * f14);
        float f16 = fArr[1];
        float f17 = fArr[5];
        float f18 = (fSin * f17) + (fCos * f16);
        float f19 = (f17 * fCos) + (f16 * f14);
        float f20 = fArr[2];
        float f21 = fArr[6];
        float f22 = (fSin * f21) + (fCos * f20);
        float f23 = (f21 * fCos) + (f20 * f14);
        float f24 = fArr[3];
        float f25 = fArr[7];
        float f26 = (fSin * f25) + (fCos * f24);
        fArr[0] = f13;
        fArr[1] = f18;
        fArr[2] = f22;
        fArr[3] = f26;
        fArr[4] = f15;
        fArr[5] = f19;
        fArr[6] = f23;
        fArr[7] = (fCos * f25) + (f14 * f24);
    }

    public static final void q(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void r(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        q(fArr, f10, f11, f12);
    }

    public static final void s(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 4) + i11] = f10;
    }

    public static final void t(float[] fArr, @NotNull float[] fArr2) {
        for (int i10 = 0; i10 < 16; i10++) {
            fArr[i10] = fArr2[i10];
        }
    }

    public static final void u(float[] fArr, @NotNull float[] fArr2) {
        float fB = C2090o2.b(fArr, 0, fArr2, 0);
        float fB2 = C2090o2.b(fArr, 0, fArr2, 1);
        float fB3 = C2090o2.b(fArr, 0, fArr2, 2);
        float fB4 = C2090o2.b(fArr, 0, fArr2, 3);
        float fB5 = C2090o2.b(fArr, 1, fArr2, 0);
        float fB6 = C2090o2.b(fArr, 1, fArr2, 1);
        float fB7 = C2090o2.b(fArr, 1, fArr2, 2);
        float fB8 = C2090o2.b(fArr, 1, fArr2, 3);
        float fB9 = C2090o2.b(fArr, 2, fArr2, 0);
        float fB10 = C2090o2.b(fArr, 2, fArr2, 1);
        float fB11 = C2090o2.b(fArr, 2, fArr2, 2);
        float fB12 = C2090o2.b(fArr, 2, fArr2, 3);
        float fB13 = C2090o2.b(fArr, 3, fArr2, 0);
        float fB14 = C2090o2.b(fArr, 3, fArr2, 1);
        float fB15 = C2090o2.b(fArr, 3, fArr2, 2);
        float fB16 = C2090o2.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    @NotNull
    public static String v(float[] fArr) {
        return C5032y.v("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void w(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[8] * f12) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f14 = (fArr[9] * f12) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f15 = (fArr[10] * f12) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f16 = (fArr[11] * f12) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void x(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        w(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f101363a, obj);
    }

    @NotNull
    public final float[] g() {
        return this.f101363a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f101363a);
    }

    @NotNull
    public String toString() {
        return v(this.f101363a);
    }

    public final /* synthetic */ float[] y() {
        return this.f101363a;
    }
}
