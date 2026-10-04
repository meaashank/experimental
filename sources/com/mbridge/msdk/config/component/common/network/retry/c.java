package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f154373d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f154375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f154376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f154377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f154378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f154379j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f154370a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f154371b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f154372c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f154374e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f154380k = new AtomicInteger(0);

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f154381a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + com.prism.gaia.download.a.f164606q + this.f154381a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    public class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    public class C0548c implements com.mbridge.msdk.config.component.common.network.retry.b {
        public C0548c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    public class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        public d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    public class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        public e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f154387b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f154388a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f154389a = new AtomicInteger(1);

            public a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f154389a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return f154387b;
        }

        public ThreadPoolExecutor b() {
            return this.f154388a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f154375f = str;
        this.f154376g = aVar;
        this.f154377h = aVar2;
        this.f154378i = aVar3;
        this.f154379j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f154371b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f154376g, this.f154378i, this.f154377h);
                h();
                this.f154371b.a(this.f154375f);
                aVar = this.f154371b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f154378i.c(0);
                this.f154378i.b(0);
                this.f154378i.a(e10.getMessage());
                g();
                aVar = this.f154371b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f154371b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f154372c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.f154376g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("340"))) {
            f();
        } else if (this.f154376g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("341"))) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f154370a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f154376g, this.f154378i, this.f154377h);
                i();
                this.f154370a.a(this.f154375f);
                aVar = this.f154370a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f154378i.c(0);
                this.f154378i.b(0);
                this.f154378i.a(e10.getMessage());
                g();
                aVar = this.f154370a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f154370a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f154372c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f154380k.incrementAndGet();
        if (this.f154380k.get() >= this.f154376g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f154380k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f154377h;
            if (aVar != null) {
                aVar.d(this.f154378i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f154380k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f154374e;
            if (scheduledExecutorService != null) {
                this.f154373d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f154391a.c();
                    }
                }, this.f154376g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f154380k.get() + " 次重试");
            }
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("调度重试任务失败: "), "RequestRetry");
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f154377h;
            if (aVar2 != null) {
                aVar2.d(this.f154378i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f154371b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f154379j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f154370a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f154379j;
        if (bVar != null) {
            bVar.a(new C0548c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f154374e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f154374e.shutdown();
            if (this.f154374e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f154374e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f154374e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f154372c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f154372c = true;
        ScheduledFuture<?> scheduledFuture = this.f154373d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f154373d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f154370a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f154371b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f154374e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("创建独立调度器失败: "), "RequestRetry");
        }
    }

    public void c() {
        if (this.f154372c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154392a.e();
                }
            });
        }
    }
}
