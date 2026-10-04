package com.bytedance.adsdk.NOt.Ht;

import android.view.Choreographer;
import com.bytedance.adsdk.NOt.Mm;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ZRu implements Choreographer.FrameCallback {
    private Mm aT;
    private float NOt = 1.0f;
    private boolean mZ = false;
    private long uR = 0;
    private float TFq = 0.0f;
    private float Ht = 0.0f;
    private int Mm = 0;
    private float FA = -2.1474836E9f;
    private float Vor = 2.1474836E9f;
    protected boolean ZRu = false;
    private boolean ZH = false;

    private boolean OCA() {
        return aT() < 0.0f;
    }

    private float om() {
        Mm mm = this.aT;
        if (mm == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / mm.lp()) / Math.abs(this.NOt);
    }

    private void to() {
        if (this.aT == null) {
            return;
        }
        float f10 = this.Ht;
        if (f10 < this.FA || f10 > this.Vor) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.FA), Float.valueOf(this.Vor), Float.valueOf(this.Ht)));
        }
    }

    public void FA() {
        this.aT = null;
        this.FA = -2.1474836E9f;
        this.Vor = 2.1474836E9f;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float Ht() {
        Mm mm = this.aT;
        if (mm == null) {
            return 0.0f;
        }
        return (this.Ht - mm.Ht()) / (this.aT.Mm() - this.aT.Ht());
    }

    public float Mm() {
        return this.Ht;
    }

    public void NOt(float f10) {
        ZRu(this.FA, f10);
    }

    public void Vor() {
        mZ(-aT());
    }

    public void WMI() {
        if (isRunning()) {
            uR(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void ZH() {
        this.ZRu = true;
        ZRu(OCA());
        ZRu((int) (OCA() ? yBV() : oK()));
        this.uR = 0L;
        this.Mm = 0;
        WMI();
    }

    public void ZRu(Mm mm) {
        boolean z10 = this.aT == null;
        this.aT = mm;
        if (z10) {
            ZRu(Math.max(this.FA, mm.Ht()), Math.min(this.Vor, mm.Mm()));
        } else {
            ZRu((int) mm.Ht(), (int) mm.Mm());
        }
        float f10 = this.Ht;
        this.Ht = 0.0f;
        this.TFq = 0.0f;
        ZRu((int) f10);
        mZ();
    }

    public float aT() {
        return this.NOt;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        NOt();
        qF();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        WMI();
        if (this.aT == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.NOt.TFq.ZRu("LottieValueAnimator#doFrame");
        float fOm = (this.uR != 0 ? j10 - r1 : 0L) / om();
        float f10 = this.TFq;
        if (OCA()) {
            fOm = -fOm;
        }
        float f11 = f10 + fOm;
        boolean zMZ = TFq.mZ(f11, oK(), yBV());
        float f12 = this.TFq;
        float fNOt = TFq.NOt(f11, oK(), yBV());
        this.TFq = fNOt;
        if (this.ZH) {
            fNOt = (float) Math.floor(fNOt);
        }
        this.Ht = fNOt;
        this.uR = j10;
        if (!this.ZH || this.TFq != f12) {
            mZ();
        }
        if (!zMZ) {
            if (getRepeatCount() == -1 || this.Mm < getRepeatCount()) {
                ZRu();
                this.Mm++;
                if (getRepeatMode() == 2) {
                    this.mZ = !this.mZ;
                    Vor();
                } else {
                    float fYBV = OCA() ? yBV() : oK();
                    this.TFq = fYBV;
                    this.Ht = fYBV;
                }
                this.uR = j10;
            } else {
                float fOK = this.NOt < 0.0f ? oK() : yBV();
                this.TFq = fOK;
                this.Ht = fOK;
                qF();
                NOt(OCA());
            }
        }
        to();
        com.bytedance.adsdk.NOt.TFq.NOt("LottieValueAnimator#doFrame");
    }

    @MainThread
    public void edo() {
        this.ZRu = true;
        WMI();
        this.uR = 0L;
        if (OCA() && Mm() == oK()) {
            ZRu(yBV());
        } else if (!OCA() && Mm() == yBV()) {
            ZRu(oK());
        }
        TFq();
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float fOK;
        float fYBV;
        float fOK2;
        if (this.aT == null) {
            return 0.0f;
        }
        if (OCA()) {
            fOK = yBV() - this.Ht;
            fYBV = yBV();
            fOK2 = oK();
        } else {
            fOK = this.Ht - oK();
            fYBV = yBV();
            fOK2 = oK();
        }
        return fOK / (fYBV - fOK2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(Ht());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        Mm mm = this.aT;
        if (mm == null) {
            return 0L;
        }
        return (long) mm.TFq();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.ZRu;
    }

    @MainThread
    public void lp() {
        qF();
        NOt(OCA());
    }

    public void mZ(boolean z10) {
        this.ZH = z10;
    }

    public float oK() {
        Mm mm = this.aT;
        if (mm == null) {
            return 0.0f;
        }
        float f10 = this.FA;
        return f10 == -2.1474836E9f ? mm.Ht() : f10;
    }

    @MainThread
    public void qF() {
        uR(true);
    }

    @MainThread
    public void sAl() {
        qF();
        uR();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.mZ) {
            return;
        }
        this.mZ = false;
        Vor();
    }

    @MainThread
    public void uR(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.ZRu = false;
        }
    }

    public float yBV() {
        Mm mm = this.aT;
        if (mm == null) {
            return 0.0f;
        }
        float f10 = this.Vor;
        return f10 == 2.1474836E9f ? mm.Mm() : f10;
    }

    @Override // com.bytedance.adsdk.NOt.Ht.ZRu
    public void NOt() {
        super.NOt();
        NOt(OCA());
    }

    public void mZ(float f10) {
        this.NOt = f10;
    }

    public void ZRu(float f10) {
        if (this.TFq == f10) {
            return;
        }
        float fNOt = TFq.NOt(f10, oK(), yBV());
        this.TFq = fNOt;
        if (this.ZH) {
            fNOt = (float) Math.floor(fNOt);
        }
        this.Ht = fNOt;
        this.uR = 0L;
        mZ();
    }

    public void ZRu(int i10) {
        ZRu(i10, (int) this.Vor);
    }

    public void ZRu(float f10, float f11) {
        if (f10 <= f11) {
            Mm mm = this.aT;
            float fHt = mm == null ? -3.4028235E38f : mm.Ht();
            Mm mm2 = this.aT;
            float fMm = mm2 == null ? Float.MAX_VALUE : mm2.Mm();
            float fNOt = TFq.NOt(f10, fHt, fMm);
            float fNOt2 = TFq.NOt(f11, fHt, fMm);
            if (fNOt == this.FA && fNOt2 == this.Vor) {
                return;
            }
            this.FA = fNOt;
            this.Vor = fNOt2;
            ZRu((int) TFq.NOt(this.Ht, fNOt, fNOt2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
