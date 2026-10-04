package com.bytedance.adsdk.NOt.mZ.ZRu;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class edo<V, O> implements sAl<V, O> {
    final List<com.bytedance.adsdk.NOt.Mm.ZRu<V>> ZRu;

    public edo(List<com.bytedance.adsdk.NOt.Mm.ZRu<V>> list) {
        this.ZRu = list;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public boolean NOt() {
        return this.ZRu.isEmpty() || (this.ZRu.size() == 1 && this.ZRu.get(0).TFq());
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public List<com.bytedance.adsdk.NOt.Mm.ZRu<V>> mZ() {
        return this.ZRu;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.ZRu.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.ZRu.toArray()));
        }
        return sb2.toString();
    }
}
