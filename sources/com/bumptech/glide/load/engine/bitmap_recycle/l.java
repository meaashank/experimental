package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface l {
    String a(int i10, int i11, Bitmap.Config config);

    int b(Bitmap bitmap);

    String c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @Nullable
    Bitmap f(int i10, int i11, Bitmap.Config config);

    @Nullable
    Bitmap removeLast();
}
