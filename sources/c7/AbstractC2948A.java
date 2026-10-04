package c7;

/* JADX INFO: renamed from: c7.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2948A implements InterfaceC2957i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f131235d = "asdf-".concat(AbstractC2948A.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f131237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f131238c;

    public AbstractC2948A() {
        this(-1);
    }

    @Override // c7.InterfaceC2957i
    public Runnable a(Object[] objArr) {
        b(objArr);
        return null;
    }

    @Override // c7.InterfaceC2957i
    public final void b(Object[] objArr) {
        int iE = e(objArr);
        if (iE >= 0) {
            f(objArr, iE);
        }
    }

    public int c(Object[] objArr) {
        return -1;
    }

    public int d() {
        return -1;
    }

    public final int e(Object[] objArr) {
        int iC = this.f131236a;
        if (iC < 0) {
            iC = c(objArr);
        }
        if (this.f131237b) {
            if (objArr.length <= iC) {
                return -1;
            }
            Class<?> cls = this.f131238c;
            if (cls != null && iC >= 0 && !cls.isInstance(objArr[iC])) {
                this.f131238c.getCanonicalName();
                return -1;
            }
        }
        return iC;
    }

    public abstract void f(Object[] objArr, int i10);

    public void g(Class<?> cls) {
        this.f131237b = true;
        this.f131238c = cls;
    }

    public AbstractC2948A(int i10) {
        this.f131237b = false;
        this.f131238c = null;
        this.f131236a = i10 < 0 ? -1 : i10;
    }
}
