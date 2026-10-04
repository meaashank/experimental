package com.inmobi.media;

import com.inmobi.commons.core.configs.TelemetryConfig;
import ed.InterfaceC4376a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class W6 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W6 f152551a = new W6();

    public W6() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        return ((TelemetryConfig) D4.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getLpConfig();
    }
}
