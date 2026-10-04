package q0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p0.C5378b;
import s0.p;
import s0.w;
import s0.x;
import w.y;

/* JADX INFO: renamed from: q0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5413c extends AbstractC5412b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f226560P = "KeyAttribute";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f226561Q = "KeyAttributes";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final boolean f226562R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f226563S = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f226579y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f226580z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f226564A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f226565B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f226566C = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f226567D = Float.NaN;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f226568E = Float.NaN;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f226569F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f226570G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f226571H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f226572I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f226573J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f226574K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f226575L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f226576M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f226577N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f226578O = Float.NaN;

    public C5413c() {
        this.f226558k = 1;
        this.f226559l = new HashMap<>();
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f226555h = i11;
            return true;
        }
        if (i10 == 301) {
            this.f226580z = i11;
            return true;
        }
        if (i10 == 302) {
            this.f226564A = i11;
            return true;
        }
        if (a(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean b(int i10, float f10) {
        if (i10 == 100) {
            this.f226572I = f10;
            return true;
        }
        switch (i10) {
            case 303:
                this.f226565B = f10;
                return true;
            case 304:
                this.f226575L = f10;
                return true;
            case 305:
                this.f226576M = f10;
                return true;
            case 306:
                this.f226577N = f10;
                return true;
            case 307:
                this.f226566C = f10;
                return true;
            case 308:
                this.f226568E = f10;
                return true;
            case 309:
                this.f226569F = f10;
                return true;
            case 310:
                this.f226567D = f10;
                return true;
            case 311:
                this.f226573J = f10;
                return true;
            case 312:
                this.f226574K = f10;
                return true;
            case 313:
                this.f226570G = f10;
                return true;
            case 314:
                this.f226571H = f10;
                return true;
            case 315:
                this.f226578O = f10;
                return true;
            case x.a.f238250q /* 316 */:
                this.f226572I = f10;
                return true;
            default:
                return false;
        }
    }

    @Override // q0.AbstractC5412b
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean d(int i10, String str) {
        if (i10 == 101) {
            this.f226557j = str;
            return true;
        }
        if (i10 != 317) {
            return super.d(i10, str);
        }
        this.f226579y = str;
        return true;
    }

    @Override // s0.x
    public int e(String str) {
        return w.a(str);
    }

    @Override // q0.AbstractC5412b
    public void f(HashMap<String, p> map) {
        for (String str : map.keySet()) {
            p pVar = map.get(str);
            if (pVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f226568E)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226568E);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f226569F)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226569F);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f226567D)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226567D);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f226575L)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226575L);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f226576M)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226576M);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f226577N)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226577N);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f226578O)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226578O);
                                break;
                            }
                            break;
                        case "pivotX":
                            if (Float.isNaN(this.f226568E)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226570G);
                                break;
                            }
                            break;
                        case "pivotY":
                            if (Float.isNaN(this.f226569F)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226571H);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f226573J)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226573J);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f226574K)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226574K);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f226566C)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226566C);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f226565B)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226565B);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f226572I)) {
                                break;
                            } else {
                                pVar.g(this.f226555h, this.f226572I);
                                break;
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes ".concat(str));
                            break;
                    }
                } else {
                    C5378b c5378b = this.f226559l.get(str.substring(7));
                    if (c5378b != null) {
                        ((p.c) pVar).k(this.f226555h, c5378b);
                    }
                }
            }
        }
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: g */
    public AbstractC5412b clone() {
        return null;
    }

    @Override // q0.AbstractC5412b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f226565B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f226566C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f226567D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f226568E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f226569F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f226570G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f226571H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f226575L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f226576M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f226577N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f226572I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f226573J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f226574K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f226578O)) {
            hashSet.add("progress");
        }
        if (this.f226559l.size() > 0) {
            Iterator<String> it = this.f226559l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // q0.AbstractC5412b
    public void q(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.f226565B)) {
            map.put("alpha", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226566C)) {
            map.put("elevation", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226567D)) {
            map.put("rotationZ", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226568E)) {
            map.put("rotationX", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226569F)) {
            map.put("rotationY", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226570G)) {
            map.put("pivotX", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226571H)) {
            map.put("pivotY", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226575L)) {
            map.put("translationX", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226576M)) {
            map.put("translationY", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226577N)) {
            map.put("translationZ", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226572I)) {
            map.put("pathRotate", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226573J)) {
            map.put("scaleX", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226574K)) {
            map.put("scaleY", Integer.valueOf(this.f226580z));
        }
        if (!Float.isNaN(this.f226578O)) {
            map.put("progress", Integer.valueOf(this.f226580z));
        }
        if (this.f226559l.size() > 0) {
            Iterator<String> it = this.f226559l.keySet().iterator();
            while (it.hasNext()) {
                map.put(y.a("CUSTOM,", it.next()), Integer.valueOf(this.f226580z));
            }
        }
    }

    public int v() {
        return this.f226580z;
    }

    public final float w(int i10) {
        if (i10 == 100) {
            return this.f226555h;
        }
        switch (i10) {
            case 303:
                return this.f226565B;
            case 304:
                return this.f226575L;
            case 305:
                return this.f226576M;
            case 306:
                return this.f226577N;
            case 307:
                return this.f226566C;
            case 308:
                return this.f226568E;
            case 309:
                return this.f226569F;
            case 310:
                return this.f226567D;
            case 311:
                return this.f226573J;
            case 312:
                return this.f226574K;
            case 313:
                return this.f226570G;
            case 314:
                return this.f226571H;
            case 315:
                return this.f226578O;
            case x.a.f238250q /* 316 */:
                return this.f226572I;
            default:
                return Float.NaN;
        }
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f226555h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int iA = w.a(strArr[i10]);
            System.out.println(strArr[i10] + com.prism.gaia.server.accounts.b.f166434b0 + w(iA));
        }
    }
}
