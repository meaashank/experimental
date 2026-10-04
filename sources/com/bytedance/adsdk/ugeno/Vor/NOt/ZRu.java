package com.bytedance.adsdk.ugeno.Vor.NOt;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.mZ;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends FrameLayout {
    private Map<Integer, aT> NOt;
    private mZ ZRu;

    public ZRu(Context context) {
        super(context);
    }

    public void ZRu(mZ mZVar) {
        this.ZRu = mZVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, aT> map = this.NOt;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.Ht();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mZ mZVar2 = this.ZRu;
        if (mZVar2 != null) {
            mZVar2.ZRu(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            super.onMeasure(iArrZRu[0], iArrZRu[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        mZ mZVar2 = this.ZRu;
        if (mZVar2 != null) {
            mZVar2.TFq();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setEventMap(Map<Integer, aT> map) {
        this.NOt = map;
    }
}
