package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.xY;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        return !com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.NOt(ZRu(i10, str)) ? zRu.ZRu(str, i10, deque) : ZRu(str, i10, deque);
    }

    private int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cZRu = ZRu(i11, str);
            if (!com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.NOt(cZRu) && !com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ(cZRu) && '.' != cZRu && '[' != cZRu && ']' != cZRu && '_' != cZRu && '-' != cZRu) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.ZRu.NOt.uR.ZRu.ZRu(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.Mm(strSubstring));
            return i11;
        }
        deque.push(new xY(strSubstring));
        return i11;
    }
}
