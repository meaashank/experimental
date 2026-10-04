package com.prism.gaia.client;

import D9.d;
import U6.c;
import U6.p;
import X6.s;
import Z6.j;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.n0;
import com.prism.gaia.genum.ProcessType;
import com.prism.gaia.helper.e;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.naked.compat.android.app.ActivityThreadCompat2;
import com.prism.gaia.naked.compat.android.app.ContextImplCompat2;
import com.prism.gaia.naked.compat.android.app.LoadedApkCompat2;
import com.prism.gaia.naked.compat.android.content.pm.PackageManagerCompat2;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAG;
import com.prism.gaia.naked.metadata.android.app.ContextImplCAG;
import com.prism.gaia.naked.metadata.android.app.LoadedApkCAG;
import com.prism.gaia.naked.metadata.android.rms.HwSysResImplCAG;
import com.prism.gaia.naked.metadata.android.rms.resource.ReceiverResourceCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.remote.StubProcessInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import v8.C5705o;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaContext {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f164211x = l0.b(GaiaContext.class.getSimpleName());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final GaiaContext f164212y = new GaiaContext();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f164213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GProcessClient f164214b = GProcessClient.c6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164215c = Process.myUid();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f164216d = Process.myPid();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f164217e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<Exception> f164218f = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164219g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164220h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PackageManager f164221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProcessType f164222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f164223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f164224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f164225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f164226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f164227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f164228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f164229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f164230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ApplicationInfo f164231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f164232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PackageInfo f164233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ApplicationInfo f164234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f164235w;

    public static final class SupervisorCallFailed extends RuntimeException {
        public SupervisorCallFailed(Throwable th) {
            super("gaia call failed while the supervisor is alive: this call went wrong, not the container", th);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164236a;

        static {
            int[] iArr = new int[ProcessType.values().length];
            f164236a = iArr;
            try {
                iArr[ProcessType.SUPERVISOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164236a[ProcessType.MAIN_PROCESS_PER_SPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164236a[ProcessType.GUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f164236a[ProcessType.SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164236a[ProcessType.CHILD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f164237a = new e("", c.f68692Z);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f164238b = new e("", c.f68694a0);
    }

    public static <T> T c(RemoteException remoteException) throws RuntimeException {
        remoteException.getMessage();
        if (f164212y.e0()) {
            if (GProcessClient.f164187n.g6()) {
                throw new SupervisorCallFailed(remoteException);
            }
            GProcessClient.i6();
            System.exit(0);
        }
        throw new RuntimeException("!!!!!!!!!!!!!!!!!Supervisor Dead!!!!!!!!!!!!!!!!!!!", remoteException);
    }

    public static boolean c0() {
        return System.getProperty("java.vm.version").startsWith("2");
    }

    public static void d(Exception exc) {
        exc.getMessage();
        GProcessClient.i6();
        System.exit(0);
    }

    public static boolean f0(String str) {
        return l0(str).vpid != -1;
    }

    public static GaiaContext j() {
        return f164212y;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[PHI: r1
      0x00b9: PHI (r1v11 java.lang.String) = (r1v8 java.lang.String), (r1v9 java.lang.String) binds: [B:31:0x00b7, B:34:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.prism.gaia.remote.StubProcessInfo l0(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.GaiaContext.l0(java.lang.String):com.prism.gaia.remote.StubProcessInfo");
    }

    public int A() {
        return this.f164221i.resolveActivity(B(), 65536).getIconResource();
    }

    public Intent B() {
        return this.f164221i.getLaunchIntentForPackage("com.app.hider.master.promax");
    }

    public Resources C() {
        return this.f164230r.getResources();
    }

    public final Object D() {
        return ContextImplCompat2.Util.getLoadedApk(this.f164232t);
    }

    public Object E() {
        return this.f164229q;
    }

    public final Handler F() {
        return ActivityThreadCompat2.Util.getHandler(this.f164229q);
    }

    public final Instrumentation G() {
        return ActivityThreadCompat2.Util.getInstrumentation(this.f164229q);
    }

    public final Context H() {
        return ContextImplCompat2.Util.getOuterContext(this.f164232t);
    }

    public int I() {
        return this.f164216d;
    }

    public GProcessClient J() {
        return this.f164214b;
    }

    public ProcessType K() {
        return this.f164222j;
    }

    public IInterface L(BroadcastReceiver broadcastReceiver, @Nullable Handler handler, boolean z10) {
        if (handler == null) {
            handler = ActivityThreadCompat2.Util.getHandler(this.f164229q);
        }
        return LoadedApkCompat2.Util.getReceiverDispatcher(ContextImplCompat2.Util.getLoadedApk(this.f164232t), broadcastReceiver, ContextImplCompat2.Util.getOuterContext(this.f164232t), handler, ActivityThreadCompat2.Util.getInstrumentation(this.f164229q), z10);
    }

    public int M(String str, String str2, String str3) {
        return this.f164232t.getResources().getIdentifier(str, str2, str3);
    }

    public String N(int i10, Object... objArr) {
        return this.f164232t.getResources().getString(i10, objArr);
    }

    public Resources O() {
        return this.f164232t.getResources();
    }

    public IInterface P(ServiceConnection serviceConnection) {
        return LoadedApkCompat2.Util.getServiceDispatcher(ContextImplCompat2.Util.getLoadedApk(this.f164232t), serviceConnection, ContextImplCompat2.Util.getOuterContext(this.f164232t), ActivityThreadCompat2.Util.getHandler(this.f164229q), 0);
    }

    public String Q() {
        return this.f164226n;
    }

    public int R() {
        return this.f164215c;
    }

    public ApplicationInfo S(String str, int i10) throws PackageManager.NameNotFoundException {
        return PackageManagerCompat2.Util.getUnHookedApplicationInfo(str, i10);
    }

    public PackageManager T() {
        return this.f164221i;
    }

    public PackageInfo U(String str, int i10) throws PackageManager.NameNotFoundException {
        return PackageManagerCompat2.Util.getUnHookedPackageInfo(str, i10);
    }

    public int V() {
        return GaiaUserHandle.getUserId(this.f164215c);
    }

    public int W() {
        return GaiaUserHandle.getVappId(this.f164219g);
    }

    public int X() {
        return this.f164220h;
    }

    public int Y() {
        return this.f164219g;
    }

    public int Z() {
        return GaiaUserHandle.getVuserId(this.f164219g);
    }

    public void a() {
        Object obj;
        Object obj2;
        Context contextN = f164212y.n();
        if (LoadedApkCAG.f165346D.HuaWei.f165348C.mReceiverResource() == null || (obj = ContextImplCAG.f165289G.mPackageInfo().get(contextN)) == null || (obj2 = LoadedApkCAG.f165346D.HuaWei.f165348C.mReceiverResource().get(obj)) == null) {
            return;
        }
        if (C3841e.s()) {
            if (HwSysResImplCAG.f165937D.HuaWei.CO26.mWhiteListMap() != null) {
                Map map = HwSysResImplCAG.f165937D.HuaWei.CO26.mWhiteListMap().get(obj2);
                List list = (List) map.get(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(contextN.getPackageName());
                if (list != null) {
                    arrayList.addAll(list);
                }
                map.put(0, arrayList);
                return;
            }
            return;
        }
        if (C3841e.p()) {
            if (ReceiverResourceCAG.f165938D.HuaWei.CN24.mWhiteList() != null) {
                List<String> list2 = ReceiverResourceCAG.f165938D.HuaWei.CN24.mWhiteList().get(obj2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(contextN.getPackageName());
                if (list2 != null) {
                    arrayList2.addAll(list2);
                }
                ReceiverResourceCAG.f165938D.HuaWei.CN24.mWhiteList().set(obj2, arrayList2);
                return;
            }
            return;
        }
        if (ReceiverResourceCAG.f165938D.HuaWei.CM.mWhiteList() == null) {
            if (ReceiverResourceCAG.f165938D.HuaWei.CL.mResourceConfig() != null) {
                ReceiverResourceCAG.f165938D.HuaWei.CL.mResourceConfig().set(obj2, null);
            }
        } else {
            String[] strArr = ReceiverResourceCAG.f165938D.HuaWei.CM.mWhiteList().get(obj2);
            LinkedList linkedList = new LinkedList();
            Collections.addAll(linkedList, strArr);
            linkedList.add(contextN.getPackageName());
            ReceiverResourceCAG.f165938D.HuaWei.CM.mWhiteList().set(obj2, (String[]) linkedList.toArray(new String[0]));
        }
    }

    public synchronized boolean a0() {
        return !this.f164218f.isEmpty();
    }

    public final void b() {
        this.f164218f.clear();
    }

    public synchronized void b0(Context context) {
        if (this.f164217e) {
            return;
        }
        if (!n0.g()) {
            m0(new IllegalStateException("GaiaContext.init() called in none-main-thread"));
            return;
        }
        this.f164232t = context;
        p pVar = new p("init performance", false);
        pVar.f();
        this.f164221i = PackageManagerCompat2.Util.initBeforeHook(this.f164232t);
        if (context.getPackageName().equals("com.app.hider.master.promax")) {
            this.f164230r = context;
        } else {
            this.f164230r = e("com.app.hider.master.promax");
        }
        this.f164231s = this.f164230r.getApplicationInfo();
        try {
            this.f164229q = ActivityThreadCAG.f165276G.currentActivityThread().call(new Object[0]);
        } catch (Throwable unused) {
            this.f164229q = null;
        }
        if (this.f164229q == null) {
            m0(new IllegalStateException("GaiaContext reflect ActivityThread.currentActivityThread failed"));
        }
        pVar.h("getCurrentAT");
        try {
            this.f164233u = this.f164221i.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            m0(new IllegalStateException("GaiaContext get self packageInfo failed"));
        }
        ApplicationInfo applicationInfo = this.f164232t.getApplicationInfo();
        this.f164234v = applicationInfo;
        if (applicationInfo != null) {
            this.f164223k = applicationInfo.packageName;
            this.f164225m = applicationInfo.processName;
        } else {
            m0(new IllegalStateException("GaiaContext base context has no ApplicationInfo"));
        }
        String strCall = ActivityThreadCAG.f165276G.getProcessName().call(this.f164229q, new Object[0]);
        this.f164226n = strCall;
        if (strCall == null) {
            this.f164226n = c.I();
            m0(new IllegalStateException("GaiaContext reflect ActivityThread.getProcessName failed"));
        }
        String str = f164211x;
        g();
        Log.d(str, pVar.h("detectProcessType"));
        if (c.h() == null) {
            if (c.f68724u == null) {
                m0(new IllegalStateException("None abi can be supported: " + Arrays.toString(c.f68720q) + U6.j.f68738d + Arrays.toString(c.f68721r)));
            } else if (!c.f68697c) {
                m0(new IllegalStateException("Launch abi is 32bit but not supported: " + Arrays.toString(c.f68720q) + U6.j.f68738d + Arrays.toString(c.f68721r)));
            }
        } else if (c.f68724u == null && c.f68697c) {
            m0(new IllegalStateException("Launch abi is 64bit but not supported: " + Arrays.toString(c.f68720q) + U6.j.f68738d + Arrays.toString(c.f68721r)));
        }
        pVar.h("setListener");
        this.f164217e = true;
        d.w0(this.f164232t);
        U6.j.E();
    }

    public boolean d0() {
        return ProcessType.CHILD == this.f164222j;
    }

    public Context e(@NonNull String str) {
        try {
            return this.f164232t.createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.getMessage();
            return null;
        }
    }

    public boolean e0() {
        return ProcessType.GUEST == this.f164222j;
    }

    public Resources f(@NonNull ApplicationInfo applicationInfo) {
        try {
            return T().getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.getMessage();
            return null;
        }
    }

    public final void g() {
        StubProcessInfo stubProcessInfoL0 = l0(this.f164226n);
        ProcessType processType = stubProcessInfoL0.processType;
        this.f164222j = processType;
        int i10 = a.f164236a[processType.ordinal()];
        if (i10 == 1) {
            Log.d(f164211x, "==GAIA_SERVER==");
            return;
        }
        if (i10 == 2) {
            Log.d(f164211x, "==GAIA_MAIN==");
            return;
        }
        if (i10 == 3) {
            this.f164228p = stubProcessInfoL0.spacePkgName;
            this.f164220h = stubProcessInfoL0.vpid;
            Log.d(f164211x, "==GAIA_GUEST==");
        } else if (i10 == 4) {
            this.f164228p = stubProcessInfoL0.spacePkgName;
            this.f164220h = stubProcessInfoL0.vpid;
            Log.d(f164211x, "==GAIA_SANDBOX==");
        } else if (i10 != 5) {
            Log.d(f164211x, "==GAIA_UNKNOWN==");
        } else {
            Log.d(f164211x, "==GAIA_CHILD==");
        }
    }

    public boolean g0(String str) {
        if (str == null) {
            return false;
        }
        return this.f164221i.getApplicationInfo(str, 0) != null;
    }

    public IInterface h(BroadcastReceiver broadcastReceiver) {
        return LoadedApkCompat2.Util.forgetReceiverDispatcher(ContextImplCompat2.Util.getLoadedApk(this.f164232t), ContextImplCompat2.Util.getOuterContext(this.f164232t), broadcastReceiver);
    }

    public boolean h0() {
        return ProcessType.MAIN_PROCESS_PER_SPACE == this.f164222j;
    }

    public IInterface i(ServiceConnection serviceConnection) {
        return LoadedApkCompat2.Util.forgetServiceDispatcher(ContextImplCompat2.Util.getLoadedApk(this.f164232t), ContextImplCompat2.Util.getOuterContext(this.f164232t), serviceConnection);
    }

    public boolean i0() {
        return ProcessType.SANDBOX == this.f164222j;
    }

    public boolean j0() {
        return ProcessType.SUPERVISOR == this.f164222j;
    }

    public CharSequence k(ApplicationInfo applicationInfo) {
        Resources resourcesF = f(applicationInfo);
        return resourcesF == null ? applicationInfo.packageName : resourcesF.getText(applicationInfo.labelRes);
    }

    public void k0(GuestProcessInfo guestProcessInfo) {
        if (guestProcessInfo != null) {
            String str = guestProcessInfo.packageName;
            this.f164224l = str;
            String str2 = guestProcessInfo.processName;
            this.f164227o = str2;
            this.f164219g = guestProcessInfo.vuid;
            this.f164220h = guestProcessInfo.vpid;
            if (str.equals(str2)) {
                if (c.a0(this.f164224l)) {
                    C5705o.c().d("host main process attached supervisor vuserId=" + Z() + " vpid=" + this.f164220h);
                    return;
                }
                if (c.W(this.f164224l)) {
                    C5705o.c().d("helper(" + this.f164224l + ") main process attached supervisor vuserId=" + Z() + " vpid=" + this.f164220h);
                    return;
                }
                C5705o.c().d("guest(" + this.f164224l + ") main process attached supervisor vuserId=" + Z() + " vpid=" + this.f164220h);
            }
        }
    }

    public ApplicationInfo l() {
        return this.f164234v;
    }

    public ApplicationInfo m() {
        return this.f164231s;
    }

    public final void m0(Exception exc) {
        this.f164218f.add(exc);
    }

    public Context n() {
        return this.f164232t;
    }

    public void n0(Context context) {
        this.f164235w = context;
    }

    public Activity o() {
        return s.u6().x6();
    }

    public void o0(j jVar) {
        this.f164213a = jVar;
    }

    public Context p() {
        Context context = this.f164235w;
        return context != null ? context : this.f164232t;
    }

    public j q() {
        return this.f164213a;
    }

    @Nullable
    public String r() {
        return this.f164224l;
    }

    @Nullable
    public String s() {
        return this.f164227o;
    }

    @Nullable
    public String t() {
        return this.f164228p;
    }

    public ApplicationInfo u(@NonNull String str) {
        ApplicationInfo applicationInfoO = C5714x.j().o(str, 0, 0);
        if (applicationInfoO != null) {
            return applicationInfoO;
        }
        try {
            ApplicationInfo applicationInfoS = f164212y.S(str, 0);
            if (PkgUtils.n(applicationInfoS)) {
                return applicationInfoS;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String v() {
        return this.f164223k;
    }

    public PackageInfo w() {
        return this.f164233u;
    }

    public int x() {
        return this.f164234v.targetSdkVersion;
    }

    public synchronized List<Exception> y() {
        return this.f164218f;
    }

    public Context z() {
        return this.f164230r;
    }
}
