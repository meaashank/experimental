package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;

/* JADX INFO: renamed from: com.inmobi.media.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3539f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3587ib f152910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3587ib f152911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3587ib f152912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3587ib f152913d;

    public C3539f5(CrashConfig config) {
        kotlin.jvm.internal.G.p(config, "config");
        this.f152910a = new C3587ib(config.getCrashConfig().getSamplingPercent());
        this.f152911b = new C3587ib(config.getCatchConfig().getSamplingPercent());
        this.f152912c = new C3587ib(config.getANRConfig().getWatchdog().getSamplingPercent());
        this.f152913d = new C3587ib(config.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
