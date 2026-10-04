package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.collection.M0;
import g3.InterfaceC4450h;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3097i implements InterfaceC4450h<Bitmap> {
    @Override // g3.InterfaceC4450h
    @NonNull
    public final com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.s<Bitmap> sVar, int i10, int i11) {
        if (!y3.o.x(i10, i11)) {
            throw new IllegalArgumentException(M0.a("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarH = com.bumptech.glide.c.e(context).h();
        Bitmap bitmap = sVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVarH, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? sVar : C3096h.d(bitmapC, eVarH);
    }

    public abstract Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11);
}
