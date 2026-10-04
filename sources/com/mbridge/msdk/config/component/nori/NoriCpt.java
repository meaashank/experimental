package com.mbridge.msdk.config.component.nori;

import Z3.f;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.monitor.b;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class NoriCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f154696h;

    public class a implements com.mbridge.msdk.config.component.common.network.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154697a;

        public a(String str) {
            this.f154697a = str;
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            q0.a("NoriCpt", "Request started: " + this.f154697a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.c(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.a(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void d(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.b(aVar);
        }
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("<htm") || str.contains("<body") || str.contains("<div");
    }

    private void f(String str) {
        if (d(str)) {
            g(str);
        } else {
            c(str);
        }
    }

    private void g(String str) {
        HashMap map = new HashMap();
        map.put(c.c("500"), "1");
        map.put(c.c("state_code"), "200");
        map.put(c.c("545"), str);
        map.put(c.c("is_html"), e(str) ? "1" : "2");
        map.put(c.c("request_type"), this.f154696h.f());
        a(a("906002", (Map<String, Object>) map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.nori.model.a aVar = this.f154696h;
        if (aVar == null || aVar.l() == null || this.f154696h.l().isEmpty()) {
            HashMap map = new HashMap();
            map.put(c.c(f.f79422s), "500001");
            map.put(c.c("reason"), "Network request model or URLs is null/empty");
            a(a("906002", (Map<String, Object>) map));
            return;
        }
        for (String str : this.f154696h.l()) {
            if (!TextUtils.isEmpty(str)) {
                f(c.a(str, this.f154696h.d()));
            }
        }
        a("906003", (HashMap<String, Object>) null);
    }

    private void c(String str) {
        com.mbridge.msdk.config.component.nori.monitor.a aVar = new com.mbridge.msdk.config.component.nori.monitor.a();
        com.mbridge.msdk.config.component.common.network.result.a aVar2 = new com.mbridge.msdk.config.component.common.network.result.a();
        aVar2.a(aVar);
        a aVar3 = new a(str);
        b bVar = new b(this.f154696h.k());
        aVar2.a(bVar);
        bVar.a(aVar2);
        bVar.a(aVar3);
        bVar.d();
        com.mbridge.msdk.config.component.common.network.c cVar = new com.mbridge.msdk.config.component.common.network.c(this.f154696h, aVar2);
        cVar.a(str, aVar3);
        cVar.b();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "906001";
        this.f154696h = new com.mbridge.msdk.config.component.nori.model.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put(c.c("500"), aVar.e() + "");
            map.put(c.c("state_code"), aVar.g() + "");
            map.put(c.c("545"), aVar.f());
            map.put(c.c("is_html"), e(aVar.f()) ? "1" : "2");
        }
        map.put(c.c("request_type"), this.f154696h.f());
        a(a("906002", (Map<String, Object>) map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        map.put(c.c("500"), MBridgeConstans.ENDCARD_URL_TYPE_PL);
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put(c.c("state_code"), aVar.g() + "");
            map.put(c.c("reason"), aVar.d());
            map.put(c.c(f.f79422s), Integer.valueOf(aVar.c()));
        }
        map.put(c.c("request_type"), this.f154696h.f());
        a(a("906002", (Map<String, Object>) map));
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.f154696h.c() != null) {
            try {
                return this.f154696h.c().contains(Uri.parse(str).getHost());
            } catch (Exception e10) {
                m.a(e10, new StringBuilder("Error checking host: "), "NoriCpt");
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        String strF = aVar.f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        if (d(strF)) {
            g(strF);
            aVar.a().b();
        } else {
            c(strF);
        }
    }
}
