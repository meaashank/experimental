package com.bytedance.sdk.component.TFq.mZ.ZRu.NOt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.TFq.qF;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements qF {
    private int NOt;
    private int ZRu;
    private com.bytedance.sdk.component.TFq.mZ.ZRu.mZ<String, Bitmap> mZ;

    public NOt(int i10, int i11) {
        this.NOt = i10;
        this.ZRu = i11;
        this.mZ = new com.bytedance.sdk.component.TFq.mZ.ZRu.mZ<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.TFq.mZ.ZRu.NOt.NOt.1
            @Override // com.bytedance.sdk.component.TFq.mZ.ZRu.mZ
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public int NOt(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return NOt.ZRu(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean NOt(String str) {
        return this.mZ.ZRu(str) != null;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean ZRu(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.mZ.ZRu(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public Bitmap ZRu(String str) {
        return this.mZ.ZRu(str);
    }

    public static int ZRu(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
