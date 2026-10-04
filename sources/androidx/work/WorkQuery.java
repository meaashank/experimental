package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<UUID> f120232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f120233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f120234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<WorkInfo.State> f120235d;

    public static final class Builder {
        List<UUID> mIds = new ArrayList();
        List<String> mUniqueWorkNames = new ArrayList();
        List<String> mTags = new ArrayList();
        List<WorkInfo.State> mStates = new ArrayList();

        private Builder() {
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromIds(@NonNull List<UUID> ids) {
            Builder builder = new Builder();
            builder.addIds(ids);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromStates(@NonNull List<WorkInfo.State> states) {
            Builder builder = new Builder();
            builder.addStates(states);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromTags(@NonNull List<String> tags) {
            Builder builder = new Builder();
            builder.addTags(tags);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromUniqueWorkNames(@NonNull List<String> uniqueWorkNames) {
            Builder builder = new Builder();
            builder.addUniqueWorkNames(uniqueWorkNames);
            return builder;
        }

        @NonNull
        public Builder addIds(@NonNull List<UUID> ids) {
            this.mIds.addAll(ids);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List<WorkInfo.State> states) {
            this.mStates.addAll(states);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List<String> tags) {
            this.mTags.addAll(tags);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List<String> uniqueWorkNames) {
            this.mUniqueWorkNames.addAll(uniqueWorkNames);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if (this.mIds.isEmpty() && this.mUniqueWorkNames.isEmpty() && this.mTags.isEmpty() && this.mStates.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this);
        }
    }

    public WorkQuery(@NonNull Builder builder) {
        this.f120232a = builder.mIds;
        this.f120233b = builder.mUniqueWorkNames;
        this.f120234c = builder.mTags;
        this.f120235d = builder.mStates;
    }

    @NonNull
    public List<UUID> a() {
        return this.f120232a;
    }

    @NonNull
    public List<WorkInfo.State> b() {
        return this.f120235d;
    }

    @NonNull
    public List<String> c() {
        return this.f120234c;
    }

    @NonNull
    public List<String> d() {
        return this.f120233b;
    }
}
