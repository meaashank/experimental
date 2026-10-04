package g6;

import androidx.annotation.NonNull;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes5.dex */
public class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f202266a;

    public j(ThreadPoolExecutor threadPoolExecutor) {
        this.f202266a = threadPoolExecutor;
    }

    public final q a(Runnable runnable) {
        return runnable instanceof q ? (q) runnable : new f(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f202266a.execute(a(runnable));
    }

    @Override // g6.i
    public Future<?> submit(Runnable runnable) {
        p pVar = new p(a(runnable));
        this.f202266a.execute(pVar);
        return pVar;
    }
}
