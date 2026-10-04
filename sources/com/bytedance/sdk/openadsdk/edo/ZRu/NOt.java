package com.bytedance.sdk.openadsdk.edo.ZRu;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.Yx;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private String Ht;
    private int Mm;
    private qF NOt;
    private boolean TFq;
    private String ZRu;
    private String mZ;
    private int uR;
    private int FA = 0;
    private int Vor = 0;

    public int FA() {
        return this.FA;
    }

    public String Ht() {
        return this.Ht;
    }

    public int Mm() {
        return this.Mm;
    }

    public qF NOt() {
        return this.NOt;
    }

    public boolean TFq() {
        return this.TFq;
    }

    public int Vor() {
        return this.Vor;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public String mZ() {
        qF qFVar;
        if (TextUtils.isEmpty(this.mZ) && (qFVar = this.NOt) != null) {
            this.mZ = Yx.ZRu(qFVar);
        }
        return this.mZ;
    }

    public int uR() {
        return this.uR;
    }

    public void NOt(String str) {
        this.mZ = str;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void uR(int i10) {
        this.Vor = i10;
    }

    public void NOt(int i10) {
        this.Mm = i10;
    }

    public void ZRu(qF qFVar) {
        this.NOt = qFVar;
    }

    public void ZRu(int i10) {
        this.uR = i10;
    }

    public void ZRu(boolean z10) {
        this.TFq = z10;
    }

    public void mZ(String str) {
        this.Ht = str;
    }

    public void mZ(int i10) {
        this.FA = i10;
    }
}
