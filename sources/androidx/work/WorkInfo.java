package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.D;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public UUID f120225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public State f120226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Data f120227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public Set<String> f120228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public Data f120229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f120230f;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@NonNull UUID id2, @NonNull State state, @NonNull Data outputData, @NonNull List<String> tags, @NonNull Data progress, int runAttemptCount) {
        this.f120225a = id2;
        this.f120226b = state;
        this.f120227c = outputData;
        this.f120228d = new HashSet(tags);
        this.f120229e = progress;
        this.f120230f = runAttemptCount;
    }

    @NonNull
    public UUID a() {
        return this.f120225a;
    }

    @NonNull
    public Data b() {
        return this.f120227c;
    }

    @NonNull
    public Data c() {
        return this.f120229e;
    }

    @D(from = 0)
    public int d() {
        return this.f120230f;
    }

    @NonNull
    public State e() {
        return this.f120226b;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || WorkInfo.class != o10.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) o10;
        if (this.f120230f == workInfo.f120230f && this.f120225a.equals(workInfo.f120225a) && this.f120226b == workInfo.f120226b && this.f120227c.equals(workInfo.f120227c) && this.f120228d.equals(workInfo.f120228d)) {
            return this.f120229e.equals(workInfo.f120229e);
        }
        return false;
    }

    @NonNull
    public Set<String> f() {
        return this.f120228d;
    }

    public int hashCode() {
        return ((this.f120229e.hashCode() + ((this.f120228d.hashCode() + ((this.f120227c.hashCode() + ((this.f120226b.hashCode() + (this.f120225a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f120230f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f120225a + "', mState=" + this.f120226b + ", mOutputData=" + this.f120227c + ", mTags=" + this.f120228d + ", mProgress=" + this.f120229e + '}';
    }
}
