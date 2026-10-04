package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes5.dex */
public final class E2 {
    public static final Pair a(TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            EmptyList emptyList = EmptyList.f217510a;
            return new Pair(emptyList, emptyList);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C3801y2 c3801y2 = new C3801y2();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            long jA = c3801y2.a(str, ((Config) entry.getValue()).getAccountId$media_release());
            arrayList.add(str);
            arrayList2.add(Long.valueOf(jA));
        }
        return new Pair(arrayList, arrayList2);
    }
}
