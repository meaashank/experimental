package com.bytedance.sdk.component.FA;

import com.bytedance.sdk.component.FA.ZRu;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends TFq {
    private static volatile ThreadPoolExecutor FA;
    private static volatile ThreadPoolExecutor Ht;
    private static volatile ThreadPoolExecutor Mm;
    public static mZ NOt;
    private static volatile ThreadPoolExecutor TFq;
    private static volatile ThreadPoolExecutor Vor;
    private static volatile ScheduledExecutorService ZH;
    private static volatile ThreadPoolExecutor aT;
    public static final int ZRu = Runtime.getRuntime().availableProcessors();
    public static int mZ = 120;
    public static boolean uR = true;

    public static RejectedExecutionHandler FA() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.FA.Ht.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ScheduledExecutorService Ht() {
        if (ZH == null) {
            synchronized (Ht.class) {
                try {
                    if (ZH == null) {
                        ZH = Executors.newSingleThreadScheduledExecutor(TFq.ZRu().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZH;
    }

    public static boolean Mm() {
        return uR;
    }

    public static ExecutorService NOt() {
        if (TFq == null) {
            synchronized (Ht.class) {
                try {
                    if (TFq == null) {
                        TFq = new ZRu.C0401ZRu().ZRu("init").ZRu(0).NOt(10).ZRu(5L).ZRu(TimeUnit.SECONDS).ZRu(new SynchronousQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(10, "init")).ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return TFq;
    }

    public static ExecutorService TFq() {
        if (aT == null) {
            synchronized (Ht.class) {
                try {
                    if (aT == null) {
                        ZRu ZRu2 = new ZRu.C0401ZRu().ZRu("aidl").NOt(10).ZRu(2).ZRu(30L).ZRu(TimeUnit.SECONDS).ZRu(new PriorityBlockingQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(10, "aidl")).ZRu();
                        aT = ZRu2;
                        ZRu2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aT;
    }

    public static mZ Vor() {
        return NOt;
    }

    public static void ZRu(FA fa2) {
        if (TFq == null) {
            NOt();
        }
        if (fa2 == null || TFq == null) {
            return;
        }
        TFq.execute(fa2);
    }

    public static ExecutorService aT() {
        if (Vor == null) {
            synchronized (Ht.class) {
                try {
                    if (Vor == null) {
                        ZRu ZRu2 = new ZRu.C0401ZRu().ZRu("computation").ZRu(3).NOt(10).ZRu(20L).ZRu(TimeUnit.SECONDS).ZRu(new PriorityBlockingQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(10, "computation")).ZRu();
                        Vor = ZRu2;
                        ZRu2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Vor;
    }

    public static ExecutorService mZ() {
        return ZRu(10);
    }

    public static ExecutorService uR() {
        if (FA == null) {
            synchronized (Ht.class) {
                try {
                    if (FA == null) {
                        ZRu ZRu2 = new ZRu.C0401ZRu().ZRu("log").NOt(10).ZRu(4).ZRu(20L).ZRu(TimeUnit.SECONDS).ZRu(new PriorityBlockingQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(10, "log")).ZRu();
                        FA = ZRu2;
                        ZRu2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return FA;
    }

    public static void mZ(FA fa2) {
        if (FA == null) {
            uR();
        }
        if (fa2 == null || FA == null) {
            return;
        }
        FA.execute(fa2);
    }

    public static ExecutorService ZRu(int i10) {
        if (Ht == null) {
            synchronized (Ht.class) {
                try {
                    if (Ht == null) {
                        ZRu ZRu2 = new ZRu.C0401ZRu().ZRu("io").ZRu(2).NOt(i10).ZRu(20L).ZRu(TimeUnit.SECONDS).ZRu(new LinkedBlockingQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(i10, "io")).ZRu();
                        Ht = ZRu2;
                        ZRu2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Ht;
    }

    public static void mZ(FA fa2, int i10) {
        if (fa2 != null) {
            fa2.setPriority(i10);
        }
        uR(fa2);
    }

    public static void mZ(int i10) {
        mZ = i10;
    }

    public static void NOt(FA fa2) {
        if (Ht == null) {
            mZ();
        }
        if (Ht != null) {
            Ht.execute(fa2);
        }
    }

    public static void TFq(FA fa2) {
        if (Mm == null) {
            NOt(5);
        }
        if (fa2 == null || Mm == null) {
            return;
        }
        Mm.execute(fa2);
    }

    public static void uR(FA fa2) {
        if (aT == null) {
            TFq();
        }
        if (fa2 == null || aT == null) {
            return;
        }
        aT.execute(fa2);
    }

    public static void NOt(FA fa2, int i10) {
        if (fa2 != null) {
            fa2.setPriority(i10);
        }
        mZ(fa2);
    }

    public static void ZRu(FA fa2, int i10) {
        NOt(fa2);
    }

    public static ExecutorService NOt(int i10) {
        if (Mm == null) {
            synchronized (Ht.class) {
                try {
                    if (Mm == null) {
                        ZRu ZRu2 = new ZRu.C0401ZRu().ZRu("ad").ZRu(2).NOt(i10).ZRu(20L).ZRu(TimeUnit.SECONDS).ZRu(new LinkedBlockingQueue()).ZRu(FA()).ZRu(TFq.ZRu().createThreadFactory(i10, "ad")).ZRu();
                        Mm = ZRu2;
                        ZRu2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Mm;
    }

    public static void ZRu(FA fa2, int i10, int i11) {
        if (Ht == null) {
            ZRu(i11);
        }
        if (fa2 == null || Ht == null) {
            return;
        }
        fa2.setPriority(i10);
        Ht.execute(fa2);
    }

    public static void ZRu(boolean z10) {
        uR = z10;
    }

    public static void ZRu(mZ mZVar) {
        NOt = mZVar;
    }
}
