package com.bytedance.sdk.component.TFq.mZ.ZRu.NOt;

import com.bytedance.sdk.component.TFq.om;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements om {
    private int NOt;
    private int ZRu;
    private com.bytedance.sdk.component.TFq.mZ.ZRu.mZ<String, byte[]> mZ;

    public mZ(int i10, int i11) {
        this.NOt = i10;
        this.ZRu = i11;
        this.mZ = new com.bytedance.sdk.component.TFq.mZ.ZRu.mZ<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.TFq.mZ.ZRu.NOt.mZ.1
            @Override // com.bytedance.sdk.component.TFq.mZ.ZRu.mZ
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public int NOt(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean NOt(String str) {
        return this.mZ.ZRu(str) != null;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean ZRu(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.mZ.ZRu(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public byte[] ZRu(String str) {
        return this.mZ.ZRu(str);
    }
}
