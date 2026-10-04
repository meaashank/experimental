package com.prism.lib.media.ui.widget.photoview;

import Ha.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes7.dex */
public class AttachPhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f178717a;

    public AttachPhotoView(Context context) {
        super(context);
    }

    public d c() {
        return d();
    }

    public synchronized d d() {
        d dVar = this.f178717a;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this, true);
        this.f178717a = dVar2;
        return dVar2;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        d dVar = this.f178717a;
        if (dVar != null) {
            dVar.m0();
        }
    }

    public AttachPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachPhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
