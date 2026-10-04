package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends Ht {
    @Override // com.bytedance.adsdk.ZRu.NOt.mZ.ZRu.Ht
    public int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu) {
        com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRuPollFirst;
        if (')' != ZRu(i10, str)) {
            return zRu.ZRu(str, i10, deque);
        }
        LinkedList<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> linkedList = new LinkedList();
        while (true) {
            zRuPollFirst = deque.pollFirst();
            if (zRuPollFirst == null || zRuPollFirst.ZRu() == com.bytedance.adsdk.ZRu.NOt.uR.NOt.METHOD || zRuPollFirst.ZRu() == com.bytedance.adsdk.ZRu.NOt.uR.uR.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(zRuPollFirst);
        }
        if (zRuPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i10));
        }
        if (zRuPollFirst.ZRu() != com.bytedance.adsdk.ZRu.NOt.uR.NOt.METHOD) {
            deque.push(com.bytedance.adsdk.ZRu.NOt.TFq.NOt.ZRu(linkedList, str, i10));
            return i10 + 1;
        }
        com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.aT aTVar = (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.aT) zRuPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu2 : linkedList) {
            if (zRu2.ZRu() == com.bytedance.adsdk.ZRu.NOt.uR.uR.COMMA) {
                linkedList2.add(com.bytedance.adsdk.ZRu.NOt.TFq.NOt.ZRu(linkedList3, str, i10));
                linkedList3.clear();
            } else {
                linkedList3.addLast(zRu2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.ZRu.NOt.TFq.NOt.ZRu(linkedList3, str, i10));
        }
        aTVar.ZRu((com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[]) linkedList2.toArray(new com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[linkedList2.size()]));
        int i11 = i10 + 1;
        deque.push(aTVar);
        return i11;
    }
}
