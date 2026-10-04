package W4;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f76616a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76617b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76618c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76619d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f76620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f76621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Executor f76622g;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f76623a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "AsyncTask #" + this.f76623a.getAndIncrement());
        }
    }

    static {
        a aVar = new a();
        f76620e = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1024);
        f76621f = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f76622g = threadPoolExecutor;
    }
}
