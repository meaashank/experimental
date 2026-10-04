package D8;

import U6.j;

/* JADX INFO: loaded from: classes6.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22982b = false;

    public void a(T t10) {
        this.f22981a = t10;
        this.f22982b = true;
    }

    public T b() {
        return this.f22981a;
    }

    public boolean c() {
        return this.f22982b;
    }

    public String toString() {
        return String.format("(%s)%s", this.f22982b ? "filled" : "unfilled", j.I(this.f22981a));
    }
}
