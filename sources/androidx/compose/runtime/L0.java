package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface L0<T> extends X1<T> {
    T component1();

    @NotNull
    ed.l<T, kotlin.L0> component2();

    @Override // androidx.compose.runtime.X1
    T getValue();

    void setValue(T t10);
}
