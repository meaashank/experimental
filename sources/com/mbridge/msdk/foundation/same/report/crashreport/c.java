package com.mbridge.msdk.foundation.same.report.crashreport;

import android.annotation.TargetApi;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f156538e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f156539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f156540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f156541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f156542d;

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f156543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f156544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f156545c;

        private b() {
            this.f156543a = SystemClock.uptimeMillis();
        }

        public void b() {
            this.f156544b = false;
            this.f156545c = SystemClock.uptimeMillis();
            c.this.f156539a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f156544b = true;
                this.f156543a = SystemClock.uptimeMillis();
            }
        }

        public boolean a() {
            return !this.f156544b || this.f156543a - this.f156545c >= ((long) c.this.f156542d);
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f156539a = new Handler(Looper.getMainLooper());
        this.f156542d = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @TargetApi(16)
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.f156540b == null || this.f156540b.f156544b)) {
                try {
                    Thread.sleep(this.f156542d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        if (this.f156540b == null) {
                            this.f156540b = new b();
                        }
                        this.f156540b.b();
                        long jUptimeMillis = this.f156542d;
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        while (jUptimeMillis > 0) {
                            try {
                                wait(jUptimeMillis);
                            } catch (InterruptedException e10) {
                                Log.w("AnrMonitor", e10.toString());
                            }
                            jUptimeMillis = ((long) this.f156542d) - (SystemClock.uptimeMillis() - jUptimeMillis2);
                        }
                        if (!this.f156540b.a()) {
                            com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.f156541c;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f156541c != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f156541c.a(d.b(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static c a() {
        if (f156538e == null) {
            synchronized (c.class) {
                try {
                    if (f156538e == null) {
                        f156538e = new c();
                    }
                } finally {
                }
            }
        }
        return f156538e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f156542d = i10;
        this.f156541c = aVar;
        return this;
    }
}
