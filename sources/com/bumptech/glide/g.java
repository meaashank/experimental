package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4346u;
import e.Q;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public interface g<T> {
    @CheckResult
    @Deprecated
    T a(@Nullable URL url);

    @NonNull
    @CheckResult
    T b(@Nullable File file);

    @NonNull
    @CheckResult
    T c(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    T e(@Nullable Object obj);

    @NonNull
    @CheckResult
    T i(@Nullable Uri uri);

    @NonNull
    @CheckResult
    T j(@Nullable byte[] bArr);

    @NonNull
    @CheckResult
    T l(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    T p(@Nullable @Q @InterfaceC4346u Integer num);

    @NonNull
    @CheckResult
    T q(@Nullable String str);
}
