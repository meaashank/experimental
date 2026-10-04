package com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt;

import com.bytedance.sdk.component.Ht.ZRu.uR.ZRu;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uR<T extends com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> {
    private Queue<T> NOt = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu ZRu;
    private Queue<String> mZ;
    private String uR;

    public uR(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu, Queue<String> queue, String str) {
        this.ZRu = zRu;
        this.mZ = queue;
        this.uR = str;
    }

    public synchronized boolean NOt(int i10, int i11) {
        int size = this.NOt.size();
        int iZRu = this.ZRu.ZRu();
        return (i10 == 2 || i10 == 1) ? com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.mZ() ? size > 0 : size >= iZRu : size >= iZRu;
    }

    public void ZRu(T t10) {
        Queue<T> queue = this.NOt;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int i10, int i11) {
        if (!NOt(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.ZRu.ZRu());
        do {
            T tPoll = this.NOt.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.ZRu.NOt());
        return arrayList;
    }

    public synchronized void ZRu(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.NOt.addAll(list);
        } else {
            this.NOt.size();
        }
    }
}
