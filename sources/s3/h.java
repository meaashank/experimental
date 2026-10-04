package s3;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.B;
import e.T;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@T(26)
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Activity> f238488a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f238489b;

    public class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f238490a;

        /* JADX INFO: renamed from: s3.h$a$a, reason: collision with other inner class name */
        public class RunnableC0882a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f238492a;

            public RunnableC0882a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f238492a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                B.c().i();
                h.this.f238489b = true;
                h.b(a.this.f238490a, this.f238492a);
                h.this.f238488a.clear();
            }
        }

        public a(View view) {
            this.f238490a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            y3.o.y(new RunnableC0882a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // s3.i
    public void a(Activity activity) {
        if (!this.f238489b && this.f238488a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
