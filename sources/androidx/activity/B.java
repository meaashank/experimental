package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import e.T;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@T(19)
public final class B implements InterfaceC2611y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f84844b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84845c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f84846d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f84847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f84848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f84849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Field f84850h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f84851a;

    public B(Activity activity) {
        this.f84851a = activity;
    }

    @e.I
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a() {
        try {
            f84847e = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f84849g = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f84850h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f84848f = declaredField3;
            declaredField3.setAccessible(true);
            f84847e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f84847e == 0) {
            a();
        }
        if (f84847e == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f84851a.getSystemService(G7.a.f45348f);
            try {
                Object obj = f84848f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f84849g.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f84850h.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
