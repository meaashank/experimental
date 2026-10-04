package v8;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncAdapterType;
import android.content.SyncRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.S;
import com.prism.gaia.server.content.SyncStatusInfo;
import java.util.List;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5706p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239887b = "asdf-".concat(C5706p.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5706p f239888c = new C5706p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<S> f239889a = GProcessClient.f164187n.d6("content", S.class, new a());

    /* JADX INFO: renamed from: v8.p$a */
    public class a implements c.a<S> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public S a(IBinder iBinder) {
            return S.b.U0(iBinder);
        }
    }

    public static C5706p e() {
        return f239888c;
    }

    public void A(boolean z10) {
        try {
            k().p4(z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void B(boolean z10, int i10) {
        try {
            k().i(z10, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void C(Account account, String str, boolean z10) {
        try {
            k().f4(account, str, z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void D(Account account, String str, boolean z10, int i10) {
        try {
            k().c3(account, str, z10, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void E(SyncRequest syncRequest) {
        try {
            k().I(syncRequest);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void F(SyncRequest syncRequest, int i10) {
        try {
            k().X4(syncRequest, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void G(com.prism.gaia.client.stub.q qVar) {
        try {
            k().R4(qVar);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void a(Account account, String str, Bundle bundle, long j10) {
        try {
            k().G1(account, str, bundle, j10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void b(int i10, ISyncStatusObserver iSyncStatusObserver) {
        try {
            k().F0(i10, iSyncStatusObserver);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void c(Account account, String str, ComponentName componentName) {
        try {
            k().w0(account, str, componentName);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void d(Account account, String str, ComponentName componentName, int i10) {
        try {
            k().s3(account, str, componentName, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int f(Account account, String str) throws RemoteException {
        try {
            return k().E5(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int g(Account account, String str, int i10) {
        try {
            return k().w3(account, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean h() {
        try {
            return k().J2();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean i(int i10) {
        try {
            return k().X0(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public List<PeriodicSync> j(Account account, String str, ComponentName componentName) {
        try {
            return k().Q1(account, str, componentName);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public S k() {
        return (S) this.f239889a.b();
    }

    public SyncAdapterType[] l() {
        try {
            return k().R0();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public SyncAdapterType[] m(int i10) {
        try {
            return k().F2(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean n(Account account, String str) {
        try {
            return k().c4(account, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean o(Account account, String str, int i10) {
        try {
            return k().t1(account, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public SyncStatusInfo p(Account account, String str, ComponentName componentName) {
        return null;
    }

    public SyncStatusInfo q(Account account, String str, ComponentName componentName, int i10) {
        return null;
    }

    public boolean r(Account account, String str, ComponentName componentName) {
        try {
            return k().j2(account, str, componentName);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean s(Account account, String str, ComponentName componentName) {
        try {
            return k().N1(account, str, componentName);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean t(Account account, String str, ComponentName componentName, int i10) {
        try {
            return k().C(account, str, componentName, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void u(Uri uri, com.prism.gaia.client.stub.q qVar, boolean z10, int i10, int i11, int i12) {
        try {
            k().F1(uri, qVar, z10, i10, i11, i12);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void v(Uri uri, boolean z10, com.prism.gaia.client.stub.q qVar, int i10, int i11) {
        try {
            k().U1(uri, z10, qVar, i10, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void w(Account account, String str, Bundle bundle) {
        try {
            k().u1(account, str, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void x(ISyncStatusObserver iSyncStatusObserver) {
        try {
            k().l4(iSyncStatusObserver);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void y(Account account, String str, Bundle bundle) {
        try {
            k().a1(account, str, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void z(Account account, String str, int i10) {
        try {
            k().Y0(account, str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }
}
