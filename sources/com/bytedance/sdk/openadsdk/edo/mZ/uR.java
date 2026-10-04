package com.bytedance.sdk.openadsdk.edo.mZ;

/* JADX INFO: loaded from: classes3.dex */
class uR implements NOt {
    private static volatile uR ZRu;

    private uR() {
    }

    @Override // com.bytedance.sdk.openadsdk.edo.mZ.NOt
    public void ZRu(com.bytedance.sdk.openadsdk.edo.NOt nOt) {
    }

    @Override // com.bytedance.sdk.openadsdk.edo.mZ.NOt
    public void ZRu(com.bytedance.sdk.openadsdk.edo.NOt nOt, boolean z10) {
    }

    public static uR ZRu() {
        if (ZRu == null) {
            synchronized (uR.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }
}
