package r6;

/* JADX INFO: loaded from: classes5.dex */
public class f<T> extends AbstractC5535c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f227239d;

    public f() {
        this(false, null);
    }

    @Override // r6.AbstractC5535c
    public void c(T t10) {
        this.f227239d = t10;
        super.c(t10);
    }

    @Override // r6.AbstractC5535c
    public T f() {
        return this.f227239d;
    }

    public T o() {
        return this.f227239d;
    }

    public f(T t10) {
        this(true, t10);
    }

    public f(boolean z10, T t10) {
        super(z10);
        this.f227239d = t10;
    }
}
