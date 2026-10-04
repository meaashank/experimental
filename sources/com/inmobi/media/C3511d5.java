package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3511d5 implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3511d5 f152815a = new C3511d5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3579i3 f152816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M5 f152817c;

    static {
        kotlin.G gA = kotlin.I.a(C3497c5.f152745a);
        f152817c = new M5((CrashConfig) gA.getValue());
        Context contextD = C3657nb.d();
        if (contextD != null) {
            f152816b = new C3579i3(contextD, (CrashConfig) gA.getValue(), C3657nb.f());
        }
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (config instanceof CrashConfig) {
            M5 m52 = f152817c;
            CrashConfig crashConfig = (CrashConfig) config;
            m52.getClass();
            m52.f152223a = crashConfig;
            C3539f5 c3539f5 = m52.f152225c;
            c3539f5.getClass();
            c3539f5.f152910a.f153012a = crashConfig.getCrashConfig().getSamplingPercent();
            c3539f5.f152911b.f153012a = crashConfig.getCatchConfig().getSamplingPercent();
            c3539f5.f152912c.f153012a = crashConfig.getANRConfig().getWatchdog().getSamplingPercent();
            c3539f5.f152913d.f153012a = crashConfig.getANRConfig().getAppExitReason().getSamplingPercent();
            N3 n32 = m52.f152224b;
            if (n32 != null) {
                K3 eventConfig = crashConfig.getEventConfig();
                kotlin.jvm.internal.G.p(eventConfig, "eventConfig");
                n32.f152286i = eventConfig;
            }
            C3579i3 c3579i3 = f152816b;
            if (c3579i3 != null) {
                c3579i3.f152997a = crashConfig;
            }
        }
    }
}
