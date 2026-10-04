package q0;

import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p0.C5378b;
import s0.F;
import s0.i;
import s0.p;
import s0.w;
import s0.x;

/* JADX INFO: renamed from: q0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5414d extends AbstractC5412b {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f226581R = "KeyCycle";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f226582S = "KeyCycle";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String f226583T = "wavePeriod";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f226584U = "waveOffset";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f226585V = "wavePhase";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f226586W = "waveShape";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f226587X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f226588Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f226589Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f226590a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f226591b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f226592c0 = 5;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f226593d0 = 6;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f226594e0 = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f226612y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f226613z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f226595A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f226596B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f226597C = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f226598D = 0.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f226599E = 0.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f226600F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f226601G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f226602H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f226603I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f226604J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f226605K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f226606L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f226607M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f226608N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f226609O = Float.NaN;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f226610P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f226611Q = Float.NaN;

    public C5414d() {
        this.f226558k = 4;
        this.f226559l = new HashMap<>();
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean a(int i10, int i11) {
        if (i10 == 401) {
            this.f226613z = i11;
            return true;
        }
        if (i10 == 421) {
            this.f226595A = i11;
            return true;
        }
        if (b(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.f226600F = f10;
            return true;
        }
        if (i10 == 403) {
            this.f226601G = f10;
            return true;
        }
        if (i10 == 416) {
            this.f226604J = f10;
            return true;
        }
        switch (i10) {
            case 304:
                this.f226609O = f10;
                return true;
            case 305:
                this.f226610P = f10;
                return true;
            case 306:
                this.f226611Q = f10;
                return true;
            case 307:
                this.f226602H = f10;
                return true;
            case 308:
                this.f226605K = f10;
                return true;
            case 309:
                this.f226606L = f10;
                return true;
            case 310:
                this.f226603I = f10;
                return true;
            case 311:
                this.f226607M = f10;
                return true;
            case 312:
                this.f226608N = f10;
                return true;
            default:
                switch (i10) {
                    case 423:
                        this.f226597C = f10;
                        return true;
                    case 424:
                        this.f226598D = f10;
                        return true;
                    case x.c.f238318w /* 425 */:
                        this.f226599E = f10;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // q0.AbstractC5412b
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f226612y = str;
            return true;
        }
        if (i10 != 422) {
            return super.d(i10, str);
        }
        this.f226596B = str;
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // s0.x
    public int e(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                b10 = !str.equals(x.c.f238291P) ? (byte) -1 : (byte) 0;
                break;
            case -1310311125:
                b10 = !str.equals("easing") ? (byte) -1 : (byte) 1;
                break;
            case -1249320806:
                b10 = !str.equals("rotationX") ? (byte) -1 : (byte) 2;
                break;
            case -1249320805:
                b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 3;
                break;
            case -1249320804:
                b10 = !str.equals("rotationZ") ? (byte) -1 : (byte) 4;
                break;
            case -1225497657:
                b10 = !str.equals("translationX") ? (byte) -1 : (byte) 5;
                break;
            case -1225497656:
                b10 = !str.equals("translationY") ? (byte) -1 : (byte) 6;
                break;
            case -1225497655:
                b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 7;
                break;
            case -1019779949:
                b10 = !str.equals(x.c.f238293R) ? (byte) -1 : (byte) 8;
                break;
            case -1001078227:
                b10 = !str.equals("progress") ? (byte) -1 : (byte) 9;
                break;
            case -991726143:
                b10 = !str.equals(x.c.f238292Q) ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b10 = !str.equals("pivotX") ? (byte) -1 : (byte) 11;
                break;
            case -987906985:
                b10 = !str.equals("pivotY") ? (byte) -1 : (byte) 12;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : Ascii.SO;
                break;
            case 92909918:
                b10 = !str.equals("alpha") ? (byte) -1 : Ascii.SI;
                break;
            case 106629499:
                b10 = !str.equals(x.c.f238294S) ? (byte) -1 : (byte) 16;
                break;
            case 579057826:
                b10 = !str.equals("curveFit") ? (byte) -1 : (byte) 17;
                break;
            case 803192288:
                b10 = !str.equals("pathRotate") ? (byte) -1 : Ascii.DC2;
                break;
            case 1532805160:
                b10 = !str.equals("waveShape") ? (byte) -1 : (byte) 19;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : Ascii.DC4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 422;
            case 1:
                return 420;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return 424;
            case 9:
                return 315;
            case 10:
                return 423;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return x.c.f238318w;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: g */
    public AbstractC5412b clone() {
        return null;
    }

    @Override // q0.AbstractC5412b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f226601G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f226602H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f226603I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f226605K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f226606L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f226607M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f226608N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f226604J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f226609O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f226610P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f226611Q)) {
            hashSet.add("translationZ");
        }
        if (this.f226559l.size() > 0) {
            Iterator<String> it = this.f226559l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, i> map) {
        i iVar;
        i iVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C5378b c5378b = this.f226559l.get(str.substring(7));
                if (c5378b != null && c5378b.m() == 901 && (iVar = map.get(str)) != null) {
                    iVar.g(this.f226555h, this.f226595A, this.f226596B, -1, this.f226597C, this.f226598D, this.f226599E, c5378b.n(), c5378b);
                }
            } else {
                float fX = x(str);
                if (!Float.isNaN(fX) && (iVar2 = map.get(str)) != null) {
                    iVar2.f(this.f226555h, this.f226595A, this.f226596B, -1, this.f226597C, this.f226598D, this.f226599E, fX);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f226595A + ", mWavePeriod=" + this.f226597C + ", mWaveOffset=" + this.f226598D + ", mWavePhase=" + this.f226599E + ", mRotation=" + this.f226603I + '}');
    }

    public float x(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f226605K;
            case "rotationY":
                return this.f226606L;
            case "rotationZ":
                return this.f226603I;
            case "translationX":
                return this.f226609O;
            case "translationY":
                return this.f226610P;
            case "translationZ":
                return this.f226611Q;
            case "offset":
                return this.f226598D;
            case "progress":
                return this.f226600F;
            case "scaleX":
                return this.f226607M;
            case "scaleY":
                return this.f226608N;
            case "elevation":
                return this.f226602H;
            case "alpha":
                return this.f226601G;
            case "phase":
                return this.f226599E;
            case "pathRotate":
                return this.f226604J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        F.c(" ------------- " + this.f226555h + " -------------");
        F.c("MotionKeyCycle{Shape=" + this.f226595A + ", Period=" + this.f226597C + ", Offset=" + this.f226598D + ", Phase=" + this.f226599E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            w.a(strArr[i10]);
            F.c(strArr[i10] + com.prism.gaia.server.accounts.b.f166434b0 + x(strArr[i10]));
        }
    }

    @Override // q0.AbstractC5412b
    public void f(HashMap<String, p> map) {
    }
}
