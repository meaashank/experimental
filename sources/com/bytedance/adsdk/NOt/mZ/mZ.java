package com.bytedance.adsdk.NOt.mZ;

import android.graphics.Typeface;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class mZ {
    private final String NOt;
    private Typeface TFq;
    private final String ZRu;
    private final String mZ;
    private final float uR;

    public mZ(String str, String str2, String str3, float f10) {
        this.ZRu = str;
        this.NOt = str2;
        this.mZ = str3;
        this.uR = f10;
    }

    public String NOt() {
        return this.NOt;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public String mZ() {
        return this.mZ;
    }

    public Typeface uR() {
        return this.TFq;
    }

    public void ZRu(Typeface typeface) {
        this.TFq = typeface;
    }
}
