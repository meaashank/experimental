package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import g3.InterfaceC4444b;

/* JADX INFO: loaded from: classes2.dex */
public class n<Z> implements s<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s<Z> f139746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f139747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4444b f139748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f139749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f139750g;

    public interface a {
        void c(InterfaceC4444b interfaceC4444b, n<?> nVar);
    }

    public n(s<Z> sVar, boolean z10, boolean z11, InterfaceC4444b interfaceC4444b, a aVar) {
        y3.m.f(sVar, "Argument must not be null");
        this.f139746c = sVar;
        this.f139744a = z10;
        this.f139745b = z11;
        this.f139748e = interfaceC4444b;
        y3.m.f(aVar, "Argument must not be null");
        this.f139747d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void a() {
        if (this.f139749f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f139750g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f139750g = true;
        if (this.f139745b) {
            this.f139746c.a();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<Z> b() {
        return this.f139746c.b();
    }

    public synchronized void c() {
        if (this.f139750g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f139749f++;
    }

    public s<Z> d() {
        return this.f139746c;
    }

    public boolean e() {
        return this.f139744a;
    }

    public void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f139749f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f139749f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f139747d.c(this.f139748e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Z get() {
        return this.f139746c.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f139746c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f139744a + ", listener=" + this.f139747d + ", key=" + this.f139748e + ", acquired=" + this.f139749f + ", isRecycled=" + this.f139750g + ", resource=" + this.f139746c + '}';
    }
}
