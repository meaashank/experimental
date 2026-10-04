package q0;

import java.util.HashMap;
import java.util.HashSet;
import p0.C5378b;
import s0.p;
import s0.x;

/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5412b implements x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f226543m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f226544n = "alpha";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f226545o = "elevation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f226546p = "rotationZ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f226547q = "rotationX";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f226548r = "transitionPathRotate";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f226549s = "scaleX";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f226550t = "scaleY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f226551u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f226552v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f226553w = "CUSTOM";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f226554x = "visibility";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f226555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f226556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f226557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f226558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, C5378b> f226559l;

    public AbstractC5412b() {
        int i10 = f226543m;
        this.f226555h = i10;
        this.f226556i = i10;
        this.f226557j = null;
    }

    @Override // s0.x
    public boolean a(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f226555h = i11;
        return true;
    }

    @Override // s0.x
    public boolean b(int i10, float f10) {
        return false;
    }

    @Override // s0.x
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // s0.x
    public boolean d(int i10, String str) {
        if (i10 != 101) {
            return false;
        }
        this.f226557j = str;
        return true;
    }

    public abstract void f(HashMap<String, p> map);

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5412b clone();

    public AbstractC5412b h(AbstractC5412b abstractC5412b) {
        this.f226555h = abstractC5412b.f226555h;
        this.f226556i = abstractC5412b.f226556i;
        this.f226557j = abstractC5412b.f226557j;
        this.f226558k = abstractC5412b.f226558k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f226555h;
    }

    public boolean k(String str) {
        String str2 = this.f226557j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i10, float f10) {
        this.f226559l.put(str, new C5378b(str, i10, f10));
    }

    public void m(String str, int i10, int i11) {
        this.f226559l.put(str, new C5378b(str, i10, i11));
    }

    public void n(String str, int i10, String str2) {
        this.f226559l.put(str, new C5378b(str, i10, str2));
    }

    public void o(String str, int i10, boolean z10) {
        this.f226559l.put(str, new C5378b(str, i10, z10));
    }

    public void p(int i10) {
        this.f226555h = i10;
    }

    public AbstractC5412b r(int i10) {
        this.f226556i = i10;
        return this;
    }

    public boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void q(HashMap<String, Integer> map) {
    }
}
