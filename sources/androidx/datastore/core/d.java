package androidx.datastore.core;

import ed.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface d<T> {
    @Nullable
    Object a(@NotNull p<? super T, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar);

    @NotNull
    kotlinx.coroutines.flow.e<T> getData();
}
