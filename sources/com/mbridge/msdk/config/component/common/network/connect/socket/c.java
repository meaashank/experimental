package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.foundation.tools.m0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f154355d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f154356a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f154357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f154358c;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f154359a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f154359a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f154357b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f154358c = new AtomicBoolean(false);
    }

    private boolean b() {
        try {
            int iH = m0.h();
            if (iH > 0) {
                int iX = m0.x();
                return iX > 0 && (((double) iH) / ((double) iX)) * 100.0d <= 5.0d;
            }
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Memory check failed: "), "SocketThreadPoolManager");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f154356a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f154356a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th) {
                this.f154358c.set(false);
                if (!this.f154356a.isEmpty()) {
                    d();
                }
                throw th;
            }
        }
        this.f154358c.set(false);
        if (this.f154356a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f154358c.compareAndSet(false, true)) {
            this.f154357b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154361a.c();
                }
            });
        }
    }

    public static c a() {
        if (f154355d == null) {
            synchronized (c.class) {
                try {
                    if (f154355d == null) {
                        f154355d = new c();
                    }
                } finally {
                }
            }
        }
        return f154355d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f154356a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f154357b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f154357b.getActiveCount(), this.f154357b.getQueue().size());
    }
}
