package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes3.dex */
public class TTImage {
    private final int NOt;
    private final int ZRu;
    private final String mZ;
    private double uR;

    public TTImage(int i10, int i11, String str, double d10) {
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = str;
        this.uR = d10;
    }

    public double getDuration() {
        return this.uR;
    }

    public int getHeight() {
        return this.ZRu;
    }

    public String getImageUrl() {
        return this.mZ;
    }

    public int getWidth() {
        return this.NOt;
    }

    public boolean isValid() {
        String str;
        return this.ZRu > 0 && this.NOt > 0 && (str = this.mZ) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
