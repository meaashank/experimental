package Q0;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.InterfaceC2427d;
import e.D;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f65780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65781b;

        /* JADX INFO: renamed from: Q0.m$a$a, reason: collision with other inner class name */
        public static class C0098a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65782a;

            public C0098a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f65782a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f65782a);
                super.run();
            }
        }

        public a(@NonNull String str, int i10) {
            this.f65780a = str;
            this.f65781b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0098a(runnable, this.f65780a, this.f65781b);
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f65783a;

        public b(@NonNull Handler handler) {
            handler.getClass();
            this.f65783a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            Handler handler = this.f65783a;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f65783a + " is shutting down");
        }
    }

    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public Callable<T> f65784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public InterfaceC2427d<T> f65785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public Handler f65786c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2427d f65787a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f65788b;

            public a(InterfaceC2427d interfaceC2427d, Object obj) {
                this.f65787a = interfaceC2427d;
                this.f65788b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f65787a.accept(this.f65788b);
            }
        }

        public c(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull InterfaceC2427d<T> interfaceC2427d) {
            this.f65784a = callable;
            this.f65785b = interfaceC2427d;
            this.f65786c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f65784a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f65786c.post(new a(this.f65785b, tCall));
        }
    }

    public static ThreadPoolExecutor a(@NonNull String str, int i10, @D(from = 0) int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@NonNull Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull InterfaceC2427d<T> interfaceC2427d) {
        executor.execute(new c(Q0.b.a(), callable, interfaceC2427d));
    }

    public static <T> T d(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @D(from = 0) int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException(Jb.d.f58184l);
        }
    }
}
