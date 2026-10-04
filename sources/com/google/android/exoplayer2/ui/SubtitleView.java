package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends View implements TextOutput {
    private static final int ABSOLUTE = 2;
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    private static final int FRACTIONAL = 0;
    private static final int FRACTIONAL_IGNORE_PADDING = 1;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<SubtitlePainter> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public SubtitleView(Context context) {
        this(context, null);
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private CaptionStyleCompat getUserCaptionStyleV19() {
        return CaptionStyleCompat.createFromCaptionStyle(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    private void setTextSize(int i10, float f10) {
        if (this.textSizeType == i10 && this.textSize == f10) {
            return;
        }
        this.textSizeType = i10;
        this.textSize = f10;
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f10;
        List<Cue> list = this.cues;
        int i10 = 0;
        int size = list == null ? 0 : list.size();
        int top = getTop();
        int bottom = getBottom();
        int paddingLeft = getPaddingLeft() + getLeft();
        int paddingTop = getPaddingTop() + top;
        int paddingRight = getPaddingRight() + getRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom <= paddingTop || paddingRight <= paddingLeft) {
            return;
        }
        int i11 = this.textSizeType;
        if (i11 == 2) {
            f10 = this.textSize;
        } else {
            f10 = (i11 == 0 ? paddingBottom - paddingTop : bottom - top) * this.textSize;
        }
        float f11 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        while (i10 < size) {
            int i12 = paddingRight;
            this.painters.get(i10).draw(this.cues.get(i10), this.applyEmbeddedStyles, this.applyEmbeddedFontSizes, this.style, f11, this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, i12, paddingBottom);
            i10++;
            paddingRight = i12;
        }
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public void onCues(List<Cue> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        if (this.applyEmbeddedFontSizes == z10) {
            return;
        }
        this.applyEmbeddedFontSizes = z10;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        if (this.applyEmbeddedStyles == z10 && this.applyEmbeddedFontSizes == z10) {
            return;
        }
        this.applyEmbeddedStyles = z10;
        this.applyEmbeddedFontSizes = z10;
        invalidate();
    }

    public void setBottomPaddingFraction(float f10) {
        if (this.bottomPaddingFraction == f10) {
            return;
        }
        this.bottomPaddingFraction = f10;
        invalidate();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (this.cues == list) {
            return;
        }
        this.cues = list;
        int size = list == null ? 0 : list.size();
        while (this.painters.size() < size) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public void setFixedTextSize(int i10, float f10) {
        Context context = getContext();
        setTextSize(2, TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f10) {
        setFractionalTextSize(f10, false);
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        if (this.style == captionStyleCompat) {
            return;
        }
        this.style = captionStyleCompat;
        invalidate();
    }

    public void setUserDefaultStyle() {
        setStyle((Util.SDK_INT < 19 || isInEditMode()) ? CaptionStyleCompat.DEFAULT : getUserCaptionStyleV19());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(((Util.SDK_INT < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    public void setFractionalTextSize(float f10, boolean z10) {
        setTextSize(z10 ? 1 : 0, f10);
    }
}
