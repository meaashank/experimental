package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f154783a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154784b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154785c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154786d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f154787e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f154788f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f154789g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f154808a.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        try {
            this.f154783a.remove(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f154785c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f154785c == 0) {
            this.f154788f.postDelayed(this.f154789g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f154785c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f154785c == 1) {
            if (!this.f154786d) {
                this.f154788f.removeCallbacks(this.f154789g);
            } else {
                a("916003", "");
                this.f154786d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f154784b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f154784b == 1 && this.f154787e) {
            this.f154787e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f154784b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    public void a(a aVar) {
        try {
            this.f154783a.add(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "add subscriber error");
        }
    }

    private void b() {
        if (this.f154784b == 0 && this.f154786d) {
            a("916004", "");
            this.f154787e = true;
        }
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<a> it = this.f154783a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND), str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f154785c == 0) {
            this.f154786d = true;
        }
    }
}
