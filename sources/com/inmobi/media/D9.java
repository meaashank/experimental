package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes5.dex */
public class D9 extends dd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f151853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f151854o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D9(Xc visibilityChecker, AdConfig.ViewabilityConfig viewabilityConfig, byte b10, N4 n42) {
        super(visibilityChecker, b10, n42);
        kotlin.jvm.internal.G.p(visibilityChecker, "visibilityChecker");
        this.f151853n = viewabilityConfig;
        this.f151854o = 100;
    }

    @Override // com.inmobi.media.dd
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f151853n;
        return viewabilityConfig != null ? viewabilityConfig.getVisibilityThrottleMillis() : this.f151854o;
    }

    @Override // com.inmobi.media.dd
    public final void d() {
        g();
    }
}
