package v8;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.M;
import java.util.Map;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5693c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C5693c f239866b = new C5693c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<M> f239867a = GProcessClient.f164187n.d6("account", M.class, new a());

    /* JADX INFO: renamed from: v8.c$a */
    public class a implements c.a<M> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public M a(IBinder iBinder) {
            return M.b.h2(iBinder);
        }
    }

    public static C5693c k() {
        return f239866b;
    }

    public String A(Account account) {
        try {
            return B().C0(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public M B() {
        return (M) this.f239867a.b();
    }

    public String C(Account account, String str) {
        try {
            return B().a0(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void D(IBinder iBinder, Account account, String[] strArr, String str) {
        try {
            B().C4(iBinder, account, strArr, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void E(String str, String str2) {
        try {
            B().x5(str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void F(IBinder iBinder, Account account, String str) {
        try {
            B().G2(iBinder, account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String G(Account account, String str) {
        try {
            return B().l3(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void H(String[] strArr, String str) {
        try {
            B().M0(strArr, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void I(IBinder iBinder, Account account, boolean z10) {
        try {
            B().C2(iBinder, account, z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void J(IBinder iBinder, Account account, boolean z10, int i10) {
        try {
            B().w1(iBinder, account, z10, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean K(Account account) {
        try {
            return B().h(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean L(Account account, int i10) {
        try {
            return B().p5(account, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void M(IBinder iBinder, Account account, String str) {
        try {
            B().N4(iBinder, account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean N(Account account, String str, int i10) {
        try {
            return B().K2(account, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void O(Account account, String str, String str2) {
        try {
            B().s(account, str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void P(Account account, String str) {
        try {
            B().q1(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void Q(Account account, String str, String str2) {
        try {
            B().Q3(account, str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void R(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) {
        try {
            B().w(iBinder, str, str2, strArr, z10, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void S(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) {
        try {
            B().E(iBinder, account, str, z10, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void T(String[] strArr, String str) {
        try {
            B().t2(strArr, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void U(Account account, String str, int i10, boolean z10) {
        try {
            B().S0(account, str, i10, z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void V(IBinder iBinder, Account account, String str, boolean z10, Bundle bundle) {
        try {
            B().p(iBinder, account, str, z10, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean a(Account account) {
        try {
            return B().R3(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void b(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle) {
        try {
            B().M3(iBinder, str, str2, strArr, z10, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void c(IBinder iBinder, String str, String str2, String[] strArr, boolean z10, Bundle bundle, int i10) {
        try {
            B().c1(iBinder, str, str2, strArr, z10, bundle, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean d(Account account, String str, Bundle bundle) {
        try {
            return B().D4(account, str, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean e(Account account, String str, Bundle bundle, Map map) {
        try {
            return B().A(account, str, bundle, map);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Bundle f(String str, int i10) {
        try {
            return B().I2(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void g(Account account) {
        try {
            B().r4(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void h(IBinder iBinder, Account account, Bundle bundle, boolean z10, int i10) {
        try {
            B().G0(iBinder, account, bundle, z10, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void i(IBinder iBinder, String str, boolean z10) {
        try {
            B().M4(iBinder, str, z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void j(IBinder iBinder, Bundle bundle, boolean z10, Bundle bundle2, int i10) {
        try {
            B().T4(iBinder, bundle, z10, bundle2, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void l(IBinder iBinder, String str, String[] strArr, String str2) {
        try {
            B().L0(iBinder, str, strArr, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int m(Account account, String str) {
        try {
            return B().Y(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Account[] n(String str, String str2) {
        try {
            return B().b2(str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Map o(String str, String str2) {
        try {
            return B().S3(str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Account[] p(String str, int i10, String str2) {
        try {
            return B().Q4(str, i10, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void q(IBinder iBinder, String str, String[] strArr, String str2) {
        try {
            B().j5(iBinder, str, strArr, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Account[] r(String str, String str2, String str3) {
        try {
            return B().o4(str, str2, str3);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Account[] s(int i10) {
        try {
            return B().D(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Account[] t(String str, int i10, String str2) {
        try {
            return B().F(str, i10, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void u(IBinder iBinder, Account account, String str, boolean z10, boolean z11, Bundle bundle) {
        try {
            B().m3(iBinder, account, str, z10, z11, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void v(IBinder iBinder, String str, String str2) {
        try {
            B().c5(iBinder, str, str2);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public AuthenticatorDescription[] w(int i10) {
        try {
            return B().E1(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Map x(Account account) {
        try {
            return B().o3(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Map<String, Integer> y(Account account, int i10) {
        try {
            return B().s1(account, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Object z(Account account) {
        try {
            return B().c0(account);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }
}
