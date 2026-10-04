package W4;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f76610c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f76611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f76612b = new b();

    public interface a {
        void a(b bVar);
    }

    public static c b() {
        return f76610c;
    }

    public b a(Context context) {
        return this.f76612b;
    }

    public final void c() {
        a aVar = this.f76611a;
        if (aVar != null) {
            aVar.a(this.f76612b);
        }
    }

    public void d(int i10, int i11, int i12, int i13) {
        this.f76612b.j(i10);
        this.f76612b.l(i11);
        this.f76612b.i(i12);
        this.f76612b.k(i13);
        c();
    }

    public void e(int i10) {
        this.f76612b.g(i10);
        c();
    }

    public void f(a aVar) {
        this.f76611a = aVar;
    }
}
