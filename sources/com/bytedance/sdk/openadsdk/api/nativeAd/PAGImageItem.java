package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class PAGImageItem {
    private final int NOt;
    private final int ZRu;
    private final String mZ;
    private float uR;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = str;
        this.uR = f10;
    }

    public float getDuration() {
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

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
