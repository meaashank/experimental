package g6;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class t implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f202274a = Executors.newSingleThreadExecutor();

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f202274a.execute(runnable);
    }
}
