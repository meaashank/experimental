package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f154495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b f154496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f154498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f154499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f154500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f154501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.f f154502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f154503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f154504j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f154506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f154507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f154508n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f154510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f154511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f154512r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f154505k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f154509o = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154513a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f154513a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154502h != null) {
                    d.this.f154502h.a(this.f154513a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f154516b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f154515a = bVar;
            this.f154516b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154505k >= d.this.f154504j) {
                    d.this.b(4);
                    if (d.this.f154502h != null) {
                        d.this.f154502h.a(this.f154515a, this.f154516b);
                    }
                    d.this.a();
                    return;
                }
                d.this.b(7);
                d.this.f154505k++;
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f154519b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f154518a = bVar;
            this.f154519b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154502h != null) {
                    d.this.f154502h.a(this.f154518a, this.f154519b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    public class RunnableC0549d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154521a;

        public RunnableC0549d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f154521a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154502h != null) {
                    d.this.f154502h.c(this.f154521a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154523a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f154523a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154502h != null) {
                    d.this.f154502h.b(this.f154523a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f154525a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f154525a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f154499e != null && !d.this.f154499e.isEmpty()) {
                    String str = (String) d.this.f154499e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f154525a.a("responseHeaders", str);
                    }
                }
                if (d.this.f154502h != null) {
                    d.this.f154502h.d(this.f154525a);
                }
                d.this.a();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        this.f154501g = eVar.f154532f;
        this.f154497c = eVar.f154529c;
        this.f154503i = eVar.f154533g;
        this.f154495a = eVar.f154527a;
        this.f154510p = eVar.f154536j;
        this.f154496b = eVar.f154528b;
        this.f154512r = eVar.f154537k;
        this.f154502h = eVar.f154530d;
        this.f154504j = eVar.f154534h;
        this.f154508n = eVar.f154535i;
        this.f154499e = eVar.f154531e;
    }

    public long f() {
        return this.f154498d;
    }

    public long g() {
        return this.f154503i;
    }

    public int h() {
        return this.f154506l;
    }

    public int i() {
        return this.f154507m;
    }

    public long j() {
        return this.f154508n;
    }

    public long k() {
        return this.f154509o;
    }

    public long l() {
        return this.f154512r;
    }

    public void m() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public long b() {
        return this.f154495a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b c() {
        return this.f154496b;
    }

    public int d() {
        return this.f154497c;
    }

    public String e() {
        com.mbridge.msdk.config.component.load.downloader.b bVar = this.f154496b;
        if (bVar != null) {
            return bVar.f();
        }
        return null;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(int i10) {
        this.f154507m = i10;
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f154507m != 5) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f154511q, 0, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f154507m != 5) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0549d(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), System.currentTimeMillis(), 0L, System.currentTimeMillis(), k(), f(), 0, this.f154511q, 2, "", bVar.b(), bVar.a()));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f154507m = 5;
        Future future = this.f154500f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void b(long j10) {
        this.f154509o = j10;
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (this.f154507m != 5) {
            b(1);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), bVar.i(), System.currentTimeMillis(), k(), f(), bVar.d(), this.f154511q, 1, bVar.j(), bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void a(long j10) {
        this.f154498d = j10;
    }

    public void a(int i10) {
        this.f154506l = i10;
    }

    public void a(String str) {
        this.f154511q = str;
    }

    public void a(Future future) {
        this.f154500f = future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f154502h = null;
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f154507m != 5) {
            b(4);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
            q0.b("DownloadRequest", aVar.a().getMessage());
            l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(bVar.f(), bVar.h(), bVar.g(), 0L, 0L, k(), f(), bVar.d(), this.f154511q, 4, "", bVar.b(), bVar.a()), bVar.h());
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
        if (this.f154507m != 5) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }
}
