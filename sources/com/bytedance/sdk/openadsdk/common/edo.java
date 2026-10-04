package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class edo extends View {
    private View NOt;
    private final ZRu ZRu;

    public interface ZRu {
        View ZRu(Context context);
    }

    public edo(Context context, ZRu zRu) {
        super(context);
        this.ZRu = zRu;
        ZRu();
    }

    private View NOt() {
        ZRu zRu;
        if (this.NOt == null && (zRu = this.ZRu) != null) {
            this.NOt = zRu.ZRu(getContext());
            ZRu(this.NOt, (ViewGroup) getParent());
        }
        return this.NOt;
    }

    private void ZRu() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.NOt;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            NOt();
        }
    }

    private void ZRu(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
