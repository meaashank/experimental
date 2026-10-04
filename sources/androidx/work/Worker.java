package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import e.g0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.futures.a<ListenableWorker.a> mFuture;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @g0
    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture<ListenableWorker.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.a.u();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
