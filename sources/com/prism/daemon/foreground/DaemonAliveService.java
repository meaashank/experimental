package com.prism.daemon.foreground;

import A6.d;
import A6.g;
import A6.l;
import B6.b;
import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import androidx.annotation.NonNull;
import com.prism.commons.notification.NotificationBundle;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.Y;
import com.prism.commons.utils.l0;
import com.prism.lib.notification.NotificationCustom;
import e6.C4367c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DaemonAliveService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile DaemonAliveService f162175b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162174a = l0.b("DaemonAliveService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f162176c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Y.b f162177d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f162178e = 0;

    public static final class InnerService extends Service {
        public static void a(@NonNull Context context) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) InnerService.class));
            l.e(context, intent);
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                NotificationBundle notificationBundleF = NotificationCustom.f(this);
                startForeground(notificationBundleF.f161981id, notificationBundleF.notification);
                stopSelf();
            } catch (Throwable th) {
                I.i(DaemonAliveService.f162174a, th);
            }
        }

        @Override // android.app.Service
        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                I.i(DaemonAliveService.f162174a, th);
            }
            super.onDestroy();
        }
    }

    public static void a() {
        Activity activityF;
        if (C3841e.E() || (activityF = C4367c.o().F()) == null || !activityF.hasWindowFocus()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = f162176c;
        if (j10 <= 0 || jCurrentTimeMillis - j10 >= 10000) {
            if (!d.g().c().c(activityF)) {
                e("DaemonAliveService heartbeat give up start: notification is not allowed!");
                return;
            }
            boolean zE = l.e(activityF, new Intent(activityF, (Class<?>) DaemonAliveService.class));
            if (zE) {
                f162176c = jCurrentTimeMillis;
            }
            StringBuilder sb2 = new StringBuilder("DaemonAliveService heartbeat start ");
            sb2.append(zE ? "succeed" : "failed");
            sb2.append(" with context ");
            sb2.append(activityF.getClass().getCanonicalName());
            e(sb2.toString());
        }
    }

    public static boolean d() {
        return C3841e.E();
    }

    public static void e(String str) {
        d.g().c().d(str);
    }

    public static synchronized void f(@NonNull Context context) {
        if (C3841e.E()) {
            e("DaemonAliveService not started: shortService keep-alive is counter-productive on A14+");
            return;
        }
        if (f162175b != null) {
            e("DaemonAliveService still alive");
            return;
        }
        d dVarG = d.g();
        if (!dVarG.c().b(context)) {
            e("DaemonAliveService not started: keep-alive is switched off");
            return;
        }
        if (!dVarG.c().c(context)) {
            e("DaemonAliveService give up start: notification is not allowed!");
            return;
        }
        boolean zE = l.e(context, new Intent(context, (Class<?>) DaemonAliveService.class));
        StringBuilder sb2 = new StringBuilder("DaemonAliveService start ");
        sb2.append(zE ? "succeed" : "failed");
        sb2.append(" with context ");
        sb2.append(context.getClass().getCanonicalName());
        e(sb2.toString());
        Y.e(f162177d);
    }

    public static synchronized void g(@NonNull Context context) {
        Y.f(f162177d);
        if (f162175b == null) {
            I.a(f162174a, "DaemonAliveService not in this process; stopping it across processes");
            context.stopService(new Intent(context, (Class<?>) DaemonAliveService.class));
            return;
        }
        boolean zF = l.f(f162175b);
        StringBuilder sb2 = new StringBuilder("DaemonAliveService stop ");
        sb2.append(zF ? "succeed" : "failed");
        sb2.append(" with context ");
        sb2.append(context.getClass().getCanonicalName());
        e(sb2.toString());
    }

    public final void c(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = f162178e;
        if (j10 <= 0 || jCurrentTimeMillis - j10 >= 20000) {
            f162178e = jCurrentTimeMillis;
            Iterator<g> it = d.g().b().iterator();
            while (it.hasNext()) {
                it.next().a(this, i10, true);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        I.b(f162174a, "onCreate() in thread(%d)", Integer.valueOf(Process.myTid()));
        f162175b = this;
        try {
            NotificationBundle notificationBundleF = NotificationCustom.f(this);
            startForeground(notificationBundleF.f161981id, notificationBundleF.notification);
            if (!C3841e.s() && notificationBundleF.fade) {
                InnerService.a(this);
            }
            e("DaemonAliveService onCreate and set foreground");
        } catch (Throwable th) {
            e("DaemonAliveService onCreate but set foreground failed: " + th.getMessage());
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        f162175b = null;
        e("DaemonAliveService onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        try {
            NotificationBundle notificationBundleF = NotificationCustom.f(this);
            startForeground(notificationBundleF.f161981id, notificationBundleF.notification);
            e("DaemonAliveService onStartCmd and set foreground with id=" + i11);
        } catch (Throwable th) {
            I.i(f162174a, th);
            e("DaemonAliveService onStartCmd with id=" + i11 + " but set foreground failed: " + th.getMessage());
        }
        c(i11);
        return 2;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        e("DaemonAliveService onTimeout with id=" + i10);
        l.f(this);
    }
}
