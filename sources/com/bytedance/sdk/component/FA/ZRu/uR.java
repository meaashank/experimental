package com.bytedance.sdk.component.FA.ZRu;

import com.bytedance.sdk.component.FA.ZRu.mZ;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class uR<T extends mZ> {
    private BlockingQueue<T> NOt = new LinkedBlockingQueue();
    private int ZRu;

    private uR(int i10) {
        this.ZRu = i10;
    }

    public static uR ZRu(int i10) {
        return new uR(i10);
    }

    public T ZRu() {
        return this.NOt.poll();
    }

    public boolean ZRu(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.ZRu();
        if (this.NOt.size() >= this.ZRu) {
            return false;
        }
        return this.NOt.offer(t10);
    }
}
