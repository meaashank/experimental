package com.bytedance.sdk.component.Ht.ZRu.NOt.mZ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.TFq;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.uR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends HandlerThread implements Handler.Callback {
    private static int WMI = 10;
    private static int om = 200;
    private volatile long FA;
    private volatile int Ht;
    private volatile long Mm;
    private volatile boolean NOt;
    private final int OCA;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> TFq;
    private final AtomicInteger Vor;
    private final long ZH;
    protected uR ZRu;
    private final long aT;
    private final List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> edo;
    private final AtomicInteger lp;
    private final Object mZ;
    private final AtomicInteger oK;
    private long qF;
    private volatile Handler sAl;
    private final int to;
    private com.bytedance.sdk.component.Ht.ZRu.NOt.mZ uR;
    private final int xY;
    private final AtomicInteger yBV;

    public mZ(PriorityBlockingQueue<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> priorityBlockingQueue) {
        super("csj_log");
        this.NOt = true;
        this.mZ = new Object();
        this.Mm = 0L;
        this.FA = 0L;
        this.Vor = new AtomicInteger(0);
        this.aT = 5000L;
        this.ZH = 5000000000L;
        this.lp = new AtomicInteger(0);
        this.edo = new ArrayList();
        this.oK = new AtomicInteger(0);
        this.yBV = new AtomicInteger(0);
        this.qF = 60000L;
        this.OCA = 1;
        this.to = 2;
        this.xY = 3;
        this.TFq = priorityBlockingQueue;
        this.ZRu = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt();
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
            return;
        }
        long jOK = FA.Mm().yBV().oK();
        if (jOK > 0) {
            this.qF = jOK;
        }
    }

    private boolean FA() {
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.NOt) {
            return this.Ht == 4 || this.Ht == 7 || this.Ht == 6 || this.Ht == 5 || this.Ht == 2;
        }
        return false;
    }

    private void Ht() {
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.xY(), 1);
        ZRu(false);
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.mZ();
    }

    private void Mm() {
        if (this.TFq.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRuPoll = this.TFq.poll();
                if (!(zRuPoll instanceof com.bytedance.sdk.component.Ht.ZRu.uR.NOt) && zRuPoll != null) {
                    ZRu(zRuPoll);
                }
            }
        }
    }

    private void TFq() {
        while (ZRu()) {
            try {
                com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu zRu = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR;
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.FA(), 1);
                com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRuPoll = this.TFq.poll(this.qF, TimeUnit.MILLISECONDS);
                int size = this.TFq.size();
                if (zRuPoll instanceof com.bytedance.sdk.component.Ht.ZRu.uR.NOt) {
                    ZRu(zRuPoll, size);
                } else if (zRuPoll == null) {
                    int iIncrementAndGet = this.Vor.incrementAndGet();
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.Hvv(), 1);
                    if (uR(iIncrementAndGet)) {
                        Ht();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.Ht = 1;
                        NOt((com.bytedance.sdk.component.Ht.ZRu.uR.ZRu) null);
                    }
                } else {
                    ZRu(zRuPoll);
                    NOt(zRuPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.bO(), 1);
            }
        }
    }

    private void Vor() {
        try {
            if (this.TFq.size() == 0 && this.sAl.hasMessages(11) && ZRu()) {
                ZRu(false);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void aT() {
        long jNanoTime;
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR uRVar;
        if (this.sAl.hasMessages(11)) {
            Vor();
        } else {
            TFq(1);
        }
        com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu zRu = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR;
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.NOt(), 1);
        if (this.Ht == 2) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.Mm(), 1);
            synchronized (this.mZ) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.mZ.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        uRVar = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu;
                        if (!uRVar.NOt) {
                            boolean z10 = uRVar.mZ;
                        }
                    } catch (InterruptedException e10) {
                        e10.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!uRVar.NOt && !uRVar.mZ) {
                            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.Ho(), 1);
                            mZ(2);
                            return;
                        }
                        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.ZH(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.aT(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void mZ() {
        uR();
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.gI(), 1);
        mZ(1);
    }

    private void uR() {
        if (!isAlive()) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.uR();
        } else {
            if (ZRu()) {
                return;
            }
            mZ(6);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i10 == 1) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Vor(), 1);
            NOt();
            ZRu(true);
            TFq();
        } else {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 11) {
                    ArrayList arrayList = new ArrayList(this.edo);
                    this.edo.clear();
                    ZRu((List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>) arrayList, false, "timeout_dispatch");
                    aT();
                }
                return true;
            }
            mZ();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.sAl = new Handler(getLooper(), this);
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.ZRu(this.sAl);
        this.sAl.sendEmptyMessage(1);
    }

    public static void NOt(int i10) {
        om = i10;
    }

    private void NOt() {
        long jWMI = FA.Mm().WMI();
        if (jWMI <= 0) {
            return;
        }
        this.ZRu.ZRu(Integer.MAX_VALUE, jWMI);
    }

    public static void ZRu(int i10) {
        WMI = i10;
    }

    public void mZ(int i10) {
        try {
            boolean zZRu = ZRu(i10, com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.NOt);
            if (i10 != 6 && !zZRu) {
                return;
            }
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt nOt = new com.bytedance.sdk.component.Ht.ZRu.uR.NOt();
            nOt.NOt(i10);
            this.TFq.add(nOt);
            TFq(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void NOt(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu;
        if (com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.NOt() && FA.Mm().ZRu()) {
            return;
        }
        int i10 = 0;
        if (FA()) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(this.Ht);
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.lp(), 1);
            if (this.TFq.size() != 0) {
                return;
            }
            if (!this.sAl.hasMessages(2)) {
                com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.NOt = false;
                this.FA = 0L;
                this.Mm = 0L;
                this.oK.set(0);
                this.yBV.set(0);
            } else {
                ZRu(false);
                return;
            }
        }
        do {
            boolean zZRu = ZRu(this.Ht, com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.NOt);
            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(zZRu, this.Ht, zRu);
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.sAl(), 1);
            if (zZRu && (listZRu = this.ZRu.ZRu(this.Ht, -1, null)) != null) {
                listZRu.size();
                ZRu(listZRu);
            } else {
                Vor();
            }
            i10++;
            if (!zZRu) {
                return;
            }
        } while (i10 <= 6);
    }

    private boolean uR(int i10) {
        if (i10 < 4 || this.lp.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR uRVar = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu;
        return (uRVar.NOt || uRVar.mZ) ? false : true;
    }

    public void ZRu(boolean z10) {
        this.NOt = z10;
    }

    public boolean ZRu() {
        return this.NOt;
    }

    public boolean ZRu(int i10, boolean z10) {
        TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || !tFqYBV.ZRu(FA.Mm().Ht())) {
            return false;
        }
        return this.ZRu.ZRu(i10, z10);
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, boolean z10) {
        if (zRu == null) {
            return;
        }
        zRu.uR();
        if (z10) {
            if (this.sAl != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(zRu);
                ZRu((List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.TFq.add(zRu);
        TFq(2);
    }

    private void TFq(int i10) {
        if (!ZRu()) {
            if (this.sAl == null) {
                return;
            }
            com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu zRu = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR;
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.mZ(), 1);
            if (this.sAl.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.Ht(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.uR(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu.TFq(), 1);
            }
            this.sAl.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.ZRu(), 1);
    }

    private void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        this.Vor.set(0);
        if (i10 == 0) {
            this.Ht = ((com.bytedance.sdk.component.Ht.ZRu.uR.NOt) zRu).ZH();
            if (this.Ht != 6) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Qg(), 1);
                NOt(zRu);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt nOt = (com.bytedance.sdk.component.Ht.ZRu.uR.NOt) zRu;
        if (nOt.ZH() == 1) {
            this.Ht = 1;
            NOt(zRu);
        } else if (nOt.ZH() == 2) {
            Mm();
            this.Ht = 2;
            NOt(zRu);
        }
    }

    private void NOt(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        this.edo.addAll(list);
        this.edo.size();
        TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV != null && tFqYBV.lp() != null) {
            WMI = tFqYBV.lp().NOt();
        }
        if (this.edo.size() >= WMI) {
            if (this.sAl.hasMessages(11)) {
                this.sAl.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.edo);
            this.edo.clear();
            ZRu((List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>) arrayList, false, "max_size_dispatch");
            aT();
            return;
        }
        if (this.TFq.size() == 0) {
            ZRu(false);
            if (this.sAl.hasMessages(11)) {
                this.sAl.removeMessages(11);
            }
            if (this.sAl.hasMessages(1)) {
                this.sAl.removeMessages(1);
            }
            long jZRu = om;
            if (tFqYBV != null && tFqYBV.lp() != null) {
                jZRu = tFqYBV.lp().ZRu();
            }
            this.sAl.sendEmptyMessageDelayed(11, jZRu);
            return;
        }
        this.edo.size();
    }

    private void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        this.Vor.set(0);
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR uRVar = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu;
        if (uRVar.NOt) {
            this.Ht = 5;
        } else if (uRVar.mZ) {
            this.Ht = 7;
        } else {
            this.Ht = 4;
        }
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Jem(), 1);
        this.ZRu.ZRu(zRu, this.Ht);
        com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.Mm(zRu);
    }

    private void ZRu(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, String str) {
        ZRu(str);
        ZRu(list, false, str);
        aT();
    }

    private void ZRu(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(list, this.TFq.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.mZ()) {
                com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu = list.get(0);
                if (zRu != null) {
                    if (zRu.TFq() == 1) {
                        ZRu(list, "highPriority");
                        return;
                    }
                    if (zRu.uR() == 0 && zRu.TFq() == 2) {
                        if (zRu.NOt() == 3) {
                            ZRu(list, "version_v3");
                            return;
                        } else {
                            NOt(list);
                            return;
                        }
                    }
                    if (zRu.uR() == 1) {
                        ZRu(list, "stats");
                        return;
                    } else if (zRu.uR() == 3) {
                        ZRu(list, "adType_v3");
                        return;
                    } else {
                        if (zRu.uR() == 2) {
                            ZRu(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            ZRu(list, "batchRead");
            return;
        }
        Vor();
    }

    private void NOt(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, final boolean z10, final long j10) {
        this.lp.incrementAndGet();
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.GC(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.Ht.ZRu.uR.ZRu next = it.next();
                int iAT = next == null ? 0 : next.aT();
                if (map.get(Integer.valueOf(iAT)) == null) {
                    map.put(Integer.valueOf(iAT), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iAT))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && FA.Mm().mZ() != null && FA.Mm().mZ().get(num) != null) {
                    FA.Mm().mZ().get(num).ZRu(list, new com.bytedance.sdk.component.Ht.ZRu.NOt.NOt() { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.3
                        @Override // com.bytedance.sdk.component.Ht.ZRu.NOt.NOt
                        public void ZRu(List<ZRu> list2) {
                            try {
                                mZ.this.lp.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ZRu zRu = list2.get(i10);
                                    if (zRu != null) {
                                        mZ.this.ZRu(z10, zRu.ZRu(), zRu.NOt(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.uR.ZRu(list, new com.bytedance.sdk.component.Ht.ZRu.NOt.NOt() { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.2
                        @Override // com.bytedance.sdk.component.Ht.ZRu.NOt.NOt
                        public void ZRu(List<ZRu> list2) {
                            try {
                                mZ.this.lp.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ZRu zRu = list2.get(i10);
                                    if (zRu != null) {
                                        mZ.this.ZRu(z10, zRu.ZRu(), zRu.NOt(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.bO(), 1);
            this.lp.decrementAndGet();
        }
    }

    private void ZRu(String str) {
        if (this.sAl.hasMessages(11)) {
            this.sAl.removeMessages(11);
        }
        if (this.edo.size() != 0) {
            ArrayList arrayList = new ArrayList(this.edo);
            this.edo.clear();
            ZRu((List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>) arrayList, false, "before_".concat(String.valueOf(str)));
            aT();
            arrayList.size();
        }
    }

    private void ZRu(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, boolean z10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(list, this.Ht, str);
        com.bytedance.sdk.component.Ht.ZRu.NOt.mZ mZVarFA = FA.Mm().FA();
        this.uR = mZVarFA;
        if (mZVarFA != null) {
            NOt(list, z10, jCurrentTimeMillis);
        } else {
            ZRu(list, z10, jCurrentTimeMillis);
        }
    }

    private void ZRu(final List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, final boolean z10, final long j10) {
        TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV != null) {
            Executor executorTFq = tFqYBV.TFq();
            if (list.get(0).TFq() == 1) {
                executorTFq = tFqYBV.uR();
            }
            if (executorTFq == null) {
                return;
            }
            this.lp.incrementAndGet();
            executorTFq.execute(new com.bytedance.sdk.component.Ht.ZRu.TFq.TFq("csj_log_upload") { // from class: com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.1
                @Override // java.lang.Runnable
                public void run() {
                    mZ mZVar = mZ.this;
                    mZVar.ZRu((List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu>) list, z10, j10, mZVar.Ht);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, boolean z10, long j10, int i10) {
        mZ mZVar;
        Throwable th;
        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu;
        NOt nOtZRu;
        try {
            zRu = list.get(0);
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.GC(), 1);
        } catch (Throwable th2) {
            th = th2;
            mZVar = this;
        }
        try {
            if (zRu.uR() == 0) {
                nOtZRu = FA.TFq().ZRu(list);
                ZRu(nOtZRu, list);
                if (nOtZRu != null) {
                    com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(list, nOtZRu.uR);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().Mm());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e10) {
                    e10.getMessage();
                }
                nOtZRu = FA.TFq().ZRu(jSONObject);
            }
            NOt nOt = nOtZRu;
            this.lp.decrementAndGet();
            mZVar = this;
            try {
                mZVar.ZRu(z10, nOt, list, j10);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                th.getMessage();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.bO(), 1);
                mZVar.lp.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            mZVar = this;
            th.getMessage();
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.bO(), 1);
            mZVar.lp.decrementAndGet();
        }
    }

    private void ZRu(NOt nOt, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        if (nOt == null || !nOt.ZRu) {
            return;
        }
        List<Object> listZRu = com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu();
        if (list == null || listZRu == null || listZRu.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu : list) {
            if (zRu.TFq() == 1) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.ZRu(zRu);
                com.bytedance.sdk.component.Ht.ZRu.mZ.ZRu.TFq(zRu);
                Iterator<Object> it = listZRu.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(boolean z10, NOt nOt, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, long j10) {
        if (z10 || nOt == null) {
            return;
        }
        int i10 = nOt.NOt;
        int i11 = -2;
        if (nOt.TFq) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (nOt.ZRu || ((i10 < 500 || i10 >= 509) && i10 <= 513)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.lp.get();
        }
        ZRu(i11, list, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ZRu(int r6, java.util.List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> r7, long r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Ht.ZRu.NOt.mZ.mZ.ZRu(int, java.util.List, long):void");
    }

    public void ZRu(int i10, long j10) {
        if (this.sAl == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        if (i10 == 2) {
            this.sAl.sendMessageDelayed(messageObtain, ((long) (((this.oK.incrementAndGet() - 1) % 4) + 1)) * j10);
        } else if (i10 == 3) {
            this.sAl.sendMessageDelayed(messageObtain, ((long) (((this.yBV.incrementAndGet() - 1) % 4) + 1)) * j10);
        }
    }
}
