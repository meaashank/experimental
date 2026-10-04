package com.github.appintro.indicator;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.github.appintro.internal.LayoutUtil;
import dd.k;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressIndicatorController extends ProgressBar implements IndicatorController {
    private int selectedIndicatorColor;
    private int unselectedIndicatorColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public ProgressIndicatorController(@NotNull Context context) {
        this(context, null, 0, 6, null);
        G.p(context, "context");
    }

    private final boolean isRtl() {
        Context context = getContext();
        G.o(context, "this.context");
        return LayoutUtil.isRtl(context);
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
        setMax(i10);
        if (isRtl()) {
            setScaleX(-1.0f);
        }
        if (i10 == 1) {
            setVisibility(4);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    @NotNull
    public ProgressIndicatorController newInstance(@NotNull Context context) {
        G.p(context, "context");
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i10) {
        setProgress(isRtl() ? getMax() - i10 : i10 + 1);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i10) {
        this.selectedIndicatorColor = i10;
        getProgressDrawable().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i10) {
        this.unselectedIndicatorColor = i10;
        getIndeterminateDrawable().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public ProgressIndicatorController(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G.p(context, "context");
    }

    public /* synthetic */ ProgressIndicatorController(Context context, AttributeSet attributeSet, int i10, int i11, C4969v c4969v) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.progressBarStyleHorizontal : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public ProgressIndicatorController(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        G.p(context, "context");
        this.selectedIndicatorColor = 1;
        this.unselectedIndicatorColor = 1;
    }
}
