package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.AbstractRunnableC3716s1;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* JADX INFO: renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC3716s1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f153337b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153336a = "s1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f153338c = new Handler(Looper.getMainLooper());

    public AbstractRunnableC3716s1(Object obj) {
        this.f153337b = new WeakReference(obj);
    }

    public static final void a(AbstractRunnableC3716s1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        Object obj = this$0.f153337b.get();
        if (obj != null) {
            C3742u c3742u = C3742u.f153409a;
            int iHashCode = obj.hashCode();
            try {
                SparseArray sparseArray = C3742u.f153410b;
                Queue queue = (Queue) sparseArray.get(iHashCode);
                if (queue != null) {
                    queue.poll();
                    AbstractRunnableC3716s1 abstractRunnableC3716s1 = (AbstractRunnableC3716s1) queue.peek();
                    if (queue.size() > 0 && abstractRunnableC3716s1 != null) {
                        try {
                            C3742u.f153411c.execute(abstractRunnableC3716s1);
                        } catch (OutOfMemoryError unused) {
                            abstractRunnableC3716s1.c();
                        }
                    }
                    if (queue.size() == 0) {
                        sparseArray.remove(iHashCode);
                    }
                }
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    public abstract void a();

    public final void b() {
        this.f153338c.post(new Runnable() { // from class: F5.y2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractRunnableC3716s1.a(this.f34651a);
            }
        });
    }

    public void c() {
        String TAG = this.f153336a;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        AbstractC3666o6.a((byte) 1, TAG, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f153337b.get();
        if (obj != null) {
            C3742u c3742u = C3742u.f153409a;
            int iHashCode = obj.hashCode();
            SparseArray sparseArray = C3742u.f153410b;
            sparseArray.remove(iHashCode);
            sparseArray.size();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        b();
    }
}
