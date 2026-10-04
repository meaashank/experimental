package com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements View.OnTouchListener {
    private static int mZ = 10;
    private float NOt;
    private int TFq;
    private float ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.mZ.FA uR;
    private RectF Ht = new RectF();
    private long Mm = 0;
    private final int FA = 200;
    private final int Vor = 3;
    private SoftReference<ViewGroup> aT = new SoftReference<>(null);

    public ZRu(com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2, int i10, final ViewGroup viewGroup) {
        this.TFq = mZ;
        this.uR = fa2;
        if (i10 > 0) {
            this.TFq = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.ZRu.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.this.aT = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Ht = ZRu(this.aT.get());
            this.ZRu = motionEvent.getRawX();
            this.NOt = motionEvent.getRawY();
            this.Mm = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.Ht;
            if (rectF != null && !rectF.contains(this.ZRu, this.NOt)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.ZRu);
            float fAbs2 = Math.abs(rawY - this.NOt);
            int i10 = this.TFq;
            if (fAbs >= i10 && fAbs2 >= i10) {
                com.bytedance.sdk.component.adexpress.dynamic.mZ.FA fa3 = this.uR;
                if (fa3 != null) {
                    fa3.ZRu();
                }
            } else if ((System.currentTimeMillis() - this.Mm < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (fa2 = this.uR) != null) {
                fa2.ZRu();
            }
        }
        return true;
    }

    private RectF ZRu(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
