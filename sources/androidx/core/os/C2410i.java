package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: androidx.core.os.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2410i {

    /* JADX INFO: renamed from: androidx.core.os.i$a */
    public static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f111295a;

        public a(@NonNull Handler handler) {
            handler.getClass();
            this.f111295a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            Handler handler = this.f111295a;
            runnable.getClass();
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f111295a + " is shutting down");
        }
    }

    @NonNull
    public static Executor a(@NonNull Handler handler) {
        return new a(handler);
    }
}
