package com.inmobi.media;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C3742u;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3742u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3742u f153409a = new C3742u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f153410b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f153411c;

    static {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        AdConfig adConfig = (AdConfig) D4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfig.getMaxPoolSize(), adConfig.getMaxPoolSize(), 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new V4("u".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f153411c = threadPoolExecutor;
    }

    public static void a(final int i10, final AbstractRunnableC3716s1 task) {
        kotlin.jvm.internal.G.p(task, "task");
        if (kotlin.jvm.internal.G.g(Looper.myLooper(), Looper.getMainLooper())) {
            c(i10, task);
            return;
        }
        ExecutorC3763v6 executorC3763v6 = (ExecutorC3763v6) T3.f152451d.getValue();
        Runnable runnable = new Runnable() { // from class: F5.A2
            @Override // java.lang.Runnable
            public final void run() {
                C3742u.b(i10, task);
            }
        };
        executorC3763v6.getClass();
        executorC3763v6.f153451a.post(runnable);
    }

    public static final void b(int i10, AbstractRunnableC3716s1 task) {
        kotlin.jvm.internal.G.p(task, "$task");
        c(i10, task);
    }

    public static void c(int i10, AbstractRunnableC3716s1 abstractRunnableC3716s1) {
        try {
            SparseArray sparseArray = f153410b;
            Queue linkedList = (Queue) sparseArray.get(i10);
            if (linkedList == null) {
                linkedList = new LinkedList();
                sparseArray.put(i10, linkedList);
            }
            linkedList.add(abstractRunnableC3716s1);
            AbstractRunnableC3716s1 abstractRunnableC3716s12 = (AbstractRunnableC3716s1) linkedList.peek();
            if (linkedList.size() != 1 || abstractRunnableC3716s12 == null) {
                return;
            }
            try {
                f153411c.execute(abstractRunnableC3716s12);
            } catch (OutOfMemoryError unused) {
                abstractRunnableC3716s12.c();
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
