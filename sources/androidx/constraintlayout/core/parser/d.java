package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f105934f = 80;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f105935g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f105936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f105937b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105938c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f105939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105940e;

    public d(char[] cArr) {
        this.f105936a = cArr;
    }

    public String A(int i10, int i11) {
        return "";
    }

    public String B() {
        return "";
    }

    public void b(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public String c() {
        String str = new String(this.f105936a);
        long j10 = this.f105938c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f105937b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f105937b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public d g() {
        return this.f105939d;
    }

    public String h() {
        if (!CLParser.f105919d) {
            return "";
        }
        return q() + " -> ";
    }

    public long i() {
        return this.f105938c;
    }

    public float j() {
        if (this instanceof f) {
            return ((f) this).j();
        }
        return Float.NaN;
    }

    public int k() {
        if (this instanceof f) {
            return ((f) this).k();
        }
        return 0;
    }

    public int n() {
        return this.f105940e;
    }

    public long o() {
        return this.f105937b;
    }

    public String q() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean s() {
        return this.f105938c != Long.MAX_VALUE;
    }

    public boolean t() {
        return this.f105937b > -1;
    }

    public String toString() {
        long j10 = this.f105937b;
        long j11 = this.f105938c;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f105937b);
            sb2.append(com.prism.gaia.download.a.f164606q);
            return android.support.v4.media.session.f.a(sb2, this.f105938c, ")");
        }
        return q() + " (" + this.f105937b + " : " + this.f105938c + ") <<" + new String(this.f105936a).substring((int) this.f105937b, ((int) this.f105938c) + 1) + ">>";
    }

    public boolean v() {
        return this.f105937b == -1;
    }

    public void w(c cVar) {
        this.f105939d = cVar;
    }

    public void x(long j10) {
        if (this.f105938c != Long.MAX_VALUE) {
            return;
        }
        this.f105938c = j10;
        if (CLParser.f105919d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        c cVar = this.f105939d;
        if (cVar != null) {
            cVar.C(this);
        }
    }

    public void y(int i10) {
        this.f105940e = i10;
    }

    public void z(long j10) {
        this.f105937b = j10;
    }
}
