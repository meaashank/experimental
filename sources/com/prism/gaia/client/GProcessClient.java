package com.prism.gaia.client;

import U6.o;
import X6.s;
import X6.u;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.prism.commons.utils.r0;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.a;
import com.prism.gaia.gserver.SupervisorService;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAG;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.server.GProcessSupervisorProvider;
import com.prism.gaia.server.T;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import o8.C5335a;
import p6.C5395b;
import p6.c;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class GProcessClient extends a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f164186m = "asdf-".concat(GProcessClient.class.getSimpleName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GProcessClient f164187n = new GProcessClient();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f164188o = "00000000000000";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f164189p = "action";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f164190q = "vuid";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f164191r = "vpid";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f164192s = "packageName";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f164193t = "processName";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f164194u = "vpnTunnelGone";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f164195v = "vpnTunnelUp";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static ServiceConnection f164196w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile T f164198h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f164197g = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile String f164199i = "00000000000000";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<f> f164200j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f164201k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f164202l = false;

    public enum ProcessAction {
        starting,
        binding,
        bound,
        shown,
        dead,
        cmd_restart,
        _message
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements p6.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f164203a;

        public a(c.a aVar) {
            this.f164203a = aVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
        @Override // p6.c
        public IInterface a(String str) {
            return this.f164203a.a(GProcessClient.this.y0(str));
        }

        @Override // p6.c
        public boolean b() {
            return GaiaContext.j().j0();
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = GProcessClient.f164186m;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String unused = GProcessClient.f164186m;
        }
    }

    public class c implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBinder f164206a;

        public c(IBinder iBinder) {
            this.f164206a = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            String unused = GProcessClient.f164186m;
            try {
                this.f164206a.unlinkToDeath(this, 0);
            } finally {
                GProcessClient.this.m6();
            }
        }
    }

    public interface d {
        void a(GuestProcessInfo guestProcessInfo, ProcessAction processAction);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f164208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f164209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f164210c;

        public e() {
        }

        public final synchronized void d(String str, Bundle bundle) {
            Activity activity = this.f164208a;
            if (activity == null) {
                return;
            }
            if (bundle == null) {
                if (str != null) {
                    r0.g(activity, str, 0);
                }
                return;
            }
            int i10 = bundle.getInt("action", -1);
            if (i10 < 0) {
                if (str != null) {
                    r0.g(this.f164208a, str, 0);
                }
                return;
            }
            ProcessAction processAction = ProcessAction.values()[i10];
            if (processAction == ProcessAction._message) {
                if (str != null) {
                    r0.g(this.f164208a, str, 1);
                }
                return;
            }
            if (str != null) {
                r0.g(this.f164208a, str, 0);
            }
            if (this.f164210c != null) {
                String string = bundle.getString(GProcessClient.f164193t);
                String str2 = this.f164209b;
                if (str2 == null || (string != null && string.equals(str2))) {
                    int i11 = bundle.getInt(GProcessClient.f164190q, -1);
                    int i12 = bundle.getInt(GProcessClient.f164191r, -1);
                    String string2 = bundle.getString("packageName");
                    GuestProcessInfo guestProcessInfo = new GuestProcessInfo();
                    guestProcessInfo.vuid = i11;
                    guestProcessInfo.vpid = i12;
                    guestProcessInfo.packageName = string2;
                    guestProcessInfo.processName = string;
                    this.f164210c.a(guestProcessInfo, processAction);
                }
            }
        }

        public final synchronized void e(Activity activity, String str, d dVar) {
            this.f164208a = activity;
            this.f164209b = str;
            this.f164210c = dVar;
        }

        public final synchronized void f(Activity activity) {
            if (this.f164208a == activity) {
                this.f164208a = null;
                this.f164209b = null;
                this.f164210c = null;
            }
        }

        public e(X6.f fVar) {
        }
    }

    public interface f {
        void a();
    }

    public static void a6(Activity activity) {
        activity.finishAndRemoveTask();
    }

    public static GProcessClient c6() {
        return f164187n;
    }

    public static /* synthetic */ void h2(String str, final Activity activity, final d dVar, final GuestProcessInfo guestProcessInfo, final ProcessAction processAction) {
        processAction.toString();
        if (processAction == ProcessAction.dead) {
            activity.runOnUiThread(new Runnable() { // from class: X6.a
                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity2 = activity;
                    GProcessClient.d dVar2 = dVar;
                    GuestProcessInfo guestProcessInfo2 = guestProcessInfo;
                    new AlertDialog.Builder(activity2).setMessage(GaiaContext.j().z().getString(o.n.f72156X3, "Instagram")).setPositiveButton(o.n.f72083K4, new DialogInterface.OnClickListener() { // from class: X6.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            dVar2.a(guestProcessInfo2, GProcessClient.ProcessAction.cmd_restart);
                        }
                    }).setNegativeButton(o.n.f72310x4, new DialogInterface.OnClickListener() { // from class: X6.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            dVar2.a(guestProcessInfo2, processAction);
                        }
                    }).create().show();
                }
            });
        } else {
            dVar.a(guestProcessInfo, processAction);
        }
    }

    public static void i6() {
        int iMyPid = Process.myPid();
        GProcessClient gProcessClient = f164187n;
        if (gProcessClient.Y5()) {
            gProcessClient.h4(iMyPid);
        } else {
            Process.killProcess(iMyPid);
        }
    }

    @Override // com.prism.gaia.client.a
    public void J3(String str, Bundle bundle) {
        if (bundle != null && bundle.getBoolean(f164195v, false)) {
            C5335a.c();
        } else if (bundle == null || !bundle.getBoolean(f164194u, false)) {
            this.f164201k.d(str, bundle);
        } else {
            C5335a.d();
        }
    }

    @Override // com.prism.gaia.client.a
    public IBinder N2() {
        return ActivityThreadCAG.f165276G.getApplicationThread().call(GaiaContext.j().E(), new Object[0]);
    }

    @Override // com.prism.gaia.client.a
    public String R1() {
        return GaiaContext.j().Q();
    }

    public void W5() {
        if (Y5()) {
            synchronized (this) {
                try {
                    if (this.f164202l) {
                        return;
                    }
                    try {
                        GuestProcessInfo guestProcessInfoX1 = this.f164198h.x1(asBinder());
                        this.f164202l = true;
                        GaiaContext.j().k0(guestProcessInfoX1);
                    } catch (RemoteException e10) {
                        e10.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void X5() {
        if (f164196w != null || GaiaContext.j().j0()) {
            return;
        }
        try {
            Context contextZ = GaiaContext.f164212y.z();
            Intent intent = new Intent(contextZ, (Class<?>) SupervisorService.class);
            b bVar = new b();
            if (contextZ.bindService(intent, bVar, 65)) {
                f164196w = bVar;
            }
        } catch (Throwable unused) {
        }
    }

    public boolean Y5() {
        synchronized (this) {
            try {
                if (this.f164198h != null) {
                    return true;
                }
                return Z5();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Z5() {
        if (!GaiaContext.j().i0()) {
            this.f164198h = GProcessSupervisorProvider.p();
            if (this.f164198h != null) {
                boolean zL6 = l6();
                if (zL6) {
                    X5();
                    GaiaContext gaiaContext = GaiaContext.f164212y;
                    if (gaiaContext.e0()) {
                        u.e(gaiaContext.Q());
                    }
                }
                return zL6;
            }
            if (GaiaContext.f164212y.e0()) {
                C5705o.c().a(new RuntimeException("supervisor can not be started, kill guest self"), "SUPERVISOR_START_FAIL", null);
                i6();
            }
        }
        return false;
    }

    public void b6() {
        if (Y5()) {
            try {
                this.f164198h.W1(asBinder());
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.prism.gaia.client.a
    public int c() {
        return GaiaContext.j().I();
    }

    public <T extends IInterface> C5395b<T> d6(String str, Class<T> cls, c.a<T> aVar) {
        final C5395b<T> c5395b = new C5395b<>(str, cls, new a(aVar));
        if (GaiaContext.j().h0()) {
            o6(new f() { // from class: X6.e
                @Override // com.prism.gaia.client.GProcessClient.f
                public final void a() {
                    c5395b.c();
                }
            });
        }
        return c5395b;
    }

    public String e6() {
        return this.f164199i;
    }

    public boolean f6() {
        if (!Y5()) {
            return false;
        }
        try {
            return this.f164198h.I5(GaiaContext.j().r());
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean g6() {
        T t10 = this.f164198h;
        if (t10 == null) {
            return false;
        }
        try {
            IBinder iBinderAsBinder = t10.asBinder();
            if (iBinderAsBinder != null) {
                if (iBinderAsBinder.isBinderAlive()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.prism.gaia.client.a
    public IBinder h1() {
        if (GaiaContext.j().e0() || GaiaContext.f164212y.i0()) {
            return s.u6();
        }
        return null;
    }

    public void h4(int i10) {
        if (Y5()) {
            try {
                this.f164198h.h4(i10);
            } catch (RemoteException unused) {
            }
        }
    }

    public boolean h6() {
        return this.f164198h != null;
    }

    public final void j6() {
        IBinder iBinderAsBinder = this.f164198h.asBinder();
        try {
            iBinderAsBinder.linkToDeath(new c(iBinderAsBinder), 0);
        } catch (Throwable unused) {
            m6();
        }
    }

    public void k6(String str) {
        if (Y5()) {
            try {
                this.f164198h.a2(GaiaContext.j().I(), str);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean l6() {
        try {
            String strL2 = this.f164198h.L2();
            if (!this.f164199i.equals("00000000000000")) {
                if (!this.f164199i.equals(strL2)) {
                    if (GaiaContext.j().e0()) {
                        C5705o.c().a(new RuntimeException("supervisor restart, kill guest self"), "SUPERVISOR_RESTART", null);
                        i6();
                        return false;
                    }
                    this.f164199i = strL2;
                }
                return true;
            }
            this.f164199i = strL2;
            j6();
            return true;
        } catch (RemoteException e10) {
            e10.getMessage();
            this.f164198h = null;
            return false;
        }
    }

    public void m6() {
        int i10 = 0;
        ArrayList arrayList = new ArrayList(0);
        synchronized (this) {
            try {
                if (this.f164198h != null) {
                    this.f164198h = null;
                    this.f164202l = false;
                    arrayList = new ArrayList(this.f164200j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                ((f) obj).a();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    public void n6(final Activity activity, @Nullable final String str, @NonNull final d dVar) {
        if (a7.c.f84757b.equals(str)) {
            this.f164201k.e(activity, str, new d() { // from class: X6.b
                @Override // com.prism.gaia.client.GProcessClient.d
                public final void a(GuestProcessInfo guestProcessInfo, GProcessClient.ProcessAction processAction) {
                    GProcessClient.h2(str, activity, dVar, guestProcessInfo, processAction);
                }
            });
        } else {
            this.f164201k.e(activity, str, dVar);
        }
    }

    public void o6(f fVar) {
        synchronized (this) {
            this.f164200j.add(fVar);
        }
    }

    @Override // com.prism.gaia.client.a
    public String p3() {
        return this.f164197g;
    }

    public void p6(Activity activity) {
        this.f164201k.f(activity);
    }

    public void q6(f fVar) {
        synchronized (this) {
            this.f164200j.remove(fVar);
        }
    }

    public void r6(IBinder iBinder) {
        synchronized (this) {
            this.f164198h = T.b.U0(iBinder);
        }
    }

    public void u5() {
        try {
            this.f164198h.u5();
        } catch (RemoteException unused) {
        }
        i6();
    }

    @Nullable
    public IBinder y0(String str) {
        if (!Y5()) {
            return null;
        }
        try {
            return com.prism.gaia.utils.c.a(this.f164198h.y0(str));
        } catch (RemoteException unused) {
            return null;
        }
    }
}
