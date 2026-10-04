package com.bytedance.sdk.component.FA;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class Mm<V> extends FutureTask<V> implements Comparable<Mm<V>> {
    private int NOt;
    private int ZRu;

    public Mm(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.ZRu = i10 == -1 ? 5 : i10;
        this.NOt = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(Mm mm) {
        if (ZRu() < mm.ZRu()) {
            return 1;
        }
        return ZRu() > mm.ZRu() ? -1 : 0;
    }

    public int ZRu() {
        return this.ZRu;
    }

    public Mm(Runnable runnable, V v10, int i10, int i11) {
        super(runnable, v10);
        this.ZRu = i10 == -1 ? 5 : i10;
        this.NOt = i11;
    }
}
