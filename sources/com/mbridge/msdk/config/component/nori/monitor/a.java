package com.mbridge.msdk.config.component.nori.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static boolean f154711H = MBridgeConstans.DEBUG;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final AtomicInteger f154712I = new AtomicInteger(0);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final AtomicInteger f154713J = new AtomicInteger(0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Map<String, Object> f154719F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Map<String, Integer> f154720G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f154721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f154723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f154724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f154725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f154726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f154727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f154728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f154729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f154730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f154731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f154732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f154733m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f154734n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f154735o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f154736p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f154737q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f154738r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f154739s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f154740t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f154741u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f154742v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f154743w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f154744x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f154745y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f154746z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f154714A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f154715B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f154716C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f154717D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f154718E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f154721a) {
            return;
        }
        HashMap map = new HashMap();
        this.f154720G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.f154720G.put("activeThreads", Integer.valueOf(i11));
        this.f154720G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f154721a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f154721a) {
            return;
        }
        this.f154727g = (System.nanoTime() - this.f154737q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.f154721a) {
            return;
        }
        this.f154737q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.f154721a) {
            return;
        }
        this.f154726f = (System.nanoTime() - this.f154735o) / 1000000;
    }

    public void i() {
        if (this.f154721a) {
            return;
        }
        this.f154735o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f154721a));
        map2.put("retryCount", Integer.valueOf(this.f154722b));
        map2.put("requestBodySize", Long.valueOf(this.f154723c));
        map2.put("responseBodySize", Long.valueOf(this.f154724d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f154725e));
        map3.put("dnsTime", Long.valueOf(this.f154726f));
        map3.put("connectionTime", Long.valueOf(this.f154727g));
        map3.put("requestTime", Long.valueOf(this.f154728h));
        map3.put("serverTime", Long.valueOf(this.f154729i));
        map3.put("responseTime", Long.valueOf(this.f154730j));
        map3.put("queueTime", Long.valueOf(this.f154731k));
        map3.put("parsingTime", Long.valueOf(this.f154732l));
        map.put("timingInfo", map3);
        map.put("connectionInfo", this.f154719F);
        map.put("threadPoolInfo", this.f154720G);
        return map;
    }

    public void k() {
        if (this.f154721a) {
            return;
        }
        this.f154725e = (System.nanoTime() - this.f154733m) / 1000000;
    }

    public void l() {
        if (this.f154721a) {
            return;
        }
        this.f154731k = (System.nanoTime() - this.f154733m) / 1000000;
    }

    public void m() {
        if (this.f154721a) {
            return;
        }
        this.f154733m = System.nanoTime();
    }

    public void n() {
        if (this.f154721a) {
            return;
        }
        this.f154743w = System.nanoTime();
    }

    public void o() {
        if (this.f154721a) {
            return;
        }
        this.f154742v = System.nanoTime();
    }

    public void p() {
        if (this.f154721a) {
            return;
        }
        this.f154741u = System.nanoTime();
    }

    public void q() {
        if (this.f154721a) {
            return;
        }
        this.f154714A = System.nanoTime();
    }

    public void r() {
        if (this.f154721a) {
            return;
        }
        this.f154746z = System.nanoTime();
    }

    public void s() {
        if (this.f154721a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f154745y = jNanoTime;
        this.f154729i = (jNanoTime - this.f154744x) / 1000000;
    }

    public void t() {
        if (this.f154721a) {
            return;
        }
        this.f154739s = System.nanoTime();
    }

    public void u() {
        if (this.f154721a) {
            return;
        }
        this.f154738r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f154721a) {
            return;
        }
        this.f154730j = (System.nanoTime() - this.f154745y) / 1000000;
        this.f154724d = j10;
    }

    public void a(boolean z10) {
        this.f154721a = z10;
        if (z10) {
            this.f154722b++;
        }
    }

    public void a(long j10) {
        if (this.f154721a) {
            return;
        }
        this.f154728h = (System.nanoTime() - this.f154741u) / 1000000;
        this.f154723c = j10;
    }

    public void a() {
        if (this.f154721a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f154721a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (f154711H) {
            try {
                int iH = m0.h();
                int iX = m0.x();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iX));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                m.a(e10, new StringBuilder("Failed to record task rejection: "), "NetworkRequestMonitor");
            }
        }
    }
}
