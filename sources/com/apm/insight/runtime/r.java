package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f137539a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f137542d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f137540b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f137541c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f137543e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!r.this.f137541c.isEmpty()) {
                if (r.this.f137542d != null) {
                    try {
                        r.this.f137542d.sendMessageAtFrontOfQueue((Message) r.this.f137541c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!r.this.f137540b.isEmpty()) {
                c cVar = (c) r.this.f137540b.poll();
                if (r.this.f137542d != null) {
                    try {
                        r.this.f137542d.sendMessageAtTime(cVar.f137548a, cVar.f137549b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f137545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f137546b;

        public b(String str) {
            super(str);
            this.f137545a = 0;
            this.f137546b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (r.this.f137543e) {
                r.this.f137542d = new Handler();
            }
            r.this.f137542d.post(r.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f137545a < 5) {
                            com.apm.insight.c.a();
                            k.a(th, "NPTH_CATCH");
                        } else if (!this.f137546b) {
                            this.f137546b = true;
                            com.apm.insight.c.a();
                            k.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f137545a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f137548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f137549b;

        public c(Message message, long j10) {
            this.f137548a = message;
            this.f137549b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.r.1
        };
        new Object() { // from class: com.apm.insight.runtime.r.2
        };
    }

    public r(String str) {
        this.f137539a = new b(str);
    }

    public final void b() {
        this.f137539a.start();
    }

    public final HandlerThread c() {
        return this.f137539a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f137542d, runnable);
    }

    @Nullable
    public final Handler a() {
        return this.f137542d;
    }

    private boolean b(Message message, long j10) {
        if (this.f137542d == null) {
            synchronized (this.f137543e) {
                try {
                    if (this.f137542d == null) {
                        this.f137540b.add(new c(message, j10));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f137542d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
