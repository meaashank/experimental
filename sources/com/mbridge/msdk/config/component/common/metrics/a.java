package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f154313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x f154314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    JSONObject f154315c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f154316a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f154313a;
            if (mVar == null) {
                m mVarA = m.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f154313a = mVarA;
                if (mVarA != null) {
                    JSONObject jSONObject = this.f154315c;
                    if (jSONObject != null) {
                        mVarA.a(jSONObject);
                    }
                    this.f154313a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f154315c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f154313a;
    }

    public void d() {
        if (this.f154313a == null) {
            this.f154313a = c();
        }
        this.f154313a.a();
    }

    private a() {
    }

    public static a a() {
        return b.f154316a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f154315c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th) {
                q0.b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    private x b() {
        if (this.f154314b == null) {
            this.f154314b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new c()).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f156482d, 0)).a();
        }
        return this.f154314b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f154314b = xVar;
            m mVar = this.f154313a;
            if (mVar != null) {
                mVar.i();
                m.b("metrics_component");
                this.f154313a = null;
            }
            c();
        }
    }
}
