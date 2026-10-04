package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class LogCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f154633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    x f154634i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f154192f = "913001";
        this.f154633h = new com.mbridge.msdk.config.component.log.model.a(map);
        this.f154634i = new x.b().a(this.f154633h.k()).b(this.f154633h.d()).d(this.f154633h.g()).c(this.f154633h.b()).e(this.f154633h.a()).a(new d()).a(new a()).a(new n()).a(this.f154633h.f(), a(this.f154633h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f154634i);
        if (this.f154633h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f154633h.h());
        }
        if (this.f154633h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
        a("913002", (HashMap<String, Object>) null);
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f154633h.i(), this.f154633h.j()) : new p(new h(), this.f154633h.c(), 0);
    }
}
