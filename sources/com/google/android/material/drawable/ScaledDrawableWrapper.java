package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import i.C4540c;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScaledDrawableWrapper extends C4540c {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(@NonNull Drawable drawable, int i10, int i11) {
        super(drawable);
        this.width = i10;
        this.height = i11;
    }

    @Override // i.C4540c, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // i.C4540c, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
