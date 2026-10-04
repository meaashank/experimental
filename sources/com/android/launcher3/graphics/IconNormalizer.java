package com.android.launcher3.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.Utilities;
import com.android.launcher3.dragndrop.FolderAdaptiveIcon;
import i.C4541d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class IconNormalizer {
    private static final float BOUND_RATIO_MARGIN = 0.05f;
    private static final float CIRCLE_AREA_BY_RECT = 0.7853982f;
    private static final boolean DEBUG = false;
    public static final float ICON_VISIBLE_AREA_FACTOR = 0.92f;
    private static final float LINEAR_SCALE_SLOPE = 0.040449437f;
    private static final float MAX_CIRCLE_AREA_FACTOR = 0.6597222f;
    private static final float MAX_SQUARE_AREA_FACTOR = 0.6510417f;
    private static final int MIN_VISIBLE_ALPHA = 40;
    private static final float PIXEL_DIFF_PERCENTAGE_THRESHOLD = 0.005f;
    private static final float SCALE_NOT_INITIALIZED = 0.0f;
    private static final String TAG = "IconNormalizer";
    private final Rect mAdaptiveIconBounds;
    private float mAdaptiveIconScale;
    private final Bitmap mBitmap;
    private final Rect mBounds;
    private final Canvas mCanvas;
    private final float[] mLeftBorder;
    private final Matrix mMatrix;
    private final int mMaxSize;
    private final Paint mPaintMaskShape;
    private final Paint mPaintMaskShapeOutline;
    private final byte[] mPixels;
    private final float[] mRightBorder;
    private final Path mShapePath;

    public IconNormalizer(Context context) {
        int i10 = LauncherAppState.getIDP(context).iconBitmapSize * 2;
        this.mMaxSize = i10;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.mBitmap = bitmapCreateBitmap;
        this.mCanvas = new Canvas(bitmapCreateBitmap);
        this.mPixels = new byte[i10 * i10];
        this.mLeftBorder = new float[i10];
        this.mRightBorder = new float[i10];
        this.mBounds = new Rect();
        this.mAdaptiveIconBounds = new Rect();
        Paint paint = new Paint();
        this.mPaintMaskShape = paint;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        Paint paint2 = new Paint();
        this.mPaintMaskShapeOutline = paint2;
        paint2.setStrokeWidth(context.getResources().getDisplayMetrics().density * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mShapePath = new Path();
        this.mMatrix = new Matrix();
        this.mAdaptiveIconScale = 0.0f;
    }

    private static void convertToConvexArray(float[] fArr, int i10, int i11, int i12) {
        float[] fArr2 = new float[fArr.length - 1];
        int i13 = -1;
        float f10 = Float.MAX_VALUE;
        for (int i14 = i11 + 1; i14 <= i12; i14++) {
            float f11 = fArr[i14];
            if (f11 > -1.0f) {
                if (f10 == Float.MAX_VALUE) {
                    i13 = i11;
                } else {
                    float f12 = ((f11 - fArr[i13]) / (i14 - i13)) - f10;
                    float f13 = i10;
                    if (f12 * f13 < 0.0f) {
                        while (i13 > i11) {
                            i13--;
                            if ((((fArr[i14] - fArr[i13]) / (i14 - i13)) - fArr2[i13]) * f13 >= 0.0f) {
                                break;
                            }
                        }
                    }
                }
                f10 = (fArr[i14] - fArr[i13]) / (i14 - i13);
                for (int i15 = i13; i15 < i14; i15++) {
                    fArr2[i15] = f10;
                    fArr[i15] = ((i15 - i13) * f10) + fArr[i13];
                }
                i13 = i14;
            }
        }
    }

    public static int getNormalizedCircleSize(int i10) {
        return (int) Math.round(Math.sqrt(((double) (((i10 * i10) * MAX_CIRCLE_AREA_FACTOR) * 4.0f)) / 3.141592653589793d));
    }

    private boolean isShape(Path path) {
        if (Math.abs((this.mBounds.width() / this.mBounds.height()) - 1.0f) > 0.05f) {
            return false;
        }
        this.mMatrix.reset();
        this.mMatrix.setScale(this.mBounds.width(), this.mBounds.height());
        Matrix matrix = this.mMatrix;
        Rect rect = this.mBounds;
        matrix.postTranslate(rect.left, rect.top);
        path.transform(this.mMatrix, this.mShapePath);
        this.mCanvas.drawPath(this.mShapePath, this.mPaintMaskShape);
        this.mCanvas.drawPath(this.mShapePath, this.mPaintMaskShapeOutline);
        return isTransparentBitmap();
    }

    private boolean isTransparentBitmap() {
        Rect rect;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.mPixels);
        byteBufferWrap.rewind();
        this.mBitmap.copyPixelsToBuffer(byteBufferWrap);
        Rect rect2 = this.mBounds;
        int i10 = rect2.top;
        int i11 = this.mMaxSize;
        int i12 = i10 * i11;
        int i13 = i11 - rect2.right;
        int i14 = 0;
        while (true) {
            rect = this.mBounds;
            if (i10 >= rect.bottom) {
                break;
            }
            int i15 = rect.left;
            int i16 = i12 + i15;
            while (i15 < this.mBounds.right) {
                if ((this.mPixels[i16] & 255) > 40) {
                    i14++;
                }
                i16++;
                i15++;
            }
            i12 = i16 + i13;
            i10++;
        }
        return ((float) i14) / ((float) (this.mBounds.height() * rect.width())) < PIXEL_DIFF_PERCENTAGE_THRESHOLD;
    }

    public synchronized float getScale(@NonNull Drawable drawable, @Nullable RectF rectF, @Nullable Path path, @Nullable boolean[] zArr) {
        Drawable drawableA;
        try {
            float f10 = 0.0f;
            if (Utilities.ATLEAST_OREO && com.android.launcher3.dragndrop.g.a(drawable)) {
                if (this.mAdaptiveIconScale != 0.0f) {
                    if (rectF != null) {
                        rectF.set(this.mAdaptiveIconBounds);
                    }
                    return this.mAdaptiveIconScale;
                }
                drawableA = drawable;
                if (drawableA instanceof FolderAdaptiveIcon) {
                    d.a();
                    drawableA = c.a(new ColorDrawable(-16777216), null);
                }
            } else {
                drawableA = drawable;
            }
            int intrinsicWidth = drawableA.getIntrinsicWidth();
            int intrinsicHeight = drawableA.getIntrinsicHeight();
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                if (intrinsicWidth <= 0 || intrinsicWidth > this.mMaxSize) {
                    intrinsicWidth = this.mMaxSize;
                }
                if (intrinsicHeight <= 0 || intrinsicHeight > this.mMaxSize) {
                    intrinsicHeight = this.mMaxSize;
                }
            } else {
                int i10 = this.mMaxSize;
                if (intrinsicWidth > i10 || intrinsicHeight > i10) {
                    int iMax = Math.max(intrinsicWidth, intrinsicHeight);
                    int i11 = this.mMaxSize;
                    intrinsicWidth = (intrinsicWidth * i11) / iMax;
                    intrinsicHeight = (i11 * intrinsicHeight) / iMax;
                }
            }
            int i12 = 0;
            this.mBitmap.eraseColor(0);
            drawableA.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawableA.draw(this.mCanvas);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.mPixels);
            byteBufferWrap.rewind();
            this.mBitmap.copyPixelsToBuffer(byteBufferWrap);
            int i13 = this.mMaxSize;
            int i14 = i13 + 1;
            int i15 = i13 - intrinsicWidth;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int iMax2 = -1;
            int i19 = -1;
            while (i16 < intrinsicHeight) {
                float f11 = f10;
                int i20 = i12;
                int i21 = i20;
                int i22 = -1;
                int i23 = -1;
                while (i21 < intrinsicWidth) {
                    Drawable drawable2 = drawableA;
                    if ((this.mPixels[i17] & 255) > 40) {
                        if (i22 == -1) {
                            i22 = i21;
                        }
                        i23 = i21;
                    }
                    i17++;
                    i21++;
                    drawableA = drawable2;
                }
                Drawable drawable3 = drawableA;
                i17 += i15;
                this.mLeftBorder[i16] = i22;
                int i24 = i23;
                this.mRightBorder[i16] = i24;
                if (i22 != -1) {
                    if (i18 == -1) {
                        i18 = i16;
                    }
                    int iMin = Math.min(i14, i22);
                    iMax2 = Math.max(iMax2, i24);
                    i14 = iMin;
                    i19 = i16;
                }
                i16++;
                i12 = i20;
                f10 = f11;
                drawableA = drawable3;
            }
            Drawable drawable4 = drawableA;
            float f12 = f10;
            int i25 = i12;
            if (i18 != -1 && iMax2 != -1) {
                convertToConvexArray(this.mLeftBorder, 1, i18, i19);
                convertToConvexArray(this.mRightBorder, -1, i18, i19);
                float f13 = f12;
                for (int i26 = i25; i26 < intrinsicHeight; i26++) {
                    float f14 = this.mLeftBorder[i26];
                    if (f14 > -1.0f) {
                        f13 += (this.mRightBorder[i26] - f14) + 1.0f;
                    }
                }
                float f15 = f13 / (((iMax2 + 1) - i14) * ((i19 + 1) - i18));
                float fA = f15 < CIRCLE_AREA_BY_RECT ? MAX_CIRCLE_AREA_FACTOR : C4541d.a(1.0f, f15, LINEAR_SCALE_SLOPE, MAX_SQUARE_AREA_FACTOR);
                Rect rect = this.mBounds;
                rect.left = i14;
                rect.right = iMax2;
                rect.top = i18;
                rect.bottom = i19;
                if (rectF != null) {
                    float f16 = i14;
                    float f17 = intrinsicWidth;
                    float f18 = intrinsicHeight;
                    rectF.set(f16 / f17, i18 / f18, 1.0f - (iMax2 / f17), 1.0f - (i19 / f18));
                }
                if (zArr != null && zArr.length > 0) {
                    zArr[i25] = isShape(path);
                }
                float fSqrt = f13 / (intrinsicWidth * intrinsicHeight) > fA ? (float) Math.sqrt(fA / r7) : 1.0f;
                if (Utilities.ATLEAST_OREO && com.android.launcher3.dragndrop.g.a(drawable4) && this.mAdaptiveIconScale == f12) {
                    this.mAdaptiveIconScale = fSqrt;
                    this.mAdaptiveIconBounds.set(this.mBounds);
                }
                return fSqrt;
            }
            return 1.0f;
        } finally {
        }
    }
}
