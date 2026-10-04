package com.bytedance.sdk.component.TFq.uR;

import android.graphics.Bitmap;
import com.bykv.vk.openvk.preload.geckox.d.j;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends ZRu {
    private com.bytedance.sdk.component.TFq.Ht NOt;
    private byte[] ZRu;

    public TFq(byte[] bArr, com.bytedance.sdk.component.TFq.Ht ht) {
        this.ZRu = bArr;
        this.NOt = ht;
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public void ZRu(com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        com.bytedance.sdk.component.TFq.mZ.Ht htOm = mZVar.om();
        com.bytedance.sdk.component.TFq.mZ.NOt.ZRu ZRu = htOm.ZRu(mZVar);
        try {
            mZVar.xY();
            Bitmap bitmapZRu = ZRu.ZRu(this.ZRu);
            if (bitmapZRu == null) {
                ZRu(1002, "decode failed bitmap null", null, mZVar);
                return;
            }
            mZVar.ZRu(new sAl(bitmapZRu, this.NOt, false));
            htOm.ZRu(mZVar.OCA()).ZRu(mZVar.TFq(), bitmapZRu);
        } catch (Throwable th) {
            ZRu(1002, j.a(th, new StringBuilder("decode failed:")), th, mZVar);
        }
    }

    private void ZRu(int i10, String str, Throwable th, com.bytedance.sdk.component.TFq.mZ.mZ mZVar) {
        if (this.NOt == null) {
            mZVar.ZRu(new ZH());
        } else {
            mZVar.ZRu(new FA(i10, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.TFq.uR.Vor
    public String ZRu() {
        return "decode";
    }
}
