package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private final List<ZRu<Integer, Integer>> NOt;
    private final List<ZRu<com.bytedance.adsdk.NOt.mZ.NOt.edo, Path>> ZRu;
    private final List<com.bytedance.adsdk.NOt.mZ.NOt.FA> mZ;

    public FA(List<com.bytedance.adsdk.NOt.mZ.NOt.FA> list) {
        this.mZ = list;
        this.ZRu = new ArrayList(list.size());
        this.NOt = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.ZRu.add(list.get(i10).NOt().ZRu());
            this.NOt.add(list.get(i10).mZ().ZRu());
        }
    }

    public List<ZRu<com.bytedance.adsdk.NOt.mZ.NOt.edo, Path>> NOt() {
        return this.ZRu;
    }

    public List<com.bytedance.adsdk.NOt.mZ.NOt.FA> ZRu() {
        return this.mZ;
    }

    public List<ZRu<Integer, Integer>> mZ() {
        return this.NOt;
    }
}
