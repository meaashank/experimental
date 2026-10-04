package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        char cZRu;
        int i11 = i10;
        while (true) {
            cZRu = ZRu(i11, str);
            if (!com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.NOt(cZRu) && !com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ(cZRu)) {
                break;
            }
            i11++;
        }
        if (cZRu != '(') {
            return zRu.ZRu(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.aT(str.substring(i10, i11)));
        return i11 + 1;
    }
}
