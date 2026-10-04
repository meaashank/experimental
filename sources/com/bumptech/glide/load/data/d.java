package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes2.dex */
public interface d<T> {

    public interface a<T> {
        void e(@Nullable T t10);

        void f(@NonNull Exception exc);
    }

    @NonNull
    Class<T> a();

    void b();

    @NonNull
    DataSource c();

    void cancel();

    void d(@NonNull Priority priority, @NonNull a<? super T> aVar);
}
