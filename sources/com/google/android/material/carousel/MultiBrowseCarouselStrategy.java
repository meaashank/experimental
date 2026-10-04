package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.colorspace.C2016d;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i10) {
        int itemCount = arrangement.getItemCount() - i10;
        boolean z10 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i11 = arrangement.smallCount;
            if (i11 > 0) {
                arrangement.smallCount = i11 - 1;
            } else {
                int i12 = arrangement.mediumCount;
                if (i12 > 1) {
                    arrangement.mediumCount = i12 - 1;
                }
            }
            itemCount--;
        }
        return z10;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        float f10 = containerHeight;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f12;
        float smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f12;
        float fMin = Math.min(measuredHeight + f12, f10);
        float fD = O0.a.d((measuredHeight / 3.0f) + f12, CarouselStrategyHelper.getSmallSizeMin(view.getContext()) + f12, CarouselStrategyHelper.getSmallSizeMax(view.getContext()) + f12);
        float f13 = (fMin + fD) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        if (f10 < 2.0f * smallSizeMin) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        int iMax = (int) Math.max(1.0d, Math.floor(C2016d.a(smallSizeMax, CarouselStrategyHelper.maxValue(iArr2), f10 - (CarouselStrategyHelper.maxValue(iArr) * f13), fMin)));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, fD, smallSizeMin, smallSizeMax, iArr2, f13, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount())) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, fD, smallSizeMin, smallSizeMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f13, new int[]{arrangementFindLowestCostArrangement.mediumCount}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f12, f10, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i10) {
        if (i10 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i10 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
