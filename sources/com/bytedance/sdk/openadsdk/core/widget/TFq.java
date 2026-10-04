package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import o3.C5321a;
import o3.C5322b;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class TFq extends ImageView {
    private float FA;
    private boolean Ht;
    private boolean Mm;
    private Movie NOt;
    private AnimatedImageDrawable TFq;
    private float Vor;
    private int ZH;
    private int ZRu;
    private float aT;
    private boolean edo;
    private int lp;
    private long mZ;
    private boolean oK;
    private volatile boolean sAl;
    private int uR;

    public TFq(Context context) {
        super(context);
        this.Ht = Build.VERSION.SDK_INT >= 28;
        this.Mm = false;
        this.edo = true;
        this.oK = true;
        ZRu();
    }

    private AnimatedImageDrawable NOt(int i10) {
        if (i10 != -1 && Build.VERSION.SDK_INT >= 28) {
            return ZRu(ImageDecoder.createSource(getResources(), i10));
        }
        return null;
    }

    private ImageDecoder.Source mZ(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileZRu = ZRu(getContext(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? "GIF_AD_CACHE/" : "/GIF_CACHE/", "TT_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileZRu);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(fileZRu);
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return sourceCreateSource;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    com.bytedance.sdk.component.utils.lp.ZRu("GifView", "GifView  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable unused3) {
        }
        return null;
    }

    private void uR() {
        if (this.NOt == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.mZ == 0) {
            this.mZ = jUptimeMillis;
        }
        int iDuration = this.NOt.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.oK || Math.abs(iDuration - this.uR) >= 60) {
            this.uR = (int) ((jUptimeMillis - this.mZ) % ((long) iDuration));
        } else {
            this.uR = iDuration;
            this.sAl = true;
        }
    }

    public void ZRu() {
        if (this.Ht) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.NOt == null || this.Ht) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.sAl) {
                ZRu(canvas);
                return;
            }
            uR();
            ZRu(canvas);
            mZ();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("GifView", "onDraw->Throwable->", th);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.NOt != null && !this.Ht) {
            this.FA = (getWidth() - this.ZH) / 2.0f;
            this.Vor = (getHeight() - this.lp) / 2.0f;
        }
        this.edo = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.Ht || (movie = this.NOt) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.NOt.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.aT = fMax;
        int i12 = (int) (iWidth * fMax);
        this.ZH = i12;
        int i13 = (int) (iHeight * fMax);
        this.lp = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.NOt != null) {
            this.edo = i10 == 1;
            mZ();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.NOt != null) {
            this.edo = i10 == 0;
            mZ();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.NOt != null) {
            this.edo = i10 == 0;
            mZ();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.oK = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.TFq) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("GifView", "setRepeatConfig error", e10);
        }
    }

    public void ZRu(int i10, boolean z10) {
        this.sAl = z10;
        this.ZRu = i10;
        if (i10 != -1) {
            if (!this.Ht) {
                this.NOt = ZRu(i10);
            } else {
                this.TFq = NOt(i10);
            }
        }
    }

    private AnimatedImageDrawable NOt(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return ZRu(mZ(bArr));
    }

    public void NOt() {
        if (this.NOt == null || !this.sAl) {
            return;
        }
        this.sAl = false;
        if (!this.Ht) {
            this.mZ = SystemClock.uptimeMillis() - ((long) this.uR);
            invalidate();
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = this.TFq;
        if (animatedImageDrawable == null || animatedImageDrawable.isRunning()) {
            return;
        }
        this.TFq.start();
    }

    public void ZRu(byte[] bArr, boolean z10) {
        this.sAl = z10;
        if (bArr != null) {
            if (!this.Ht) {
                this.NOt = ZRu(bArr);
            } else {
                this.TFq = NOt(bArr);
            }
            mZ();
        }
    }

    private void mZ() {
        if (this.NOt == null || this.Ht || !this.edo) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private Movie ZRu(int i10) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie ZRu(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable ZRu(ImageDecoder.Source source) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return null;
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source);
            setImageDrawable(drawableDecodeDrawable);
            if (C5321a.a(drawableDecodeDrawable)) {
                AnimatedImageDrawable animatedImageDrawableA = C5322b.a(drawableDecodeDrawable);
                if (!this.sAl) {
                    animatedImageDrawableA.start();
                }
                return animatedImageDrawableA;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static File ZRu(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.Ht.ZRu(context, com.bytedance.sdk.openadsdk.multipro.NOt.mZ(), str, str2);
    }

    private void ZRu(Canvas canvas) {
        Movie movie = this.NOt;
        if (movie == null) {
            return;
        }
        movie.setTime(this.uR);
        float f10 = this.aT;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.NOt.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.NOt;
            float f11 = this.FA;
            float f12 = this.aT;
            movie2.draw(canvas, f11 / f12, this.Vor / f12);
        }
        canvas.restore();
    }
}
