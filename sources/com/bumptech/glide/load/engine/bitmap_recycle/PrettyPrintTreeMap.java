package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbA.append('{');
            sbA.append(entry.getKey());
            sbA.append(':');
            sbA.append(entry.getValue());
            sbA.append("}, ");
        }
        if (!isEmpty()) {
            sbA.replace(sbA.length() - 2, sbA.length(), "");
        }
        sbA.append(" )");
        return sbA.toString();
    }
}
