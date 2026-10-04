package com.bytedance.sdk.component.FA.mZ;

import Q0.h;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lp;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u4.g;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends ThreadPoolExecutor implements AutoCloseable {
    private LinkedHashMap<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu> FA;
    private int Ht;
    private boolean Mm;
    private int NOt;
    private int TFq;
    private final String ZRu;
    private int mZ;
    private int uR;

    public static class ZRu {
        private String ZRu = g.f239565h;
        private int NOt = 4;
        private int mZ = 100;
        private int uR = 0;
        private long TFq = 30000;
        private boolean Ht = false;
        private TimeUnit Mm = TimeUnit.MILLISECONDS;
        private int FA = -1;
        private int Vor = 20;
        private boolean aT = false;
        private BlockingQueue<Runnable> ZH = new PriorityBlockingQueue();
        private ThreadFactory lp = null;

        public ZRu NOt(int i10) {
            this.mZ = i10;
            return this;
        }

        public ZRu TFq(int i10) {
            this.FA = i10;
            return this;
        }

        public ZRu ZRu(String str) {
            this.ZRu = str;
            return this;
        }

        public ZRu mZ(int i10) {
            this.uR = i10;
            return this;
        }

        public ZRu uR(int i10) {
            this.Vor = i10;
            return this;
        }

        public ZRu NOt(boolean z10) {
            this.aT = z10;
            return this;
        }

        public ZRu ZRu(int i10) {
            this.NOt = i10;
            return this;
        }

        public ZRu ZRu(long j10) {
            this.TFq = j10;
            return this;
        }

        public ZRu ZRu(boolean z10) {
            this.Ht = z10;
            return this;
        }

        public Ht ZRu() {
            if (this.lp == null) {
                this.lp = new uR(this.ZRu);
            }
            if (this.NOt < 0) {
                this.NOt = 8;
            }
            if (this.NOt == 0) {
                this.ZH = new SynchronousQueue();
            }
            if (this.ZH == null) {
                this.ZH = new LinkedBlockingQueue();
            }
            if (this.mZ > 100) {
                this.mZ = 100;
            }
            int i10 = this.mZ;
            int i11 = this.NOt;
            if (i10 < i11) {
                this.mZ = i11;
            }
            if (this.Vor < 0) {
                this.Vor = 20;
            }
            if (this.Vor > 100) {
                this.Vor = 100;
            }
            return new Ht(this);
        }
    }

    private void Ht() {
        if (getCompletedTaskCount() > this.NOt) {
            TFq tFqZRu = mZ.ZRu();
            if (tFqZRu != null) {
                tFqZRu.ZRu(this);
            }
            this.NOt = -1;
        }
    }

    private boolean Mm() {
        return this.NOt > 0;
    }

    private void TFq() {
        try {
            if (this.uR != 0 && getCorePoolSize() > this.uR && getQueue().size() == 0) {
                setCorePoolSize(this.uR);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void uR() {
        try {
            if (this.uR != 0 && getCorePoolSize() < this.TFq) {
                int size = getQueue().size();
                if (getActiveCount() < this.uR || size < this.Ht) {
                    return;
                }
                setCorePoolSize(this.TFq);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String NOt() {
        return this.ZRu;
    }

    public void ZRu(ZRu zRu) {
        try {
            if (zRu.NOt >= 0 && this.uR != zRu.NOt) {
                int i10 = zRu.NOt;
                this.uR = i10;
                setCorePoolSize(i10);
            }
            this.TFq = zRu.mZ;
            this.Ht = zRu.uR;
            allowCoreThreadTimeOut(zRu.Ht);
            this.NOt = zRu.FA;
            this.mZ = zRu.Vor;
            this.Mm = zRu.aT;
        } catch (Throwable th) {
            lp.ZRu("PAGThreadPoolExecutor", th.getMessage());
        }
        String unused = zRu.ZRu;
        int unused2 = zRu.NOt;
        int unused3 = zRu.mZ;
        long unused4 = zRu.TFq;
        int unused5 = zRu.uR;
        int unused6 = zRu.Vor;
        boolean unused7 = zRu.aT;
        BlockingQueue unused8 = zRu.ZH;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z10 = runnable instanceof NOt;
        if (z10) {
            ((NOt) runnable).mZ(SystemClock.elapsedRealtime());
            try {
                if (Mm() && this.FA != null) {
                    ZRu((NOt) runnable);
                    Ht();
                }
            } catch (Exception e10) {
                lp.ZRu("PAGThreadPoolExecutor", e10.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z10) {
            NOt nOt = (NOt) runnable;
            nOt.NOt();
            nOt.ZRu();
            nOt.mZ();
            nOt.uR();
            nOt.TFq();
        }
        TFq();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof NOt) {
            ((NOt) runnable).NOt(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.FA.mZ.ZRu zRuNOt;
        if (!(runnable instanceof NOt)) {
            runnable = new NOt("unknown", runnable) { // from class: com.bytedance.sdk.component.FA.mZ.Ht.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableFA = FA();
                    if (runnableFA != null) {
                        runnableFA.run();
                    }
                }
            };
        }
        if (!g.f239565h.equals(this.ZRu)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(uR.ZRu(this.ZRu)) && (zRuNOt = mZ.NOt()) != null) {
                zRuNOt.ZRu(this, (NOt) runnable);
            }
        }
        ((NOt) runnable).ZRu(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            uR();
        } catch (Throwable th) {
            ZRu(runnable, th);
        }
    }

    public boolean mZ() {
        return this.Mm;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.ZRu)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.ZRu) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iZRu;
        String strNOt;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof NOt) {
            NOt nOt = (NOt) runnable;
            iZRu = nOt.ZRu();
            strNOt = nOt.NOt();
        } else {
            iZRu = 6;
            strNOt = "";
        }
        if (iZRu == 0 || TextUtils.isEmpty(strNOt)) {
            new RuntimeException();
        }
        execute(new NOt(iZRu, strNOt) { // from class: com.bytedance.sdk.component.FA.mZ.Ht.2
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private Ht(ZRu zRu) {
        super(zRu.NOt, Integer.MAX_VALUE, zRu.TFq, zRu.Mm, (BlockingQueue<Runnable>) zRu.ZH, zRu.lp);
        this.Mm = false;
        String unused = zRu.ZRu;
        int unused2 = zRu.NOt;
        int unused3 = zRu.mZ;
        long unused4 = zRu.TFq;
        int unused5 = zRu.uR;
        int unused6 = zRu.Vor;
        boolean unused7 = zRu.aT;
        BlockingQueue unused8 = zRu.ZH;
        this.ZRu = zRu.ZRu;
        this.uR = zRu.NOt;
        this.TFq = zRu.mZ;
        this.Ht = zRu.uR;
        allowCoreThreadTimeOut(zRu.Ht);
        this.NOt = zRu.FA;
        this.mZ = zRu.Vor;
        this.Mm = zRu.aT;
        if (Mm()) {
            final int i10 = this.mZ + 4;
            this.FA = new LinkedHashMap<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu>(i10, 0.75f, true) { // from class: com.bytedance.sdk.component.FA.mZ.Ht.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu> entry) {
                    return size() > i10;
                }
            };
        }
    }

    private void ZRu(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerMZ = mZ.mZ();
                if (handlerMZ != null) {
                    handlerMZ.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            lp.ZRu("PAGThreadPoolExecutor", "try exc failed", th2);
        }
    }

    private void ZRu(NOt nOt) {
        LinkedHashMap<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu> linkedHashMap = this.FA;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.FA.mZ.ZRu.ZRu zRu = linkedHashMap.get(nOt.NOt());
            if (zRu == null) {
                synchronized (linkedHashMap) {
                    try {
                        zRu = linkedHashMap.get(nOt.NOt());
                        if (zRu == null) {
                            zRu = new com.bytedance.sdk.component.FA.mZ.ZRu.ZRu();
                            linkedHashMap.put(nOt.NOt(), zRu);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zRu.ZRu(nOt);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.FA.mZ.ZRu.ZRu> ZRu() {
        return this.FA;
    }
}
