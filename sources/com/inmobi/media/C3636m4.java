package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3636m4 extends D9 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f153134p;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3636m4(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, N4 n42) {
        C3552g4 visibilityChecker = C3594j4.f153036k;
        kotlin.jvm.internal.G.p(visibilityChecker, "visibilityChecker");
        super(visibilityChecker, viewabilityConfig, b10, n42);
        this.f153134p = 1000;
    }

    @Override // com.inmobi.media.D9, com.inmobi.media.dd
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f151853n;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f153134p;
    }
}
