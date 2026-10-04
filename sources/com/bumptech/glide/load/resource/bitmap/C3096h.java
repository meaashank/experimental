package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3096h implements com.bumptech.glide.load.engine.s<Bitmap>, com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f139945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139946b;

    public C3096h(@NonNull Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        y3.m.f(bitmap, "Bitmap must not be null");
        this.f139945a = bitmap;
        y3.m.f(eVar, "BitmapPool must not be null");
        this.f139946b = eVar;
    }

    @Nullable
    public static C3096h d(@Nullable Bitmap bitmap, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C3096h(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
        this.f139946b.d(this.f139945a);
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f139945a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return y3.o.i(this.f139945a);
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        this.f139945a.prepareToDraw();
    }
}
