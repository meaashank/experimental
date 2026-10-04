package U6;

import androidx.compose.animation.core.E0;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f73874f = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f73877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f73878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f73879e;

    public p(String str) {
        this(str, false);
    }

    public final String a(String str, long j10) {
        this.f73879e = false;
        return c(E0.a(new StringBuilder(), this.f73875a, " -> ", str), j10 - this.f73877c);
    }

    public String b() {
        return !this.f73876b ? "" : c(android.support.v4.media.e.a(new StringBuilder(), this.f73875a, " -> done"), System.currentTimeMillis() - this.f73878d);
    }

    public final String c(String str, long j10) {
        return str + " using: " + j10 + "ms";
    }

    public String d() {
        return e("begin");
    }

    public String e(String str) {
        return !this.f73876b ? "" : E0.a(new StringBuilder(), this.f73875a, " -> ", str);
    }

    public p f() {
        if (!this.f73876b) {
            return this;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f73877c = jCurrentTimeMillis;
        if (this.f73878d == -1) {
            this.f73878d = jCurrentTimeMillis;
        }
        this.f73879e = true;
        return this;
    }

    public String g(String str) {
        return !this.f73876b ? "" : !this.f73879e ? c(E0.a(new StringBuilder("!!NOT_STARTED!! "), this.f73875a, " -", str), -1L) : a(str, System.currentTimeMillis());
    }

    public String h(String str) {
        if (!this.f73876b) {
            return "";
        }
        if (!this.f73879e) {
            return c(E0.a(new StringBuilder("!!NOT_STARTED!! "), this.f73875a, " -", str), -1L);
        }
        String strA = a(str, System.currentTimeMillis());
        f();
        return strA;
    }

    public p(String str, boolean z10) {
        this.f73877c = 0L;
        this.f73878d = -1L;
        this.f73879e = false;
        this.f73875a = str;
        this.f73876b = z10;
    }
}
