package com.bytedance.adsdk.NOt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lp<V> {
    private final Throwable NOt;
    private final V ZRu;

    public lp(V v10) {
        this.ZRu = v10;
        this.NOt = null;
    }

    public Throwable NOt() {
        return this.NOt;
    }

    public V ZRu() {
        return this.ZRu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        if (ZRu() != null && ZRu().equals(lpVar.ZRu())) {
            return true;
        }
        if (NOt() == null || lpVar.NOt() == null) {
            return false;
        }
        return NOt().toString().equals(NOt().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{ZRu(), NOt()});
    }

    public lp(Throwable th) {
        this.NOt = th;
        this.ZRu = null;
    }
}
