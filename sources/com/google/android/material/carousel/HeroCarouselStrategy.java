package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.colorspace.C2016d;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f10;
        float smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f10;
        float f11 = containerHeight;
        float fMin = Math.min(measuredWidth + f10, f11);
        float fD = O0.a.d((measuredWidth / 3.0f) + f10, CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f10, CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f10);
        float f12 = (fMin + fD) / 2.0f;
        int i10 = 0;
        int[] iArr = f11 < 2.0f * smallSizeMin ? new int[]{0} : SMALL_COUNTS;
        int iMax = (int) Math.max(1.0d, Math.floor(C2016d.a(smallSizeMax, CarouselStrategyHelper.maxValue(r0), f11, fMin)));
        int iCeil = (((int) Math.ceil(f11 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i11 = 0; i11 < iCeil; i11++) {
            iArr2[i11] = iMax + i11;
        }
        int i12 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fD, smallSizeMin, smallSizeMax, i12 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f12, i12 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr2);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fD, smallSizeMin, smallSizeMax, iArr, f12, MEDIUM_COUNTS, fMin, iArr2);
        } else {
            i10 = i12;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f10, f11, arrangementFindLowestCostArrangement, i10);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i10) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i10 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i10 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
