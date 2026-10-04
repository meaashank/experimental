package W2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public d() {
    }

    @NonNull
    public static d a(@NonNull List<d> continuations) {
        return continuations.get(0).b(continuations);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract d b(@NonNull List<d> continuations);

    @NonNull
    public abstract ListenableFuture<Void> c();

    @NonNull
    public final d d(@NonNull OneTimeWorkRequest work) {
        return e(Collections.singletonList(work));
    }

    @NonNull
    public abstract d e(@NonNull List<OneTimeWorkRequest> work);
}
