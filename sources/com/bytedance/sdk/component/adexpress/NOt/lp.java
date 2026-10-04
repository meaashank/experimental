package com.bytedance.sdk.component.adexpress.NOt;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.NOt.aT;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lp implements aT.ZRu {

    @NonNull
    private List<aT> NOt;
    oK ZRu;
    private Vor mZ;
    private AtomicBoolean uR = new AtomicBoolean(false);

    public lp(List<aT> list, Vor vor) {
        this.NOt = list;
        this.mZ = vor;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public boolean NOt(aT aTVar) {
        int iIndexOf = this.NOt.indexOf(aTVar);
        return iIndexOf < this.NOt.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public void ZRu() {
        this.mZ.uR();
        Iterator<aT> it = this.NOt.iterator();
        while (it.hasNext() && !it.next().ZRu(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public boolean mZ() {
        return this.uR.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public oK NOt() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public void ZRu(aT aTVar) {
        int iIndexOf = this.NOt.indexOf(aTVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.NOt.size()) {
                return;
            }
        } while (!this.NOt.get(iIndexOf).ZRu(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public void ZRu(oK oKVar) {
        this.ZRu = oKVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT.ZRu
    public void ZRu(boolean z10) {
        this.uR.getAndSet(z10);
    }
}
