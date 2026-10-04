package p0;

import androidx.compose.runtime.R0;
import androidx.compose.runtime.changelist.j;
import i.C4541d;
import s0.x;

/* JADX INFO: renamed from: p0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5378b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f226150g = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f226151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f226153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f226154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f226155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f226156f;

    public C5378b(C5378b c5378b) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = c5378b.f226151a;
        this.f226152b = c5378b.f226152b;
        this.f226153c = c5378b.f226153c;
        this.f226154d = c5378b.f226154d;
        this.f226155e = c5378b.f226155e;
        this.f226156f = c5378b.f226156f;
    }

    public static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String c(int i10) {
        return "#" + C5377a.a(i10, new StringBuilder("00000000")).substring(r2.length() - 8);
    }

    public static int p(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int iA = (int) C4541d.a(1.0f, f11, f15, 0.5f);
        int i11 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i12 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i13 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i13 << 16) + (i12 << 8) + iA) | (-16777216);
        }
        if (i10 == 1) {
            return ((i11 << 16) + (i13 << 8) + iA) | (-16777216);
        }
        if (i10 == 2) {
            return ((iA << 16) + (i13 << 8) + i12) | (-16777216);
        }
        if (i10 == 3) {
            return ((iA << 16) + (i11 << 8) + i13) | (-16777216);
        }
        if (i10 == 4) {
            return ((i12 << 16) + (iA << 8) + i13) | (-16777216);
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i13 << 16) + (iA << 8) + i11) | (-16777216);
    }

    public static int s(float f10, float f11, float f12, float f13) {
        int iB = b((int) (f10 * 255.0f));
        int iB2 = b((int) (f11 * 255.0f));
        return (iB << 16) | (b((int) (f13 * 255.0f)) << 24) | (iB2 << 8) | b((int) (f12 * 255.0f));
    }

    public void a(C5382f c5382f) {
        int i10 = this.f226152b;
        switch (i10) {
            case 900:
            case x.b.f238271l /* 902 */:
            case x.b.f238275p /* 906 */:
                c5382f.J(this.f226151a, i10, this.f226153c);
                break;
            case x.b.f238270k /* 901 */:
            case x.b.f238274o /* 905 */:
                c5382f.I(this.f226151a, i10, this.f226154d);
                break;
            case x.b.f238272m /* 903 */:
                c5382f.K(this.f226151a, i10, this.f226155e);
                break;
            case x.b.f238273n /* 904 */:
                c5382f.L(this.f226151a, i10, this.f226156f);
                break;
        }
    }

    public C5378b d() {
        return new C5378b(this);
    }

    public boolean e(C5378b c5378b) {
        int i10;
        if (c5378b != null && (i10 = this.f226152b) == c5378b.f226152b) {
            switch (i10) {
                case 900:
                case x.b.f238275p /* 906 */:
                    if (this.f226153c == c5378b.f226153c) {
                        return true;
                    }
                    break;
                case x.b.f238270k /* 901 */:
                    return this.f226154d == c5378b.f226154d;
                case x.b.f238271l /* 902 */:
                    return this.f226153c == c5378b.f226153c;
                case x.b.f238272m /* 903 */:
                    return this.f226153c == c5378b.f226153c;
                case x.b.f238273n /* 904 */:
                    return this.f226156f == c5378b.f226156f;
                case x.b.f238274o /* 905 */:
                    return this.f226154d == c5378b.f226154d;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f226156f;
    }

    public int g() {
        return this.f226153c;
    }

    public float h() {
        return this.f226154d;
    }

    public int i() {
        return this.f226153c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f226151a;
    }

    public String l() {
        return this.f226155e;
    }

    public int m() {
        return this.f226152b;
    }

    public float n() {
        switch (this.f226152b) {
            case 900:
                return this.f226153c;
            case x.b.f238270k /* 901 */:
                return this.f226154d;
            case x.b.f238271l /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case x.b.f238272m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case x.b.f238273n /* 904 */:
                return this.f226156f ? 1.0f : 0.0f;
            case x.b.f238274o /* 905 */:
                return this.f226154d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f226152b) {
            case 900:
                fArr[0] = this.f226153c;
                return;
            case x.b.f238270k /* 901 */:
                fArr[0] = this.f226154d;
                return;
            case x.b.f238271l /* 902 */:
                int i10 = (this.f226153c >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i10 / 255.0f;
                return;
            case x.b.f238272m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case x.b.f238273n /* 904 */:
                fArr[0] = this.f226156f ? 1.0f : 0.0f;
                return;
            case x.b.f238274o /* 905 */:
                fArr[0] = this.f226154d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i10 = this.f226152b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int r() {
        return this.f226152b != 902 ? 1 : 4;
    }

    public void t(boolean z10) {
        this.f226156f = z10;
    }

    public String toString() {
        String strA = R0.a(new StringBuilder(), this.f226151a, ':');
        switch (this.f226152b) {
            case 900:
                StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
                sbA.append(this.f226153c);
                return sbA.toString();
            case x.b.f238270k /* 901 */:
                StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(strA);
                sbA2.append(this.f226154d);
                return sbA2.toString();
            case x.b.f238271l /* 902 */:
                StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(strA);
                sbA3.append(c(this.f226153c));
                return sbA3.toString();
            case x.b.f238272m /* 903 */:
                StringBuilder sbA4 = androidx.compose.runtime.changelist.a.a(strA);
                sbA4.append(this.f226155e);
                return sbA4.toString();
            case x.b.f238273n /* 904 */:
                StringBuilder sbA5 = androidx.compose.runtime.changelist.a.a(strA);
                sbA5.append(Boolean.valueOf(this.f226156f));
                return sbA5.toString();
            case x.b.f238274o /* 905 */:
                StringBuilder sbA6 = androidx.compose.runtime.changelist.a.a(strA);
                sbA6.append(this.f226154d);
                return sbA6.toString();
            default:
                return j.a(strA, "????");
        }
    }

    public void u(float f10) {
        this.f226154d = f10;
    }

    public void v(int i10) {
        this.f226153c = i10;
    }

    public void w(C5382f c5382f, float[] fArr) {
        int i10 = this.f226152b;
        switch (i10) {
            case 900:
                c5382f.J(this.f226151a, i10, (int) fArr[0]);
                return;
            case x.b.f238270k /* 901 */:
            case x.b.f238274o /* 905 */:
                c5382f.I(this.f226151a, i10, fArr[0]);
                return;
            case x.b.f238271l /* 902 */:
                c5382f.J(this.f226151a, this.f226152b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case x.b.f238272m /* 903 */:
            case x.b.f238275p /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f226151a);
            case x.b.f238273n /* 904 */:
                c5382f.L(this.f226151a, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f226155e = str;
    }

    public void y(Object obj) {
        switch (this.f226152b) {
            case 900:
            case x.b.f238275p /* 906 */:
                this.f226153c = ((Integer) obj).intValue();
                break;
            case x.b.f238270k /* 901 */:
                this.f226154d = ((Float) obj).floatValue();
                break;
            case x.b.f238271l /* 902 */:
                this.f226153c = ((Integer) obj).intValue();
                break;
            case x.b.f238272m /* 903 */:
                this.f226155e = (String) obj;
                break;
            case x.b.f238273n /* 904 */:
                this.f226156f = ((Boolean) obj).booleanValue();
                break;
            case x.b.f238274o /* 905 */:
                this.f226154d = ((Float) obj).floatValue();
                break;
        }
    }

    public void z(float[] fArr) {
        switch (this.f226152b) {
            case 900:
            case x.b.f238275p /* 906 */:
                this.f226153c = (int) fArr[0];
                return;
            case x.b.f238270k /* 901 */:
            case x.b.f238274o /* 905 */:
                this.f226154d = fArr[0];
                return;
            case x.b.f238271l /* 902 */:
                this.f226153c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case x.b.f238272m /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case x.b.f238273n /* 904 */:
                this.f226156f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public C5378b(String str, int i10, String str2) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226151a = str;
        this.f226152b = i10;
        this.f226155e = str2;
    }

    public C5378b(String str, int i10, int i11) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = str;
        this.f226152b = i10;
        if (i10 == 901) {
            this.f226154d = i11;
        } else {
            this.f226153c = i11;
        }
    }

    public C5378b(String str, int i10, float f10) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226155e = null;
        this.f226151a = str;
        this.f226152b = i10;
        this.f226154d = f10;
    }

    public C5378b(String str, int i10, boolean z10) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = str;
        this.f226152b = i10;
        this.f226156f = z10;
    }

    public C5378b(String str, int i10) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = str;
        this.f226152b = i10;
    }

    public C5378b(String str, int i10, Object obj) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = str;
        this.f226152b = i10;
        y(obj);
    }

    public C5378b(C5378b c5378b, Object obj) {
        this.f226153c = Integer.MIN_VALUE;
        this.f226154d = Float.NaN;
        this.f226155e = null;
        this.f226151a = c5378b.f226151a;
        this.f226152b = c5378b.f226152b;
        y(obj);
    }
}
