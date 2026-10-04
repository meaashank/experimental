package y8;

import I9.a;
import android.os.IBinder;
import android.os.RemoteException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.remote.AppProceedInfo;
import com.prism.gaia.remote.GInstallProgress;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.GuestAppSizeG;
import com.prism.gaia.server.O;
import java.util.List;
import p6.C5395b;
import p6.c;
import v8.C5714x;

/* JADX INFO: renamed from: y8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5842a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f241111b = "asdf-".concat(C5842a.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5842a f241112c = new C5842a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<O> f241113a = GProcessClient.f164187n.d6("app", O.class, new C0911a());

    /* JADX INFO: renamed from: y8.a$a, reason: collision with other inner class name */
    public class C0911a implements c.a<O> {
        public C0911a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O a(IBinder iBinder) {
            return O.b.T5(iBinder);
        }
    }

    /* JADX INFO: renamed from: y8.a$b */
    public class b extends a.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Z6.a f241115g;

        public b(Z6.a aVar) {
            this.f241115g = aVar;
        }

        @Override // I9.a
        public void b(AppProceedInfo appProceedInfo) throws RemoteException {
            try {
                this.f241115g.b(appProceedInfo);
            } catch (Exception unused) {
                String unused2 = C5842a.f241111b;
            }
        }

        @Override // I9.a
        public void d(String str) throws RemoteException {
            try {
                this.f241115g.d(str);
            } catch (Exception unused) {
                String unused2 = C5842a.f241111b;
            }
        }

        @Override // I9.a
        public void e(AppProceedInfo appProceedInfo) throws RemoteException {
            try {
                this.f241115g.e(appProceedInfo);
            } catch (Exception unused) {
                String unused2 = C5842a.f241111b;
            }
        }

        @Override // I9.a
        public void f(GuestAppInfo guestAppInfo) throws RemoteException {
            try {
                this.f241115g.f(guestAppInfo);
            } catch (Exception unused) {
                String unused2 = C5842a.f241111b;
            }
        }

        @Override // I9.a
        public void g(GuestAppInfo guestAppInfo) throws RemoteException {
            try {
                this.f241115g.g(guestAppInfo);
            } catch (Exception unused) {
                String unused2 = C5842a.f241111b;
            }
        }

        @Override // I9.a
        public void v4(List<GuestAppInfo> list, List<AppProceedInfo> list2) throws RemoteException {
            try {
                this.f241115g.a(list, list2, null);
            } catch (Exception e10) {
                String unused = C5842a.f241111b;
                this.f241115g.a(list, list2, e10);
            }
        }
    }

    public static C5842a m() {
        return f241112c;
    }

    public boolean b(String str, int i10) {
        try {
            return i().S(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean c(String str, int i10) {
        try {
            return i().E0(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public List<GuestAppInfo> d() {
        try {
            return i().I0();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public GuestAppInfo e(String str) {
        try {
            return i().I3(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public GInstallProgress f(String str) {
        try {
            return i().O4(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int[] g(String str) {
        try {
            return i().F5(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public GuestAppSizeG h(String str, int i10) {
        try {
            return i().W4(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public final O i() {
        return (O) this.f241113a.b();
    }

    public AppProceedInfo j(String str, int i10) {
        try {
            return i().H1(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public AppProceedInfo k(String str) {
        try {
            return i().m(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public AppProceedInfo l(String str, int i10) {
        try {
            return i().z2(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void n(Z6.a aVar) throws Throwable {
        i().h5(new b(aVar));
    }

    public void o() {
        try {
            i().z4();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public AppProceedInfo p(String str) {
        try {
            return i().B(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void q(String str, String str2) {
        try {
            i().D2(str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void r(String str) {
        try {
            i().t0(str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean s(String str, int i10) {
        try {
            boolean zD0 = i().d0(str, i10);
            if (!zD0) {
                return zD0;
            }
            C5714x.j().e0(str, i10);
            return zD0;
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean t(String str) {
        try {
            boolean zS2 = i().S2(str);
            if (!zS2) {
                return zS2;
            }
            C5714x.j().e0(str, -1);
            return zS2;
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void u(GInstallProgress gInstallProgress) {
        try {
            i().W0(gInstallProgress);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }
}
