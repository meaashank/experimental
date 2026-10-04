package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,330:1\n98#1,2:331\n98#1,2:333\n98#1,2:335\n98#1,2:337\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n84#1:358\n98#1,2:359\n98#1,2:361\n98#1,2:363\n98#1,2:365\n98#1,2:367\n98#1,2:369\n98#1,2:371\n98#1,2:373\n98#1,2:375\n98#1,2:377\n98#1,2:379\n98#1,2:381\n98#1,2:383\n98#1,2:385\n98#1,2:387\n98#1,2:389\n98#1,2:391\n98#1,2:393\n98#1,2:395\n98#1,2:397\n84#1:399\n84#1:400\n84#1:401\n84#1:402\n98#1,2:403\n98#1,2:405\n98#1,2:407\n98#1,2:409\n98#1,2:411\n98#1,2:413\n98#1,2:415\n98#1,2:417\n98#1,2:419\n98#1,2:421\n98#1,2:423\n98#1,2:425\n98#1,2:427\n134#1,5:429\n98#1,2:434\n98#1,2:436\n98#1,2:438\n98#1,2:440\n139#1:442\n134#1,5:443\n98#1,2:448\n98#1,2:450\n98#1,2:452\n98#1,2:454\n139#1:456\n134#1,5:457\n98#1,2:462\n98#1,2:464\n98#1,2:466\n98#1,2:468\n139#1:470\n98#1,2:471\n98#1,2:473\n98#1,2:475\n98#1,2:477\n98#1,2:479\n98#1,2:481\n98#1,2:483\n98#1,2:485\n98#1,2:487\n98#1,2:489\n98#1,2:491\n98#1,2:493\n98#1,2:495\n98#1,2:497\n98#1,2:499\n98#1,2:501\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n112#1:331,2\n113#1:333,2\n114#1:335,2\n115#1:337,2\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n153#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n163#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n173#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n183#1:358\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n204#1:397,2\n212#1:399\n213#1:400\n214#1:401\n215#1:402\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n237#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n259#1:427,2\n266#1:429,5\n267#1:434,2\n268#1:436,2\n269#1:438,2\n270#1:440,2\n266#1:442\n278#1:443,5\n279#1:448,2\n280#1:450,2\n281#1:452,2\n282#1:454,2\n278#1:456\n290#1:457,5\n291#1:462,2\n292#1:464,2\n293#1:466,2\n294#1:468,2\n290#1:470\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n312#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n327#1:501,2\n*E\n"})
@dd.h
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f100764a;

    public /* synthetic */ N0(float[] fArr) {
        this.f100764a = fArr;
    }

    public static final /* synthetic */ N0 a(float[] fArr) {
        return new N0(fArr);
    }

    @NotNull
    public static float[] b(@NotNull float[] fArr) {
        return fArr;
    }

    public static float[] c(float[] fArr, int i10, C4969v c4969v) {
        return (i10 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : fArr;
    }

    public static final void d(float[] fArr) {
        l(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    public static final void e(float[] fArr) {
        l(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    public static final float f(float[] fArr, float[] fArr2, int i10, float[] fArr3, int i11) {
        int i12 = i10 * 5;
        return (fArr2[i12 + 3] * fArr3[15 + i11]) + (fArr2[i12 + 2] * fArr3[10 + i11]) + (fArr2[i12 + 1] * fArr3[5 + i11]) + (fArr2[i12] * fArr3[i11]);
    }

    public static boolean g(float[] fArr, Object obj) {
        return (obj instanceof N0) && kotlin.jvm.internal.G.g(fArr, ((N0) obj).f100764a);
    }

    public static final boolean h(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.G.g(fArr, fArr2);
    }

    public static final float i(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 5) + i11];
    }

    public static int k(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void l(float[] fArr) {
        C4875q.S1(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    public static final void m(float[] fArr, float f10, ed.p<? super Float, ? super Float, kotlin.L0> pVar) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        pVar.invoke(Float.valueOf((float) Math.cos(d10)), Float.valueOf((float) Math.sin(d10)));
    }

    public static final void n(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 5) + i11] = f10;
    }

    public static final void o(float[] fArr, @NotNull float[] fArr2) {
        C4875q.H0(fArr2, fArr, 0, 0, 0, 14, null);
    }

    public static final void p(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    public static final void q(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    public static final void r(float[] fArr, float f10) {
        l(fArr);
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    public static final void s(float[] fArr, float f10) {
        l(fArr);
        float f11 = 1 - f10;
        float f12 = 0.213f * f11;
        float f13 = 0.715f * f11;
        float f14 = f11 * 0.072f;
        fArr[0] = f12 + f10;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[5] = f12;
        fArr[6] = f13 + f10;
        fArr[7] = f14;
        fArr[10] = f12;
        fArr[11] = f13;
        fArr[12] = f14 + f10;
    }

    public static final void t(float[] fArr, float f10, float f11, float f12, float f13) {
        l(fArr);
        fArr[0] = f10;
        fArr[6] = f11;
        fArr[12] = f12;
        fArr[18] = f13;
    }

    public static final void u(float[] fArr, @NotNull float[] fArr2) {
        float f10 = f(fArr, fArr, 0, fArr2, 0);
        float f11 = f(fArr, fArr, 0, fArr2, 1);
        float f12 = f(fArr, fArr, 0, fArr2, 2);
        float f13 = f(fArr, fArr, 0, fArr2, 3);
        float f14 = (fArr[3] * fArr2[19]) + (fArr[2] * fArr2[14]) + (fArr[1] * fArr2[9]) + (fArr[0] * fArr2[4]) + fArr[4];
        float f15 = f(fArr, fArr, 1, fArr2, 0);
        float f16 = f(fArr, fArr, 1, fArr2, 1);
        float f17 = f(fArr, fArr, 1, fArr2, 2);
        float f18 = f(fArr, fArr, 1, fArr2, 3);
        float f19 = (fArr[8] * fArr2[19]) + (fArr[7] * fArr2[14]) + (fArr[6] * fArr2[9]) + (fArr[5] * fArr2[4]) + fArr[9];
        float f20 = f(fArr, fArr, 2, fArr2, 0);
        float f21 = f(fArr, fArr, 2, fArr2, 1);
        float f22 = f(fArr, fArr, 2, fArr2, 2);
        float f23 = f(fArr, fArr, 2, fArr2, 3);
        float f24 = (fArr[13] * fArr2[19]) + (fArr[12] * fArr2[14]) + (fArr[11] * fArr2[9]) + (fArr[10] * fArr2[4]) + fArr[14];
        float f25 = f(fArr, fArr, 3, fArr2, 0);
        float f26 = f(fArr, fArr, 3, fArr2, 1);
        float f27 = f(fArr, fArr, 3, fArr2, 2);
        float f28 = f(fArr, fArr, 3, fArr2, 3);
        float f29 = (fArr[18] * fArr2[19]) + (fArr[17] * fArr2[14]) + (fArr[16] * fArr2[9]) + (fArr[15] * fArr2[4]) + fArr[19];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        fArr[9] = f19;
        fArr[10] = f20;
        fArr[11] = f21;
        fArr[12] = f22;
        fArr[13] = f23;
        fArr[14] = f24;
        fArr[15] = f25;
        fArr[16] = f26;
        fArr[17] = f27;
        fArr[18] = f28;
        fArr[19] = f29;
    }

    public static String v(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f100764a, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f100764a);
    }

    @NotNull
    public final float[] j() {
        return this.f100764a;
    }

    public String toString() {
        return v(this.f100764a);
    }

    public final /* synthetic */ float[] w() {
        return this.f100764a;
    }
}
