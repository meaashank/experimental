package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface e {
    @NonNull
    ListenableFuture<Void> a(@NonNull Context context, @NonNull UUID id2, @NonNull d foregroundInfo);
}
