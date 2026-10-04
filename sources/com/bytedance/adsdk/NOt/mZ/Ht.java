package com.bytedance.adsdk.NOt.mZ;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    public final float NOt;
    public final float ZRu;
    private final String mZ;

    public Ht(String str, float f10, float f11) {
        this.mZ = str;
        this.NOt = f11;
        this.ZRu = f10;
    }

    public boolean ZRu(String str) {
        if (this.mZ.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.mZ.endsWith("\r")) {
            String str2 = this.mZ;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
