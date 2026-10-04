package com.bytedance.adsdk.NOt.mZ.NOt;

import android.graphics.Path;
import androidx.compose.animation.C1636p;

/* JADX INFO: loaded from: classes2.dex */
public class oK implements mZ {
    private final boolean Ht;
    private final Path.FillType NOt;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.uR TFq;
    private final boolean ZRu;
    private final String mZ;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.ZRu uR;

    public oK(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRu, com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar, boolean z11) {
        this.mZ = str;
        this.ZRu = z10;
        this.NOt = fillType;
        this.uR = zRu;
        this.TFq = uRVar;
        this.Ht = z11;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.ZRu NOt() {
        return this.uR;
    }

    public boolean TFq() {
        return this.Ht;
    }

    public String ZRu() {
        return this.mZ;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.uR mZ() {
        return this.TFq;
    }

    public String toString() {
        return C1636p.a(new StringBuilder("ShapeFill{color=, fillEnabled="), this.ZRu, '}');
    }

    public Path.FillType uR() {
        return this.NOt;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.NOt.mZ
    public com.bytedance.adsdk.NOt.ZRu.ZRu.mZ ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu) {
        return new com.bytedance.adsdk.NOt.ZRu.ZRu.Mm(vor, zRu, this);
    }
}
