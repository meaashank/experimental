package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import v3.p;

/* JADX INFO: loaded from: classes2.dex */
public interface g<R> {
    boolean a(@NonNull R r10, @NonNull Object obj, p<R> pVar, @NonNull DataSource dataSource, boolean z10);

    boolean b(@Nullable GlideException glideException, @Nullable Object obj, @NonNull p<R> pVar, boolean z10);
}
