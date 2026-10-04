package androidx.work;

import T2.r;
import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import e.T;
import e.f0;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkRequest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f120236d = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f120237e = 18000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final long f120238f = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public UUID f120239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public r f120240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Set<String> f120241c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkRequest(@NonNull UUID id2, @NonNull r workSpec, @NonNull Set<String> tags) {
        this.f120239a = id2;
        this.f120240b = workSpec;
        this.f120241c = tags;
    }

    @NonNull
    public UUID a() {
        return this.f120239a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String b() {
        return this.f120239a.toString();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<String> c() {
        return this.f120241c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public r d() {
        return this.f120240b;
    }

    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {
        r mWorkSpec;
        Class<? extends ListenableWorker> mWorkerClass;
        boolean mBackoffCriteriaSet = false;
        Set<String> mTags = new HashSet();
        UUID mId = UUID.randomUUID();

        public Builder(@NonNull Class<? extends ListenableWorker> workerClass) {
            this.mWorkerClass = workerClass;
            this.mWorkSpec = new r(this.mId.toString(), workerClass.getName());
            addTag(workerClass.getName());
        }

        @NonNull
        public final B addTag(@NonNull String str) {
            this.mTags.add(str);
            return (B) getThis();
        }

        @NonNull
        public final W build() {
            W w10 = (W) buildInternal();
            Constraints constraints = this.mWorkSpec.f68228j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && constraints.e()) || constraints.f120212d || constraints.f120210b || constraints.f120211c;
            if (this.mWorkSpec.f68235q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.mId = UUID.randomUUID();
            r rVar = new r(this.mWorkSpec);
            this.mWorkSpec = rVar;
            rVar.f68219a = this.mId.toString();
            return w10;
        }

        @NonNull
        public abstract W buildInternal();

        @NonNull
        public abstract B getThis();

        @NonNull
        public final B keepResultsForAtLeast(long j10, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.f68233o = timeUnit.toMillis(j10);
            return (B) getThis();
        }

        @NonNull
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, long j10, @NonNull TimeUnit timeUnit) {
            this.mBackoffCriteriaSet = true;
            r rVar = this.mWorkSpec;
            rVar.f68230l = backoffPolicy;
            rVar.e(timeUnit.toMillis(j10));
            return (B) getThis();
        }

        @NonNull
        public final B setConstraints(@NonNull Constraints constraints) {
            this.mWorkSpec.f68228j = constraints;
            return (B) getThis();
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(@NonNull OutOfQuotaPolicy outOfQuotaPolicy) {
            r rVar = this.mWorkSpec;
            rVar.f68235q = true;
            rVar.f68236r = outOfQuotaPolicy;
            return (B) getThis();
        }

        @NonNull
        public B setInitialDelay(long j10, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.f68225g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.mWorkSpec.f68225g) {
                return (B) getThis();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NonNull
        @f0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B setInitialRunAttemptCount(int i10) {
            this.mWorkSpec.f68229k = i10;
            return (B) getThis();
        }

        @NonNull
        @f0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B setInitialState(@NonNull WorkInfo.State state) {
            this.mWorkSpec.f68220b = state;
            return (B) getThis();
        }

        @NonNull
        public final B setInputData(@NonNull Data data) {
            this.mWorkSpec.f68223e = data;
            return (B) getThis();
        }

        @NonNull
        @f0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B setPeriodStartTime(long j10, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.f68232n = timeUnit.toMillis(j10);
            return (B) getThis();
        }

        @NonNull
        @f0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final B setScheduleRequestedAt(long j10, @NonNull TimeUnit timeUnit) {
            this.mWorkSpec.f68234p = timeUnit.toMillis(j10);
            return (B) getThis();
        }

        @NonNull
        @T(26)
        public final B keepResultsForAtLeast(@NonNull Duration duration) {
            this.mWorkSpec.f68233o = duration.toMillis();
            return (B) getThis();
        }

        @NonNull
        @T(26)
        public final B setBackoffCriteria(@NonNull BackoffPolicy backoffPolicy, @NonNull Duration duration) {
            this.mBackoffCriteriaSet = true;
            r rVar = this.mWorkSpec;
            rVar.f68230l = backoffPolicy;
            rVar.e(duration.toMillis());
            return (B) getThis();
        }

        @NonNull
        @T(26)
        public B setInitialDelay(@NonNull Duration duration) {
            this.mWorkSpec.f68225g = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.mWorkSpec.f68225g) {
                return (B) getThis();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
