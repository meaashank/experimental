package com.bytedance.sdk.component.adexpress.Ht;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import o3.C5321a;
import o3.C5322b;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class sAl extends ImageView {
    private float FA;
    private boolean Ht;
    private float Mm;
    private long NOt;
    private boolean TFq;
    private float Vor;
    private int ZH;
    private Movie ZRu;
    private int aT;
    private boolean edo;
    private volatile boolean lp;
    private int mZ;
    private boolean sAl;
    private AnimatedImageDrawable uR;

    public sAl(Context context) {
        super(context);
        this.TFq = Build.VERSION.SDK_INT >= 28;
        this.Ht = false;
        this.sAl = true;
        this.edo = true;
        ZRu();
    }

    private void NOt() {
        if (this.ZRu == null || this.TFq || !this.sAl) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void mZ() {
        if (this.ZRu == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.NOt == 0) {
            this.NOt = jUptimeMillis;
        }
        int iDuration = this.ZRu.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.edo || Math.abs(iDuration - this.mZ) >= 60) {
            this.mZ = (int) ((jUptimeMillis - this.NOt) % ((long) iDuration));
        } else {
            this.mZ = iDuration;
            this.lp = true;
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && C5321a.a(drawable)) {
            AnimatedImageDrawable animatedImageDrawableA = C5322b.a(drawable);
            this.uR = animatedImageDrawableA;
            if (!this.lp) {
                animatedImageDrawableA.start();
            }
            if (!this.edo) {
                animatedImageDrawableA.setRepeatCount(0);
            }
        }
        NOt();
    }

    public void ZRu() {
        if (this.TFq) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.ZRu == null || this.TFq) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.lp) {
                ZRu(canvas);
                return;
            }
            mZ();
            ZRu(canvas);
            NOt();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("GifView", "onDraw->Throwable->", th);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.ZRu != null && !this.TFq) {
            this.Mm = (getWidth() - this.aT) / 2.0f;
            this.FA = (getHeight() - this.ZH) / 2.0f;
        }
        this.sAl = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.TFq || (movie = this.ZRu) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.ZRu.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.Vor = fMax;
        int i12 = (int) (iWidth * fMax);
        this.aT = i12;
        int i13 = (int) (iHeight * fMax);
        this.ZH = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.ZRu != null) {
            this.sAl = i10 == 1;
            NOt();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.ZRu != null) {
            this.sAl = i10 == 0;
            NOt();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.ZRu != null) {
            this.sAl = i10 == 0;
            NOt();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.edo = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.uR) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("GifView", "setRepeatConfig error", e10);
        }
    }

    private void ZRu(Canvas canvas) {
        Movie movie = this.ZRu;
        if (movie == null) {
            return;
        }
        movie.setTime(this.mZ);
        float f10 = this.Vor;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.ZRu.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.ZRu;
            float f11 = this.Mm;
            float f12 = this.Vor;
            movie2.draw(canvas, f11 / f12, this.FA / f12);
        }
        canvas.restore();
    }
}
