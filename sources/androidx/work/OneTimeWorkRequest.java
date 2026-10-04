package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OneTimeWorkRequest extends WorkRequest {

    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        public Builder(@NonNull Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.mWorkSpec.f68222d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public Builder getThis() {
            return this;
        }

        @NonNull
        public Builder setInputMerger(@NonNull Class<? extends g> inputMerger) {
            this.mWorkSpec.f68222d = inputMerger.getName();
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        @NonNull
        public OneTimeWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && this.mWorkSpec.f68228j.f120211c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }
    }

    public OneTimeWorkRequest(Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    @NonNull
    public static OneTimeWorkRequest e(@NonNull Class<? extends ListenableWorker> workerClass) {
        return new Builder(workerClass).build();
    }

    @NonNull
    public static List<OneTimeWorkRequest> f(@NonNull List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        Iterator<Class<? extends ListenableWorker>> it = workerClasses.iterator();
        while (it.hasNext()) {
            arrayList.add(new Builder(it.next()).build());
        }
        return arrayList;
    }
}
