package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f140400d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f140401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f140402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f140403c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.b.b.a f140404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f140405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f140406g;

    public abstract Object a(b<OUT> bVar, IN in2) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f140406g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f140405f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f140405f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f140405f, this);
    }

    public final OUT f() {
        return this.f140403c;
    }

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f140405f = new c(bVar);
        this.f140401a = dVar;
        this.f140402b = in2;
        this.f140404e = aVar;
        if (dVar != null) {
            this.f140406g = dVar.f140406g;
        } else {
            long andIncrement = f140400d.getAndIncrement();
            this.f140406g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f140405f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f140405f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f140404e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f140405f, this, th);
    }
}
