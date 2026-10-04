package com.bytedance.sdk.component.TFq.mZ.ZRu.NOt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.TFq.qF;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements qF {
    private final com.bytedance.sdk.component.TFq.mZ.ZRu.NOt NOt;
    private final qF ZRu;

    public uR(qF qFVar) {
        this(qFVar, null);
    }

    public uR(qF qFVar, com.bytedance.sdk.component.TFq.mZ.ZRu.NOt nOt) {
        this.ZRu = qFVar;
        this.NOt = nOt;
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean NOt(String str) {
        return this.ZRu.NOt(str);
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public boolean ZRu(String str, Bitmap bitmap) {
        return this.ZRu.ZRu(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.TFq.ZRu
    public Bitmap ZRu(String str) {
        return this.ZRu.ZRu(str);
    }
}
