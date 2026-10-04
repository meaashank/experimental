package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        if (gVarA == null) {
            gVarA = i.b().a();
        }
        return gVarA.c0() * 1000;
    }

    public abstract V a(K k10, int i10);

    public abstract void a(K k10, V v10);

    public abstract void a(K k10, V v10, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k10, int i10) {
        return null;
    }

    public long b() {
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        if (gVarA == null) {
            gVarA = i.b().a();
        }
        return gVarA.d0() * 1000;
    }
}
