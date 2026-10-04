package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f154543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f154544c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f154547f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f154542a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f154545d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f154546e = true;

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f154547f = dVar;
        this.f154544c = bVar;
        this.f154543b = cVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        String strE = this.f154547f.e();
        if (this.f154547f.i() == 5) {
            com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
            cVar.a(true);
            return cVar;
        }
        if (this.f154544c.e() == 0) {
            this.f154544c.b(100);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f154543b.a(strE, this.f154544c.b(), new c.a() { // from class: com.mbridge.msdk.config.component.load.downloader.core.q
            @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
            public final void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
                this.f154577a.a(countDownLatch, bVar);
            }
        });
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f154542a) {
                    this.f154546e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f154542a) {
                    this.f154546e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.c cVarRun = k.a(this.f154547f, this.f154545d, this.f154543b, strE, this.f154544c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(cVarRun) || !cVarRun.c()) {
                if (this.f154544c != null) {
                    this.f154544c.a(false);
                }
                return n.a(this.f154547f, this.f154545d, this.f154543b, this.f154544c).run();
            }
            if (this.f154544c != null) {
                this.f154544c.a(true);
                this.f154544c.a(this.f154547f.k());
                this.f154544c.b(this.f154545d.h());
                this.f154544c.b(this.f154545d.d());
                this.f154544c.c(this.f154545d.n());
                this.f154544c.a(com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f154547f.k(), this.f154547f.f()));
            }
            a(this.f154547f, this.f154544c);
            return cVarRun;
        } catch (Throwable th) {
            synchronized (this.f154542a) {
                this.f154546e = false;
                throw th;
            }
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        synchronized (this.f154542a) {
            try {
                if (this.f154546e) {
                    this.f154545d = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        countDownLatch.countDown();
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.i() != 5) {
            long jF = this.f154547f.f();
            long jK = this.f154547f.k();
            dVar.a(bVar, new DownloadProgress(jF, jK, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jK, jF)));
        }
    }
}
