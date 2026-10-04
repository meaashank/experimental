package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public interface M {
    void addMenuProvider(@NonNull U u10);

    void addMenuProvider(@NonNull U u10, @NonNull androidx.lifecycle.B b10);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull U u10, @NonNull androidx.lifecycle.B b10, @NonNull Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(@NonNull U u10);
}
