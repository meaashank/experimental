package u0;

/* JADX INFO: renamed from: u0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5635c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f239332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f239333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f239334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f239335d;

    public boolean a(int i10, int i11) {
        int i12;
        int i13 = this.f239332a;
        return i10 >= i13 && i10 < i13 + this.f239334c && i11 >= (i12 = this.f239333b) && i11 < i12 + this.f239335d;
    }

    public int b() {
        return (this.f239332a + this.f239334c) / 2;
    }

    public int c() {
        return (this.f239333b + this.f239335d) / 2;
    }

    public void d(int i10, int i11) {
        this.f239332a -= i10;
        this.f239333b -= i11;
        this.f239334c = (i10 * 2) + this.f239334c;
        this.f239335d = (i11 * 2) + this.f239335d;
    }

    public boolean e(C5635c c5635c) {
        int i10;
        int i11;
        int i12 = this.f239332a;
        int i13 = c5635c.f239332a;
        return i12 >= i13 && i12 < i13 + c5635c.f239334c && (i10 = this.f239333b) >= (i11 = c5635c.f239333b) && i10 < i11 + c5635c.f239335d;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f239332a = i10;
        this.f239333b = i11;
        this.f239334c = i12;
        this.f239335d = i13;
    }
}
