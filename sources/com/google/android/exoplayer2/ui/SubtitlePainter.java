package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private int backgroundColor;
    private Rect bitmapRect;
    private float bottomPaddingFraction;
    private final float cornerRadius;
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private CharSequence cueText;
    private Layout.Alignment cueTextAlignment;
    private int edgeColor;
    private int edgeType;
    private int foregroundColor;
    private final RectF lineBounds = new RectF();
    private final float outlineWidth;
    private final Paint paint;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private float textSizePx;
    private int textTop;
    private int windowColor;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.cornerRadius = fRound;
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private static boolean areCharSequencesEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, (Paint) null);
    }

    private void drawLayout(Canvas canvas, boolean z10) {
        if (z10) {
            drawTextLayout(canvas);
        } else {
            drawBitmapLayout(canvas);
        }
    }

    private void drawTextLayout(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.paint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.paint);
        } else {
            canvas2 = canvas;
        }
        if (Color.alpha(this.backgroundColor) > 0) {
            this.paint.setColor(this.backgroundColor);
            float lineTop = staticLayout.getLineTop(0);
            int lineCount = staticLayout.getLineCount();
            int i10 = 0;
            while (i10 < lineCount) {
                this.lineBounds.left = staticLayout.getLineLeft(i10) - this.textPaddingX;
                this.lineBounds.right = staticLayout.getLineRight(i10) + this.textPaddingX;
                RectF rectF = this.lineBounds;
                rectF.top = lineTop;
                rectF.bottom = staticLayout.getLineBottom(i10);
                RectF rectF2 = this.lineBounds;
                float f10 = rectF2.bottom;
                float f11 = this.cornerRadius;
                canvas2.drawRoundRect(rectF2, f11, f11, this.paint);
                i10++;
                lineTop = f10;
            }
        }
        int i11 = this.edgeType;
        if (i11 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas2);
        } else if (i11 == 2) {
            TextPaint textPaint = this.textPaint;
            float f12 = this.shadowRadius;
            float f13 = this.shadowOffset;
            textPaint.setShadowLayer(f12, f13, f13, this.edgeColor);
        } else if (i11 == 3 || i11 == 4) {
            boolean z10 = i11 == 3;
            int i12 = z10 ? -1 : this.edgeColor;
            int i13 = z10 ? this.edgeColor : -1;
            float f14 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f15 = -f14;
            this.textPaint.setShadowLayer(this.shadowRadius, f15, f15, i12);
            staticLayout.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f14, f14, i13);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupBitmapLayout() {
        /*
            r7 = this;
            int r0 = r7.parentRight
            int r1 = r7.parentLeft
            int r0 = r0 - r1
            int r2 = r7.parentBottom
            int r3 = r7.parentTop
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.cuePosition
            float r4 = r4 * r0
            float r4 = r4 + r1
            float r1 = (float) r3
            float r2 = (float) r2
            float r3 = r7.cueLine
            float r3 = r3 * r2
            float r3 = r3 + r1
            float r1 = r7.cueSize
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r1 = r7.cueBitmapHeight
            r5 = 1
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 == 0) goto L2a
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            goto L3f
        L2a:
            float r1 = (float) r0
            android.graphics.Bitmap r2 = r7.cueBitmap
            int r2 = r2.getHeight()
            float r2 = (float) r2
            android.graphics.Bitmap r5 = r7.cueBitmap
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r2 = r2 / r5
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
        L3f:
            int r2 = r7.cueLineAnchor
            r5 = 1
            r6 = 2
            if (r2 != r6) goto L48
            float r2 = (float) r0
        L46:
            float r4 = r4 - r2
            goto L4e
        L48:
            if (r2 != r5) goto L4e
            int r2 = r0 / 2
            float r2 = (float) r2
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r4)
            int r4 = r7.cuePositionAnchor
            if (r4 != r6) goto L59
            float r4 = (float) r1
        L57:
            float r3 = r3 - r4
            goto L5f
        L59:
            if (r4 != r5) goto L5f
            int r4 = r1 / 2
            float r4 = (float) r4
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r2
            int r1 = r1 + r3
            r4.<init>(r2, r3, r0, r1)
            r7.bitmapRect = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitlePainter.setupBitmapLayout():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    private void setupTextLayout() {
        ?? spannableStringBuilder;
        int iMax;
        int iMin;
        int i10;
        int iRound;
        int i11;
        int i12 = this.parentRight - this.parentLeft;
        int i13 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.textSizePx);
        int i14 = (int) ((this.textSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i15 = i14 * 2;
        int i16 = i12 - i15;
        float f10 = this.cueSize;
        if (f10 != Float.MIN_VALUE) {
            i16 = (int) (i16 * f10);
        }
        int i17 = i16;
        if (i17 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.applyEmbeddedFontSizes && this.applyEmbeddedStyles) {
            spannableStringBuilder = this.cueText;
        } else if (this.applyEmbeddedStyles) {
            spannableStringBuilder = new SpannableStringBuilder(this.cueText);
            int length = spannableStringBuilder.length();
            AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
            RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
            for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                spannableStringBuilder.removeSpan(absoluteSizeSpan);
            }
            for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                spannableStringBuilder.removeSpan(relativeSizeSpan);
            }
        } else {
            spannableStringBuilder = this.cueText.toString();
        }
        ?? r92 = spannableStringBuilder;
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(r92, this.textPaint, i17, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        for (int i18 = 0; i18 < lineCount; i18++) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i18)), iMax2);
        }
        if (this.cueSize == Float.MIN_VALUE || iMax2 >= i17) {
            i17 = iMax2;
        }
        int i19 = i17 + i15;
        float f11 = this.cuePosition;
        if (f11 != Float.MIN_VALUE) {
            int iRound2 = Math.round(i12 * f11);
            int i20 = this.parentLeft;
            int i21 = iRound2 + i20;
            int i22 = this.cuePositionAnchor;
            if (i22 == 2) {
                i21 -= i19;
            } else if (i22 == 1) {
                i21 = ((i21 * 2) - i19) / 2;
            }
            iMax = Math.max(i21, i20);
            iMin = Math.min(i19 + iMax, this.parentRight);
        } else {
            iMax = (i12 - i19) / 2;
            iMin = iMax + i19;
        }
        int i23 = iMin - iMax;
        if (i23 <= 0) {
            Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.cueLine;
        if (f12 != Float.MIN_VALUE) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i13 * f12);
                i11 = this.parentTop;
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f13 = this.cueLine;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom);
                    i11 = this.parentTop;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom);
                    i11 = this.parentBottom;
                }
            }
            i10 = iRound + i11;
            int i24 = this.cueLineAnchor;
            if (i24 == 2) {
                i10 -= height;
            } else if (i24 == 1) {
                i10 = ((i10 * 2) - height) / 2;
            }
            int i25 = i10 + height;
            int i26 = this.parentBottom;
            if (i25 > i26) {
                i10 = i26 - height;
            } else {
                int i27 = this.parentTop;
                if (i10 < i27) {
                    i10 = i27;
                }
            }
        } else {
            i10 = (this.parentBottom - height) - ((int) (i13 * this.bottomPaddingFraction));
        }
        this.textLayout = new StaticLayout(r92, this.textPaint, i23, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = i10;
        this.textPaddingX = i14;
    }

    public void draw(Cue cue, boolean z10, boolean z11, CaptionStyleCompat captionStyleCompat, float f10, float f11, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z12 = cue.bitmap == null;
        if (!z12) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i14 = (cue.windowColorSet && z10) ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.applyEmbeddedStyles == z10 && this.applyEmbeddedFontSizes == z11 && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i14 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.textSizePx == f10 && this.bottomPaddingFraction == f11 && this.parentLeft == i10 && this.parentTop == i11 && this.parentRight == i12 && this.parentBottom == i13) {
            drawLayout(canvas, z12);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.applyEmbeddedStyles = z10;
        this.applyEmbeddedFontSizes = z11;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i14;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.textSizePx = f10;
        this.bottomPaddingFraction = f11;
        this.parentLeft = i10;
        this.parentTop = i11;
        this.parentRight = i12;
        this.parentBottom = i13;
        if (z12) {
            setupTextLayout();
        } else {
            setupBitmapLayout();
        }
        drawLayout(canvas, z12);
    }
}
