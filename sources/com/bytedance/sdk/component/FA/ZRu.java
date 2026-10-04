package com.bytedance.sdk.component.FA;

import Q0.h;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lp;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class ZRu extends ThreadPoolExecutor implements AutoCloseable {
    private String ZRu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.FA.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0401ZRu {
        private RejectedExecutionHandler FA;
        private String ZRu = "io";
        private int NOt = 1;
        private long mZ = 30;
        private TimeUnit uR = TimeUnit.SECONDS;
        private int TFq = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> Ht = null;
        private ThreadFactory Mm = null;
        private int Vor = 5;

        public C0401ZRu NOt(int i10) {
            this.Vor = i10;
            return this;
        }

        public C0401ZRu ZRu(String str) {
            this.ZRu = str;
            return this;
        }

        public C0401ZRu ZRu(int i10) {
            this.NOt = i10;
            return this;
        }

        public C0401ZRu ZRu(long j10) {
            this.mZ = j10;
            return this;
        }

        public C0401ZRu ZRu(TimeUnit timeUnit) {
            this.uR = timeUnit;
            return this;
        }

        public C0401ZRu ZRu(BlockingQueue<Runnable> blockingQueue) {
            this.Ht = blockingQueue;
            return this;
        }

        public C0401ZRu ZRu(ThreadFactory threadFactory) {
            this.Mm = threadFactory;
            return this;
        }

        public C0401ZRu ZRu(RejectedExecutionHandler rejectedExecutionHandler) {
            this.FA = rejectedExecutionHandler;
            return this;
        }

        public ZRu ZRu() {
            if (this.Mm == null) {
                this.Mm = TFq.ZRu().createThreadFactory(this.Vor, this.ZRu);
            }
            if (this.FA == null) {
                this.FA = Ht.FA();
            }
            if (this.Ht == null) {
                this.Ht = new LinkedBlockingQueue();
            }
            return new ZRu(this.ZRu, this.NOt, this.TFq, this.mZ, this.uR, this.Ht, this.Mm, this.FA);
        }
    }

    public ZRu(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.ZRu = str;
    }

    private void ZRu(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            ZRu(runnable, e10);
        } catch (Throwable th) {
            ZRu(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!Ht.Mm() || TextUtils.isEmpty(this.ZRu) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.ZRu;
        str.getClass();
        switch (str) {
            case "io":
                ZRu(queue, 2);
                break;
            case "log":
                ZRu(queue, 4);
                break;
            case "aidl":
                ZRu(queue, 2);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof FA) {
            ZRu(new NOt((FA) runnable, this));
        } else {
            ZRu(new NOt(new FA("unknown") { // from class: com.bytedance.sdk.component.FA.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!Ht.Mm() || TextUtils.isEmpty(this.ZRu) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.ZRu;
        str.getClass();
        switch (str) {
            case "io":
                ZRu(queue, Ht.ZRu + 2, getCorePoolSize() * 2);
                break;
            case "log":
                ZRu(queue, 8, 8);
                break;
            case "aidl":
                ZRu(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.ZRu) || "aidl".equals(this.ZRu)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.ZRu) || "aidl".equals(this.ZRu)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void ZRu(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        ZRu(runnable, (Throwable) outOfMemoryError);
    }

    private void ZRu(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                lp.ZRu("", "try exc failed", th2);
            }
        }
    }

    private void ZRu(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void ZRu(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String ZRu() {
        return this.ZRu;
    }
}
