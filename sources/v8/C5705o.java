package v8;

import android.os.Bundle;
import android.os.IBinder;
import com.prism.bugreport.commons.ParcelableException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.utils.l;
import com.prism.gaia.server.BinderC4156g;
import com.prism.gaia.server.Q;
import k6.InterfaceC4829b;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5705o implements InterfaceC4829b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239883b = "asdf-".concat(C5705o.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5705o f239884c = new C5705o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<Q> f239885a = GProcessClient.f164187n.d6("bug_reporter", Q.class, new a());

    /* JADX INFO: renamed from: v8.o$a */
    public class a implements c.a<Q> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Q a(IBinder iBinder) {
            return Q.b.U0(iBinder);
        }
    }

    public static C5705o c() {
        return f239884c;
    }

    public static void f() {
        Bundle bundle = new Bundle();
        bundle.putInt("TestIntKey", l.b.f165186t);
        f239884c.e(new Throwable("TestThrowable"), "TestPackage", "TestGuestProcess", "TEST_REPORT", bundle);
    }

    @Override // k6.InterfaceC4829b
    public void a(Throwable th, String str, Bundle bundle) {
        GaiaContext gaiaContextJ = GaiaContext.j();
        String strR = gaiaContextJ.r();
        String str2 = strR == null ? com.prism.lib_google_billing.q.f194113a : strR;
        String strS = gaiaContextJ.s();
        e(th, str2, strS == null ? com.prism.lib_google_billing.q.f194113a : strS, str, bundle);
    }

    public final Q b() {
        return GaiaContext.j().e0() ? (Q) this.f239885a.b() : BinderC4156g.h2();
    }

    public void d(String str) {
        try {
            b().x2(str);
        } catch (Throwable unused) {
        }
    }

    public void e(Throwable th, String str, String str2, String str3, Bundle bundle) {
        try {
            b().b5(new ParcelableException(th), str, str2, str3, bundle);
        } catch (Throwable unused) {
        }
    }

    public void g() {
        try {
            b().S4();
        } catch (Throwable unused) {
        }
    }
}
