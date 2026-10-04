package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f152538a = new W0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static LinkedHashSet f152539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f152540c;

    public static final boolean a(W0 w02, Context context) {
        w02.getClass();
        try {
            Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final /* synthetic */ String b() {
        return "W0";
    }

    public final void c() {
        f152540c = true;
    }

    public final void d() {
        f152540c = false;
    }

    public static final void a(W0 w02, boolean z10) {
        LinkedHashSet linkedHashSet;
        w02.getClass();
        if (C3657nb.d() == null || (linkedHashSet = f152539b) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C3797xc) ((U0) it.next())).a(z10);
            } catch (Exception unused) {
            }
        }
    }

    @e.e0
    public final void a(@NotNull Context context, @NotNull U0 listener) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(listener, "listener");
        if (f152539b == null) {
            f152539b = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new V0(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f152539b;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }
}
