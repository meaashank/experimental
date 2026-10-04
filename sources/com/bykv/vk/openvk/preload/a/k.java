package com.bykv.vk.openvk.preload.a;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.g<String, h> f140392a = new com.bykv.vk.openvk.preload.a.b.g<>();

    public final void a(String str, h hVar) {
        com.bykv.vk.openvk.preload.a.b.g<String, h> gVar = this.f140392a;
        if (hVar == null) {
            hVar = j.f140391a;
        }
        gVar.put(str, hVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f140392a.equals(this.f140392a);
        }
        return true;
    }

    public final Set<Map.Entry<String, h>> g() {
        return this.f140392a.entrySet();
    }

    public final int hashCode() {
        return this.f140392a.hashCode();
    }
}
