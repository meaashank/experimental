package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.h;
import e.D;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Configuration {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f120192m = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Executor f120193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f120194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final p f120195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final h f120196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final m f120197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final f f120198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f120199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f120200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f120201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f120202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f120203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f120204l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f120205a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f120206b;

        public a(final boolean val$isTaskExecutor) {
            this.f120206b = val$isTaskExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(this.f120206b ? "WM.task-" : "androidx.work-");
            sbA.append(this.f120205a.incrementAndGet());
            return new Thread(runnable, sbA.toString());
        }
    }

    public interface b {
        @NonNull
        Configuration a();
    }

    public Configuration(@NonNull Builder builder) {
        Executor executor = builder.mExecutor;
        if (executor == null) {
            this.f120193a = a(false);
        } else {
            this.f120193a = executor;
        }
        Executor executor2 = builder.mTaskExecutor;
        if (executor2 == null) {
            this.f120204l = true;
            this.f120194b = a(true);
        } else {
            this.f120204l = false;
            this.f120194b = executor2;
        }
        p pVar = builder.mWorkerFactory;
        if (pVar == null) {
            this.f120195c = p.c();
        } else {
            this.f120195c = pVar;
        }
        h hVar = builder.mInputMergerFactory;
        if (hVar == null) {
            this.f120196d = new h.a();
        } else {
            this.f120196d = hVar;
        }
        m mVar = builder.mRunnableScheduler;
        if (mVar == null) {
            this.f120197e = new androidx.work.impl.a();
        } else {
            this.f120197e = mVar;
        }
        this.f120200h = builder.mLoggingLevel;
        this.f120201i = builder.mMinJobSchedulerId;
        this.f120202j = builder.mMaxJobSchedulerId;
        this.f120203k = builder.mMaxSchedulerLimit;
        this.f120198f = builder.mExceptionHandler;
        this.f120199g = builder.mDefaultProcessName;
    }

    @NonNull
    public final Executor a(boolean isTaskExecutor) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(isTaskExecutor));
    }

    @NonNull
    public final ThreadFactory b(boolean isTaskExecutor) {
        return new a(isTaskExecutor);
    }

    @Nullable
    public String c() {
        return this.f120199g;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public f d() {
        return this.f120198f;
    }

    @NonNull
    public Executor e() {
        return this.f120193a;
    }

    @NonNull
    public h f() {
        return this.f120196d;
    }

    public int g() {
        return this.f120202j;
    }

    @D(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f120203k / 2 : this.f120203k;
    }

    public int i() {
        return this.f120201i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int j() {
        return this.f120200h;
    }

    @NonNull
    public m k() {
        return this.f120197e;
    }

    @NonNull
    public Executor l() {
        return this.f120194b;
    }

    @NonNull
    public p m() {
        return this.f120195c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean n() {
        return this.f120204l;
    }

    public static final class Builder {

        @Nullable
        String mDefaultProcessName;

        @Nullable
        f mExceptionHandler;
        Executor mExecutor;
        h mInputMergerFactory;
        int mLoggingLevel;
        int mMaxJobSchedulerId;
        int mMaxSchedulerLimit;
        int mMinJobSchedulerId;
        m mRunnableScheduler;
        Executor mTaskExecutor;
        p mWorkerFactory;

        public Builder() {
            this.mLoggingLevel = 4;
            this.mMinJobSchedulerId = 0;
            this.mMaxJobSchedulerId = Integer.MAX_VALUE;
            this.mMaxSchedulerLimit = 20;
        }

        @NonNull
        public Configuration build() {
            return new Configuration(this);
        }

        @NonNull
        public Builder setDefaultProcessName(@NonNull String processName) {
            this.mDefaultProcessName = processName;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setInitializationExceptionHandler(@NonNull f exceptionHandler) {
            this.mExceptionHandler = exceptionHandler;
            return this;
        }

        @NonNull
        public Builder setInputMergerFactory(@NonNull h inputMergerFactory) {
            this.mInputMergerFactory = inputMergerFactory;
            return this;
        }

        @NonNull
        public Builder setJobSchedulerJobIdRange(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.mMinJobSchedulerId = minJobSchedulerId;
            this.mMaxJobSchedulerId = maxJobSchedulerId;
            return this;
        }

        @NonNull
        public Builder setMaxSchedulerLimit(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.mMaxSchedulerLimit = Math.min(maxSchedulerLimit, 50);
            return this;
        }

        @NonNull
        public Builder setMinimumLoggingLevel(int loggingLevel) {
            this.mLoggingLevel = loggingLevel;
            return this;
        }

        @NonNull
        public Builder setRunnableScheduler(@NonNull m runnableScheduler) {
            this.mRunnableScheduler = runnableScheduler;
            return this;
        }

        @NonNull
        public Builder setTaskExecutor(@NonNull Executor taskExecutor) {
            this.mTaskExecutor = taskExecutor;
            return this;
        }

        @NonNull
        public Builder setWorkerFactory(@NonNull p workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NonNull Configuration configuration) {
            this.mExecutor = configuration.f120193a;
            this.mWorkerFactory = configuration.f120195c;
            this.mInputMergerFactory = configuration.f120196d;
            this.mTaskExecutor = configuration.f120194b;
            this.mLoggingLevel = configuration.f120200h;
            this.mMinJobSchedulerId = configuration.f120201i;
            this.mMaxJobSchedulerId = configuration.f120202j;
            this.mMaxSchedulerLimit = configuration.f120203k;
            this.mRunnableScheduler = configuration.f120197e;
            this.mExceptionHandler = configuration.f120198f;
            this.mDefaultProcessName = configuration.f120199g;
        }
    }
}
