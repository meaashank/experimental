package com.mbridge.msdk.config.component.load.downloader.core;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f154554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f154555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f154556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f154557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f154558e;

    private k(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f154557d = dVar;
        this.f154556c = bVar;
        this.f154554a = cVar;
        this.f154555b = str;
        this.f154558e = bVar2;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f154556c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        File file = new File(this.f154558e.h());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f154557d.a(0L);
            cVar.b(false);
            return cVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        long jK = this.f154556c.k();
        if (jK > 0 && jC != jK) {
            a(cVar, file);
            return cVar;
        }
        this.f154557d.b(jK);
        this.f154557d.a(jK != 0 ? jC : this.f154556c.g());
        cVar.b(a(jC));
        return cVar;
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.c cVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f154557d.b(this.f154556c.k());
        this.f154557d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f154556c.f(), file.getAbsolutePath(), this.f154556c.d(), this.f154556c.n(), jLastModified, this.f154556c.k(), this.f154556c.g(), this.f154556c.e(), this.f154556c.c(), this.f154556c.j(), this.f154556c.h(), this.f154556c.b(), this.f154556c.a()), this.f154558e.h());
        cVar.b(a(length));
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f154556c.k(), j10) >= this.f154558e.e();
    }
}
