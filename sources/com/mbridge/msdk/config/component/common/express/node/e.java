package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f154256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f154257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<d> f154258c;

    public e(d dVar, String str, List<d> list) {
        this.f154256a = dVar;
        this.f154257b = str;
        this.f154258c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f154258c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("876"), com.mbridge.msdk.config.component.common.util.c.c("877"), com.mbridge.msdk.config.component.common.util.c.c("878")).contains(this.f154257b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f154258c.get(0), aVar));
            for (int i10 = 1; i10 < this.f154258c.size(); i10++) {
                arrayList.add(this.f154258c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f154258c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f154256a.a(dVar, eVar, aVar), arrayList, this.f154257b, aVar);
    }
}
