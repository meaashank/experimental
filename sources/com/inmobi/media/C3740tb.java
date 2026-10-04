package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3740tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3740tb f153404a = new C3740tb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3664o4 f153405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f153406c;

    public static SignalsConfig.IceConfig a(String str) {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        Config configA = C3745u2.a("signals", str, null);
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
        return ((SignalsConfig) configA).getIceConfig();
    }

    public final synchronized void b() {
        try {
            LinkedHashMap linkedHashMap = C3773w2.f153489a;
            C3745u2.a("signals", C3657nb.b(), null);
            C3726sb c3726sb = C3726sb.f153355a;
            boolean zIsSessionEnabled = a().isSessionEnabled();
            c3726sb.getClass();
            C3726sb.f153359e = zIsSessionEnabled;
            if (!zIsSessionEnabled) {
                C3726sb.f153358d = null;
            }
            C3726sb.c();
            C3657nb c3657nb = C3657nb.f153207a;
            String strH = c3657nb.h();
            if (strH == null || a(strH).isVisibleWifiEnabled()) {
                c();
            }
            String strH2 = c3657nb.h();
            if (strH2 == null || a(strH2).isLocationEnabled()) {
                C3526e6.f152844a.d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (f153406c) {
                return;
            }
            f153406c = true;
            if (f153405b == null) {
                f153405b = new C3664o4();
            }
            C3664o4 c3664o4 = f153405b;
            if (c3664o4 != null) {
                c3664o4.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (f153406c) {
                f153406c = false;
                C3664o4 c3664o4 = f153405b;
                if (c3664o4 != null) {
                    HandlerC3650n4 handlerC3650n4 = c3664o4.f153225a;
                    handlerC3650n4.f153187a = true;
                    handlerC3650n4.sendEmptyMessageDelayed(2, a().getStopRequestTimeout() * 1000);
                }
            }
            C3526e6 c3526e6 = C3526e6.f152844a;
            if (C3526e6.c()) {
                LocationManager locationManager = C3526e6.f152845b;
                if (locationManager != null) {
                    locationManager.removeUpdates(c3526e6);
                }
                GoogleApiClient googleApiClient = C3526e6.f152847d;
                if (googleApiClient != null) {
                    googleApiClient.disconnect();
                }
            }
            C3526e6.f152847d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static SignalsConfig.IceConfig a() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        return ((SignalsConfig) D4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getIceConfig();
    }
}
