package com.bytedance.adsdk.ZRu.NOt.mZ.ZRu;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ht {
    public int NOt(int i10, String str) {
        while (com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.ZRu(ZRu(i10, str))) {
            i10++;
        }
        return i10;
    }

    public char ZRu(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int ZRu(String str, int i10, Deque<com.bytedance.adsdk.ZRu.NOt.NOt.ZRu> deque, com.bytedance.adsdk.ZRu.NOt.mZ.ZRu zRu);
}
