package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class L3 extends F1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(String tableName, String tableSchema) {
        super(tableName, tableSchema);
        kotlin.jvm.internal.G.p(tableName, "tableName");
        kotlin.jvm.internal.G.p(tableSchema, "tableSchema");
    }

    public final void a(List eventIdList) {
        kotlin.jvm.internal.G.p(eventIdList, "eventIdList");
        if (eventIdList.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = eventIdList.size() - 1;
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(eventIdList.get(i10));
            sb2.append(",");
        }
        sb2.append(eventIdList.get(eventIdList.size() - 1));
        a("id IN (" + ((Object) sb2) + ')', null);
    }

    public final ArrayList b(int i10) {
        ArrayList arrayListA = F1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListA.get(i11);
            i11++;
            G1 g12 = (G1) obj;
            if (g12 != null) {
                arrayList.add(g12);
            }
        }
        return arrayList;
    }

    public final void a(long j10) {
        Context contextD = C3657nb.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            J5.a(contextD, "batch_processing_info").a(android.support.v4.media.e.a(new StringBuilder(), this.f151914a, "_last_batch_process"), j10);
        }
    }

    public final void a(int i10) {
        ArrayList arrayListA = F1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        int size = arrayListA.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListA.get(i12);
            i12++;
            G1 g12 = (G1) obj;
            arrayList.add(g12 != null ? Integer.valueOf(g12.f151969c) : null);
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj2;
            if (num != null) {
                arrayList2.add(num);
            }
        }
        a((List) arrayList2);
    }
}
