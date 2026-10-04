package v8;

import android.os.IBinder;
import android.os.RemoteException;
import com.prism.commons.utils.C3853q;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.natives.NativeMirror;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.C3919b;
import com.prism.gaia.naked.compat.android.net.NetworkInterfaceCompat2;
import com.prism.gaia.naked.compat.android.system.StructIfaddrsCompat2;
import com.prism.gaia.server.U;
import java.io.IOException;
import java.net.NetworkInterface;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5707q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239891b = "asdf-".concat(C5707q.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5707q f239892c = new C5707q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<U> f239893a = GProcessClient.f164187n.d6("device", U.class, new a());

    /* JADX INFO: renamed from: v8.q$a */
    public class a implements c.a<U> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public U a(IBinder iBinder) {
            return U.b.U0(iBinder);
        }
    }

    public static C5707q c() {
        return f239892c;
    }

    public void a(NetworkInterface networkInterface) {
        if (networkInterface != null && networkInterface.getName().equalsIgnoreCase("wlan0")) {
            NetworkInterfaceCompat2.Util.setHardwareAddr(networkInterface, C3853q.o(f239892c.n()));
        }
    }

    public void b(Object obj) {
        String ifaName = StructIfaddrsCompat2.Util.getIfaName(obj);
        if (ifaName == null || !ifaName.equalsIgnoreCase("wlan0")) {
            return;
        }
        StructIfaddrsCompat2.Util.setHardwareAddr(obj, C3853q.o(f239892c.n()));
    }

    public String d() {
        try {
            return m().d1();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String e() {
        try {
            return m().A3();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String f() {
        try {
            return m().getDeviceId();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String g() {
        try {
            return m().e4();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String h() {
        try {
            return m().A5();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String i() {
        try {
            return m().v3();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String j() {
        try {
            return m().k3();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String k() {
        try {
            return m().U4();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String l() {
        try {
            return m().b4();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public U m() {
        return (U) this.f239893a.b();
    }

    public String n() {
        try {
            return m().h3();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void o() {
        GFile gFileM = D9.d.M("wlan0");
        NativeMirror.addRuleRedirectFile("/sys/class/net/wlan0/address", gFileM.getAbsolutePath());
        if (gFileM.exists()) {
            return;
        }
        try {
            com.prism.gaia.helper.utils.l.w(gFileM, -1);
            com.prism.gaia.helper.utils.l.f0((n() + '\n').getBytes(C3919b.f165105a), gFileM);
        } catch (IOException unused) {
        }
    }
}
