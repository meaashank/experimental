package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class oK {
    private String Ht;
    private int NOt;
    private boolean TFq;
    private String ZRu;
    private int mZ;
    private double uR;

    public boolean Ht() {
        return this.TFq;
    }

    public String Mm() {
        return this.Ht;
    }

    public int NOt() {
        return this.NOt;
    }

    public boolean TFq() {
        return !TextUtils.isEmpty(this.ZRu) && this.NOt > 0 && this.mZ > 0;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        return this.mZ;
    }

    public double uR() {
        return this.uR;
    }

    public void NOt(int i10) {
        this.mZ = i10;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void NOt(String str) {
        this.Ht = str;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    public void ZRu(boolean z10) {
        this.TFq = z10;
    }
}
