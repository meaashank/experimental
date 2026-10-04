package w;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public class c {
    @NonNull
    public static <T> ListenableFuture<T> a(@NonNull Throwable th) {
        androidx.concurrent.futures.d dVarI = androidx.concurrent.futures.d.i();
        dVarI.setException(th);
        return dVarI;
    }
}
