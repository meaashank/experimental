package com.prism.gaia.server;

import U6.b;
import U6.o;
import android.app.AlarmManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.provider.ProviderCall;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.a;
import com.prism.gaia.gserver.GaiaAppManagerService;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.helper.utils.ComponentUtils;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.server.T;
import com.prism.gaia.server.am.ProcessRecordG;
import com.prism.gaia.server.am.RunningData;
import com.prism.gaia.server.job.GaiaJobSchedulerService;
import com.prism.gaia.server.pm.BinderC4171f;
import com.prism.gaia.server.pm.GaiaUserManagerService;
import com.prism.gaia.server.pm.PackageSettingG;
import com.prism.gaia.utils.GaiaPreferenceUtils;
import g6.C4455a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p6.InterfaceC5394a;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class GProcessSupervisorProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166058b = "com.app.hider.master.promax.gaia.provider.GProcessSupervisorProvider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166059c = "checkInit";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Map<String, InterfaceC5394a> f166065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f166066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile ProcessRecordG f166067k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f166057a = "asdf-".concat("GProcessSupervisorProvider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f166060d = new b(UUID.randomUUID().toString());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RunningData f166061e = RunningData.J();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f166062f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile GProcessSupervisorProvider f166063g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f166064h = true;

    public static class RemoteKillProcess extends RemoteRunnable {
        public static final Parcelable.Creator<RemoteKillProcess> CREATOR = new a();
        private int pid;

        public class a implements Parcelable.Creator<RemoteKillProcess> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteKillProcess createFromParcel(Parcel parcel) {
                return new RemoteKillProcess(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteKillProcess[] newArray(int i10) {
                return new RemoteKillProcess[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void killProcess(int i10, GUri gUri) {
            RemoteKillProcess remoteKillProcess = new RemoteKillProcess();
            remoteKillProcess.pid = i10;
            remoteKillProcess.start(gUri);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            Process.killProcess(this.pid);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.pid);
        }

        private RemoteKillProcess() {
        }

        private RemoteKillProcess(Parcel parcel) {
            super(parcel);
            this.pid = parcel.readInt();
        }
    }

    public class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProcessRecordG f166068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IBinder f166069b;

        public a(ProcessRecordG processRecordG, IBinder iBinder) {
            this.f166068a = processRecordG;
            this.f166069b = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            try {
                String unused = GProcessSupervisorProvider.f166057a;
                ProcessRecordG processRecordG = this.f166068a;
                String str = processRecordG.f166731a;
                int i10 = processRecordG.f166735e;
                String str2 = this.f166068a.f166732b;
                this.f166069b.unlinkToDeath(this, 0);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public static class b extends T.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f166070j;

        @Override // com.prism.gaia.server.T
        public boolean I5(String str) {
            return GProcessSupervisorProvider.f166064h;
        }

        @Override // com.prism.gaia.server.T
        public boolean J(int i10, String str) {
            return GProcessSupervisorProvider.y(i10, str);
        }

        @Override // com.prism.gaia.server.T
        public String L2() {
            return this.f166070j;
        }

        @Override // com.prism.gaia.server.T
        public void W1(IBinder iBinder) {
            try {
                ProcessRecordG processRecordGV = GProcessSupervisorProvider.f166061e.v(a.b.U0(iBinder).c());
                if (processRecordGV == null) {
                    return;
                }
                GProcessSupervisorProvider.Q(processRecordGV);
            } catch (RemoteException unused) {
                String unused2 = GProcessSupervisorProvider.f166057a;
            }
        }

        @Override // com.prism.gaia.server.T
        public void a2(int i10, String str) {
            ProcessRecordG processRecordGV = GProcessSupervisorProvider.f166061e.v(i10);
            if (processRecordGV == null) {
                return;
            }
            GProcessSupervisorProvider.F(GProcessSupervisorProvider.f166067k, str, GProcessSupervisorProvider.r(processRecordGV, GProcessClient.ProcessAction._message));
        }

        @Override // com.prism.gaia.server.T
        public void h4(int i10) {
            GProcessSupervisorProvider.E(i10);
        }

        @Override // com.prism.gaia.server.T
        public void u5() {
            U6.c.r().b().c(GaiaContext.j().n());
            GProcessSupervisorProvider.A();
            GProcessSupervisorProvider.C();
            GProcessClient.i6();
        }

        @Override // com.prism.gaia.server.T
        public GuestProcessInfo x1(IBinder iBinder) {
            ProcessRecordG processRecordGN = GProcessSupervisorProvider.n(iBinder);
            GuestProcessInfo guestProcessInfo = new GuestProcessInfo();
            guestProcessInfo.packageName = processRecordGN.f166731a;
            guestProcessInfo.processName = processRecordGN.f166732b;
            guestProcessInfo.vuid = processRecordGN.f166734d;
            guestProcessInfo.vpid = processRecordGN.f166735e;
            return guestProcessInfo;
        }

        @Override // com.prism.gaia.server.T
        public IBinder y0(String str) {
            return GProcessSupervisorProvider.u(str);
        }

        public b(String str) {
            this.f166070j = str;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f166071a = "package";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f166072b = "activity";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f166073c = "user";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f166074d = "app";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f166075e = "account";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f166076f = "content";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f166077g = "job";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f166078h = "notification";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f166079i = "device";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f166080j = "guest_crash";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f166081k = "bug_reporter";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f166082l = "setting_mgr";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f166083m = "vpn_router";
    }

    static {
        Object obj = new Object();
        com.prism.gaia.helper.utils.o.h("GProcessSupervisorProvider.startProcessLock", obj);
        f166066j = obj;
        f166067k = null;
    }

    public static void A() {
        ArrayList arrayList = (ArrayList) f166061e.u(true);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ProcessRecordG processRecordG = (ProcessRecordG) obj;
            if (processRecordG.m()) {
                D(processRecordG);
            }
        }
    }

    public static void B(String str, int i10) {
        ArrayList arrayList = (ArrayList) f166061e.y(str, i10);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            D((ProcessRecordG) obj);
        }
    }

    public static void C() {
        if (f166067k != null) {
            D(f166067k);
        }
    }

    public static void D(@NonNull ProcessRecordG processRecordG) {
        int i10 = processRecordG.f166737g;
        if (i10 <= 0) {
            return;
        }
        RemoteKillProcess.killProcess(i10, processRecordG.i());
        q(processRecordG);
    }

    public static void E(int i10) {
        ProcessRecordG processRecordGV = f166061e.v(i10);
        if (processRecordGV == null) {
            Process.killProcess(i10);
        } else {
            D(processRecordGV);
        }
    }

    public static void F(@Nullable ProcessRecordG processRecordG, String str, Bundle bundle) {
        com.prism.gaia.client.a aVar;
        if (processRecordG == null || (aVar = processRecordG.f166739i) == null) {
            return;
        }
        try {
            aVar.J3(str, bundle);
        } catch (Throwable unused) {
        }
    }

    public static void G(@NonNull ProcessRecordG processRecordG) {
    }

    public static void H(@NonNull ProcessRecordG processRecordG) {
    }

    public static void I(@NonNull ProcessRecordG processRecordG) {
        F(f166067k, s(processRecordG, o.n.f72219i3), r(processRecordG, GProcessClient.ProcessAction.dead));
    }

    public static void J(@NonNull ProcessRecordG processRecordG) {
        F(f166067k, null, r(processRecordG, GProcessClient.ProcessAction.shown));
    }

    public static void K(@NonNull ProcessRecordG processRecordG) {
        F(f166067k, s(processRecordG, o.n.f72225j3), r(processRecordG, GProcessClient.ProcessAction.starting));
    }

    public static void L() {
        List<ProcessRecordG> listU = f166061e.u(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean(GProcessClient.f164194u, true);
        ArrayList arrayList = (ArrayList) listU;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ProcessRecordG processRecordG = (ProcessRecordG) obj;
            if (processRecordG.m()) {
                F(processRecordG, null, bundle);
            }
        }
    }

    public static void M() {
        List<ProcessRecordG> listU = f166061e.u(true);
        Bundle bundle = new Bundle();
        bundle.putBoolean(GProcessClient.f164195v, true);
        ArrayList arrayList = (ArrayList) listU;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ProcessRecordG processRecordG = (ProcessRecordG) obj;
            if (processRecordG.m()) {
                F(processRecordG, null, bundle);
            }
        }
    }

    public static void N(@NonNull ProcessRecordG processRecordG) {
        if (processRecordG.j()) {
            return;
        }
        processRecordG.f166742l = ProcessRecordG.Status.bound;
        com.prism.gaia.server.am.q.p6().H6(processRecordG);
    }

    public static void O(@NonNull ProcessRecordG processRecordG) {
        if (processRecordG.l()) {
            return;
        }
        processRecordG.f166742l = ProcessRecordG.Status.dead;
        I(processRecordG);
        com.prism.gaia.server.am.q.p6().I6(processRecordG);
    }

    public static void P(@NonNull ProcessRecordG processRecordG) {
        J(processRecordG);
    }

    public static void Q(@NonNull ProcessRecordG processRecordG) {
        if (processRecordG.m()) {
            N(processRecordG);
        }
    }

    public static void R(@NonNull ProcessRecordG processRecordG) {
        String str = processRecordG.f166731a;
        if (!processRecordG.m()) {
            if (processRecordG.n()) {
                f166067k = null;
                return;
            }
            return;
        }
        RunningData runningData = RunningData.f166760w;
        runningData.W();
        if (!runningData.A0(processRecordG.f166734d, processRecordG)) {
            com.prism.gaia.server.am.A.b().a(processRecordG.f166734d);
        }
        if (Z6.b.a()) {
            M9.c.Y5().d6(processRecordG.f166734d);
        }
        O(processRecordG);
    }

    public static int S(boolean z10) {
        return f166061e.k0(z10);
    }

    public static int T(ComponentInfo componentInfo) {
        BinderC4171f.j6().d();
        String str = componentInfo.packageName;
        String strK = ComponentUtils.k(componentInfo);
        PackageSettingG packageSettingGP6 = BinderC4171f.f167556s0.p6(str);
        if (packageSettingGP6 == null) {
            return -1;
        }
        return f166061e.l0(packageSettingGP6.isInstalledInHelper(), componentInfo.applicationInfo.uid, str, strK);
    }

    public static int U(boolean z10, int i10, String str, String str2) {
        return f166061e.l0(z10, i10, str, str2);
    }

    public static void V(@NonNull ProcessRecordG processRecordG) {
        if (U6.c.W(processRecordG.f166733c)) {
            Z6.g.l(true, processRecordG.f166733c);
        }
        K(processRecordG);
        Bundle bundle = new Bundle();
        bundle.putString(b.c.f68625n, processRecordG.f166732b);
        bundle.putString(b.c.f68626o, processRecordG.f166731a);
        bundle.putInt(b.c.f68620i, processRecordG.f166734d);
        bundle.putInt(b.c.f68621j, processRecordG.f166735e);
        if (ProviderCall.a(GaiaContext.f164212y.n(), U6.c.B(processRecordG.f166735e, processRecordG.f166733c), b.d.f68638a, null, bundle) == null) {
            q(processRecordG);
        }
    }

    @Nullable
    public static ProcessRecordG W(ComponentInfo componentInfo) {
        return X(ComponentUtils.k(componentInfo), componentInfo.packageName, GaiaUserHandle.getVuserId(componentInfo.applicationInfo.uid));
    }

    @Nullable
    public static ProcessRecordG X(String str, String str2, int i10) {
        ProcessRecordG processRecordGY;
        GaiaAppManagerService.p6().U6(str2);
        m(str2, i10);
        a0();
        synchronized (f166066j) {
            processRecordGY = Y(str, str2, i10);
        }
        return processRecordGY;
    }

    @Nullable
    public static ProcessRecordG Y(String str, String str2, int i10) {
        PackageSettingG packageSettingGP6 = BinderC4171f.h6().p6(str2);
        ApplicationInfo applicationInfoK4 = BinderC4171f.f167556s0.k4(str2, 0, i10);
        if (packageSettingGP6 == null || applicationInfoK4 == null) {
            return null;
        }
        int vuid = GaiaUserHandle.getVuid(i10, applicationInfoK4.uid);
        RunningData runningData = f166061e;
        ProcessRecordG processRecordGX = runningData.x(str, vuid);
        if (processRecordGX != null && (processRecordGX.p() || processRecordGX.b())) {
            return processRecordGX;
        }
        boolean zIsInstalledInHelper = packageSettingGP6.isInstalledInHelper();
        if (runningData.k0(zIsInstalledInHelper) < 3) {
            A();
        }
        int iL0 = runningData.l0(zIsInstalledInHelper, vuid, str2, str);
        if (iL0 == -1) {
            return null;
        }
        C5705o c5705oC = C5705o.c();
        StringBuilder sbA = androidx.constraintlayout.widget.e.a("supervisor start guest(", str2, ") vuserId=", i10, " process=");
        sbA.append(str);
        sbA.append(" vpid=");
        sbA.append(iL0);
        c5705oC.d(sbA.toString());
        ApplicationInfoCAG.L21.primaryCpuAbi().get(applicationInfoK4);
        final ProcessRecordG processRecordG = new ProcessRecordG(applicationInfoK4.packageName, str, packageSettingGP6.getSpacePkgName(), vuid, iL0);
        runningData.d(processRecordG);
        C4455a.b().d().execute(new Runnable() { // from class: com.prism.gaia.server.c
            @Override // java.lang.Runnable
            public final void run() {
                GProcessSupervisorProvider.V(processRecordG);
            }
        });
        processRecordG.f166749s.add(applicationInfoK4.packageName);
        return processRecordG;
    }

    public static ProcessRecordG Z(@Nullable ProcessRecordG processRecordG) {
        if (processRecordG == null) {
            return null;
        }
        com.prism.gaia.helper.utils.o.c("waitAttachGuestProcess(" + processRecordG.f166732b + ")");
        Bundle bundle = new Bundle();
        bundle.putString(b.c.f68625n, processRecordG.f166732b);
        bundle.putString(b.c.f68626o, processRecordG.f166731a);
        bundle.putInt(b.c.f68620i, processRecordG.f166734d);
        bundle.putInt(b.c.f68621j, processRecordG.f166735e);
        Bundle bundleA = ProviderCall.a(GaiaContext.j().n(), U6.c.B(processRecordG.f166735e, processRecordG.f166733c), b.d.f68638a, null, bundle);
        if (bundleA != null) {
            return n(bundleA.getBinder(b.c.f68613b));
        }
        q(processRecordG);
        return null;
    }

    public static /* synthetic */ void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (InterfaceC5394a interfaceC5394a : f166065i.values()) {
            C5705o.c().d("GService(" + interfaceC5394a.b() + ") initializing...");
            interfaceC5394a.d();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C5705o.c().d("GServices all get ready in " + jCurrentTimeMillis2 + "(ms)");
    }

    public static void a0() {
        BinderC4171f.j6().d();
        com.prism.gaia.server.am.q.s6().d();
    }

    public static void l(InterfaceC5394a interfaceC5394a) {
        f166065i.put(interfaceC5394a.b(), interfaceC5394a);
    }

    public static void m(String str, final int i10) {
        final PackageSettingG packageSettingGP6;
        if (i10 == 0 && (packageSettingGP6 = BinderC4171f.h6().p6(str)) != null && packageSettingGP6.markLaunchedIfFirst(i10)) {
            com.prism.gaia.server.am.q.b6(new Runnable() { // from class: com.prism.gaia.server.e
                @Override // java.lang.Runnable
                public final void run() {
                    com.prism.gaia.server.am.q.p6().c7(packageSettingGP6, i10);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.prism.gaia.server.am.ProcessRecordG n(android.os.IBinder r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.GProcessSupervisorProvider.n(android.os.IBinder):com.prism.gaia.server.am.ProcessRecordG");
    }

    public static ProcessRecordG o(com.prism.gaia.server.am.G g10) {
        if (g10.f166702c == null) {
            return null;
        }
        PackageSettingG packageSettingGP6 = BinderC4171f.h6().p6(g10.f166700a.packageName);
        if (packageSettingGP6 == null) {
            String str = g10.f166700a.packageName;
            return null;
        }
        int iG = g10.g();
        RunningData runningData = f166061e;
        ProcessRecordG processRecordGX = runningData.x(g10.e(), iG);
        if (processRecordGX != null) {
            return processRecordGX;
        }
        GuestProcessInfo guestProcessInfo = new GuestProcessInfo();
        guestProcessInfo.packageName = g10.d();
        guestProcessInfo.processName = g10.e();
        guestProcessInfo.vuid = iG;
        guestProcessInfo.vpid = g10.f166701b;
        ProcessRecordG processRecordG = new ProcessRecordG(guestProcessInfo.packageName, guestProcessInfo.processName, packageSettingGP6.getSpacePkgName(), guestProcessInfo.vuid, g10.f166701b);
        runningData.f(U6.c.c(processRecordG.f166733c, g10.f166701b, g10.f166702c), guestProcessInfo);
        runningData.d(processRecordG);
        return processRecordG;
    }

    public static T p() {
        if (GaiaContext.j().j0()) {
            return f166060d;
        }
        Bundle bundleB = ProviderCall.b(GaiaContext.f164212y.n(), f166058b, "checkInit", null, null);
        if (bundleB == null) {
            return null;
        }
        return T.b.U0(com.prism.gaia.utils.c.a(bundleB.getBinder(b.c.f68612a)));
    }

    public static void q(@NonNull ProcessRecordG processRecordG) {
        f166061e.r0(processRecordG);
        R(processRecordG);
    }

    public static Bundle r(@NonNull ProcessRecordG processRecordG, GProcessClient.ProcessAction processAction) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", processAction.ordinal());
        bundle.putInt(GProcessClient.f164190q, processRecordG.f166734d);
        bundle.putInt(GProcessClient.f164191r, processRecordG.f166735e);
        bundle.putString("packageName", processRecordG.f166731a);
        bundle.putString(GProcessClient.f164193t, processRecordG.f166732b);
        return bundle;
    }

    public static String s(@NonNull ProcessRecordG processRecordG, int i10) {
        GaiaContext gaiaContextJ = GaiaContext.j();
        String str = processRecordG.f166731a;
        return gaiaContextJ.N(i10, str, processRecordG.f166732b.replace(str, ""));
    }

    @Nullable
    public static GProcessSupervisorProvider t() {
        return f166063g;
    }

    public static IBinder u(String str) {
        InterfaceC5394a interfaceC5394a;
        Map<String, InterfaceC5394a> map = f166065i;
        if (map == null || (interfaceC5394a = map.get(str)) == null) {
            return null;
        }
        return interfaceC5394a.c();
    }

    public static b v() {
        if (GaiaContext.j().j0()) {
            return f166060d;
        }
        return null;
    }

    public static void w() {
        if (f166062f) {
            return;
        }
        synchronized (GProcessSupervisorProvider.class) {
            if (f166062f) {
                return;
            }
            try {
                x();
            } catch (Throwable unused) {
            }
            f166062f = true;
        }
    }

    public static void x() {
        Context contextN = GaiaContext.j().n();
        if (C3841e.w()) {
            f166064h = Environment.isExternalStorageLegacy();
        }
        if (C3841e.E() && ((Integer) ((r6.k) GaiaPreferenceUtils.f167742j.a(contextN)).o()).intValue() <= 307012) {
            ((AlarmManager) contextN.getSystemService("alarm")).cancelAll();
            ((r6.k) GaiaPreferenceUtils.f167742j.a(contextN)).p(307022);
        }
        f166065i = new LinkedHashMap(13);
        l(BinderC4156g.v5());
        l(I.T5());
        l(G9.a.T5());
        l(L.T5());
        if (Z6.b.a()) {
            l(M9.c.Z5());
        }
        l(K9.g.h6());
        l(GaiaUserManagerService.f6());
        l(BinderC4171f.j6());
        l(com.prism.gaia.server.am.q.s6());
        l(GaiaJobSchedulerService.a6());
        l(GaiaAppManagerService.q6());
        l(com.prism.gaia.server.accounts.i.N6());
        l(com.prism.gaia.server.content.c.U5());
        try {
            com.prism.gaia.server.pm.u uVar = com.prism.gaia.server.pm.u.f167650m;
            uVar.e(null, false);
            GuestProcessTaskManagerProvider.d();
            for (String str : uVar.o()) {
                if (U6.c.V(str)) {
                    GuestProcessTaskManagerProvider.c(str);
                }
            }
        } catch (Throwable th) {
            C5705o.c().e(th, GaiaContext.f164212y.v(), "supervisor", "SUPERVISOR_INIT_SERVICES_AFTER", null);
        }
        try {
            GaiaContext.f164212y.a();
        } catch (Throwable unused) {
        }
        try {
            f166061e.W();
        } catch (Throwable th2) {
            th2.getMessage();
            C5705o.c().e(th2, GaiaContext.f164212y.v(), "supervisor", "SUPERVISOR_INIT_DATA", null);
        }
        C4455a.b.f202252a.a().execute(new RunnableC4153d());
        U6.c.f68713k.b().b(GaiaContext.f164212y.z());
    }

    public static boolean y(int i10, String str) {
        ProcessRecordG processRecordGX = f166061e.x(str, i10);
        return processRecordGX != null && processRecordGX.b();
    }

    public static void z(String str, int i10) {
        ProcessRecordG processRecordGX = f166061e.x(str, i10);
        if (processRecordGX != null) {
            D(processRecordGX);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if ("checkInit".equals(str)) {
            bundle2.putBinder(b.c.f68612a, f166060d);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f166063g = this;
        w();
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
