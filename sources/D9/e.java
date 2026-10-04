package D9;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.UserManager;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.os.UserInfoG;
import com.prism.gaia.server.f0;
import java.util.List;
import p6.C5395b;
import p6.c;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23011c = "no_modify_accounts";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f23012d = "no_config_wifi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f23013e = "no_install_apps";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f23014f = "no_uninstall_apps";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f23015g = "no_share_location";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f23016h = "no_install_unknown_sources";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f23017i = "no_config_bluetooth";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f23018j = "no_usb_file_transfer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f23019k = "no_config_credentials";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f23020l = "no_remove_user";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<f0> f23022a = GProcessClient.f164187n.d6("user", f0.class, new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23010b = "asdf-".concat(e.class.getSimpleName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f23021m = new e();

    public class a implements c.a<f0> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 a(IBinder iBinder) {
            return f0.b.U0(iBinder);
        }
    }

    public static e b() {
        return f23021m;
    }

    public static int c() {
        return Integer.MAX_VALUE;
    }

    public static boolean u() {
        return true;
    }

    public UserInfoG a(String str, int i10) {
        try {
            return e().i5(str, i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public long d(GaiaUserHandle gaiaUserHandle) {
        return l(gaiaUserHandle.getIdentifier());
    }

    public final f0 e() {
        return (f0) this.f23022a.b();
    }

    public int f() {
        List<UserInfoG> listM = m();
        if (listM != null) {
            return listM.size();
        }
        return 1;
    }

    public GaiaUserHandle g(long j10) {
        int iH = h((int) j10);
        if (iH >= 0) {
            return new GaiaUserHandle(iH);
        }
        return null;
    }

    public int h(int i10) {
        try {
            return e().k5(i10);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public Bitmap i(int i10) {
        try {
            return e().M1(i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public UserInfoG j(int i10) {
        try {
            return e().k(i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @TargetApi(17)
    public UserManager k() {
        return (UserManager) GaiaContext.j().n().getSystemService("user");
    }

    public int l(int i10) {
        try {
            return e().Q5(i10);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public List<UserInfoG> m() {
        try {
            return e().z5(false);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public List<UserInfoG> n(boolean z10) {
        try {
            return e().z5(z10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean o() {
        try {
            return e().K5();
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i10) {
        try {
            return e().T(i10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public void r(boolean z10) {
        try {
            e().g2(z10);
        } catch (RemoteException unused) {
        }
    }

    public void s(int i10, Bitmap bitmap) {
        try {
            e().W3(i10, bitmap);
        } catch (RemoteException unused) {
        }
    }

    public void t(int i10, String str) {
        try {
            e().w5(i10, str);
        } catch (RemoteException unused) {
        }
    }
}
