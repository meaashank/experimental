package com.bytedance.adsdk.NOt.ZRu.ZRu;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private final List<to> ZRu = new ArrayList();

    public void ZRu(to toVar) {
        this.ZRu.add(toVar);
    }

    public void ZRu(Path path) {
        for (int size = this.ZRu.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.NOt.Ht.Ht.ZRu(path, this.ZRu.get(size));
        }
    }
}
