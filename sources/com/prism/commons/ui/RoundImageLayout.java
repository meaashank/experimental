package com.prism.commons.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import c6.C2947b;

/* JADX INFO: loaded from: classes5.dex */
public class RoundImageLayout extends FromLayoutFileLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImageView.ScaleType[] f162016f = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatImageView f162017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CardView f162018e;

    public RoundImageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.prism.commons.ui.FromLayoutFileLayout
    public int a() {
        return C2947b.k.f129430W;
    }

    @Override // com.prism.commons.ui.FromLayoutFileLayout
    public void b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super.b(context, attributeSet);
        this.f162017d = (AppCompatImageView) findViewById(C2947b.h.f129224q2);
        this.f162018e = (CardView) findViewById(C2947b.h.f129127e1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2947b.o.us, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C2947b.o.vs);
        if (drawable != null) {
            this.f162017d.setBackgroundDrawable(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C2947b.o.ws);
        if (drawable2 != null) {
            this.f162017d.setImageDrawable(drawable2);
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_width, R.attr.layout_height}, 0, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(C2947b.o.xs, -1);
        if (i10 != -1) {
            this.f162017d.setScaleType(f162016f[i10]);
        }
        this.f162018e.setRadius(Math.min(typedArrayObtainStyledAttributes2.getLayoutDimension(0, -2), typedArrayObtainStyledAttributes2.getLayoutDimension(1, -2)) / 2);
        setOutlineProvider(this.f162018e.getOutlineProvider());
    }

    public ImageView d() {
        return this.f162017d;
    }

    public RoundImageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
