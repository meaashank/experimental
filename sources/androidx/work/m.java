package androidx.work;

import androidx.annotation.NonNull;
import e.D;

/* JADX INFO: loaded from: classes2.dex */
public interface m {
    void a(@NonNull Runnable runnable);

    void b(@D(from = 0) long delayInMillis, @NonNull Runnable runnable);
}
