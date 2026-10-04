package com.bumptech.glide.load.engine;

import e.f0;
import g3.InterfaceC4444b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<InterfaceC4444b, j<?>> f139751a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<InterfaceC4444b, j<?>> f139752b = new HashMap();

    public j<?> a(InterfaceC4444b interfaceC4444b, boolean z10) {
        return c(z10).get(interfaceC4444b);
    }

    @f0
    public Map<InterfaceC4444b, j<?>> b() {
        return Collections.unmodifiableMap(this.f139751a);
    }

    public final Map<InterfaceC4444b, j<?>> c(boolean z10) {
        return z10 ? this.f139752b : this.f139751a;
    }

    public void d(InterfaceC4444b interfaceC4444b, j<?> jVar) {
        c(jVar.q()).put(interfaceC4444b, jVar);
    }

    public void e(InterfaceC4444b interfaceC4444b, j<?> jVar) {
        Map<InterfaceC4444b, j<?>> mapC = c(jVar.q());
        if (jVar.equals(mapC.get(interfaceC4444b))) {
            mapC.remove(interfaceC4444b);
        }
    }
}
