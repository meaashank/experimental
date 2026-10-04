package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface N<T> extends X1<T> {

    public interface a<T> {
        T a();

        @NotNull
        androidx.collection.K0<androidx.compose.runtime.snapshots.J> b();
    }

    @NotNull
    a<T> g();

    @Nullable
    H1<T> getPolicy();
}
