package q0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p0.C5378b;
import s0.F;
import s0.p;
import s0.u;
import s0.z;

/* JADX INFO: renamed from: q0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5416f extends AbstractC5412b {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f226633Q = "KeyTimeCycle";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f226634R = "KeyTimeCycle";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f226635S = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f226652y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f226653z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f226636A = Float.NaN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f226637B = Float.NaN;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f226638C = Float.NaN;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f226639D = Float.NaN;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f226640E = Float.NaN;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f226641F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f226642G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f226643H = Float.NaN;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f226644I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f226645J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f226646K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f226647L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f226648M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f226649N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f226650O = Float.NaN;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f226651P = 0.0f;

    public C5416f() {
        this.f226558k = 3;
        this.f226559l = new HashMap<>();
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f226555h = i11;
            return true;
        }
        if (i10 != 421) {
            return super.a(i10, i11);
        }
        this.f226648M = i11;
        return true;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.f226647L = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 401) {
            this.f226653z = u(Float.valueOf(f10));
            return true;
        }
        if (i10 == 403) {
            this.f226636A = f10;
            return true;
        }
        if (i10 == 416) {
            this.f226641F = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 423) {
            this.f226650O = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 424) {
            this.f226651P = t(Float.valueOf(f10));
            return true;
        }
        switch (i10) {
            case 304:
                this.f226644I = t(Float.valueOf(f10));
                return true;
            case 305:
                this.f226645J = t(Float.valueOf(f10));
                return true;
            case 306:
                this.f226646K = t(Float.valueOf(f10));
                return true;
            case 307:
                this.f226637B = t(Float.valueOf(f10));
                return true;
            case 308:
                this.f226639D = t(Float.valueOf(f10));
                return true;
            case 309:
                this.f226640E = t(Float.valueOf(f10));
                return true;
            case 310:
                this.f226638C = t(Float.valueOf(f10));
                return true;
            case 311:
                this.f226642G = t(Float.valueOf(f10));
                return true;
            case 312:
                this.f226643H = t(Float.valueOf(f10));
                return true;
            default:
                return false;
        }
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // q0.AbstractC5412b, s0.x
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f226652y = str;
            return true;
        }
        if (i10 != 421) {
            return super.d(i10, str);
        }
        this.f226648M = 7;
        this.f226649N = str;
        return true;
    }

    @Override // s0.x
    public int e(String str) {
        return z.a(str);
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: g */
    public AbstractC5412b clone() {
        C5416f c5416f = new C5416f();
        c5416f.h(this);
        return c5416f;
    }

    @Override // q0.AbstractC5412b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f226636A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f226637B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f226638C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f226639D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f226640E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f226642G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f226643H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f226641F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f226644I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f226645J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f226646K)) {
            hashSet.add("translationZ");
        }
        if (this.f226559l.size() > 0) {
            Iterator<String> it = this.f226559l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, u> map) {
        for (String str : map.keySet()) {
            u uVar = map.get(str);
            if (uVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f226639D)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226639D, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f226640E)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226640E, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.f226638C)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226638C, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f226644I)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226644I, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f226645J)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226645J, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f226646K)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226646K, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f226647L)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226647L, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f226642G)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226642G, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f226643H)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226643H, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f226646K)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226646K, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f226636A)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226636A, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.f226641F)) {
                                break;
                            } else {
                                uVar.c(this.f226555h, this.f226641F, this.f226650O, this.f226648M, this.f226651P);
                                break;
                            }
                            break;
                        default:
                            F.f("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    C5378b c5378b = this.f226559l.get(str.substring(7));
                    if (c5378b != null) {
                        ((u.b) uVar).g(this.f226555h, c5378b, this.f226650O, this.f226648M, this.f226651P);
                    }
                }
            }
        }
    }

    @Override // q0.AbstractC5412b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C5416f h(AbstractC5412b abstractC5412b) {
        super.h(abstractC5412b);
        C5416f c5416f = (C5416f) abstractC5412b;
        this.f226652y = c5416f.f226652y;
        this.f226653z = c5416f.f226653z;
        this.f226648M = c5416f.f226648M;
        this.f226650O = c5416f.f226650O;
        this.f226651P = c5416f.f226651P;
        this.f226647L = c5416f.f226647L;
        this.f226636A = c5416f.f226636A;
        this.f226637B = c5416f.f226637B;
        this.f226638C = c5416f.f226638C;
        this.f226641F = c5416f.f226641F;
        this.f226639D = c5416f.f226639D;
        this.f226640E = c5416f.f226640E;
        this.f226642G = c5416f.f226642G;
        this.f226643H = c5416f.f226643H;
        this.f226644I = c5416f.f226644I;
        this.f226645J = c5416f.f226645J;
        this.f226646K = c5416f.f226646K;
        return this;
    }

    @Override // q0.AbstractC5412b
    public void f(HashMap<String, p> map) {
    }
}
