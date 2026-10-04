package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f156437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f156438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f156439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156440d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f156440d = i10;
        this.f156437a = bArr;
        this.f156439c = map;
        if (list == null) {
            this.f156438b = null;
        } else {
            this.f156438b = Collections.unmodifiableList(list);
        }
    }
}
