package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TransCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.trans.model.a f154841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f154842i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "911001";
        if (this.f154187a.containsKey(c.c("50")) && (this.f154187a.get(c.c("50")) instanceof Map)) {
            this.f154842i = (Map) this.f154187a.get(c.c("50"));
        }
        this.f154841h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objA = new d().a(this.f154841h.a(), this.f154190d);
        HashMap map = new HashMap();
        if (objA != null) {
            map.put(c.c("500"), objA);
        }
        a(a("911002", (Map<String, Object>) map));
    }
}
