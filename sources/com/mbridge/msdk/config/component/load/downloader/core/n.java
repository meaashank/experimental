package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f154565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f154566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f154567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f154568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f154569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f154570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f154571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f154572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f154573i;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f154566b = dVar;
        this.f154568d = bVar;
        this.f154565a = cVar;
        this.f154567c = bVar2;
    }

    private boolean a(int i10) {
        return i10 == 206;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.load.downloader.core.n.run():com.mbridge.msdk.config.component.load.downloader.c");
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        if (!a(i10)) {
            this.f154566b.a(0L);
            this.f154566b.b(0L);
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = this.f154568d;
            if (bVar != null) {
                bVar.a(0);
                this.f154568d.c(0L);
                this.f154568d.b(0L);
            }
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f154567c.h()));
        }
        b0 b0VarD = a0Var.d();
        this.f154572h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            cVar.a(new IOException("response body is null"));
            this.f154566b.b(0L);
            this.f154566b.a(0L);
            return cVar;
        }
        long jK = this.f154572h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f154573i = strA;
        this.f154566b.a(strA);
        if (jK <= 0) {
            cVar.a(new IOException("response content length is null"));
            return cVar;
        }
        if (this.f154566b.k() == 0) {
            this.f154566b.b(jK);
        }
        InputStream inputStreamD = this.f154572h.d();
        this.f154570f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            cVar.a(new IOException("response inputStream is null"));
            return cVar;
        }
        this.f154567c.a(this.f154566b.k());
        this.f154566b.c(this.f154567c);
        return a(str, str2);
    }

    private void a(Exception exc) {
        this.f154569e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        this.f154567c.b(System.currentTimeMillis());
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.f154571g = aVarB;
        aVarB.seek(this.f154566b.f());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f154570f.read(bArr);
            if (i10 != -1) {
                this.f154571g.write(bArr, 0, i10);
                d dVar = this.f154566b;
                dVar.a(dVar.f() + ((long) i10));
                this.f154571g.flushAndSync();
                int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f154566b.k(), this.f154566b.f());
                this.f154567c.a(iA);
                a(this.f154566b, this.f154567c, this.f154566b.f(), this.f154566b.k(), iA);
                if (this.f154567c.e() == 100 || iA < this.f154567c.e()) {
                    if (this.f154566b.i() == 5) {
                        cVar.a(true);
                        break;
                    }
                }
            }
        }
        try {
            if (this.f154566b.i() != 5 && this.f154566b.k() == this.f154566b.f()) {
                this.f154567c.b(com.mbridge.msdk.config.component.common.file.a.d(this.f154567c.h()));
                this.f154567c.c(System.currentTimeMillis());
            }
        } catch (Throwable th) {
            q0.b(IDownloadTask.TAG, th.getMessage(), th);
        }
        if (!cVar.b()) {
            cVar.b(true);
        }
        return cVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.i() != 5) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}
