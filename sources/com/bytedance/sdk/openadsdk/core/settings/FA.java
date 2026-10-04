package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes3.dex */
public class FA implements Comparable<FA> {
    private final String FA;
    private final int Ht;
    private final int Mm;
    private final String NOt;
    private String TFq;
    private final String ZRu;
    private final int mZ;
    private final int uR;

    public FA(String str, String str2, int i10, int i11, String str3, int i12, int i13, String str4) {
        this.ZRu = str;
        this.NOt = str2;
        this.mZ = i10;
        this.uR = i11;
        this.TFq = str3;
        if (TextUtils.isEmpty(str3)) {
            this.TFq = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        this.Ht = i12;
        this.Mm = i13;
        this.FA = str4;
    }

    public int ZRu() {
        return this.Ht;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(FA fa2) {
        if (this.Ht < fa2.ZRu()) {
            return -1;
        }
        return this.Ht == fa2.ZRu() ? 0 : 1;
    }
}
