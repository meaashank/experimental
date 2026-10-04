package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import com.bytedance.sdk.component.NOt.ZRu.FA;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements FA.ZRu {
    sAl NOt;
    List<com.bytedance.sdk.component.NOt.ZRu.FA> ZRu;
    int mZ = 0;

    public mZ(List<com.bytedance.sdk.component.NOt.ZRu.FA> list, sAl sal) {
        this.ZRu = list;
        this.NOt = sal;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.FA.ZRu
    public sAl ZRu() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.FA.ZRu
    public oK ZRu(sAl sal) throws IOException {
        this.NOt = sal;
        int i10 = this.mZ + 1;
        this.mZ = i10;
        if (i10 >= this.ZRu.size()) {
            return null;
        }
        return this.ZRu.get(this.mZ).ZRu(this);
    }
}
