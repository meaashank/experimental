package com.bytedance.sdk.openadsdk.WMI.ZRu;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.component.utils.uR;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private Map<String, String> Ht;
    private byte[] NOt;
    private List<Object> TFq;
    int ZRu;
    private Bitmap mZ;
    private Bitmap uR;

    public NOt(byte[] bArr, int i10) {
        this.mZ = null;
        this.uR = null;
        this.TFq = null;
        this.Ht = null;
        this.NOt = bArr;
        this.ZRu = i10;
    }

    public Bitmap NOt() {
        return this.uR;
    }

    public Bitmap ZRu() {
        return this.mZ;
    }

    public byte[] mZ() {
        try {
            if (this.NOt == null) {
                this.NOt = uR.ZRu(this.mZ);
            }
        } catch (OutOfMemoryError e10) {
            lp.ZRu("GifRequestResult", e10.getMessage());
        }
        return this.NOt;
    }

    public boolean uR() {
        if (this.mZ != null) {
            return true;
        }
        byte[] bArr = this.NOt;
        return bArr != null && bArr.length > 0;
    }

    public NOt(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.NOt = null;
        this.TFq = null;
        this.Ht = null;
        this.uR = bitmap2;
        this.mZ = bitmap;
        this.ZRu = i10;
    }
}
