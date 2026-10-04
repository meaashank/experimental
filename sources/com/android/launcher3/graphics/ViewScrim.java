package com.android.launcher3.graphics;

import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewScrim<T extends View> {
    public static Property<ViewScrim, Float> PROGRESS = new AnonymousClass1(Float.TYPE, "progress");
    protected float mProgress = 0.0f;
    protected final T mView;

    /* JADX INFO: renamed from: com.android.launcher3.graphics.ViewScrim$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<ViewScrim, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(ViewScrim viewScrim) {
            return Float.valueOf(viewScrim.mProgress);
        }

        @Override // android.util.Property
        public void set(ViewScrim viewScrim, Float f10) {
            viewScrim.setProgress(f10.floatValue());
        }
    }

    public ViewScrim(T t10) {
        this.mView = t10;
    }

    public static ViewScrim get(View view) {
        return (ViewScrim) view.getTag(R.id.view_scrim);
    }

    public void attach() {
        this.mView.setTag(R.id.view_scrim, this);
    }

    public abstract void draw(Canvas canvas, int i10, int i11);

    public void invalidate() {
        Object parent = this.mView.getParent();
        if (parent != null) {
            ((View) parent).invalidate();
        }
    }

    public void onProgressChanged() {
    }

    public void setProgress(float f10) {
        if (this.mProgress != f10) {
            this.mProgress = f10;
            onProgressChanged();
            invalidate();
        }
    }
}
