package com.mbridge.msdk.config.component.common.express.node;

import B0.C0922f;

/* JADX INFO: loaded from: classes5.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f154264a;

    public i(String str) {
        this.f154264a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA;
        if (this.f154264a.startsWith(androidx.compose.ui.tooling.data.k.f105391d)) {
            objA = com.mbridge.msdk.config.component.common.express.c.a(this.f154264a, aVar);
        } else if (this.f154264a.startsWith("\\") && this.f154264a.endsWith("\\\"")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f154264a.substring(1, r2.length() - 2));
            sb2.append("\"");
            objA = sb2.toString();
        } else {
            objA = (this.f154264a.startsWith("\"") && this.f154264a.endsWith("\"")) ? C0922f.a(this.f154264a, 1, 1) : this.f154264a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objA;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f154264a.substring(1));
        return aVar2;
    }
}
