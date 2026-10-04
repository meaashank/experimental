package com.bytedance.adsdk.ugeno.Vor.uR;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.compose.ui.graphics.C2082m2;
import i.C4541d;
import java.util.HashSet;
import o3.C5321a;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends Drawable {
    private final RectF FA;
    private final int Ht;
    private final int Mm;
    private ImageView.ScaleType OCA;
    private final Paint TFq;
    private final Paint Vor;
    private boolean WMI;
    private final RectF ZH;
    private final Matrix aT;
    private boolean edo;
    private Shader.TileMode lp;
    private final RectF mZ;
    private float oK;
    private ColorStateList om;
    private float qF;
    private Shader.TileMode sAl;
    private final Bitmap uR;
    private final boolean[] yBV;
    private final RectF ZRu = new RectF();
    private final RectF NOt = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Vor.uR.NOt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ZRu = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public NOt(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.mZ = rectF;
        this.FA = new RectF();
        this.aT = new Matrix();
        this.ZH = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.lp = tileMode;
        this.sAl = tileMode;
        this.edo = true;
        this.oK = 0.0f;
        this.yBV = new boolean[]{true, true, true, true};
        this.WMI = false;
        this.qF = 0.0f;
        this.om = ColorStateList.valueOf(-16777216);
        this.OCA = ImageView.ScaleType.FIT_CENTER;
        this.uR = bitmap;
        int width = bitmap.getWidth();
        this.Ht = width;
        int height = bitmap.getHeight();
        this.Mm = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.TFq = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.Vor = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.om.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.qF);
    }

    public static Bitmap NOt(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static NOt ZRu(Bitmap bitmap) {
        if (bitmap != null) {
            return new NOt(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.edo) {
            BitmapShader bitmapShader = new BitmapShader(this.uR, this.lp, this.sAl);
            Shader.TileMode tileMode = this.lp;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.sAl == tileMode2) {
                bitmapShader.setLocalMatrix(this.aT);
            }
            this.TFq.setShader(bitmapShader);
            this.edo = false;
        }
        if (this.WMI) {
            if (this.qF <= 0.0f) {
                canvas.drawOval(this.NOt, this.TFq);
                return;
            } else {
                canvas.drawOval(this.NOt, this.TFq);
                canvas.drawOval(this.FA, this.Vor);
                return;
            }
        }
        if (!ZRu(this.yBV)) {
            canvas.drawRect(this.NOt, this.TFq);
            if (this.qF > 0.0f) {
                canvas.drawRect(this.FA, this.Vor);
                return;
            }
            return;
        }
        float f10 = this.oK;
        if (this.qF <= 0.0f) {
            canvas.drawRoundRect(this.NOt, f10, f10, this.TFq);
            ZRu(canvas);
        } else {
            canvas.drawRoundRect(this.NOt, f10, f10, this.TFq);
            canvas.drawRoundRect(this.FA, f10, f10, this.Vor);
            ZRu(canvas);
            NOt(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.TFq.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.TFq.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Mm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Ht;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.om.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ZRu.set(rect);
        ZRu();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.om.getColorForState(iArr, 0);
        if (this.Vor.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.Vor.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.TFq.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.TFq.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.TFq.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.TFq.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable ZRu(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof NOt) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && C5321a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), ZRu(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapNOt = NOt(drawable);
        return bitmapNOt != null ? new NOt(bitmapNOt) : drawable;
    }

    private void NOt(Canvas canvas) {
        float f10;
        float f11;
        if (NOt(this.yBV) || this.oK == 0.0f) {
            return;
        }
        RectF rectF = this.NOt;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = this.NOt.height() + f13;
        float f14 = this.oK;
        float f15 = this.qF / 2.0f;
        if (this.yBV[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.Vor);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.Vor);
        }
        if (!this.yBV[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.Vor);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.Vor);
            fWidth = fWidth;
        }
        if (this.yBV[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.Vor);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.Vor);
            f11 = fHeight;
        }
        if (this.yBV[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.Vor);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.Vor);
    }

    private void ZRu() {
        float fWidth;
        float fA;
        int i10 = AnonymousClass1.ZRu[this.OCA.ordinal()];
        if (i10 == 1) {
            this.FA.set(this.ZRu);
            RectF rectF = this.FA;
            float f10 = this.qF;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.aT.reset();
            this.aT.setTranslate((int) C4541d.a(this.FA.width(), this.Ht, 0.5f, 0.5f), (int) C4541d.a(this.FA.height(), this.Mm, 0.5f, 0.5f));
        } else if (i10 == 2) {
            this.FA.set(this.ZRu);
            RectF rectF2 = this.FA;
            float f11 = this.qF;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.aT.reset();
            float fA2 = 0.0f;
            if (this.FA.height() * this.Ht > this.FA.width() * this.Mm) {
                fWidth = this.FA.height() / this.Mm;
                fA = 0.0f;
                fA2 = C2082m2.a(this.Ht, fWidth, this.FA.width(), 0.5f);
            } else {
                fWidth = this.FA.width() / this.Ht;
                fA = C2082m2.a(this.Mm, fWidth, this.FA.height(), 0.5f);
            }
            this.aT.setScale(fWidth, fWidth);
            Matrix matrix = this.aT;
            float f12 = this.qF;
            matrix.postTranslate((f12 / 2.0f) + ((int) (fA2 + 0.5f)), (f12 / 2.0f) + ((int) (fA + 0.5f)));
        } else if (i10 == 3) {
            this.aT.reset();
            float fMin = (((float) this.Ht) > this.ZRu.width() || ((float) this.Mm) > this.ZRu.height()) ? Math.min(this.ZRu.width() / this.Ht, this.ZRu.height() / this.Mm) : 1.0f;
            float fWidth2 = (int) (((this.ZRu.width() - (this.Ht * fMin)) * 0.5f) + 0.5f);
            float fHeight = (int) (((this.ZRu.height() - (this.Mm * fMin)) * 0.5f) + 0.5f);
            this.aT.setScale(fMin, fMin);
            this.aT.postTranslate(fWidth2, fHeight);
            this.FA.set(this.mZ);
            this.aT.mapRect(this.FA);
            RectF rectF3 = this.FA;
            float f13 = this.qF;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.aT.setRectToRect(this.mZ, this.FA, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.FA.set(this.mZ);
            this.aT.setRectToRect(this.mZ, this.ZRu, Matrix.ScaleToFit.END);
            this.aT.mapRect(this.FA);
            RectF rectF4 = this.FA;
            float f14 = this.qF;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.aT.setRectToRect(this.mZ, this.FA, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.FA.set(this.mZ);
            this.aT.setRectToRect(this.mZ, this.ZRu, Matrix.ScaleToFit.START);
            this.aT.mapRect(this.FA);
            RectF rectF5 = this.FA;
            float f15 = this.qF;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.aT.setRectToRect(this.mZ, this.FA, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.FA.set(this.mZ);
            this.aT.setRectToRect(this.mZ, this.ZRu, Matrix.ScaleToFit.CENTER);
            this.aT.mapRect(this.FA);
            RectF rectF6 = this.FA;
            float f16 = this.qF;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.aT.setRectToRect(this.mZ, this.FA, Matrix.ScaleToFit.FILL);
        } else {
            this.FA.set(this.ZRu);
            RectF rectF7 = this.FA;
            float f17 = this.qF;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.aT.reset();
            this.aT.setRectToRect(this.mZ, this.FA, Matrix.ScaleToFit.FILL);
        }
        this.NOt.set(this.FA);
        this.edo = true;
    }

    public NOt NOt(Shader.TileMode tileMode) {
        if (this.sAl != tileMode) {
            this.sAl = tileMode;
            this.edo = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean NOt(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void ZRu(Canvas canvas) {
        if (NOt(this.yBV) || this.oK == 0.0f) {
            return;
        }
        RectF rectF = this.NOt;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.NOt.height() + f11;
        float f12 = this.oK;
        if (!this.yBV[0]) {
            this.ZH.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.ZH, this.TFq);
        }
        if (!this.yBV[1]) {
            this.ZH.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.ZH, this.TFq);
        }
        if (!this.yBV[2]) {
            this.ZH.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.ZH, this.TFq);
        }
        if (this.yBV[3]) {
            return;
        }
        this.ZH.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.ZH, this.TFq);
    }

    public NOt ZRu(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.oK = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.oK = 0.0f;
            }
            boolean[] zArr = this.yBV;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public NOt ZRu(float f10) {
        this.qF = f10;
        this.Vor.setStrokeWidth(f10);
        return this;
    }

    public NOt ZRu(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.om = colorStateList;
        this.Vor.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public NOt ZRu(boolean z10) {
        this.WMI = z10;
        return this;
    }

    public NOt ZRu(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.OCA != scaleType) {
            this.OCA = scaleType;
            ZRu();
        }
        return this;
    }

    public NOt ZRu(Shader.TileMode tileMode) {
        if (this.lp != tileMode) {
            this.lp = tileMode;
            this.edo = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ZRu(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
