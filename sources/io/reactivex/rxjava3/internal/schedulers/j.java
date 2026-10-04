package io.reactivex.rxjava3.internal.schedulers;

import Bc.o;
import androidx.compose.animation.core.C1598m0;
import java.util.ArrayList;
import java.util.Map;
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
    public static final String f211838a = "rx3.purge-enabled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f211839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f211840c = "rx3.purge-period-seconds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f211841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f211842e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<ScheduledThreadPoolExecutor, Object> f211843f = new ConcurrentHashMap();

    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(j.f211843f.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    j.f211843f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    public static final class b implements o<String, String> {
        public String a(String t10) {
            return System.getProperty(t10);
        }

        @Override // Bc.o
        public String apply(String t10) throws Throwable {
            return System.getProperty(t10);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, f211838a, true, true, bVar);
        f211839b = zB;
        f211841d = c(zB, f211840c, 1, 1, bVar);
        e();
    }

    public j() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory factory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, factory);
        f(f211839b, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static boolean b(boolean enabled, String key, boolean defaultNotFound, boolean defaultNotEnabled, o<String, String> propertyAccessor) {
        if (!enabled) {
            return defaultNotEnabled;
        }
        try {
            String strApply = propertyAccessor.apply(key);
            return strApply == null ? defaultNotFound : "true".equals(strApply);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            return defaultNotFound;
        }
    }

    public static int c(boolean enabled, String key, int defaultNotFound, int defaultNotEnabled, o<String, String> propertyAccessor) {
        if (!enabled) {
            return defaultNotEnabled;
        }
        try {
            String strApply = propertyAccessor.apply(key);
            return strApply == null ? defaultNotFound : Integer.parseInt(strApply);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            return defaultNotFound;
        }
    }

    public static void d() {
        ScheduledExecutorService andSet = f211842e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f211843f.clear();
    }

    public static void e() {
        g(f211839b);
    }

    public static void f(boolean purgeEnabled, ScheduledExecutorService exec) {
        if (purgeEnabled && (exec instanceof ScheduledThreadPoolExecutor)) {
            f211843f.put((ScheduledThreadPoolExecutor) exec, exec);
        }
    }

    public static void g(boolean purgeEnabled) {
        if (!purgeEnabled) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f211842e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (C1598m0.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i10 = f211841d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
