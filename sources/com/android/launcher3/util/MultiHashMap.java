package com.android.launcher3.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MultiHashMap<K, V> extends HashMap<K, ArrayList<V>> {
    public MultiHashMap() {
    }

    public void addToList(K k10, V v10) {
        ArrayList arrayList = (ArrayList) get(k10);
        if (arrayList != null) {
            arrayList.add(v10);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(v10);
        put(k10, arrayList2);
    }

    public MultiHashMap(int i10) {
        super(i10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public MultiHashMap<K, V> clone() {
        MultiHashMap<K, V> multiHashMap = new MultiHashMap<>(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            multiHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        return multiHashMap;
    }
}
