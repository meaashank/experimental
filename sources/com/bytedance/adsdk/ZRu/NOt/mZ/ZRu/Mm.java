package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.oK;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends Ht {
    private boolean ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque) {
        if ('-' != ZRu(i10, str)) {
            return com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ(ZRu(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.ZRu.NOt.uR.mZ.ZRu(deque.peek().ZRu())) {
            return false;
        }
        if (com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ(ZRu(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        char cZRu;
        if (!ZRu(str, i10, deque)) {
            return zRu.ZRu(str, i10, deque);
        }
        int i11 = ZRu(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cZRu = ZRu(i11, str);
            if (!com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ(cZRu) && (z10 || cZRu != '.')) {
                break;
            }
            i11++;
            if (cZRu == '.') {
                z10 = true;
            }
        }
        if (cZRu != '.') {
            deque.push(new oK(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
