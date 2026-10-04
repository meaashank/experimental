package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes3.dex */
public class PAGErrorModel {
    private final String NOt;
    private final int ZRu;

    public PAGErrorModel(int i10, String str) {
        this.ZRu = i10;
        this.NOt = str;
    }

    public int getErrorCode() {
        return this.ZRu;
    }

    public String getErrorMessage() {
        return this.NOt;
    }
}
