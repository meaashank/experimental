package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f154261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f154262b;

    public g(d dVar, d dVar2) {
        this.f154261a = dVar;
        this.f154262b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f154261a.a(dVar, eVar, aVar);
        Object objA2 = this.f154262b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }
}
