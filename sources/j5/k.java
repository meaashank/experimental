package j5;

import android.view.View;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import androidx.core.view.C2507z0;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f214182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f214183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f214184c;

        public a(ViewTreeObserver viewTreeObserver, View view, Runnable runnable) {
            this.f214182a = viewTreeObserver;
            this.f214183b = view;
            this.f214184c = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.f214182a.isAlive() ? this.f214182a : this.f214183b.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            this.f214184c.run();
        }
    }

    public static boolean a(View view) {
        return C2507z0.Y0(view) && view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static void b(View view, Runnable runnable) {
        if (a(view)) {
            runnable.run();
        } else {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new a(viewTreeObserver, view, runnable));
        }
    }

    public static void c(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void d(ViewManager viewManager, View view) {
        if (viewManager == null || view == null) {
            return;
        }
        try {
            viewManager.removeView(view);
        } catch (Exception unused) {
        }
    }
}
