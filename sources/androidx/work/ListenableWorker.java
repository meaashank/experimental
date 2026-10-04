package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import e.D;
import e.I;
import e.T;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class b extends a {
            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public Data c() {
                return Data.f120218c;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                return o10 != null && b.class == o10.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a() {
        }

        @NonNull
        public static a a() {
            return new C0343a();
        }

        @NonNull
        public static a b(@NonNull Data outputData) {
            return new C0343a(outputData);
        }

        @NonNull
        public static a d() {
            return new b();
        }

        @NonNull
        public static a e() {
            return new c();
        }

        @NonNull
        public static a f(@NonNull Data outputData) {
            return new c(outputData);
        }

        @NonNull
        public abstract Data c();

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0343a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Data f120221a;

            public C0343a(@NonNull Data outputData) {
                this.f120221a = outputData;
            }

            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public Data c() {
                return this.f120221a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 == null || C0343a.class != o10.getClass()) {
                    return false;
                }
                return this.f120221a.equals(((C0343a) o10).f120221a);
            }

            public int hashCode() {
                return this.f120221a.hashCode() + (C0343a.class.getName().hashCode() * 31);
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f120221a + '}';
            }

            public C0343a() {
                this(Data.f120218c);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Data f120222a;

            public c(@NonNull Data outputData) {
                this.f120222a = outputData;
            }

            @Override // androidx.work.ListenableWorker.a
            @NonNull
            public Data c() {
                return this.f120222a;
            }

            public boolean equals(Object o10) {
                if (this == o10) {
                    return true;
                }
                if (o10 == null || c.class != o10.getClass()) {
                    return false;
                }
                return this.f120222a.equals(((c) o10).f120222a);
            }

            public int hashCode() {
                return this.f120222a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                return "Success {mOutputData=" + this.f120222a + '}';
            }

            public c() {
                this(Data.f120218c);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = appContext;
        this.mWorkerParams = workerParams;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f120248f;
    }

    @NonNull
    public ListenableFuture<d> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        aVarU.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVarU;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f120243a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.f120244b;
    }

    @Nullable
    @T(28)
    public final Network getNetwork() {
        return this.mWorkerParams.f120246d.f120255c;
    }

    @D(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.f120247e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f120245c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public V2.a getTaskExecutor() {
        return this.mWorkerParams.f120249g;
    }

    @NonNull
    @T(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f120246d.f120253a;
    }

    @NonNull
    @T(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f120246d.f120254b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p getWorkerFactory() {
        return this.mWorkerParams.f120250h;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final ListenableFuture<Void> setForegroundAsync(@NonNull d foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.f120252j.a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public ListenableFuture<Void> setProgressAsync(@NonNull Data data) {
        return this.mWorkerParams.f120251i.a(getApplicationContext(), getId(), data);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRunInForeground(boolean runInForeground) {
        this.mRunInForeground = runInForeground;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @I
    public abstract ListenableFuture<a> startWork();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
