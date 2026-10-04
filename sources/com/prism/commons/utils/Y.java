package com.prism.commons.utils;

import android.app.Activity;
import android.content.Context;
import e6.C4367c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f162067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantLock f162068b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<b> f162069c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Timer f162070d = new Timer();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile TimerTask f162071e = null;

    public class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Y.b();
        }
    }

    public interface b {
        void a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:8:0x000a, B:10:0x000e, B:11:0x0010, B:15:0x0014, B:17:0x001b, B:23:0x0038, B:25:0x003c, B:26:0x003e, B:36:0x006b, B:37:0x006d, B:35:0x0069, B:20:0x0034, B:22:0x0036, B:19:0x0022, B:28:0x0040, B:29:0x0054, B:31:0x005a, B:33:0x0064), top: B:41:0x000a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = com.prism.commons.utils.Y.f162067a
            if (r0 == 0) goto L7
            java.lang.String r5 = com.prism.commons.utils.Y.f162067a
            return r5
        L7:
            java.lang.Class<com.prism.commons.utils.Y> r0 = com.prism.commons.utils.Y.class
            monitor-enter(r0)
            java.lang.String r1 = com.prism.commons.utils.Y.f162067a     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r5 = com.prism.commons.utils.Y.f162067a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r5
        L12:
            r5 = move-exception
            goto L6f
        L14:
            boolean r1 = com.prism.commons.utils.C3841e.v()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.String r1 = U2.j.a()     // Catch: java.lang.Throwable -> L12
            com.prism.commons.utils.Y.f162067a = r1     // Catch: java.lang.Throwable -> L12
            goto L38
        L22:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.invoke(r2, r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L36:
            com.prism.commons.utils.Y.f162067a = r2     // Catch: java.lang.Throwable -> L12
        L38:
            java.lang.String r1 = com.prism.commons.utils.Y.f162067a     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L40
            java.lang.String r5 = com.prism.commons.utils.Y.f162067a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r5
        L40:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "activity"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch: java.lang.Throwable -> L69
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Throwable -> L69
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L69
        L54:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L69
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> L69
            int r4 = r3.pid     // Catch: java.lang.Throwable -> L69
            if (r4 != r1) goto L54
            java.lang.String r3 = r3.processName     // Catch: java.lang.Throwable -> L69
            com.prism.commons.utils.Y.f162067a = r3     // Catch: java.lang.Throwable -> L69
            goto L54
        L69:
            com.prism.commons.utils.Y.f162067a = r2     // Catch: java.lang.Throwable -> L12
        L6b:
            java.lang.String r5 = com.prism.commons.utils.Y.f162067a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r5
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.commons.utils.Y.a(android.content.Context):java.lang.String");
    }

    public static void b() {
        List listA;
        if (f162068b.tryLock()) {
            try {
                Set<b> set = f162069c;
                synchronized (set) {
                    listA = X.a(set);
                }
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } finally {
                f162068b.unlock();
            }
        }
    }

    public static boolean c(Context context) {
        return context.getPackageName().equals(a(context));
    }

    public static boolean d() {
        Activity activityF = C4367c.o().F();
        if (activityF == null) {
            return false;
        }
        return activityF.hasWindowFocus();
    }

    public static void e(b bVar) {
        boolean z10;
        Set<b> set = f162069c;
        synchronized (set) {
            try {
                set.add(bVar);
                if (f162071e == null) {
                    f162071e = new a();
                    f162070d.schedule(f162071e, 0L, 30000L);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            return;
        }
        b();
    }

    public static void f(b bVar) {
        Set<b> set = f162069c;
        synchronized (set) {
            set.remove(bVar);
        }
    }
}
