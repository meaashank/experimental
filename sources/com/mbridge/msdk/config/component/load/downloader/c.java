package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f154489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f154490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f154491c;

    public a a() {
        return this.f154489a;
    }

    public boolean b() {
        return this.f154490b;
    }

    public boolean c() {
        return this.f154491c;
    }

    public void a(a aVar) {
        this.f154489a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f154491c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f154490b = z10;
    }
}
