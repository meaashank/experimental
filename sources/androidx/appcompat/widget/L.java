package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class L {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86004i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86005a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86006b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86007c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86008d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86009e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86010f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86011g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86012h = false;

    public int a() {
        return this.f86011g ? this.f86005a : this.f86006b;
    }

    public int b() {
        return this.f86005a;
    }

    public int c() {
        return this.f86006b;
    }

    public int d() {
        return this.f86011g ? this.f86006b : this.f86005a;
    }

    public void e(int i10, int i11) {
        this.f86012h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f86009e = i10;
            this.f86005a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f86010f = i11;
            this.f86006b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f86011g) {
            return;
        }
        this.f86011g = z10;
        if (!this.f86012h) {
            this.f86005a = this.f86009e;
            this.f86006b = this.f86010f;
            return;
        }
        if (z10) {
            int i10 = this.f86008d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f86009e;
            }
            this.f86005a = i10;
            int i11 = this.f86007c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f86010f;
            }
            this.f86006b = i11;
            return;
        }
        int i12 = this.f86007c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f86009e;
        }
        this.f86005a = i12;
        int i13 = this.f86008d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f86010f;
        }
        this.f86006b = i13;
    }

    public void g(int i10, int i11) {
        this.f86007c = i10;
        this.f86008d = i11;
        this.f86012h = true;
        if (this.f86011g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f86005a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f86006b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f86005a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f86006b = i11;
        }
    }
}
