package com.bytedance.adsdk.ugeno.Vor.uR;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ZRu.Ht;
import com.bytedance.adsdk.ugeno.ZRu.TFq;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends ImageView implements TFq, IAnimation {
    static final /* synthetic */ boolean NOt = true;
    public static final Shader.TileMode ZRu = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] uR = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private float FA;
    private Drawable Ht;
    private ColorStateList Mm;
    private com.bytedance.adsdk.ugeno.mZ OCA;
    private final float[] TFq;
    private ColorFilter Vor;
    private ImageView.ScaleType WMI;
    private Drawable ZH;
    private boolean aT;
    private boolean edo;
    private boolean lp;
    private float mZ;
    private int oK;
    private Shader.TileMode om;
    private Shader.TileMode qF;
    private boolean sAl;
    private Ht to;
    private int yBV;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Vor.uR.ZRu$1, reason: invalid class name */
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
                ZRu[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ZRu[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ZRu(Context context) {
        super(context);
        this.TFq = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.Mm = ColorStateList.valueOf(-16777216);
        this.FA = 0.0f;
        this.Vor = null;
        this.aT = false;
        this.lp = false;
        this.sAl = false;
        this.edo = false;
        Shader.TileMode tileMode = ZRu;
        this.qF = tileMode;
        this.om = tileMode;
        this.to = new Ht(this);
    }

    private Drawable NOt() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.yBV;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.yBV, e10);
                this.yBV = 0;
            }
        }
        return NOt.ZRu(drawable);
    }

    private Drawable ZRu() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.oK;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.oK, e10);
                this.oK = 0;
            }
        }
        return NOt.ZRu(drawable);
    }

    private void mZ() {
        ZRu(this.ZH, this.WMI);
    }

    private void uR() {
        Drawable drawable = this.ZH;
        if (drawable == null || !this.aT) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.ZH = drawableMutate;
        if (this.lp) {
            drawableMutate.setColorFilter(this.Vor);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.Mm.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.Mm;
    }

    public float getBorderRadius() {
        return this.to.ZRu();
    }

    public float getBorderWidth() {
        return this.FA;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.TFq) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getRubIn() {
        return this.to.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.WMI;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getShine() {
        return this.to.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getStretch() {
        return this.to.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.qF;
    }

    public Shader.TileMode getTileModeY() {
        return this.om;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar != null) {
            mZVar.ZRu(canvas, this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar != null) {
            mZVar.ZRu(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            super.onMeasure(iArrZRu[0], iArrZRu[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.OCA;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.Ht = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.Ht = drawable;
        ZRu(true);
        super.setBackgroundDrawable(this.Ht);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.yBV != i10) {
            this.yBV = i10;
            Drawable drawableNOt = NOt();
            this.Ht = drawableNOt;
            setBackgroundDrawable(drawableNOt);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        Ht ht = this.to;
        if (ht != null) {
            ht.ZRu(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.Vor != colorFilter) {
            this.Vor = colorFilter;
            this.lp = true;
            this.aT = true;
            uR();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        ZRu(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        ZRu(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.oK = 0;
        this.ZH = NOt.ZRu(bitmap);
        mZ();
        super.setImageDrawable(this.ZH);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.oK = 0;
        this.ZH = NOt.ZRu(drawable);
        mZ();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.oK != i10) {
            this.oK = i10;
            this.ZH = ZRu();
            mZ();
            super.setImageDrawable(this.ZH);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.sAl = z10;
        mZ();
        ZRu(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.mZ = f10;
        Ht ht = this.to;
        if (ht != null) {
            ht.NOt(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        Ht ht = this.to;
        if (ht != null) {
            ht.TFq(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!NOt && scaleType == null) {
            throw new AssertionError();
        }
        if (this.WMI != scaleType) {
            this.WMI = scaleType;
            switch (AnonymousClass1.ZRu[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            mZ();
            ZRu(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        Ht ht = this.to;
        if (ht != null) {
            ht.mZ(f10);
        }
    }

    public void setStretch(float f10) {
        Ht ht = this.to;
        if (ht != null) {
            ht.uR(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.qF == tileMode) {
            return;
        }
        this.qF = tileMode;
        mZ();
        ZRu(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.om == tileMode) {
            return;
        }
        this.om = tileMode;
        mZ();
        ZRu(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.Mm.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.Mm = colorStateList;
        mZ();
        ZRu(false);
        if (this.FA > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.FA == f10) {
            return;
        }
        this.FA = f10;
        mZ();
        ZRu(false);
        invalidate();
    }

    private void ZRu(boolean z10) {
        if (this.edo) {
            if (z10) {
                this.Ht = NOt.ZRu(this.Ht);
            }
            ZRu(this.Ht, ImageView.ScaleType.FIT_XY);
        }
    }

    private void ZRu(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof NOt) {
            NOt nOt = (NOt) drawable;
            nOt.ZRu(scaleType).ZRu(this.FA).ZRu(this.Mm).ZRu(this.sAl).ZRu(this.qF).NOt(this.om);
            float[] fArr = this.TFq;
            if (fArr != null) {
                nOt.ZRu(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            uR();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                ZRu(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void ZRu(float f10, float f11, float f12, float f13) {
        float[] fArr = this.TFq;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        mZ();
        ZRu(false);
        invalidate();
    }

    public void ZRu(com.bytedance.adsdk.ugeno.mZ mZVar) {
        this.OCA = mZVar;
    }
}
