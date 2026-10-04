package C4;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17554a = "MemoryLeakUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Method f17555b;

    public static void a(@NonNull Activity activity, @NonNull Application application) {
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) application.getSystemService(G7.a.f45348f);
        if (f17555b == null) {
            try {
                f17555b = InputMethodManager.class.getDeclaredMethod("finishInputLocked", null);
            } catch (NoSuchMethodException e10) {
                Log.d(f17554a, "Unable to find method in clearNextServedView", e10);
            }
        }
        boolean z10 = false;
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(inputMethodManager);
            if (obj instanceof View) {
                if (((View) obj).getContext() == activity) {
                    z10 = true;
                }
            }
        } catch (IllegalAccessException e11) {
            Log.d(f17554a, "Unable to access mNextServedView field", e11);
        } catch (NoSuchFieldException e12) {
            Log.d(f17554a, "Unable to get mNextServedView field", e12);
        }
        Method method = f17555b;
        if (method == null || !z10) {
            return;
        }
        method.setAccessible(true);
        try {
            f17555b.invoke(inputMethodManager, null);
        } catch (Exception e13) {
            Log.d(f17554a, "Unable to invoke method in clearNextServedView", e13);
        }
    }

    public static abstract class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
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
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
