package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f154249d = l.a(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f154250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f154251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f154252c;

    public b(String str, d dVar, d dVar2) {
        this.f154250a = str;
        this.f154251b = dVar;
        this.f154252c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f154251b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f154252c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f154250a, aVar);
    }
}
