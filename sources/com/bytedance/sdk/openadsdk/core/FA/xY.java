package com.bytedance.sdk.openadsdk.core.FA;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.aT;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class xY extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.NOt.Ht NOt;
    private final ZRu ZRu;

    public static class ZRu extends GestureDetector.SimpleOnGestureListener {
        boolean ZRu = false;

        public boolean NOt() {
            return this.ZRu;
        }

        public void ZRu() {
            this.ZRu = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.ZRu = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public xY(Context context) {
        this(context, new ZRu());
    }

    public boolean NOt() {
        return this.ZRu.NOt();
    }

    public void ZRu() {
        this.ZRu.ZRu();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.NOt.ZRu(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public xY(Context context, ZRu zRu) {
        super(context, zRu);
        this.ZRu = zRu;
        this.NOt = new com.bytedance.sdk.openadsdk.core.NOt.Ht();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.aT ZRu(Context context, View view, View view2) {
        if (this.NOt == null) {
            return new aT.ZRu().ZRu();
        }
        return new aT.ZRu().Ht(this.NOt.ZRu).TFq(this.NOt.NOt).uR(this.NOt.mZ).mZ(this.NOt.uR).NOt(this.NOt.TFq).ZRu(this.NOt.Ht).NOt(Cox.ZRu(view)).ZRu(Cox.ZRu(view2)).mZ(Cox.mZ(view)).uR(Cox.mZ(view2)).uR(this.NOt.Mm).TFq(this.NOt.FA).Ht(this.NOt.Vor).ZRu(this.NOt.lp).NOt(com.bytedance.sdk.openadsdk.core.Vor.NOt().ZRu() ? 1 : 2).ZRu("vessel").ZRu(Cox.TFq(context)).mZ(Cox.Mm(context)).NOt(Cox.Ht(context)).ZRu();
    }
}
