package com.bytedance.sdk.component.Ht.ZRu.Ht;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private String FA;
    private final String Ht;
    private String Mm;
    private final String NOt;
    private final int TFq;
    private boolean ZH;
    private final String ZRu;
    private final boolean mZ;
    private int uR = -1;
    private int Vor = 0;
    private String aT = null;

    public uR(String str, String str2, boolean z10, int i10, String str3) {
        this.ZRu = str;
        this.NOt = str2;
        this.mZ = z10;
        this.TFq = i10;
        this.Ht = str3;
    }

    public int FA() {
        return this.Vor;
    }

    public String Ht() {
        return this.Ht;
    }

    public String Mm() {
        return this.Mm;
    }

    public String NOt() {
        return this.NOt;
    }

    public int TFq() {
        return this.TFq;
    }

    public String Vor() {
        return this.FA;
    }

    public boolean ZH() {
        return this.uR == -1;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean aT() {
        return this.ZH;
    }

    public boolean mZ() {
        return this.mZ;
    }

    public int uR() {
        return this.uR;
    }

    public void NOt(int i10) {
        this.Vor = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.Mm)) {
            this.Mm = String.valueOf(this.Vor);
            return;
        }
        this.Mm += "," + this.Vor;
    }

    public void ZRu(int i10) {
        this.uR = i10;
    }

    public void mZ(String str) {
        this.aT = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.FA)) {
            this.FA = String.valueOf(this.aT);
            return;
        }
        this.FA += "," + this.aT;
    }

    public void ZRu(String str) {
        this.Mm = str;
    }

    public void ZRu(boolean z10) {
        this.ZH = z10;
    }

    public Runnable ZRu(String str, Map<String, String> map) {
        return ZRu.ZRu().ZRu(this, str, map);
    }

    public void NOt(String str) {
        this.FA = str;
    }
}
