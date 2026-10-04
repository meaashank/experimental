package androidx.compose.ui.graphics.colorspace;

import e.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f100991a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final float[] f100992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final float[] f100993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C f100994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C f100995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Rgb f100996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Rgb f100997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Rgb f100998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Rgb f100999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Rgb f101000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Rgb f101001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Rgb f101002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Rgb f101003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Rgb f101004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Rgb f101005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Rgb f101006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Rgb f101007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Rgb f101008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Rgb f101009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final AbstractC2015c f101010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final AbstractC2015c f101011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Rgb f101012v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final AbstractC2015c f101013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final AbstractC2015c[] f101014x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f100992b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f100993c = fArr2;
        C c10 = new C(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f100994d = c10;
        C c11 = new C(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f100995e = c11;
        l lVar = l.f101026a;
        lVar.getClass();
        D d10 = l.f101033h;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, d10, c10, 0);
        f100996f = rgb;
        lVar.getClass();
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, d10, 1.0d, 0.0f, 1.0f, 1);
        f100997g = rgb2;
        lVar.getClass();
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, d10, null, new f(), new g(), -0.799f, 2.399f, c10, 2);
        f100998h = rgb3;
        lVar.getClass();
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, d10, 1.0d, -0.5f, 7.499f, 3);
        f100999i = rgb4;
        lVar.getClass();
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, d10, new C(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f101000j = rgb5;
        lVar.getClass();
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, d10, new C(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f101001k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new D(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f101002l = rgb7;
        lVar.getClass();
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, d10, c10, 7);
        f101003m = rgb8;
        lVar.getClass();
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, l.f101029d, new C(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f101004n = rgb9;
        lVar.getClass();
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, d10, new C(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f101005o = rgb10;
        lVar.getClass();
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, d10, 2.2d, 0.0f, 1.0f, 10);
        f101006p = rgb11;
        lVar.getClass();
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, l.f101030e, new C(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f101007q = rgb12;
        lVar.getClass();
        D d11 = l.f101032g;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, d11, 1.0d, -65504.0f, 65504.0f, 12);
        f101008r = rgb13;
        lVar.getClass();
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, d11, 1.0d, -65504.0f, 65504.0f, 13);
        f101009s = rgb14;
        E e10 = new E("Generic XYZ", 14);
        f101010t = e10;
        m mVar = new m("Generic L*a*b*", 15);
        f101011u = mVar;
        lVar.getClass();
        Rgb rgb15 = new Rgb("None", fArr, d10, c11, 16);
        f101012v = rgb15;
        n nVar = new n("Oklab", 17);
        f101013w = nVar;
        f101014x = new AbstractC2015c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, e10, mVar, rgb15, nVar};
    }

    public static final double c(double d10) {
        return C2017e.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double d(double d10) {
        return C2017e.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @NotNull
    public final Rgb A() {
        return f101012v;
    }

    @Nullable
    public final AbstractC2015c B(@Y(9) @NotNull float[] fArr, @NotNull C c10) {
        for (AbstractC2015c abstractC2015c : f101014x) {
            long j10 = abstractC2015c.f100989b;
            C2014b.f100979b.getClass();
            if (C2014b.h(j10, C2014b.f100980c)) {
                l.f101026a.getClass();
                Rgb rgb = (Rgb) C2017e.e(abstractC2015c, l.f101030e, null, 2, null);
                if (C2017e.i(fArr, rgb.f100962l) && C2017e.g(c10, rgb.f100960j)) {
                    return abstractC2015c;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Rgb e() {
        return f101008r;
    }

    @NotNull
    public final Rgb f() {
        return f101009s;
    }

    @NotNull
    public final Rgb g() {
        return f101006p;
    }

    @NotNull
    public final Rgb h() {
        return f101001k;
    }

    @NotNull
    public final Rgb i() {
        return f101000j;
    }

    @NotNull
    public final AbstractC2015c j() {
        return f101011u;
    }

    @NotNull
    public final AbstractC2015c k() {
        return f101010t;
    }

    @NotNull
    public final AbstractC2015c l(int i10) {
        return f101014x[i10];
    }

    @NotNull
    public final AbstractC2015c[] m() {
        return f101014x;
    }

    @NotNull
    public final Rgb n() {
        return f101002l;
    }

    @NotNull
    public final Rgb o() {
        return f101003m;
    }

    @NotNull
    public final Rgb p() {
        return f100998h;
    }

    @NotNull
    public final Rgb q() {
        return f100999i;
    }

    @NotNull
    public final Rgb r() {
        return f100997g;
    }

    @NotNull
    public final Rgb s() {
        return f101004n;
    }

    @NotNull
    public final float[] t() {
        return f100993c;
    }

    @NotNull
    public final AbstractC2015c u() {
        return f101013w;
    }

    @NotNull
    public final Rgb v() {
        return f101007q;
    }

    @NotNull
    public final Rgb w() {
        return f101005o;
    }

    @NotNull
    public final Rgb x() {
        return f100996f;
    }

    @NotNull
    public final float[] y() {
        return f100992b;
    }

    @NotNull
    public final C z() {
        return f100994d;
    }
}
