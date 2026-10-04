package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class qF {
    private int Ht;
    private int Mm;
    private float TFq;
    private boolean ZH;
    private final ZRu ZRu;
    private float uR;
    private final boolean NOt = false;
    private boolean mZ = false;
    private boolean FA = true;
    private boolean Vor = false;
    private final View.OnTouchListener aT = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qF.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (qF.this.ZRu.Zf()) {
                return !qF.this.mZ;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                qF qFVar = qF.this;
                qFVar.ZH = qFVar.ZRu(motionEvent);
                qF.this.uR = x10;
                qF.this.TFq = y10;
                qF.this.Ht = (int) x10;
                qF.this.Mm = (int) y10;
                qF.this.FA = true;
                if (qF.this.ZRu != null && qF.this.mZ) {
                    qF.this.ZRu.ZRu(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - qF.this.Ht) > 20.0f || Math.abs(y10 - qF.this.Mm) > 20.0f) {
                    qF.this.FA = false;
                }
                qF.this.FA = true;
                qF.this.Vor = false;
                qF.this.uR = 0.0f;
                qF.this.TFq = 0.0f;
                qF.this.Ht = 0;
                if (qF.this.ZRu != null) {
                    qF.this.ZRu.ZRu(view, qF.this.FA);
                }
                qF.this.ZH = false;
            } else if (action == 3) {
                qF.this.ZH = false;
            }
            return !qF.this.mZ;
        }
    };

    public interface ZRu {
        void ZRu(View view, boolean z10);

        boolean Zf();
    }

    public qF(ZRu zRu) {
        this.ZRu = zRu;
    }

    public void ZRu(View view) {
        if (view != null) {
            view.setOnTouchListener(this.aT);
        }
    }

    public void ZRu(boolean z10) {
        this.mZ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ZRu(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iMZ = Cox.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu().getApplicationContext());
        int iUR = Cox.uR(com.bytedance.sdk.openadsdk.core.WMI.ZRu().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iMZ;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iUR;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
