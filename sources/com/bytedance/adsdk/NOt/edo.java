package com.bytedance.adsdk.NOt;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class edo<K, V> {
    private int FA;
    private int Ht;
    private int Mm;
    private int NOt;
    private int TFq;
    private final LinkedHashMap<K, V> ZRu;
    private int mZ;
    private int uR;

    public edo(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.mZ = i10;
        this.ZRu = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int mZ(K k10, V v10) {
        int iNOt = NOt(k10, v10);
        if (iNOt >= 0) {
            return iNOt;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public int NOt(K k10, V v10) {
        return 1;
    }

    public final V ZRu(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.ZRu.get(k10);
                if (v10 != null) {
                    this.Mm++;
                    return v10;
                }
                this.FA++;
                V vNOt = NOt(k10);
                if (vNOt == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.TFq++;
                        vPut = this.ZRu.put(k10, vNOt);
                        if (vPut != null) {
                            this.ZRu.put(k10, vPut);
                        } else {
                            this.NOt += mZ(k10, vNOt);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                ZRu(this.mZ);
                return vNOt;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.Mm;
            i11 = this.FA + i10;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.mZ), Integer.valueOf(this.Mm), Integer.valueOf(this.FA), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public V NOt(K k10) {
        return null;
    }

    public final V ZRu(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.uR++;
                    this.NOt += mZ(k10, v10);
                    vPut = this.ZRu.put(k10, v10);
                    if (vPut != null) {
                        this.NOt -= mZ(k10, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ZRu(this.mZ);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.NOt     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.ZRu     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.NOt     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.NOt     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.ZRu     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.ZRu     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.ZRu     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.NOt     // Catch: java.lang.Throwable -> L12
            int r0 = r3.mZ(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.NOt = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.Ht     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.Ht = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.edo.ZRu(int):void");
    }
}
