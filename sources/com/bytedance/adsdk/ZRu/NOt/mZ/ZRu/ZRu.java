package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.to;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        if (',' != ZRu(i10, str)) {
            return zRu.ZRu(str, i10, deque);
        }
        deque.push(new to(com.bytedance.adsdk.ZRu.NOt.uR.uR.COMMA));
        return i10 + 1;
    }
}
