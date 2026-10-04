package wb;

import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f240228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f240229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f240230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f240231d;

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f240232a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f240233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f240234c;

        public a(String str, int i10) {
            this.f240233b = str;
            this.f240234c = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "QCloud-" + this.f240233b + this.f240232a.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(this.f240234c);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new a("Command-", 8));
        f240228a = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5L, timeUnit, new PriorityBlockingQueue(), new a("Upload-", 3));
        f240229b = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5L, timeUnit, new LinkedBlockingQueue(Integer.MAX_VALUE), new a("Download-", 3));
        f240230c = threadPoolExecutor3;
        f240231d = new f();
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
    }
}
