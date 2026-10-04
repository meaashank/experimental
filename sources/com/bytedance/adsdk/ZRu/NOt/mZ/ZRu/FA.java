package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import androidx.activity.result.i;
import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.yBV;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        if (!com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.uR(ZRu(i10, str))) {
            return zRu.ZRu(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{ZRu(i10, str), ZRu(i11, str)});
        if (com.bytedance.adsdk.ZRu.NOt.uR.mZ.ZRu(str2) != null) {
            deque.push(new yBV(com.bytedance.adsdk.ZRu.NOt.uR.mZ.ZRu(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(ZRu(i10, str));
        if (com.bytedance.adsdk.ZRu.NOt.uR.mZ.ZRu(strValueOf) != null) {
            deque.push(new yBV(com.bytedance.adsdk.ZRu.NOt.uR.mZ.ZRu(strValueOf)));
            return i11;
        }
        StringBuilder sbA = i.a("Unrecognized:", strValueOf, "examine:");
        sbA.append(str.substring(0, i10));
        throw new IllegalArgumentException(sbA.toString());
    }
}
