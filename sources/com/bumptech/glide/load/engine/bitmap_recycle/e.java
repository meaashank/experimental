package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface e {
    void a(int i10);

    void b();

    void c(float f10);

    void d(Bitmap bitmap);

    long e();

    @NonNull
    Bitmap f(int i10, int i11, Bitmap.Config config);

    @NonNull
    Bitmap g(int i10, int i11, Bitmap.Config config);
}
