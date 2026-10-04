package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.lp;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
abstract class ZRu implements ZH {
    private static final AtomicLong sAl = new AtomicLong();
    protected volatile String FA;
    protected volatile List<Vor.NOt> Ht;
    protected volatile String Mm;
    protected final com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ NOt;
    protected com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.ZRu TFq;
    protected volatile Vor Vor;
    protected volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu ZRu;
    protected volatile lp aT;
    protected final AtomicInteger mZ = new AtomicInteger();
    protected final AtomicLong uR = new AtomicLong();
    protected volatile boolean ZH = false;
    public final long lp = sAl.incrementAndGet();
    private final AtomicInteger edo = new AtomicInteger(0);
    private int oK = -1;

    public ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu zRu, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar) {
        this.ZRu = zRu;
        this.NOt = mZVar;
    }

    public int Ht() {
        return this.Vor != null ? this.Vor.mZ.ZRu : this.ZRu instanceof com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.NOt ? 1 : 0;
    }

    public boolean Mm() {
        return Ht() == 1;
    }

    public boolean NOt() {
        return this.edo.get() == 1;
    }

    public void TFq() throws com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.ZRu {
        if (NOt()) {
            throw new com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.mZ.ZRu();
        }
    }

    public void mZ() {
        this.edo.compareAndSet(0, 2);
    }

    public boolean uR() {
        return this.edo.get() == 2;
    }

    public void ZRu() {
        this.edo.compareAndSet(0, 1);
    }

    public com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu ZRu(lp.ZRu zRu, int i10, int i11, String str) throws IOException {
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.NOt NOt = com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.mZ.ZRu().NOt();
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.TFq tFq = new com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.TFq();
        HashMap map = new HashMap();
        tFq.NOt = zRu.ZRu;
        tFq.ZRu = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            tFq.ZRu = 4;
        }
        List<Vor.NOt> list = this.Ht;
        if (list != null && !list.isEmpty()) {
            for (Vor.NOt nOt : list) {
                if (!"Range".equalsIgnoreCase(nOt.ZRu) && !"Connection".equalsIgnoreCase(nOt.ZRu) && !"Proxy-Connection".equalsIgnoreCase(nOt.ZRu) && !"Host".equalsIgnoreCase(nOt.ZRu)) {
                    map.put(nOt.ZRu, nOt.NOt);
                }
            }
        }
        String strZRu = com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(i10, i11);
        if (strZRu != null) {
            map.put("Range", strZRu);
        }
        if (TFq.Ht) {
            map.put("Cache-Control", "no-cache");
        }
        uR uRVarMZ = uR.mZ();
        Ht htZRu = Ht.ZRu();
        boolean z10 = this.Vor == null;
        mZ mZVarZRu = z10 ? uRVarMZ.ZRu() : htZRu.NOt();
        mZ mZVarNOt = z10 ? uRVarMZ.NOt() : htZRu.mZ();
        if ((mZVarZRu == null && mZVarNOt == null) || (mZVarZRu == null && mZVarNOt == null)) {
            tFq.TFq = map;
            if (this.ZH) {
                this.ZH = false;
                return null;
            }
            return NOt.ZRu(tFq);
        }
        throw null;
    }

    public void ZRu(int i10, int i11) {
        if (i10 <= 0 || i11 < 0) {
            return;
        }
        int i12 = TFq.Mm;
        int iHt = Ht();
        if (i12 == 1 || (i12 == 2 && iHt == 1)) {
            int i13 = (int) ((i11 / i10) * 100.0f);
            if (i13 > 100) {
                i13 = 100;
            }
            synchronized (this) {
                try {
                    if (i13 <= this.oK) {
                        return;
                    }
                    this.oK = i13;
                    com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(new Runnable() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ZRu zRu = ZRu.this;
                            if (zRu.TFq != null) {
                                lp lpVar = zRu.aT;
                                int unused = ZRu.this.oK;
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
