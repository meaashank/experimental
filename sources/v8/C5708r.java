package v8;

import android.os.IBinder;
import android.os.Process;
import com.prism.commons.utils.n0;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.GGuestUncaughtException;
import com.prism.gaia.server.I;
import com.prism.gaia.server.V;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5708r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239895b = "asdf-".concat(C5708r.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5708r f239896c = new C5708r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<V> f239897a = GProcessClient.f164187n.d6("guest_crash", V.class, new a());

    /* JADX INFO: renamed from: v8.r$a */
    public class a implements c.a<V> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(IBinder iBinder) {
            return V.b.U0(iBinder);
        }
    }

    public static C5708r b() {
        return f239896c;
    }

    public void a(Thread thread, Throwable th, boolean z10) {
        int iMyPid = Process.myPid();
        thread.getId();
        String strS = GaiaContext.j().s();
        GaiaContext gaiaContext = GaiaContext.f164212y;
        String strV = gaiaContext.v();
        if (gaiaContext.e0()) {
            strV = gaiaContext.r();
        }
        String str = strV;
        th.getMessage();
        try {
            Exception runtimeException = th instanceof Exception ? (Exception) th : new RuntimeException(th);
            if (gaiaContext.q() != null) {
                gaiaContext.n().getPackageName();
            }
            boolean zG = n0.g();
            V vV5 = gaiaContext.j0() ? I.v5() : (V) this.f239897a.b();
            if (vV5 == null || vV5.asBinder() == null || !vV5.asBinder().isBinderAlive()) {
                return;
            }
            vV5.l(new GGuestUncaughtException(iMyPid, zG, strS, str, runtimeException), z10);
        } catch (Exception unused) {
        }
    }
}
