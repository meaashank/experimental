package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.L;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<D> extends c<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0303a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0303a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    public final class RunnableC0303a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final CountDownLatch f114410q = new CountDownLatch(1);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f114411r;

        public RunnableC0303a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void n(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f114410q.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void o(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f114410q.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f114411r = false;
            a.this.executePendingTask();
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.onLoadInBackground();
            } catch (OperationCanceledException e10) {
                if (this.f114401d.get()) {
                    return null;
                }
                throw e10;
            }
        }

        public void z() {
            try {
                this.f114410q.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@NonNull Context context) {
        this(context, ModernAsyncTask.f114393l);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a<D>.RunnableC0303a runnableC0303a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0303a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0303a runnableC0303a, D d10) {
        if (this.mTask != runnableC0303a) {
            dispatchOnCancelled(runnableC0303a, d10);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d10);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d10);
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f114411r);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f114411r);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            L.d(this.mUpdateThrottle, printWriter, 0);
            printWriter.print(" mLastLoadCompleteTime=");
            L.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f114411r) {
            this.mTask.f114411r = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.e(this.mExecutor, null);
        } else {
            this.mTask.f114411r = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.c
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f114411r) {
                this.mTask.f114411r = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f114411r) {
            this.mTask.f114411r = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zA = this.mTask.a(false);
        if (zA) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zA;
    }

    public void onCanceled(@Nullable D d10) {
    }

    @Override // androidx.loader.content.c
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new RunnableC0303a();
        executePendingTask();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        a<D>.RunnableC0303a runnableC0303a = this.mTask;
        if (runnableC0303a != null) {
            runnableC0303a.z();
        }
    }

    public a(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
