package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.K;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    @NonNull
    public static n a(@NonNull List<n> continuations) {
        return continuations.get(0).b(continuations);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract n b(@NonNull List<n> continuations);

    @NonNull
    public abstract j c();

    @NonNull
    public abstract ListenableFuture<List<WorkInfo>> d();

    @NonNull
    public abstract K<List<WorkInfo>> e();

    @NonNull
    public final n f(@NonNull OneTimeWorkRequest work) {
        return g(Collections.singletonList(work));
    }

    @NonNull
    public abstract n g(@NonNull List<OneTimeWorkRequest> work);
}
