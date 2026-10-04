package g6;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class o implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Looper f202268b = Looper.getMainLooper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f202269a = new Handler(f202268b);

    public Handler a() {
        return this.f202269a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        if (Looper.myLooper() == f202268b) {
            runnable.run();
        } else {
            this.f202269a.post(runnable);
        }
    }
}
