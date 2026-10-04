package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.OCA;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        if ('\'' != ZRu(i10, str)) {
            return zRu.ZRu(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && ZRu(i12, str) != '\'') {
            i12++;
        }
        if (ZRu(i12, str) != '\'') {
            throw new com.bytedance.adsdk.ZRu.ZRu.ZRu("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new OCA(str.substring(i11, i12)));
        return i12 + 1;
    }
}
