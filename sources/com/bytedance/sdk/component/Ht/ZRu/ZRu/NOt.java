package com.bytedance.sdk.component.Ht.ZRu.ZRu;

import com.bytedance.sdk.component.Ht.ZRu.FA;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu {
    private final mZ NOt;
    private final uR ZRu;
    private final Queue<String> mZ;

    public NOt() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.mZ = concurrentLinkedQueue;
        this.ZRu = new Ht(concurrentLinkedQueue);
        this.NOt = new mZ();
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public synchronized void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        uR uRVar;
        if (i10 != 5) {
            try {
                if (FA.Mm().yBV().ZRu(FA.Mm().Ht()) && (uRVar = this.ZRu) != null && zRu != null) {
                    uRVar.ZRu(zRu, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mZ mZVar = this.NOt;
        if (mZVar != null && zRu != null) {
            mZVar.ZRu(zRu, i10);
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public synchronized void ZRu(int i10, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        try {
            Iterator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> it = list.iterator();
            while (it.hasNext()) {
                this.mZ.remove(it.next().mZ());
            }
            uR uRVar = this.ZRu;
            if (uRVar != null) {
                uRVar.ZRu(i10, list);
            }
            mZ mZVar = this.NOt;
            if (mZVar != null) {
                mZVar.ZRu(i10, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:64:0x0148, B:67:0x014f, B:68:0x0153, B:70:0x0159, B:74:0x016b, B:11:0x0019, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:21:0x0054, B:22:0x005f, B:24:0x0065, B:26:0x0072, B:28:0x0084, B:29:0x008c, B:30:0x0090, B:32:0x0096, B:33:0x00a4, B:34:0x00af, B:36:0x00b5, B:37:0x00c3, B:38:0x00c8, B:40:0x00d1, B:42:0x00d7, B:43:0x00da, B:45:0x00e2, B:47:0x00e8, B:48:0x00f1, B:50:0x00f7, B:51:0x0105, B:53:0x010e, B:55:0x0114, B:57:0x0122, B:58:0x0126, B:59:0x0131, B:61:0x0137), top: B:79:0x0001 }] */
    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int r9, int r10, java.util.List<java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.ZRu(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public synchronized boolean ZRu(int i10, boolean z10) {
        if (this.ZRu.ZRu(i10, z10)) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.WD(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.NOt.ZRu(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.fWk(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(int i10, long j10) {
        this.NOt.ZRu(i10, j10);
        this.ZRu.ZRu(i10, j10);
    }
}
