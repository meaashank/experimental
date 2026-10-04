package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C2383f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f111022a = "ActivityRecreator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f111023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f111024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f111025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f111026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f111027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f111028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f111029h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.core.app.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f111030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f111031b;

        public a(d dVar, Object obj) {
            this.f111030a = dVar;
            this.f111031b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f111030a.f111036a = this.f111031b;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.f$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f111032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f111033b;

        public b(Application application, d dVar) {
            this.f111032a = application;
            this.f111033b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f111032a.unregisterActivityLifecycleCallbacks(this.f111033b);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.f$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f111034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f111035b;

        public c(Object obj, Object obj2) {
            this.f111034a = obj;
            this.f111035b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C2383f.f111026e;
                if (method != null) {
                    method.invoke(this.f111034a, this.f111035b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C2383f.f111027f.invoke(this.f111034a, this.f111035b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e(C2383f.f111022a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.f$d */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f111036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f111037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f111038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f111039d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f111040e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f111041f = false;

        public d(@NonNull Activity activity) {
            this.f111037b = activity;
            this.f111038c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f111037b == activity) {
                this.f111037b = null;
                this.f111040e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f111040e || this.f111041f || this.f111039d || !C2383f.h(this.f111036a, this.f111038c, activity)) {
                return;
            }
            this.f111041f = true;
            this.f111036a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f111037b == activity) {
                this.f111039d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f111023b = clsA;
        f111024c = b();
        f111025d = f();
        f111026e = d(clsA);
        f111027f = c(clsA);
        f111028g = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f111025d.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f111029h.postAtFrontOfQueue(new c(f111024c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f111022a, "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(@NonNull Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f111028g == null) {
            return false;
        }
        if (f111027f == null && f111026e == null) {
            return false;
        }
        try {
            Object obj2 = f111025d.get(activity);
            if (obj2 == null || (obj = f111024c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f111029h;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f111028g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f111029h.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
