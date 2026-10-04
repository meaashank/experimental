package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class Fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ba f151936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f151937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f151940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f151941f;

    public Fa(Ba renderViewMetaData) {
        kotlin.jvm.internal.G.p(renderViewMetaData, "renderViewMetaData");
        this.f151936a = renderViewMetaData;
        this.f151940e = new AtomicInteger(renderViewMetaData.f151804j.f151908a);
        this.f151941f = new AtomicBoolean(false);
    }

    public final Map a() {
        Pair pair = new Pair("plType", String.valueOf(this.f151936a.f151795a.m()));
        Pair pair2 = new Pair("plId", String.valueOf(this.f151936a.f151795a.l()));
        Pair pair3 = new Pair("adType", String.valueOf(this.f151936a.f151795a.b()));
        Pair pair4 = new Pair("markupType", this.f151936a.f151796b);
        Pair pair5 = new Pair("networkType", C3635m3.q());
        Pair pair6 = new Pair("retryCount", String.valueOf(this.f151936a.f151798d));
        Ba ba2 = this.f151936a;
        Map mapJ0 = kotlin.collections.n0.j0(pair, pair2, pair3, pair4, pair5, pair6, new Pair("creativeType", ba2.f151799e), new Pair("adPosition", String.valueOf(ba2.f151802h)), new Pair("isRewarded", String.valueOf(this.f151936a.f151801g)));
        if (this.f151936a.f151797c.length() > 0) {
            mapJ0.put("metadataBlob", this.f151936a.f151797c);
        }
        return mapJ0;
    }

    public final void b() {
        this.f151937b = SystemClock.elapsedRealtime();
        Map mapA = a();
        long j10 = this.f151936a.f151803i.f151913a.f151959c;
        ScheduledExecutorService scheduledExecutorService = Cc.f151826a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        mapA.put("creativeId", this.f151936a.f151800f);
        Lb lb2 = Lb.f152196a;
        Lb.b("WebViewLoadCalled", mapA, Qb.f152402a);
    }
}
