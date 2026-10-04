package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194492a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f194493b;

    public synchronized void a() {
        this.f194492a++;
    }

    public synchronized void b() {
        this.f194492a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f194493b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.f194492a > 0 || (runnable = this.f194493b) == null) {
            return;
        }
        runnable.run();
    }
}
