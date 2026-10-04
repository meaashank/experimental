package v8;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Service;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import com.prism.commons.notification.NotificationBundle;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.os.ParceledListSliceG;
import com.prism.gaia.server.Z;
import com.prism.lib.notification.NotificationCustom;
import java.util.ArrayList;
import java.util.List;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5710t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239902c = l0.b(C5710t.class.getSimpleName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5710t f239903d = new C5710t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5395b<Z> f239905b = GProcessClient.f164187n.d6("notification", Z.class, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K9.h f239904a = new K9.k();

    /* JADX INFO: renamed from: v8.t$a */
    public class a implements c.a<Z> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Z a(IBinder iBinder) {
            return Z.b.U0(iBinder);
        }
    }

    public static void i(Service service, int i10) {
        try {
            NotificationBundle notificationBundleF = NotificationCustom.f(service);
            A6.l.b(service, notificationBundleF.f161981id, notificationBundleF.notification, i10);
            if (C3841e.s() || !notificationBundleF.fade) {
                return;
            }
            U6.c.r().b().d(GaiaContext.j().z());
        } catch (Throwable unused) {
        }
    }

    public static void j(Service service) {
        try {
            service.stopForeground(true);
        } catch (Throwable unused) {
        }
    }

    public static C5710t k() {
        return f239903d;
    }

    public void a(String str, int i10) {
        try {
            u().Z3(str, i10);
        } catch (RemoteException unused) {
        }
    }

    public void b(String str, int i10, String str2, int i11) {
        try {
            u().K4(str, i10, str2, i11);
        } catch (RemoteException unused) {
        }
    }

    public void c(String str, List<NotificationChannelGroup> list, int i10) {
        try {
            u().W2(str, new ParceledListSliceG(list), i10);
        } catch (RemoteException unused) {
        }
    }

    public void d(String str, List<NotificationChannel> list, int i10) {
        try {
            u().B5(str, new ParceledListSliceG(list), i10);
        } catch (RemoteException unused) {
        }
    }

    public void e(String str, String str2, int i10) {
        try {
            u().z0(str, str2, i10);
        } catch (RemoteException unused) {
        }
    }

    public void f(String str, String str2, int i10) {
        try {
            u().G4(str, str2, i10);
        } catch (RemoteException unused) {
        }
    }

    public void g(int i10, String str, Notification notification) {
        try {
            u().g1(i10, str, notification);
        } catch (RemoteException unused) {
        }
    }

    public NotificationBundle h(String str, String str2, int i10, String str3, Notification notification, int i11) {
        try {
            return u().l1(str, str2, i10, str3, notification, i11);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public List<StatusBarNotification> l(String str, int i10) {
        try {
            return u().X2(str, i10).getList();
        } catch (RemoteException unused) {
            return new ArrayList(0);
        }
    }

    public NotificationChannel m(String str, String str2, String str3, boolean z10, int i10) {
        try {
            return u().Z2(str, str2, str3, z10, i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public NotificationManager n() {
        return (NotificationManager) GaiaContext.j().n().getSystemService("notification");
    }

    public NotificationChannel o(String str, String str2, int i10) {
        try {
            return u().A1(str, str2, i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public NotificationChannelGroup p(String str, String str2, int i10) {
        try {
            return u().e1(str, str2, i10);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public List<NotificationChannelGroup> q(String str, int i10) {
        try {
            return u().q3(str, i10).getList();
        } catch (RemoteException unused) {
            return new ArrayList();
        }
    }

    public List<NotificationChannel> r(String str, int i10) {
        try {
            return u().r2(str, i10).getList();
        } catch (RemoteException unused) {
            return new ArrayList();
        }
    }

    public int s(String str, int i10) {
        try {
            return u().d3(str, i10);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    public int t(String str, int i10) {
        try {
            return u().L(str, i10);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    public Z u() {
        return (Z) this.f239905b.b();
    }

    public void v(String str, NotificationChannel notificationChannel, int i10) {
        try {
            u().d5(str, notificationChannel, i10);
        } catch (RemoteException unused) {
        }
    }
}
