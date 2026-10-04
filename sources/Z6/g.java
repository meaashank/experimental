package Z6;

import I9.d;
import U6.b;
import U6.o;
import U6.p;
import X6.s;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import androidx.room.F;
import com.google.gson.annotations.SerializedName;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3843g;
import com.prism.commons.utils.C3854s;
import com.prism.commons.utils.C3855t;
import com.prism.commons.utils.I;
import com.prism.commons.utils.g0;
import com.prism.commons.utils.n0;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.FileProviderHost;
import com.prism.gaia.client.stub.PermissionActivity;
import com.prism.gaia.genum.ProcessType;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.helper.utils.x;
import com.prism.gaia.naked.compat.android.app.LoadedApkCompat2;
import com.prism.gaia.remote.PermissionGroup;
import com.prism.gaia.server.BinderC4156g;
import com.prism.gaia.server.GProcessSupervisorProvider;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import com.prism.gaia.server.GuestProcessTaskManagerProvider;
import com.prism.lib_google_billing.q;
import d7.InterfaceC4302a;
import e6.C4367c;
import g6.C4455a;
import g6.t;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import u6.C5647a;
import v8.C5705o;
import v8.C5708r;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84352e = "asdf-".concat(g.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f84353f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f84354g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f84355h = new ReentrantLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84356i = "opType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84357j = "opCode";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84358k = "opTarget";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84359l = "msg";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f84360m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f84361n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84362a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84363b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaiaContext f84364c = GaiaContext.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f84365d = false;

    public class a implements com.prism.gaia.helper.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f84366a;

        public a(Application application) {
            this.f84366a = application;
        }

        @Override // com.prism.gaia.helper.g
        public boolean a(Thread thread, Throwable th) {
            String unused = g.f84352e;
            C5705o.c().d("last connected supervisor=" + GProcessClient.f164187n.e6());
            C5705o.f239884c.d("host classloader: " + LoadedApkCompat2.Util.calcClassLoaderPathChain(this.f84366a.getClassLoader()));
            C5705o.f239884c.e(th, "com.app.hider.master.promax", Hd.d.f50815k, "HOST_UNCAUGHT", null);
            String message = th.getMessage();
            if (message != null && message.contains("com.google.android.gms.ads.internal.webview.i.d")) {
                return true;
            }
            try {
                Thread.sleep(300L);
            } catch (Throwable unused2) {
            }
            System.exit(-10);
            return true;
        }
    }

    public class b implements com.prism.gaia.helper.g {
        public b() {
        }

        public static void b() {
            GProcessClient.f164187n.k6(GaiaContext.j().z().getString(o.n.f72195e3, "Instagram"));
            C5705o.c().d("schedule a delayed restart for instagram");
            try {
                Thread.sleep(10000L);
            } catch (Throwable unused) {
            }
            C5705o.f239884c.d("delayed restarting fired");
            GProcessClient.i6();
        }

        @Override // com.prism.gaia.helper.g
        public boolean a(Thread thread, Throwable th) {
            String unused = g.f84352e;
            C5705o.c().d("last connected supervisor=" + GProcessClient.f164187n.e6());
            ApplicationInfo applicationInfoV6 = s.u6().v6();
            if (applicationInfoV6 != null) {
                C5705o.f239884c.d("guest(" + applicationInfoV6.packageName + ") appInfo.sourceDir: " + applicationInfoV6.sourceDir + ", splitSourceDirs: " + Arrays.toString(applicationInfoV6.splitSourceDirs));
            }
            GaiaContext gaiaContext = GaiaContext.f164212y;
            Context contextP = gaiaContext.p();
            if (contextP != null) {
                C5705o.f239884c.d("guest(" + gaiaContext.r() + ") classloader: " + LoadedApkCompat2.Util.calcClassLoaderPathChain(contextP.getClassLoader()));
            }
            if (!n0.g() && g.E(th)) {
                C5705o.f239884c.d("guest(" + gaiaContext.r() + ") supervisor call failed on thread(" + thread.getName() + "), thread ends, process stays");
                C5705o.f239884c.e(th, gaiaContext.r(), gaiaContext.s(), "GUEST_SUPERVISOR_CALL_FAILED_OFF_MAIN", null);
                return true;
            }
            C5708r.b().a(thread, th, n0.g());
            String str = g.f84352e;
            if (g.this.f84365d || applicationInfoV6 == null || !(th instanceof VerifyError) || !a7.c.f84757b.equals(applicationInfoV6.packageName) || C4367c.o().t()) {
                return false;
            }
            ((t) C4455a.b().f()).execute(new Z6.h());
            g.this.f84365d = true;
            return false;
        }
    }

    public class c implements com.prism.gaia.helper.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f84369a;

        public c(Application application) {
            this.f84369a = application;
        }

        @Override // com.prism.gaia.helper.g
        public boolean a(Thread thread, Throwable th) {
            String unused = g.f84352e;
            C5705o.c().d("supervisor classloader: " + LoadedApkCompat2.Util.calcClassLoaderPathChain(this.f84369a.getClassLoader()));
            C5705o.f239884c.e(th, "com.app.hider.master.promax", "supervisor", "SUPERVISOR_UNCAUGHT", null);
            try {
                Thread.sleep(300L);
            } catch (Throwable unused2) {
            }
            System.exit(10);
            return true;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84371a;

        static {
            int[] iArr = new int[ProcessType.values().length];
            f84371a = iArr;
            try {
                iArr[ProcessType.MAIN_PROCESS_PER_SPACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84371a[ProcessType.GUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84371a[ProcessType.SUPERVISOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84371a[ProcessType.CHILD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface f {
        Bitmap a(Bitmap bitmap, boolean z10);

        String b(String str);
    }

    /* JADX INFO: renamed from: Z6.g$g, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0157g extends d.b {
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("pkgName")
        public String f84372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("source")
        public String f84373b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("requireSecureEnv")
        public boolean f84374c = false;

        public h(String str) {
            this.f84372a = str;
        }
    }

    public static g B() {
        return f84353f;
    }

    public static boolean E(Throwable th) {
        while (th != null) {
            if (th instanceof GaiaContext.SupervisorCallFailed) {
                return true;
            }
            th = th.getCause() == th ? null : th.getCause();
        }
        return false;
    }

    public static boolean h(boolean z10, String str) {
        if (!z10 || U6.c.V(str)) {
            return GuestProcessTaskManagerProvider.a(str);
        }
        return false;
    }

    public static boolean l(boolean z10, String str) {
        boolean zA;
        if (z10 && !f84353f.D(str)) {
            return false;
        }
        synchronized (f84354g) {
            try {
                zA = GuestProcessTaskManagerProvider.a(str);
                if (!zA) {
                    GaiaContext.f164212y.n().startActivity(PermissionActivity.a(str));
                    zA = GuestProcessTaskManagerProvider.a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zA;
    }

    public static void m() {
        GProcessSupervisorProvider.p();
    }

    public static int u() {
        return s.u6().f78657q;
    }

    public static int y() {
        return GaiaContext.j().l().targetSdkVersion;
    }

    public void A(Context context) {
        if (this.f84364c.a0()) {
            return;
        }
        try {
            p pVar = new p("hook performance", false);
            pVar.f();
            n nVarF = n.f();
            nVarF.j();
            pVar.h("hook start");
            nVarF.g();
            pVar.h("hook finished");
            b7.d.a(context);
            pVar.h("fix context");
        } catch (Throwable th) {
            this.f84363b = true;
            C5705o.c().a(th, "ON_ATTACH_BASE_CONTEXT", null);
        }
    }

    public boolean C(String str) {
        if (C3841e.z()) {
            try {
                PackageManager.Property property = this.f84364c.T().getProperty(U6.b.f68566c, str);
                if (property != null && property.getInteger() > 0) {
                    I.b(f84352e, "pkg(%s) set REQUIRE_SECURE_ENV property", str);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean D(String str) {
        return this.f84364c.g0(str);
    }

    public void F(Context context, String str) {
        g0.e(context, str, true);
    }

    public void G(Activity activity, String str) {
        String strC = a7.c.c(str);
        if (strC == null) {
            g0.e(activity, str, true);
        } else {
            C3854s.d(activity, FileProviderHost.c(activity), strC, true);
        }
    }

    public synchronized void H(Context context) {
        cb.i.a(context);
        J(context);
        A(context);
    }

    public void I(Application application, Z5.a aVar, InterfaceC4302a interfaceC4302a, e eVar) {
        p pVar = new p("onCreate performance", false);
        pVar.f();
        ProcessType processTypeK = this.f84364c.K();
        if (this.f84364c.a0() && processTypeK == ProcessType.SUPERVISOR && GProcessSupervisorProvider.t() == null) {
            processTypeK = ProcessType.MAIN_PROCESS_PER_SPACE;
        }
        if (g()) {
            if (processTypeK == ProcessType.MAIN_PROCESS_PER_SPACE) {
                C4455a.b().a().execute(new Z6.f());
            } else if (processTypeK != ProcessType.SANDBOX) {
                GProcessClient.f164187n.W5();
            }
        }
        int i10 = d.f84371a[processTypeK.ordinal()];
        if (i10 == 1) {
            com.prism.gaia.helper.c.b(new a(application));
            BinderC4156g.h2().T5(application, aVar);
            C5705o.c().d("main process started pid=" + GaiaContext.f164212y.I());
            eVar.b();
        } else if (i10 == 2) {
            com.prism.gaia.helper.c.b(new b());
            GaiaContext gaiaContext = GaiaContext.f164212y;
            D9.d.H(gaiaContext.r()).getAbsolutePath();
            Z6.c.f84350b.c(interfaceC4302a);
            C5705o.c().d("guest process started vpid=" + gaiaContext.X());
            eVar.getClass();
        } else if (i10 == 3) {
            com.prism.gaia.helper.c.b(new c(application));
            BinderC4156g.h2().T5(application, aVar);
            C5705o.c().d("supervisor process started ID=" + GProcessSupervisorProvider.v().L2());
            eVar.getClass();
        } else if (i10 == 4) {
            C5705o.c().d("child process started pid=" + GaiaContext.f164212y.I());
            eVar.getClass();
        }
        pVar.b();
    }

    public void J(Context context) {
        if (this.f84362a) {
            return;
        }
        p pVar = new p("GaiaApi.preInit() performance", false);
        pVar.f();
        i();
        j(context);
        x.b(context);
        this.f84364c.b0(context);
        pVar.h("GaiaContext.init()");
        this.f84362a = true;
        if (this.f84364c.a0()) {
            Iterator<Exception> it = this.f84364c.y().iterator();
            while (it.hasNext()) {
                C5705o.c().e(it.next(), q.f194113a, q.f194113a, "GAIA_CONTEXT", null);
            }
        }
    }

    public void K(Intent intent, I9.d dVar) {
        if (dVar != null) {
            Bundle bundle = new Bundle();
            bundle.putBinder(b.c.f68609K, dVar.asBinder());
            intent.putExtra(b.c.f68608J, bundle);
        }
    }

    public void L(j jVar) {
        this.f84364c.o0(jVar);
    }

    public synchronized void M() {
        this.f84363b = true;
    }

    public boolean f() {
        return C5647a.a(GaiaContext.j().T(), "com.app.hider.master.promax").equals(C3843g.n("89:A0:A2:81:69:38:30:92:7F:7A:6C:2F:7C:0B:69:46"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean g() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.prism.gaia.client.GaiaContext r0 = com.prism.gaia.client.GaiaContext.j()     // Catch: java.lang.Throwable -> L11
            boolean r0 = r0.a0()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            boolean r0 = r1.f84363b     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            r0 = 1
            goto L14
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = 0
        L14:
            monitor-exit(r1)
            return r0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z6.g.g():boolean");
    }

    public final void i() {
        try {
            Class<?> cls = Class.forName("huawei.android.app.HwApiCacheMangerEx");
            Method method = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                method2.getName();
                method2.getGenericReturnType().toString();
                if (method2.getName().equalsIgnoreCase("getDefault")) {
                    method = method2;
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                Field field = null;
                for (Field field2 : declaredFields) {
                    field2.getName();
                    field2.getGenericType().toString();
                    if (field2.getName().equalsIgnoreCase("bCanCache")) {
                        field = field2;
                    }
                }
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                field.setAccessible(true);
                field.set(objInvoke, Boolean.FALSE);
                Environment.getExternalStorageDirectory();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public final void j(Context context) {
        k(context, new ComponentName(context, (Class<?>) Gaia32bit64bitProvider.class));
        k(context, new ComponentName(context, (Class<?>) FileProviderHost.class));
        k(context, new ComponentName(context, (Class<?>) GProcessSupervisorProvider.class));
    }

    public final void k(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable unused) {
            componentName.toString();
        }
    }

    public void n() {
        if (g()) {
            return;
        }
        C5705o.c().g();
        System.exit(1);
    }

    public String o(String str) {
        try {
            return C3841e.x() ? this.f84364c.T().getInstallSourceInfo(str).getInstallingPackageName() : this.f84364c.T().getInstallerPackageName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String p(PackageInfo packageInfo) {
        String strO = o(packageInfo.packageName);
        return strO != null ? strO : PkgUtils.p(packageInfo.applicationInfo) ? "(system)" : "(null)";
    }

    public Context q() {
        return this.f84364c.n();
    }

    public Bitmap r(String str, boolean z10) {
        Context contextN = GaiaContext.j().n();
        Resources resourcesC = GaiaContext.f164212y.C();
        String strS = s(str);
        if (new File(strS).exists() && !z10) {
            return C3855t.h(strS);
        }
        try {
            Bitmap bitmapF = C3855t.f(contextN, C3855t.e(contextN.getPackageManager().getApplicationIcon(str)), 1.0f, C3855t.b(resourcesC, o.g.f71230b1), C3855t.b(resourcesC, o.g.f71234c1));
            C3855t.j(strS, bitmapF);
            return bitmapF;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String s(String str) {
        Context contextN = GaiaContext.j().n();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.prism.gaia.helper.utils.l.D(contextN));
        String str2 = File.separator;
        F.a(sb2, str2, "icons", str2, "va_dual_");
        return android.support.v4.media.e.a(sb2, str, u.e.f239314f);
    }

    public GaiaContext t() {
        return this.f84364c;
    }

    public String v(String str) {
        try {
            return GaiaContext.f164212y.T().getApplicationLabel(GaiaContext.j().U(str, 0).applicationInfo).toString().trim();
        } catch (Exception unused) {
            return str;
        }
    }

    public Bitmap w(String str, boolean z10) {
        Context contextN = GaiaContext.j().n();
        Resources resourcesC = GaiaContext.f164212y.C();
        String strX = x(str);
        if (new File(strX).exists() && !z10) {
            return C3855t.h(strX);
        }
        try {
            Bitmap bitmapF = C3855t.f(contextN, C3855t.e(contextN.getPackageManager().getApplicationIcon(str)), 1.0f, BitmapFactory.decodeResource(resourcesC, o.g.f71230b1), BitmapFactory.decodeResource(resourcesC, o.g.f71238d1));
            C3855t.j(strX, bitmapF);
            return bitmapF;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String x(String str) {
        Context contextN = GaiaContext.j().n();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.prism.gaia.helper.utils.l.D(contextN));
        String str2 = File.separator;
        F.a(sb2, str2, "icons", str2, "va_hidden_");
        return android.support.v4.media.e.a(sb2, str, u.e.f239314f);
    }

    public List<PermissionGroup> z(String str) {
        return C5714x.j().B(str);
    }

    public static abstract class e {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }
}
