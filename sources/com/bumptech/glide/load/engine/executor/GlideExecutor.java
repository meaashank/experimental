package com.bumptech.glide.load.engine.executor;

import Q0.h;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import e.D;
import e.f0;
import i3.C4546a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideExecutor implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f139622b = "source";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f139623c = "disk-cache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139624d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f139625e = "GlideExecutor";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139626f = "source-unlimited";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f139627g = "animation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f139628h = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f139629i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile int f139630j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f139631a;

    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;
        private int corePoolSize;
        private int maximumPoolSize;
        private String name;
        private final boolean preventNetworkOperations;
        private long threadTimeoutMillis;

        @NonNull
        private ThreadFactory threadFactory = new b();

        @NonNull
        private d uncaughtThrowableStrategy = d.f139644d;

        public Builder(boolean z10) {
            this.preventNetworkOperations = z10;
        }

        public GlideExecutor build() {
            if (TextUtils.isEmpty(this.name)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.name);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.corePoolSize, this.maximumPoolSize, this.threadTimeoutMillis, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c(this.threadFactory, this.name, this.uncaughtThrowableStrategy, this.preventNetworkOperations));
            if (this.threadTimeoutMillis != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new GlideExecutor(threadPoolExecutor);
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }

        public Builder setThreadCount(@D(from = 1) int i10) {
            this.corePoolSize = i10;
            this.maximumPoolSize = i10;
            return this;
        }

        @Deprecated
        public Builder setThreadFactory(@NonNull ThreadFactory threadFactory) {
            this.threadFactory = threadFactory;
            return this;
        }

        public Builder setThreadTimeoutMillis(long j10) {
            this.threadTimeoutMillis = j10;
            return this;
        }

        public Builder setUncaughtThrowableStrategy(@NonNull d dVar) {
            this.uncaughtThrowableStrategy = dVar;
            return this;
        }
    }

    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f139632a = 9;

        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new a(runnable);
        }

        public b(a aVar) {
        }
    }

    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f139634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f139635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f139636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f139637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f139638e = new AtomicInteger();

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f139639a;

            public a(Runnable runnable) {
                this.f139639a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f139637d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f139639a.run();
                } catch (Throwable th) {
                    c.this.f139636c.a(th);
                }
            }
        }

        public c(ThreadFactory threadFactory, String str, d dVar, boolean z10) {
            this.f139634a = threadFactory;
            this.f139635b = str;
            this.f139636c = dVar;
            this.f139637d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f139634a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f139635b + "-thread-" + this.f139638e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f139641a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f139642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f139643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f139644d;

        public class a implements d {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.d
            public void a(Throwable th) {
            }
        }

        public class b implements d {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.d
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable(GlideExecutor.f139625e, 6)) {
                    return;
                }
                Log.e(GlideExecutor.f139625e, "Request threw uncaught throwable", th);
            }
        }

        public class c implements d {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.d
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f139642b = bVar;
            f139643c = new c();
            f139644d = bVar;
        }

        void a(Throwable th);
    }

    @f0
    public GlideExecutor(ExecutorService executorService) {
        this.f139631a = executorService;
    }

    @Deprecated
    public static GlideExecutor P(d dVar) {
        return s().setUncaughtThrowableStrategy(dVar).build();
    }

    public static GlideExecutor U() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f139628h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new c(new b(), f139626f, d.f139644d, false)));
    }

    public static int d() {
        return k() >= 4 ? 2 : 1;
    }

    public static int k() {
        if (f139630j == 0) {
            f139630j = Math.min(4, C4546a.a());
        }
        return f139630j;
    }

    public static Builder l() {
        return new Builder(true).setThreadCount(d()).setName(f139627g);
    }

    public static GlideExecutor m() {
        return l().build();
    }

    @Deprecated
    public static GlideExecutor n(int i10, d dVar) {
        return l().setThreadCount(i10).setUncaughtThrowableStrategy(dVar).build();
    }

    public static Builder o() {
        return new Builder(true).setThreadCount(1).setName(f139623c);
    }

    public static GlideExecutor p() {
        return o().build();
    }

    @Deprecated
    public static GlideExecutor q(int i10, String str, d dVar) {
        return o().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(dVar).build();
    }

    @Deprecated
    public static GlideExecutor r(d dVar) {
        return o().setUncaughtThrowableStrategy(dVar).build();
    }

    public static Builder s() {
        return new Builder(false).setThreadCount(k()).setName("source");
    }

    public static GlideExecutor u() {
        return s().build();
    }

    @Deprecated
    public static GlideExecutor y(int i10, String str, d dVar) {
        return s().setThreadCount(i10).setName(str).setUncaughtThrowableStrategy(dVar).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f139631a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f139631a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f139631a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f139631a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f139631a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f139631a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f139631a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f139631a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f139631a.submit(runnable);
    }

    public String toString() {
        return this.f139631a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f139631a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f139631a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t10) {
        return this.f139631a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f139631a.submit(callable);
    }
}
