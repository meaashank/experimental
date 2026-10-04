package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f207088a = "rx2.purge-enabled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f207089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f207090c = "rx2.purge-period-seconds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f207091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f207092e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f207093f = new ConcurrentHashMap();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f207094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f207095b;

        public void a(Properties properties) {
            if (properties.containsKey(j.f207088a)) {
                this.f207094a = Boolean.parseBoolean(properties.getProperty(j.f207088a));
            } else {
                this.f207094a = true;
            }
            if (!this.f207094a || !properties.containsKey(j.f207090c)) {
                this.f207095b = 1;
                return;
            }
            try {
                this.f207095b = Integer.parseInt(properties.getProperty(j.f207090c));
            } catch (NumberFormatException unused) {
                this.f207095b = 1;
            }
        }
    }

    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(j.f207093f.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    j.f207093f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        f207089b = aVar.f207094a;
        f207091d = aVar.f207095b;
        c();
    }

    public j() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        d(f207089b, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void b() {
        ScheduledExecutorService andSet = f207092e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f207093f.clear();
    }

    public static void c() {
        e(f207089b);
    }

    public static void d(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f207093f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void e(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f207092e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (C1598m0.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f207091d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
