package com.mbridge.msdk.config.component.load;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.b;
import com.mbridge.msdk.config.component.load.downloader.d;
import com.mbridge.msdk.config.component.load.downloader.e;
import com.mbridge.msdk.config.component.load.downloader.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.tonyodev.fetch2core.server.FileResponse;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class LoadCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.model.a f154467l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f154463h = "LoadCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f154464i = "1000001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f154465j = "1000002";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final String f154466k = "1000003";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f154468m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f154469n = new a();

    public class a implements f {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void b(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912002", (Map<String, Object>) map));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void c(b bVar) {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void d(b bVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c("file_path"), bVar.h());
            map.put(c.c(FileResponse.FIELD_MD5), bVar.j());
            map.put(c.c("hit_cache"), Integer.valueOf(bVar.k() ? 1 : 0));
            map.put(c.c(R9.c.f67796d), 1);
            try {
                com.mbridge.msdk.config.component.common.file.b bVarF = com.mbridge.msdk.config.component.common.file.a.f(LoadCpt.this.f154467l.f());
                if (bVarF != null && bVarF.b().contains("zip") && bVar.d() >= 100) {
                    if (TextUtils.isEmpty(bVarF.d())) {
                        map.put(c.c("file_path"), bVarF.d());
                    } else {
                        if (!com.mbridge.msdk.config.component.common.file.a.f(bVar.h(), com.mbridge.msdk.config.component.common.file.a.d(LoadCpt.this.f154467l.f(), LoadCpt.this.f154467l.b()))) {
                            LoadCpt.this.a("912005", "1000003", "Unzip file failed");
                            return;
                        }
                        map.put(c.c("file_path"), com.mbridge.msdk.config.component.common.file.a.e(LoadCpt.this.f154467l.f(), LoadCpt.this.f154467l.b()));
                    }
                }
                LoadCpt loadCpt = LoadCpt.this;
                loadCpt.a(loadCpt.a("912004", (Map<String, Object>) new HashMap(map)));
                LoadCpt loadCpt2 = LoadCpt.this;
                loadCpt2.a(loadCpt2.a("912008", (Map<String, Object>) new HashMap(map)));
                if (bVar.k()) {
                    return;
                }
                LoadCpt.this.a("912006", (HashMap<String, Object>) new HashMap(map));
            } catch (Exception e10) {
                LoadCpt.this.a("912005", "1000002", e10.getMessage());
                HashMap map2 = new HashMap(map);
                map2.put(c.c(R9.c.f67796d), 0);
                map2.put(c.c("reason"), e10.getMessage());
                LoadCpt loadCpt3 = LoadCpt.this;
                loadCpt3.a(loadCpt3.a("912008", (Map<String, Object>) map2));
            }
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(bVar.d()));
            map.put(c.c("file_size"), String.valueOf(bVar.c()));
            map.put(c.c(Z3.f.f79422s), "1000002");
            map.put(c.c("reason"), aVar.a().getMessage());
            map.put(c.c(R9.c.f67796d), 0);
            LoadCpt loadCpt = LoadCpt.this;
            loadCpt.a(loadCpt.a("912005", (Map<String, Object>) new HashMap(map)));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912008", (Map<String, Object>) new HashMap(map)));
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.f
        public void a(b bVar, DownloadProgress downloadProgress) {
            int currentDownloadRate = downloadProgress.getCurrentDownloadRate();
            if (bVar.k()) {
                return;
            }
            LoadCpt loadCpt = LoadCpt.this;
            if (currentDownloadRate == loadCpt.f154468m) {
                return;
            }
            loadCpt.f154468m = currentDownloadRate;
            HashMap map = new HashMap();
            map.put(c.c("percent"), String.valueOf(currentDownloadRate));
            map.put(c.c("file_size"), String.valueOf(downloadProgress.getTotal()));
            LoadCpt loadCpt2 = LoadCpt.this;
            loadCpt2.a(loadCpt2.a("912003", (Map<String, Object>) map));
        }
    }

    private void g() {
        try {
            com.mbridge.msdk.config.component.common.file.b bVarB = com.mbridge.msdk.config.component.common.file.a.b(this.f154467l.f(), this.f154467l.b());
            if (bVarB == null) {
                a("912005", "1000002", "Get local file path error");
                return;
            }
            try {
                new URL(this.f154467l.f());
                int iD = (int) (this.f154467l.d() * 100.0f);
                com.mbridge.msdk.config.component.load.model.a aVar = this.f154467l;
                b bVar = new b(aVar, aVar.f(), this.f154467l.b(), bVarB.a(), iD);
                bVar.a(this.f154467l.a());
                e.a().a(bVar).b(this.f154467l.h()).a(this.f154467l.h()).c(this.f154467l.h()).a(2).withHttpRetryCounter(this.f154467l.g()).a(this.f154469n).withTimeout(60000L).build().m();
            } catch (Exception e10) {
                q0.b("LoadCpt", e10.getMessage());
                a("912005", "1000002", "Illegal Uri");
            }
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
            HashMap map = new HashMap();
            map.put(c.c(Z3.f.f79422s), "");
            map.put(c.c("reason"), th.getMessage());
            a(a("912005", (Map<String, Object>) map));
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "912001";
        this.f154467l = new com.mbridge.msdk.config.component.load.model.a(map);
        h();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (TextUtils.isEmpty(this.f154467l.c())) {
            a("912005", "1000001", "Input parameter error");
            return;
        }
        if (this.f154467l.c().equals(c.c("310"))) {
            j();
        }
        if (this.f154467l.c().equals(c.c("311"))) {
            i();
        }
        a("912007", (HashMap<String, Object>) null);
    }

    public void h() {
        try {
            if (e.a().b()) {
                return;
            }
            e.a().a(new d.b().a(this.f154467l.e()).a());
        } catch (Throwable th) {
            q0.b("LoadCpt", th.getMessage());
        }
    }

    public void i() {
        if (this.f154467l != null) {
            String strB = e.a().b(this.f154467l.f());
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            e.a().a(strB);
        }
    }

    public void j() {
        if (this.f154467l != null) {
            g();
        }
    }
}
