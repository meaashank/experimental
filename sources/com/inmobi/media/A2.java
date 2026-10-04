package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;

/* JADX INFO: loaded from: classes5.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f151737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3759v2 f151738b;

    public A2(Config config, InterfaceC3759v2 interfaceC3759v2) {
        kotlin.jvm.internal.G.p(config, "config");
        this.f151737a = config;
        this.f151738b = interfaceC3759v2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a22 = (A2) obj;
        return kotlin.jvm.internal.G.g(this.f151737a, a22.f151737a) && kotlin.jvm.internal.G.g(this.f151738b, a22.f151738b);
    }

    public final int hashCode() {
        int iHashCode = this.f151737a.hashCode() * 31;
        InterfaceC3759v2 interfaceC3759v2 = this.f151738b;
        return iHashCode + (interfaceC3759v2 == null ? 0 : interfaceC3759v2.hashCode());
    }

    public final String toString() {
        return "ConfigFetchInputs(config=" + this.f151737a + ", listener=" + this.f151738b + ')';
    }
}
