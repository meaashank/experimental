package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements com.bumptech.glide.load.engine.s<BitmapDrawable>, com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f139882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.s<Bitmap> f139883b;

    public E(@NonNull Resources resources, @NonNull com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        y3.m.f(resources, "Argument must not be null");
        this.f139882a = resources;
        y3.m.f(sVar, "Argument must not be null");
        this.f139883b = sVar;
    }

    @Nullable
    public static com.bumptech.glide.load.engine.s<BitmapDrawable> d(@NonNull Resources resources, @Nullable com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        if (sVar == null) {
            return null;
        }
        return new E(resources, sVar);
    }

    @Deprecated
    public static E e(Context context, Bitmap bitmap) {
        return (E) d(context.getResources(), C3096h.d(bitmap, com.bumptech.glide.c.e(context).h()));
    }

    @Deprecated
    public static E f(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (E) d(resources, C3096h.d(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
        this.f139883b.a();
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f139882a, this.f139883b.get());
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f139883b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        com.bumptech.glide.load.engine.s<Bitmap> sVar = this.f139883b;
        if (sVar instanceof com.bumptech.glide.load.engine.o) {
            ((com.bumptech.glide.load.engine.o) sVar).initialize();
        }
    }
}
