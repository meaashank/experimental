package d7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class b implements InterfaceC4302a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f194884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f194885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0719b f194886d;

    public interface a {
        void a(Application application);
    }

    /* JADX INFO: renamed from: d7.b$b, reason: collision with other inner class name */
    public interface InterfaceC0719b {
        void b(Activity activity);
    }

    public interface c {
        void a(Application application);
    }

    @Override // d7.InterfaceC4302a
    public void a(Application application) {
        a aVar = this.f194885c;
        if (aVar != null) {
            aVar.a(application);
        }
    }

    @Override // d7.InterfaceC4302a
    public void b(Activity activity) {
        InterfaceC0719b interfaceC0719b = this.f194886d;
        if (interfaceC0719b != null) {
            interfaceC0719b.b(activity);
        }
    }

    @Override // d7.InterfaceC4302a
    public void g(Application application) {
        c cVar = this.f194884b;
        if (cVar != null) {
            cVar.a(application);
        }
    }

    public void l(a aVar) {
        this.f194885c = aVar;
    }

    public void m(InterfaceC0719b interfaceC0719b) {
        this.f194886d = interfaceC0719b;
    }

    public void n(c cVar) {
        this.f194884b = cVar;
    }

    @Override // d7.InterfaceC4302a
    public void c(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void d(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void e(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void f(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void h(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void i(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void j(Activity activity) {
    }

    @Override // d7.InterfaceC4302a
    public void k(Intent intent) {
    }
}
