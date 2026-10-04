package com.inmobi.media;

import android.util.Base64;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.media.AbstractC3616kc;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.C5013e;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3616kc {
    public static String a(Map map, String str) {
        EnumC3568h6 enumC3568h6 = C3558ga.f152942a;
        O4 o4A = C3558ga.a("getToken", "AB", false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            C3671ob.a((String) map.get("tp"));
            C3671ob.b((String) map.get("tp-v"));
        }
        a();
        if (!C3657nb.q()) {
            if (o4A != null) {
                o4A.b("com.inmobi.media.kc", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, o4A);
            return null;
        }
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        if (((RootConfig) D4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, o4A);
            if (o4A != null) {
                o4A.b("com.inmobi.media.kc", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        C3630lc c3630lc = new C3630lc(new C3686pc(((AdConfig) D4.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getIncludeIdParams()), o4A);
        c3630lc.f153117z = map;
        c3630lc.f153116y = str;
        HashMap mapM = kotlin.collections.n0.M(new Pair("h-user-agent", C3657nb.k()));
        HashMap map2 = c3630lc.f152562k;
        if (map2 != null) {
            map2.putAll(mapM);
        }
        c3630lc.f();
        if (!c3630lc.f152555d) {
            if (o4A != null) {
                o4A.b("com.inmobi.media.kc", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, o4A);
            return null;
        }
        a(jCurrentTimeMillis, o4A);
        if (o4A != null) {
            o4A.a("com.inmobi.media.kc", "get signals success");
        }
        String strC = c3630lc.c();
        Charset charset = C5013e.f218326b;
        byte[] bytes = strC.getBytes(charset);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 8);
        kotlin.jvm.internal.G.o(bArrEncode, "encode(...)");
        return new String(bArrEncode, charset);
    }

    public static final void b() {
        HashMap mapM = kotlin.collections.n0.M(new Pair("networkType", C3635m3.q()), new Pair("plType", "AB"));
        Lb lb2 = Lb.f152196a;
        Lb.b("AdGetSignalsCalled", mapM, Qb.f152402a);
    }

    public static void a(final int i10, final long j10, O4 o42) {
        if (o42 != null) {
            o42.c("com.inmobi.media.kc", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        C3657nb.a(new Runnable() { // from class: F5.E1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3616kc.a(j10, i10);
            }
        });
        if (o42 != null) {
            o42.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap mapM = kotlin.collections.n0.M(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j10)), new Pair("networkType", C3635m3.q()), new Pair("errorCode", Integer.valueOf(i10)), new Pair("plType", "AB"));
        Lb lb2 = Lb.f152196a;
        Lb.b("AdGetSignalsFailed", mapM, Qb.f152402a);
    }

    public static void a(final long j10, O4 o42) {
        if (o42 != null) {
            o42.c("com.inmobi.media.kc", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        C3657nb.a(new Runnable() { // from class: F5.F1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3616kc.a(j10);
            }
        });
        if (o42 != null) {
            o42.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapM = kotlin.collections.n0.M(new Pair("latency", Long.valueOf(System.currentTimeMillis() - j10)), new Pair("networkType", C3635m3.q()), new Pair("plType", "AB"));
        Lb lb2 = Lb.f152196a;
        Lb.b("AdGetSignalsSucceeded", mapM, Qb.f152402a);
    }

    public static void a() {
        C3657nb.a(new F5.D1());
    }
}
