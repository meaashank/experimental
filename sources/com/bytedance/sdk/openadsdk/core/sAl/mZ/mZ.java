package com.bytedance.sdk.openadsdk.core.sAl.mZ;

import com.bytedance.sdk.component.utils.Ht;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends com.bytedance.sdk.openadsdk.NOt.NOt {
    public mZ(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.NOt.NOt, com.bytedance.sdk.openadsdk.NOt.ZRu
    public void ZRu(List<File> list) {
        int size = list.size();
        if (ZRu(0L, size)) {
            return;
        }
        for (File file : list) {
            Ht.mZ(file);
            size--;
            if (ZRu(file, 0L, size)) {
                return;
            }
        }
    }

    public mZ(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.ZRu = z10;
    }
}
