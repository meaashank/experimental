package v8;

import U6.b;
import U6.o;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import com.prism.commons.notification.NotificationBundle;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.GuestServiceStub;
import com.prism.gaia.helper.utils.C3920c;
import com.prism.gaia.naked.compat.android.app.ActivityManagerNativeCompat2;
import com.prism.gaia.naked.compat.android.app.ActivityThreadCompat2;
import com.prism.gaia.naked.compat.android.app.ServiceCompat2;
import com.prism.gaia.naked.compat.android.content.ContentProviderCompat2;
import com.prism.gaia.naked.compat.android.content.res.CompatibilityInfoCompat2;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.app.ActivityCAG;
import com.prism.gaia.naked.metadata.android.app.ActivityManagerNativeCAG;
import com.prism.gaia.naked.metadata.android.app.ActivityThreadCAG;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAG;
import com.prism.gaia.naked.metadata.android.app.IActivityTaskManagerCAG;
import com.prism.gaia.naked.metadata.android.app.IApplicationThreadCAG;
import com.prism.gaia.naked.metadata.com.android.internal.content.ReferrerIntentCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.os.ParceledListSliceG;
import com.prism.gaia.remote.BadgerInfo;
import com.prism.gaia.remote.GaiaTaskInfo;
import com.prism.gaia.remote.GuestProcessInfo;
import com.prism.gaia.remote.PendingIntentInfoG;
import com.prism.gaia.remote.ProviderPlacementG;
import com.prism.gaia.remote.RunningProcessInfo;
import com.prism.gaia.remote.StubProcessInfo;
import com.prism.gaia.server.N;
import g6.C4455a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m7.C5204a;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5703m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239871c = "asdf-".concat(C5703m.class.getSimpleName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5703m f239872d = new C5703m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f239873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f239874f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<IBinder, C5691a> f239875a = new HashMap(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5395b<N> f239876b = GProcessClient.f164187n.d6("activity", N.class, new a());

    /* JADX INFO: renamed from: v8.m$a */
    public class a implements c.a<N> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public N a(IBinder iBinder) {
            return N.b.U0(iBinder);
        }
    }

    /* JADX INFO: renamed from: v8.m$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f239878a;

        static {
            int[] iArr = new int[GuestServiceStub.StubType.values().length];
            f239878a = iArr;
            try {
                iArr[GuestServiceStub.StubType.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f239878a[GuestServiceStub.StubType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: v8.m$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GuestServiceStub f239879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IBinder f239880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f239881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<IBinder, Service> f239882d;

        public int a() {
            return b.f239878a[this.f239879a.getServiceType().ordinal()] != 1 ? 0 : -1;
        }

        public c() {
            this.f239881c = false;
            this.f239882d = new HashMap();
        }
    }

    public static void a(Intent intent) {
        f239872d.e0(intent, GaiaContext.j().Z());
    }

    public static void b(Intent intent) {
        f239872d.e0(intent, GaiaContext.j().Z());
    }

    public static C5703m o() {
        return f239872d;
    }

    public GuestProcessInfo A(int i10) {
        try {
            return I().G(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String A0(IBinder iBinder) {
        try {
            return I().S1(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String B(int i10) {
        try {
            return I().m1(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public Intent B0(Intent intent, String str, boolean z10, int i10) {
        try {
            return I().m4(intent, str, z10, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public List<String> C(int i10) {
        try {
            return I().r0(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void C0(IBinder iBinder, String str, int i10) {
        C5691a c5691a = this.f239875a.get(iBinder);
        if (c5691a == null || c5691a.f239861a == null) {
            return;
        }
        ActivityThreadCAG.f165276G.sendActivityResult().call(GaiaContext.j().E(), iBinder, str, Integer.valueOf(i10), 0, null);
    }

    public List<ActivityManager.RunningAppProcessInfo> D(int i10) {
        try {
            return I().S5(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void D0(IBinder iBinder, int i10, int i11, int i12) {
        try {
            I().x(iBinder, i10, i11, i12);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public PendingIntentInfoG E(IBinder iBinder) {
        try {
            return I().u3(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int E0(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, int i10) {
        try {
            return I().o2(intentArr, strArr, iBinder, bundle, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String F(IBinder iBinder) {
        try {
            return I().U2(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int F0(Intent intent, IBinder iBinder, String str, int i10, Bundle bundle, int i11) {
        try {
            return I().p1(intent, iBinder, str, i10, bundle, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public PendingIntent G(int i10, int i11, String str, String str2, int i12, Intent[] intentArr, String[] strArr, int i13, Bundle bundle) {
        try {
            return I().K(i10, i11, str, str2, i12, intentArr, strArr, i13, bundle);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public ComponentName G0(IInterface iInterface, Intent intent, int i10) {
        try {
            return I().A2(iInterface != null ? iInterface.asBinder() : null, intent, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String H(IBinder iBinder) {
        try {
            return I().k1(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int H0(IInterface iInterface, Intent intent) {
        try {
            return I().b0(iInterface != null ? iInterface.asBinder() : null, intent, GaiaContext.j().Z());
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public final N I() {
        return (N) this.f239876b.b();
    }

    public boolean I0(ComponentName componentName, IBinder iBinder, int i10) {
        try {
            return I().V0(componentName, iBinder, i10, GaiaContext.j().Z());
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public ParceledListSliceG J(int i10, int i11, int i12) {
        try {
            return I().X(i10, i11, i12);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public IBinder J0(Intent intent) {
        E9.d dVarC = E9.c.c(intent);
        return dVarC == null ? new Binder() : dVarC.f33337e;
    }

    public final c K(Service service) {
        if (b.f239878a[((GuestServiceStub) service).getServiceType().ordinal()] != 1) {
            if (f239873e == null) {
                f239873e = new c();
            }
            return f239873e;
        }
        if (f239874f == null) {
            f239874f = new c();
        }
        return f239874f;
    }

    public void K0(Service service) {
        c cVarK = K(service);
        cVarK.f239879a = (GuestServiceStub) service;
        cVarK.f239880b = ServiceCompat2.Util.getToken(service);
    }

    public final c L(ServiceInfo serviceInfo) {
        return A6.l.c(serviceInfo) == 0 ? f239873e : f239874f;
    }

    public void L0(Service service) {
        c cVarK = K(service);
        Iterator<IBinder> it = cVarK.f239882d.keySet().iterator();
        while (it.hasNext()) {
            ActivityThreadCompat2.Util.handleStopService(GaiaContext.j().E(), it.next());
        }
        cVarK.f239882d.clear();
        Intent intentE = E9.c.e(cVarK.a());
        if (intentE != null) {
            GaiaContext.f164212y.p().stopService(intentE);
        }
    }

    public final c M(IBinder iBinder) {
        c[] cVarArr = {f239873e, f239874f};
        for (int i10 = 0; i10 < 2; i10++) {
            c cVar = cVarArr[i10];
            if (cVar != null && cVar.f239882d.get(iBinder) != null) {
                return cVar;
            }
        }
        return null;
    }

    public String N(IBinder iBinder, String str) {
        try {
            return I().N0(iBinder, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int N0(Service service, Intent intent, int i10, int i11) {
        if (intent == null) {
            return 2;
        }
        c cVarK = K(service);
        boolean booleanExtra = intent.getBooleanExtra(b.c.f68622k, false);
        if (!cVarK.f239881c) {
            cVarK.f239881c = booleanExtra;
        }
        if (booleanExtra) {
            int intExtra = intent.getIntExtra(b.c.f68600B, -1);
            GuestServiceStub guestServiceStub = cVarK.f239879a;
            if (guestServiceStub instanceof GuestServiceStub.l1) {
                ((GuestServiceStub.l1) guestServiceStub).b(intExtra);
            }
            C5710t.i(service, intExtra);
        }
        return 2;
    }

    public GaiaTaskInfo O(int i10) {
        try {
            return I().H2(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean O0(Intent intent) {
        return false;
    }

    public int P(IBinder iBinder) {
        try {
            return I().j1(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void P0(IBinder iBinder, Intent intent, boolean z10) {
        try {
            I().Z4(iBinder, intent, z10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int Q(int i10) {
        try {
            return I().m5(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean Q0(com.prism.gaia.client.stub.s sVar) {
        try {
            return I().g5(sVar);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void R(IBinder iBinder, String[] strArr, int i10) {
        try {
            I().P(iBinder, strArr, i10);
        } catch (RemoteException unused) {
        }
    }

    public void R0(Intent intent, int i10) {
        try {
            I().f0(intent, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void S(IBinder iBinder, Intent intent, boolean z10) {
        ActivityThreadCompat2.Util.handleBindService(GaiaContext.j().E(), ActivityThreadCompat2.Util.ctorBindServiceData(iBinder, intent, z10));
    }

    public void S0(String str) {
        try {
            I().B4(str);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public Service T(IBinder iBinder, ServiceInfo serviceInfo) {
        Object objE = GaiaContext.j().E();
        ActivityThreadCompat2.Util.handleCreateService(objE, ActivityThreadCompat2.Util.ctorCreateServiceData(iBinder, serviceInfo, CompatibilityInfoCompat2.Util.DEFAULT_COMPATIBILITY_INFO));
        Service serviceByToken = ActivityThreadCompat2.Util.getServiceByToken(objE, iBinder);
        c cVarL = L(serviceInfo);
        if (cVarL != null) {
            cVarL.f239882d.put(iBinder, serviceByToken);
        }
        return serviceByToken;
    }

    public void T0(com.prism.gaia.client.stub.r rVar) {
        try {
            I().o1(rVar);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void U(Intent intent) {
        IBinder binder = intent.getExtras().getBinder(Z6.g.f84358k);
        if (binder == null) {
            X6.s.u6().getClass();
            intent.getIntExtra(Z6.g.f84356i, 0);
        } else {
            try {
                I().j4(binder, intent);
            } catch (RemoteException unused) {
            }
        }
    }

    public void V(IBinder iBinder, final Intent intent, String str) {
        synchronized (this.f239875a) {
            try {
                C5691a c5691a = this.f239875a.get(iBinder);
                if (c5691a == null) {
                    I.u(f239871c, "handleNewIntent ActivityClientRecord is null");
                    C4455a.b().a().execute(new Runnable() { // from class: v8.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5703m.b(intent);
                        }
                    });
                    return;
                }
                I.b(f239871c, "handleNewIntent move task(%d) to front", Integer.valueOf(c5691a.f239864d));
                f239872d.p().moveTaskToFront(c5691a.f239864d, 0);
                Object objE = GaiaContext.j().E();
                if (!ActivityThreadCompat2.Util.hasActivityClientRecord(objE, iBinder)) {
                    k0(iBinder, true);
                    C4455a.b().a().execute(new Runnable() { // from class: v8.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5703m.a(intent);
                        }
                    });
                    return;
                }
                Intent intentNewInstance = ReferrerIntentCAG.f165983G.ctor().newInstance(intent, str);
                if (C3841e.z()) {
                    ActivityThreadCAG.S31.handleNewIntent().call(objE, ActivityThreadCompat2.Util.getActivityClientRecord(objE, iBinder), Collections.singletonList(intentNewInstance));
                } else if (C3841e.w()) {
                    ActivityThreadCAG.Q29.handleNewIntent().call(objE, iBinder, Collections.singletonList(intentNewInstance));
                } else if (ActivityThreadCAG.f165275C.performNewIntents() != null) {
                    ActivityThreadCAG.f165275C.performNewIntents().call(objE, iBinder, Collections.singletonList(intentNewInstance));
                } else {
                    ActivityThreadCAG.N24_P28.performNewIntents().call(objE, iBinder, Collections.singletonList(intentNewInstance), Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void W(IBinder iBinder, ServiceInfo serviceInfo, int i10, int i11, Intent intent) {
        Object objE = GaiaContext.j().E();
        ApplicationInfo applicationInfo = serviceInfo.applicationInfo;
        ActivityThreadCompat2.Util.handleServiceArgs(objE, ActivityThreadCompat2.Util.ctorServiceArgsData(iBinder, applicationInfo != null && applicationInfo.targetSdkVersion < 5, i10, i11, intent));
    }

    public void X(IBinder iBinder) {
        ActivityThreadCompat2.Util.handleStopService(GaiaContext.j().E(), iBinder);
        c cVarM = M(iBinder);
        if (cVarM != null) {
            cVarM.f239882d.remove(iBinder);
            if (cVarM.f239882d.isEmpty()) {
                GaiaContext.f164212y.p().stopService(E9.c.e(cVarM.a()));
            }
        }
    }

    public void Y(IBinder iBinder, Intent intent) {
        ActivityThreadCompat2.Util.handleUnbindService(GaiaContext.j().E(), ActivityThreadCompat2.Util.ctorBindServiceData(iBinder, intent, false));
    }

    public boolean Z(IBinder iBinder) {
        try {
            return I().t4(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean a0(int i10) {
        try {
            return I().H3(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public boolean b0(IBinder iBinder) {
        try {
            return I().E4(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public IInterface c(int i10, ProviderInfo providerInfo) {
        try {
            return ContentProviderCompat2.Util.asInterface(I().W(i10, providerInfo));
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void c0(String str, int i10) {
        try {
            I().D0(str, i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public void d(IBinder iBinder, Intent intent, String str, IBinder iBinder2, String str2, int i10, int i11, int i12, Bundle bundle) throws RemoteException {
        I().F4(iBinder, intent, str, iBinder2, str2, i10, i11, i12, bundle);
    }

    public void d0(String str, int i10) {
        try {
            I().l0(str, i10);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public int e(IBinder iBinder, IBinder iBinder2, Intent intent, com.prism.gaia.client.stub.s sVar, int i10, String str, int i11) {
        try {
            return I().e0(iBinder, iBinder2, intent, sVar, i10, str, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int e0(Intent intent, int i10) {
        try {
            return i10 < 0 ? com.prism.gaia.helper.compat.b.f164987j : I().u4(intent, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int f(Intent intent, com.prism.gaia.client.stub.r rVar, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) {
        try {
            return I().m2(intent, rVar, i10, str, bundle, z10, z11, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void f0(String str) {
        try {
            I().R5(str);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public void g(String str, int i10) {
        try {
            I().m0(str, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void g0(BadgerInfo badgerInfo) {
        try {
            I().Y3(badgerInfo);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void h(IBinder iBinder) {
        try {
            I().b1(iBinder);
        } catch (RemoteException unused) {
        }
    }

    public void h0(IBinder iBinder) {
        try {
            I().N5(iBinder);
        } catch (RemoteException unused) {
        }
    }

    public StubProcessInfo i(String str, String str2, int i10) {
        try {
            return I().O3(str, str2, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void i0(String str, IBinder iBinder, int i10, Intent intent, ActivityInfo activityInfo) {
        j0(str, iBinder, i10, intent, activityInfo, false);
    }

    public final Notification j(Context context, String str, String str2) {
        Notification.Builder builder;
        if (C3841e.s()) {
            NotificationChannel notificationChannelA = w.j.a(str, str2, 3);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationChannelA.enableLights(false);
            notificationChannelA.enableVibration(false);
            notificationChannelA.setVibrationPattern(new long[]{0, 300});
            notificationChannelA.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannelA);
            builder = C5699i.a(context, str);
        } else {
            builder = new Notification.Builder(context);
        }
        builder.setSmallIcon(R.color.transparent);
        if (C3841e.s()) {
            builder.setStyle(C5700j.a());
            builder.setCustomContentView(new RemoteViews(context.getPackageName(), o.k.f71944b0));
            builder.setOngoing(false);
            builder.setAutoCancel(true);
        } else {
            builder.setContent(new RemoteViews(context.getPackageName(), o.k.f71944b0));
        }
        builder.setPriority(-1);
        builder.setSound(null);
        builder.setVibrate(new long[]{0, 300});
        if (C3841e.z()) {
            builder.setForegroundServiceBehavior(1);
        }
        return builder.build();
    }

    public void j0(String str, IBinder iBinder, int i10, Intent intent, ActivityInfo activityInfo, boolean z10) {
        C5691a c5691a = new C5691a();
        c5691a.f239862b = activityInfo;
        c5691a.f239864d = i10;
        c5691a.f239863c = z10;
        synchronized (this.f239875a) {
            this.f239875a.put(iBinder, c5691a);
            I.b(f239871c, "createdGuestActivities add token(%s) for activity(%s)", iBinder, c5691a.f239862b.name);
        }
        try {
            I().i4(str, iBinder, i10, intent);
        } catch (RemoteException unused) {
        }
    }

    public void k(IBinder iBinder) {
        C5691a c5691aY = y(iBinder);
        if (c5691aY != null) {
            Activity activity = c5691aY.f239861a;
            while (true) {
                Activity activity2 = ActivityCAG.f165269G.mParent().get(activity);
                if (activity2 == null) {
                    break;
                } else {
                    activity = activity2;
                }
            }
            if (ActivityCAG.f165269G.mFinished().get(activity)) {
                return;
            }
            com.prism.gaia.helper.compat.b.a(iBinder, ActivityCAG.f165269G.mResultCode().get(activity), ActivityCAG.f165269G.mResultData().get(activity));
            ActivityCAG.f165269G.mFinished().set(activity, true);
        }
    }

    public boolean k0(IBinder iBinder, boolean z10) {
        boolean zU;
        synchronized (this.f239875a) {
            try {
                if (z10) {
                    C5691a c5691aRemove = this.f239875a.remove(iBinder);
                    if (c5691aRemove != null) {
                        I.b(f239871c, "createdGuestActivities remove token(%s) for activity(%s)", iBinder, c5691aRemove.f239862b.name);
                    }
                } else {
                    I.b(f239871c, "createdGuestActivities keep token(%s): relaunching, not finishing", iBinder);
                }
                try {
                    zU = I().u(iBinder, z10);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU;
    }

    public boolean l(IBinder iBinder, int i10, String str, Bundle bundle, boolean z10, int i11) {
        try {
            return I().q5(iBinder, i10, str, bundle, z10, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void l0(IBinder iBinder) {
        synchronized (this.f239875a) {
            C5691a c5691a = this.f239875a.get(iBinder);
            if (c5691a != null) {
                c5691a.f239865e = true;
            }
            try {
                I().a3(iBinder);
            } catch (RemoteException unused) {
            }
        }
    }

    public void m(ApplicationInfo applicationInfo, int i10) {
        if (applicationInfo == null) {
            return;
        }
        applicationInfo.uid = GaiaUserHandle.fixToVuserId(applicationInfo.uid, i10);
    }

    public void m0(IBinder iBinder, int i10) {
        try {
            I().d4(iBinder, i10);
        } catch (RemoteException unused) {
        }
    }

    public int n(Intent intent, IBinder iBinder, String str, int i10, IBinder iBinder2, Bundle bundle, int i11) {
        try {
            return I().x4(intent, iBinder, str, i10, iBinder2, bundle, i11);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void n0(IBinder iBinder) {
        try {
            I().s2(iBinder);
        } catch (RemoteException unused) {
        }
    }

    public void o0(IBinder iBinder) {
        try {
            I().j(iBinder);
        } catch (RemoteException unused) {
        }
    }

    public ActivityManager p() {
        return (ActivityManager) GaiaContext.j().n().getSystemService("activity");
    }

    public void p0(IBinder iBinder, @NonNull NotificationBundle notificationBundle) {
        int i10 = notificationBundle.f161981id;
        c cVarM = M(iBinder);
        if (cVarM != null && cVarM.f239881c) {
            C5710t.k().n().notify(notificationBundle.tag, notificationBundle.f161981id, notificationBundle.notification);
        }
    }

    public ComponentName q(IBinder iBinder) {
        try {
            return I().r1(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public IBinder q0(Intent intent, int i10) {
        try {
            return I().n0(intent, i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String r(IBinder iBinder) {
        try {
            return I().F3(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int r0(IBinder iBinder, Intent intent) {
        try {
            return I().L5(iBinder, intent);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public ComponentName s(IBinder iBinder) {
        try {
            return I().o(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public ProviderPlacementG s0(int i10, ProviderInfo providerInfo) {
        try {
            ProviderPlacementG providerPlacementGZ1 = I().Z1(i10, providerInfo);
            return providerPlacementGZ1 != null ? providerPlacementGZ1 : ProviderPlacementG.inProcess(null);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String t(IBinder iBinder) {
        try {
            return I().X1(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void t0(IBinder iBinder, Intent intent, IBinder iBinder2) {
        try {
            I().O1(iBinder, intent, iBinder2);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public int u(IBinder iBinder) {
        try {
            return I().q(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void u0(IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        try {
            I().J1(iBinder, iBinder2, iBinder3);
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    public List<String> v() {
        try {
            return I().P1();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int v0(String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        NakedMethod<Integer> nakedMethodStartActivities;
        IInterface iInterfaceL;
        String str2;
        IBinder iBinder2;
        Bundle bundle2;
        if (IActivityManagerCAG.f165322G.startActivities() != null) {
            nakedMethodStartActivities = IActivityManagerCAG.f165322G.startActivities();
            iInterfaceL = ActivityManagerNativeCompat2.Util.getIActivityManager();
        } else {
            nakedMethodStartActivities = IActivityTaskManagerCAG.f165323G.startActivities();
            C5204a c5204a = (C5204a) Z6.n.f().e(C5204a.class);
            iInterfaceL = (c5204a == null || c5204a.n() == null) ? null : c5204a.n().l();
        }
        int i10 = 0;
        if (nakedMethodStartActivities != null && iInterfaceL != null) {
            Class[] clsArrParamList = nakedMethodStartActivities.paramList();
            Object[] objArr = new Object[clsArrParamList.length];
            if (clsArrParamList[0] == IApplicationThreadCAG.f165326G.ORG_CLASS()) {
                objArr[0] = ActivityThreadCAG.f165276G.getApplicationThread().call(GaiaContext.j().E(), new Object[0]);
            }
            int iP = C3838b.p(clsArrParamList, String.class);
            int iP2 = C3838b.p(clsArrParamList, Intent[].class);
            int i11 = iP2 + 1;
            int iQ = C3838b.q(clsArrParamList, IBinder.class, 2);
            int iP3 = C3838b.p(clsArrParamList, Bundle.class);
            if (iP != -1) {
                objArr[iP] = str;
            }
            objArr[iP2] = intentArr;
            objArr[i11] = strArr;
            objArr[iQ] = iBinder;
            objArr[iP3] = bundle;
            C3920c.a(clsArrParamList, objArr);
            return nakedMethodStartActivities.call(iInterfaceL, objArr).intValue();
        }
        if (intentArr == null) {
            return 0;
        }
        int length = intentArr.length;
        int iW0 = 0;
        while (i10 < length) {
            Intent intent = intentArr[i10];
            if (intent != null) {
                str2 = str;
                iBinder2 = iBinder;
                bundle2 = bundle;
                iW0 = w0(str2, intent, iBinder2, null, -1, bundle2);
            } else {
                str2 = str;
                iBinder2 = iBinder;
                bundle2 = bundle;
            }
            i10++;
            str = str2;
            iBinder = iBinder2;
            bundle = bundle2;
        }
        return iW0;
    }

    public List<RunningProcessInfo> w() {
        try {
            return I().g0();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public int w0(String str, Intent intent, IBinder iBinder, String str2, int i10, Bundle bundle) {
        Class[] clsArrParamList = IActivityManagerCAG.f165321C.startActivity() != null ? IActivityManagerCAG.f165321C.startActivity().paramList() : IActivityManagerCAG.f165321C.startActivityWithFeature().paramList();
        Object[] objArr = new Object[clsArrParamList.length];
        if (clsArrParamList[0] == IApplicationThreadCAG.f165326G.ORG_CLASS()) {
            objArr[0] = ActivityThreadCAG.f165276G.getApplicationThread().call(GaiaContext.j().E(), new Object[0]);
        }
        int iP = C3838b.p(clsArrParamList, Intent.class);
        int iQ = C3838b.q(clsArrParamList, IBinder.class, 2);
        int iP2 = C3838b.p(clsArrParamList, Bundle.class);
        int i11 = iP + 1;
        objArr[iP] = intent;
        objArr[iQ] = iBinder;
        objArr[iQ + 1] = str2;
        objArr[iQ + 2] = Integer.valueOf(i10);
        if (iP2 != -1) {
            objArr[iP2] = bundle;
        }
        objArr[i11] = intent.getType();
        objArr[iP - 1] = str;
        C3920c.a(clsArrParamList, objArr);
        Arrays.asList(objArr);
        ActivityManagerNativeCompat2.Util.getIActivityManager().getClass();
        return IActivityManagerCAG.f165321C.startActivity() != null ? IActivityManagerCAG.f165321C.startActivity().call(ActivityManagerNativeCAG.f165272G.getDefault().call(new Object[0]), objArr).intValue() : IActivityManagerCAG.f165321C.startActivityWithFeature().call(ActivityManagerNativeCAG.f165272G.getDefault().call(new Object[0]), objArr).intValue();
    }

    public List<String> x() {
        try {
            return I().n5();
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void x0(IBinder iBinder) {
        try {
            I().e5(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public C5691a y(IBinder iBinder) {
        C5691a c5691a;
        synchronized (this.f239875a) {
            c5691a = iBinder == null ? null : this.f239875a.get(iBinder);
        }
        return c5691a;
    }

    public Intent y0(IInterface iInterface, com.prism.gaia.client.stub.r rVar, IntentFilter intentFilter, String str) {
        try {
            return I().v2(iInterface != null ? iInterface.asBinder() : null, rVar, intentFilter, str);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public String z(int i10) {
        try {
            return I().f2(i10);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void z0(IBinder iBinder) {
        try {
            I().i2(iBinder);
        } catch (RemoteException e10) {
            GaiaContext.c(e10);
            throw null;
        }
    }

    public void M0(Intent intent) {
    }
}
