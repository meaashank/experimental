package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.view.View;
import com.bytedance.sdk.openadsdk.Zf.ZRu.TFq;
import com.bytedance.sdk.openadsdk.core.model.qF;

/* JADX INFO: loaded from: classes3.dex */
public class FA extends NOt {
    private int uR;

    public FA(Integer num, View view, qF qFVar, TFq.ZRu zRu) {
        super(num, view, qFVar, 2000, zRu);
        this.uR = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public int Ht() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public void NOt(int i10) {
        if (Vor()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.uR = 0;
            FA();
        }
        if (i10 == 3 || i10 == 2) {
            this.uR = 2;
            FA();
        }
        if (this.uR == 1 || i10 != 0) {
            return;
        }
        this.uR = 1;
        ZRu();
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public void ZRu() {
        if (this.uR != 1) {
            return;
        }
        super.ZRu();
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public boolean lp() {
        int i10 = this.uR;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.mZ.set(false);
        }
        return !z10 || super.lp();
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public boolean mZ() {
        return Ht.ZRu(this.ZRu.get(), this.NOt.dkT()) && this.uR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.Zf.ZRu.NOt
    public void uR() {
        super.uR();
    }
}
