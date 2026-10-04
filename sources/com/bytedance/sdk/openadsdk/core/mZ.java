package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static volatile mZ ZRu;

    private mZ() {
    }

    public static mZ ZRu(Context context) {
        if (ZRu == null) {
            synchronized (mZ.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new mZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public String NOt(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("ttopenadsdk", str, str2);
    }

    public int NOt(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("ttopenadsdk", str, i10);
    }

    public Long NOt(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("ttopenadsdk", str, j10));
    }

    public void ZRu(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("ttopenadsdk", str, str2);
    }

    public void ZRu(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void ZRu(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("ttopenadsdk", str, Long.valueOf(j10));
    }
}
