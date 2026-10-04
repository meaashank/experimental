package com.android.launcher3.folder;

/* JADX INFO: loaded from: classes2.dex */
public class ClippedFolderIconLayoutRule {
    public static final int ENTER_INDEX = -3;
    public static final int EXIT_INDEX = -2;
    private static final float ITEM_RADIUS_SCALE_FACTOR = 1.33f;
    public static final int MAX_NUM_ITEMS_IN_PREVIEW = 4;
    private static final float MAX_RADIUS_DILATION = 0.15f;
    private static final float MAX_SCALE = 0.58f;
    private static final int MIN_NUM_ITEMS_IN_PREVIEW = 2;
    private static final float MIN_SCALE = 0.48f;
    private float mAvailableSpace;
    private float mBaselineIconScale;
    private float mIconSize;
    private boolean mIsRtl;
    private float mRadius;
    private float[] mTmpPoint = new float[2];

    private void getGridPosition(int i10, int i11, float[] fArr) {
        getPosition(0, 4, fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        getPosition(3, 4, fArr);
        float f12 = fArr[0] - f10;
        float f13 = fArr[1] - f11;
        fArr[0] = (i11 * f12) + f10;
        fArr[1] = (i10 * f13) + f11;
    }

    private void getPosition(int i10, int i11, float[] fArr) {
        int i12 = i10;
        int iMax = Math.max(i11, 2);
        boolean z10 = this.mIsRtl;
        double d10 = 0.0d;
        double d11 = z10 ? 0.0d : 3.141592653589793d;
        int i13 = z10 ? 1 : -1;
        if (iMax == 3) {
            d10 = 0.5235987755982988d;
        } else if (iMax == 4) {
            d10 = 0.7853981633974483d;
        }
        double d12 = i13;
        double d13 = (d10 * d12) + d11;
        if (iMax == 4 && i12 == 3) {
            i12 = 2;
        } else if (iMax == 4 && i12 == 2) {
            i12 = 3;
        }
        float f10 = ((((iMax - 2) * 0.15f) / 2.0f) + 1.0f) * this.mRadius;
        double d14 = ((6.283185307179586d / ((double) iMax)) * ((double) i12) * d12) + d13;
        float fScaleForItem = (scaleForItem(iMax) * this.mIconSize) / 2.0f;
        fArr[0] = ((this.mAvailableSpace / 2.0f) + ((float) ((Math.cos(d14) * ((double) f10)) / 2.0d))) - fScaleForItem;
        fArr[1] = ((this.mAvailableSpace / 2.0f) + ((float) ((Math.sin(d14) * ((double) (-f10))) / 2.0d))) - fScaleForItem;
    }

    public PreviewItemDrawingParams computePreviewItemDrawingParams(int i10, int i11, PreviewItemDrawingParams previewItemDrawingParams) {
        float fScaleForItem = scaleForItem(i11);
        if (i10 == -2) {
            getGridPosition(0, 2, this.mTmpPoint);
        } else if (i10 == -3) {
            getGridPosition(1, 2, this.mTmpPoint);
        } else if (i10 >= 4) {
            float[] fArr = this.mTmpPoint;
            float f10 = (this.mAvailableSpace / 2.0f) - ((this.mIconSize * fScaleForItem) / 2.0f);
            fArr[1] = f10;
            fArr[0] = f10;
        } else {
            getPosition(i10, i11, this.mTmpPoint);
        }
        float[] fArr2 = this.mTmpPoint;
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        if (previewItemDrawingParams == null) {
            return new PreviewItemDrawingParams(f11, f12, fScaleForItem, 0.0f);
        }
        previewItemDrawingParams.update(f11, f12, fScaleForItem);
        previewItemDrawingParams.overlayAlpha = 0.0f;
        return previewItemDrawingParams;
    }

    public float getIconSize() {
        return this.mIconSize;
    }

    public void init(int i10, float f10, boolean z10) {
        float f11 = i10;
        this.mAvailableSpace = f11;
        this.mRadius = (ITEM_RADIUS_SCALE_FACTOR * f11) / 2.0f;
        this.mIconSize = f10;
        this.mIsRtl = z10;
        this.mBaselineIconScale = f11 / (f10 * 1.0f);
    }

    public float scaleForItem(int i10) {
        return (i10 <= 2 ? MAX_SCALE : i10 == 3 ? 0.53f : MIN_SCALE) * this.mBaselineIconScale;
    }
}
