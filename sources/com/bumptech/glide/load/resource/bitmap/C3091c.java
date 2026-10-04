package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3091c extends o3.j<BitmapDrawable> implements com.bumptech.glide.load.engine.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139937b;

    public C3091c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f139937b = eVar;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
        this.f139937b.d(((BitmapDrawable) this.f223214a).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return y3.o.i(((BitmapDrawable) this.f223214a).getBitmap());
    }

    @Override // o3.j, com.bumptech.glide.load.engine.o
    public void initialize() {
        ((BitmapDrawable) this.f223214a).getBitmap().prepareToDraw();
    }
}
