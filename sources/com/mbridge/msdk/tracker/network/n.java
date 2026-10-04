package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f159966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f159967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f159968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f159969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f159970e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f159966a = blockingQueue;
        this.f159967b = mVar;
        this.f159968c = bVar;
        this.f159969d = wVar;
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                } catch (Exception e10) {
                    c0.a(e10, "Unhandled exception %s", e10.toString());
                    a0 a0Var = new a0(e10);
                    a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f159969d.a(tVar, a0Var);
                    tVar.x();
                }
            } catch (b0 e11) {
                e11.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(tVar, e11);
                tVar.x();
            }
            if (tVar.v()) {
                tVar.c("network-discard-cancelled");
                tVar.x();
                return;
            }
            if (tVar.y()) {
                a(tVar);
            }
            q qVarA = this.f159967b.a(tVar);
            tVar.a("network-http-complete");
            if (qVarA.f160022e && tVar.u()) {
                tVar.c("not-modified");
                tVar.x();
                return;
            }
            v<?> vVarA = tVar.a(qVarA);
            tVar.a("network-parse-complete");
            if (tVar.z() && vVarA.f160095b != null) {
                this.f159968c.a(tVar.e(), vVarA.f160095b);
                tVar.a("network-cache-written");
            }
            tVar.w();
            this.f159969d.a(tVar, vVarA);
            tVar.a(vVarA);
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f159970e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        b(this.f159966a.take());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f159969d.a(tVar, tVar.c(b0Var));
    }
}
