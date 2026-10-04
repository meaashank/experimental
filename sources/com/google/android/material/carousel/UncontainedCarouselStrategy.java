package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes4.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UncontainedCarouselStrategy() {
    }

    private float calculateMediumChildSize(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f11;
        if (fMax > f13) {
            fMax = Math.max(f13, f12 * 1.2f);
        }
        return Math.min(f11, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(float f10, float f11, float f12, int i10, float f13, float f14, float f15) {
        float fMin = Math.min(f14, f12);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f12, f11);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f13, f12, f11);
        float f16 = f13 / 2.0f;
        float f17 = (f15 + 0.0f) - f16;
        float f18 = f17 + f16;
        float f19 = fMin / 2.0f;
        float f20 = (i10 * f12) + f18;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f12, f10).addAnchorKeyline((f17 - f16) - f19, childMaskPercentage, fMin).addKeyline(f17, childMaskPercentage2, f13, false).addKeylineRange((f12 / 2.0f) + f18, 0.0f, f12, i10, true);
        builderAddKeylineRange.addKeyline(f16 + f20, childMaskPercentage2, f13, false);
        builderAddKeylineRange.addAnchorKeyline(f20 + f13 + f19, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f10, float f11, float f12, int i10, float f13, int i11, float f14) {
        float fMin = Math.min(f14, f12);
        float fMax = Math.max(fMin, 0.5f * f13);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f12, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f12, f10);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f13, f12, f10);
        float f15 = (i10 * f12) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f12, f11).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f12 / 2.0f, 0.0f, f12, i10, true);
        if (i11 > 0) {
            float f16 = (f13 / 2.0f) + f15;
            f15 += f13;
            builderAddKeylineRange.addKeyline(f16, childMaskPercentage3, f13, false);
        }
        builderAddKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f15, childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = measuredHeight;
        float f12 = f10;
        float f13 = f11 + f12;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f12;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f12;
        int iMax = Math.max(1, (int) Math.floor(containerWidth / f13));
        float f14 = containerWidth - (iMax * f13);
        if (carousel.getCarouselAlignment() == 1) {
            float f15 = f14 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f12, f13, iMax, Math.max(Math.min(3.0f * f15, f13), CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f12), extraSmallSize2, f15);
        }
        int i10 = 1;
        if (f14 <= 0.0f) {
            i10 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f12, containerWidth, f13, iMax, calculateMediumChildSize(extraSmallSize, f13, f14), i10, extraSmallSize2);
    }
}
