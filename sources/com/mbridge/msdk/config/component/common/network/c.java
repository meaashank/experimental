package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;
import org.apache.http.HttpVersion;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f154317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f154318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f154319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f154320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154322f = HttpVersion.HTTP;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f154323g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f154324h = null;

    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f154323g != null) {
                c.this.f154323g.a();
            }
        }
    }

    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f154324h != null) {
                c.this.f154324h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f154319c = aVar;
        this.f154318b = aVar2;
        this.f154320d = aVar2.a();
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f154319c, this.f154318b, this.f154317a);
            this.f154323g = aVar;
            aVar.a(this.f154321e);
            this.f154320d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f154321e = str;
        this.f154317a = aVar;
        this.f154322f = this.f154319c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f154317a;
        if (aVar != null) {
            aVar.a(this.f154318b);
        }
        if (this.f154322f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f154319c, this.f154318b, this.f154317a);
            this.f154324h = aVar;
            aVar.a(this.f154321e);
            this.f154320d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
