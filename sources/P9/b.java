package P9;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.hider.ui.SplashActivity;
import com.prism.hider.vault.commons.InterfaceC4271g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65591e = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f65592f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65593a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Activity> f65594b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<Activity> f65595c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65596d = 0;

    public static b f() {
        if (f65592f == null) {
            synchronized (b.class) {
                try {
                    if (f65592f == null) {
                        f65592f = new b();
                    }
                } finally {
                }
            }
        }
        return f65592f;
    }

    public boolean c() {
        return this.f65596d == 0;
    }

    public void d() {
        int i10 = this.f65596d;
        if (i10 > 0) {
            this.f65596d = i10 - 1;
        }
    }

    public void e() {
        int i10 = this.f65593a;
        if (i10 > 0) {
            this.f65593a = i10 - 1;
        }
    }

    public final void g(Activity activity) {
        this.f65594b = new WeakReference<>(activity);
    }

    public final void h(Activity activity) {
        this.f65595c = new WeakReference<>(activity);
    }

    public void i(Application application) {
        application.registerActivityLifecycleCallbacks(new a(this));
    }

    public void j() {
        this.f65596d++;
    }

    public boolean k(Context context) {
        this.f65596d = 0;
        WeakReference<Activity> weakReference = this.f65594b;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.getComponentName().toShortString();
        }
        int i10 = this.f65593a;
        if (i10 % 2 == 0 && (activity == null || (activity instanceof InterfaceC4271g))) {
            context.startActivity(new Intent(context, (Class<?>) SplashActivity.class));
            this.f65593a++;
            return true;
        }
        if (activity != null && !(activity instanceof InterfaceC4271g)) {
            return false;
        }
        this.f65593a = i10 + 1;
        return false;
    }

    public static class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f65597a;

        public a(b bVar) {
            this.f65597a = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            this.f65597a.g(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            this.f65597a.h(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
