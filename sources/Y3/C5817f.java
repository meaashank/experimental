package y3;

import androidx.annotation.NonNull;
import e.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: y3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5817f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f241064a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f241065b = new b();

    /* JADX INFO: renamed from: y3.f$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            o.y(runnable);
        }
    }

    /* JADX INFO: renamed from: y3.f$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f241065b;
    }

    public static Executor b() {
        return f241064a;
    }

    @f0
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e10) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        }
    }
}
