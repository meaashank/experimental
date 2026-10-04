package com.bytedance.sdk.component.Vor.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private static volatile ZRu NOt;
    private volatile NOt ZRu;

    private ZRu() {
    }

    public static ZRu ZRu() {
        if (NOt == null) {
            synchronized (ZRu.class) {
                try {
                    if (NOt == null) {
                        NOt = new ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public NOt NOt() {
        return this.ZRu;
    }

    public void ZRu(NOt nOt) {
        this.ZRu = nOt;
    }
}
