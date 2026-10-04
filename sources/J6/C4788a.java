package j6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: j6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4788a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C4788a f214185d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f214186a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Activity, ArrayList<InterfaceC0809a>> f214187b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<Activity> f214188c = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0809a {
        void onDestroy();
    }

    public static C4788a b() {
        if (f214185d == null) {
            synchronized (C4788a.class) {
                try {
                    if (f214185d == null) {
                        f214185d = new C4788a();
                    }
                } finally {
                }
            }
        }
        return f214185d;
    }

    public final void a(Activity activity) {
        if (this.f214186a) {
            return;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(this);
        this.f214186a = true;
        this.f214188c.add(activity);
    }

    public synchronized void c(Activity activity, InterfaceC0809a interfaceC0809a) {
        try {
            a(activity);
            ArrayList<InterfaceC0809a> arrayList = this.f214187b.get(activity);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f214187b.put(activity, arrayList);
            }
            arrayList.add(interfaceC0809a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f214188c.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f214187b.containsKey(activity)) {
            ArrayList<InterfaceC0809a> arrayList = this.f214187b.get(activity);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InterfaceC0809a interfaceC0809a = arrayList.get(i10);
                i10++;
                interfaceC0809a.onDestroy();
            }
        }
        this.f214188c.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
