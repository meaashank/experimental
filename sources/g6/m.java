package g6;

import g6.C4455a;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f202267a;

    public m() {
        int i10 = C4455a.C0737a.f202250b;
        this.f202267a = new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new s(-1));
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f202267a.execute(runnable);
    }

    @Override // g6.i
    public Future<?> submit(Runnable runnable) {
        return this.f202267a.submit(runnable);
    }
}
