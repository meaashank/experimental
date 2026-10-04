package com.github.appintro.indicator;

import B0.C0920d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.appintro.R;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DotIndicatorController extends LinearLayout implements IndicatorController {
    private int currentPosition;
    private int selectedIndicatorColor;
    private int slideCount;
    private int unselectedIndicatorColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotIndicatorController(@NotNull Context context) {
        super(context);
        G.p(context, "context");
        this.selectedIndicatorColor = C0920d.getColor(context, R.color.appintro_default_selected_color);
        this.unselectedIndicatorColor = C0920d.getColor(context, R.color.appintro_default_unselected_color);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getSelectedIndicatorColor() {
        return this.selectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getUnselectedIndicatorColor() {
        return this.unselectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void initialize(int i10) {
        this.slideCount = i10;
        int i11 = 0;
        while (i11 < i10) {
            i11++;
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(C0920d.getDrawable(getContext(), R.drawable.ic_appintro_indicator));
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i10 == 1) {
                imageView.setVisibility(4);
            }
            addView(imageView, layoutParams);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    @NotNull
    public View newInstance(@NotNull Context context) {
        G.p(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(17);
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i10) {
        this.currentPosition = i10;
        int i11 = this.slideCount;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int selectedIndicatorColor = i12 == i10 ? getSelectedIndicatorColor() : getUnselectedIndicatorColor();
            View childAt = getChildAt(i12);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) childAt).getDrawable().setTint(selectedIndicatorColor);
            i12 = i13;
        }
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i10) {
        this.selectedIndicatorColor = i10;
        selectPosition(this.currentPosition);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i10) {
        this.unselectedIndicatorColor = i10;
        selectPosition(this.currentPosition);
    }
}
