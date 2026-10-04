package Za;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.B;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;

/* JADX INFO: loaded from: classes7.dex */
public class n {
    public static /* synthetic */ void a(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, view.getWidth() / 2, view.getHeight() / 2, 0));
    }

    public static /* synthetic */ void b(View view, final P p10, Boolean bool) {
        if (!bool.booleanValue()) {
            view.postDelayed(new Runnable() { // from class: Za.k
                @Override // java.lang.Runnable
                public final void run() {
                    p10.r(Boolean.TRUE);
                }
            }, 500L);
        } else {
            d(view);
            p10.r(Boolean.FALSE);
        }
    }

    public static void d(final View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, view.getWidth() / 2, view.getHeight() / 2, 0));
        view.postDelayed(new Runnable() { // from class: Za.m
            @Override // java.lang.Runnable
            public final void run() {
                n.a(view);
            }
        }, 150L);
    }

    public static void e(B b10, @NonNull final View view) {
        final P p10 = new P(Boolean.FALSE);
        p10.k(b10, new Q() { // from class: Za.l
            @Override // androidx.lifecycle.Q
            public final void a(Object obj) {
                n.b(view, p10, (Boolean) obj);
            }
        });
    }
}
