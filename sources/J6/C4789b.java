package j6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: j6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4789b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C4789b f214189d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f214190a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Activity, a> f214191b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<Activity> f214192c = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j6.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Object> f214193a;

        public void a(Object obj) {
            this.f214193a.add(obj);
        }

        public List<Object> b() {
            return this.f214193a;
        }

        public void c(List<Object> list) {
            this.f214193a = list;
        }

        public a() {
            this.f214193a = new ArrayList();
        }
    }

    public static C4789b c() {
        if (f214189d == null) {
            synchronized (C4789b.class) {
                try {
                    if (f214189d == null) {
                        f214189d = new C4789b();
                    }
                } finally {
                }
            }
        }
        return f214189d;
    }

    public final void a(Activity activity) {
        if (this.f214190a) {
            return;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(this);
        this.f214190a = true;
        this.f214192c.add(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> T[] b(Class<T> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<Activity, a> entry : this.f214191b.entrySet()) {
                Activity key = entry.getKey();
                if (key != null && this.f214192c.contains(key)) {
                    for (Object obj : entry.getValue().b()) {
                        if (cls.isInstance(obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }

    public synchronized void d(Activity activity, Object obj) {
        try {
            a(activity);
            a aVar = this.f214191b.get(activity);
            if (aVar == null) {
                aVar = new a();
                this.f214191b.put(activity, aVar);
            }
            aVar.a(obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f214192c.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f214192c.remove(activity);
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
