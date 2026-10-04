package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f105942h;

    public f(char[] cArr) {
        super(cArr);
        this.f105942h = Float.NaN;
    }

    public static d C(char[] cArr) {
        return new f(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, i10);
        float fJ = j();
        int i12 = (int) fJ;
        if (i12 == fJ) {
            sb2.append(i12);
        } else {
            sb2.append(fJ);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        float fJ = j();
        int i10 = (int) fJ;
        if (i10 == fJ) {
            return android.support.v4.media.c.a("", i10);
        }
        return "" + fJ;
    }

    public boolean D() {
        float fJ = j();
        return ((float) ((int) fJ)) == fJ;
    }

    public void E(float f10) {
        this.f105942h = f10;
    }

    @Override // androidx.constraintlayout.core.parser.d
    public float j() {
        if (Float.isNaN(this.f105942h)) {
            this.f105942h = Float.parseFloat(c());
        }
        return this.f105942h;
    }

    @Override // androidx.constraintlayout.core.parser.d
    public int k() {
        if (Float.isNaN(this.f105942h)) {
            this.f105942h = Integer.parseInt(c());
        }
        return (int) this.f105942h;
    }

    public f(float f10) {
        super(null);
        this.f105942h = f10;
    }
}
