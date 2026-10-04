package com.bytedance.sdk.component.Ht.ZRu.NOt;

import android.os.Handler;
import android.os.Looper;
import androidx.collection.LruCacheKt;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.TFq;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private volatile com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ Vor;
    private final Comparator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZH;
    private volatile Handler aT;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> lp;
    public static final uR ZRu = new uR();
    public static final com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu uR = new com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu();
    public static final AtomicLong TFq = new AtomicLong(0);
    public static final AtomicLong Ht = new AtomicLong(0);
    public static final long Mm = System.currentTimeMillis();
    public static long FA = 0;
    public volatile boolean NOt = false;
    public volatile boolean mZ = false;

    private uR() {
        Comparator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> comparator = new Comparator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>() { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.uR.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu2) {
                return uR.this.ZRu(zRu, zRu2);
            }
        };
        this.ZH = comparator;
        this.lp = new PriorityBlockingQueue<>(8, comparator);
    }

    public void NOt() {
        uR();
        TFq();
    }

    public void TFq() {
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(uR.Cox(), 1);
        final com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ mZVar = this.Vor;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (mZVar != null) {
                mZVar.mZ(2);
                return;
            }
            return;
        }
        TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV != null) {
            Executor executorUR = tFqYBV.uR();
            if (executorUR == null) {
                executorUR = tFqYBV.TFq();
            }
            if (executorUR != null) {
                executorUR.execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("flush") { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.uR.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ mZVar2 = mZVar;
                        if (mZVar2 != null) {
                            mZVar2.mZ(2);
                        }
                    }
                });
            }
        }
    }

    public void mZ() {
        if (this.Vor == null || !this.Vor.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.Vor != null && this.Vor.isAlive()) {
                    if (this.aT != null) {
                        this.aT.removeCallbacksAndMessages(null);
                    }
                    this.Vor.ZRu(false);
                    this.Vor.quitSafely();
                    this.Vor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean uR() {
        try {
            if (this.Vor != null || com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
                return false;
            }
            synchronized (this) {
                if (this.Vor != null) {
                    return false;
                }
                this.Vor = new com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ(this.lp);
                this.Vor.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu() {
        return this.lp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu2) {
        long jZRu;
        long jNOt;
        long jNOt2;
        long jZRu2;
        if (zRu == null) {
            return zRu2 == null ? 0 : -1;
        }
        if (zRu2 == null) {
            return 1;
        }
        if (zRu.TFq() == zRu2.TFq()) {
            if (zRu.ZRu() != null) {
                jZRu = zRu.ZRu().ZRu();
                jNOt = zRu.ZRu().NOt();
            } else {
                jZRu = 0;
                jNOt = 0;
            }
            if (zRu2.ZRu() != null) {
                jZRu2 = zRu2.ZRu().ZRu();
                jNOt2 = zRu2.ZRu().NOt();
            } else {
                jNOt2 = 0;
                jZRu2 = 0;
            }
            if (jZRu == 0 || jZRu2 == 0) {
                return 0;
            }
            long j10 = jZRu - jZRu2;
            if (Math.abs(j10) > LruCacheKt.f86729a) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jNOt == 0 || jNOt2 == 0) {
                return 0;
            }
            return (int) (jNOt - jNOt2);
        }
        return zRu.TFq() - zRu2.TFq();
    }

    public void ZRu(Handler handler) {
        this.aT = handler;
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        uR();
        TFq tFqYBV = FA.Mm().yBV();
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ mZVar = this.Vor;
        if (mZVar != null) {
            ZRu(tFqYBV, zRu);
            mZVar.ZRu(zRu, zRu.TFq() == 4);
        }
    }

    private void ZRu(final TFq tFq, com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        if (tFq != null) {
            try {
                if (tFq.Mm()) {
                    final long jNOt = (zRu == null || zRu.ZRu() == null) ? 0L : zRu.ZRu().NOt();
                    if (jNOt == 1) {
                        FA = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongMU = uR.MU();
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(atomicLongMU, 1);
                    if (atomicLongMU.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorUR = tFq.uR();
                                if (executorUR == null) {
                                    executorUR = tFq.TFq();
                                }
                                if (executorUR != null) {
                                    executorUR.execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("report") { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.uR.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            uR.this.ZRu(tFq, jNOt);
                                        }
                                    });
                                }
                            } else {
                                ZRu(tFq, jNOt);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(TFq tFq, long j10) {
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ mZVar = this.Vor;
        if (tFq == null || mZVar == null) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu zRu = uR;
        mZVar.ZRu(tFq.ZRu(zRu.NOt(j10)), true);
        zRu.IZ();
    }
}
