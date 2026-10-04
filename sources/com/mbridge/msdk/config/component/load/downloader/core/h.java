package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f154550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f154551d;

    public h(d dVar) {
        this.f154550c = dVar;
        this.f154548a = dVar.d();
        this.f154549b = dVar.h();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "Start download task.");
        this.f154551d = this.f154550c.c();
        if (this.f154550c.i() != 7) {
            this.f154550c.d(this.f154551d);
        }
        this.f154550c.b(0);
        com.mbridge.msdk.config.component.load.downloader.c cVarRun = g.a(this.f154550c, this.f154551d, l.c().b()).run();
        if (cVarRun.c()) {
            this.f154550c.e(this.f154551d);
        } else if (cVarRun.a() != null) {
            this.f154550c.a(this.f154551d, cVarRun.a());
        } else if (cVarRun.b()) {
            this.f154550c.b(this.f154551d);
        }
    }
}
