package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3543f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f152929c;

    public C3543f9(String hyperId, String spHost, SignalsConfig.NovatiqConfig novatiqConfig) {
        kotlin.jvm.internal.G.p(hyperId, "hyperId");
        kotlin.jvm.internal.G.p(spHost, "spHost");
        kotlin.jvm.internal.G.p(novatiqConfig, "novatiqConfig");
        this.f152927a = hyperId;
        this.f152928b = spHost;
        this.f152929c = novatiqConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3543f9)) {
            return false;
        }
        C3543f9 c3543f9 = (C3543f9) obj;
        return kotlin.jvm.internal.G.g(this.f152927a, c3543f9.f152927a) && kotlin.jvm.internal.G.g(this.f152928b, c3543f9.f152928b) && kotlin.jvm.internal.G.g(this.f152929c, c3543f9.f152929c);
    }

    public final int hashCode() {
        return this.f152929c.hashCode() + ((((this.f152928b.hashCode() + (((this.f152927a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098) * 31);
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f152927a + ", sspId=i6i, spHost=" + this.f152928b + ", pubId=inmobi, novatiqConfig=" + this.f152929c + ')';
    }
}
