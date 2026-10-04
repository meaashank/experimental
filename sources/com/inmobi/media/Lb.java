package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.Lb;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import jd.C4806d;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Lb implements InterfaceC3808y9, InterfaceC3572ha, InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lb f152196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f152197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f152198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f152199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile TelemetryConfig f152200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static N3 f152201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3476ac f152202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Kb f152203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Vb f152204i;

    static {
        Lb lb2 = new Lb();
        f152196a = lb2;
        f152197b = "Lb";
        List listU = kotlin.collections.I.U("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady");
        f152198c = listU;
        f152199d = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        Config configA = C3745u2.a("telemetry", C3657nb.b(), lb2);
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f152200e = (TelemetryConfig) configA;
        TelemetryConfig telemetryConfig = f152200e;
        f152202g = new C3476ac(new Ob(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), kotlin.collections.U.a6(listU));
        f152203h = Kb.f152177a;
    }

    public static final void b(final String eventType, final Map keyValueMap, final Qb telemetryEventType) {
        kotlin.jvm.internal.G.p(eventType, "eventType");
        kotlin.jvm.internal.G.p(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.G.p(telemetryEventType, "telemetryEventType");
        C3657nb.a(new Runnable() { // from class: F5.U
            @Override // java.lang.Runnable
            public final void run() {
                Lb.c(eventType, keyValueMap, telemetryEventType);
            }
        });
    }

    public static final void c() {
        if (f152199d.getAndSet(true)) {
            return;
        }
        Lb lb2 = f152196a;
        if (F1.a((F1) AbstractC3531eb.e()) > 0) {
            lb2.b();
        }
        C3657nb.f().a(new int[]{2, 1}, f152203h);
        f152204i = new Vb(f152200e);
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfig = (TelemetryConfig) config;
            f152200e = telemetryConfig;
            f152202g = new C3476ac(new Ob(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), kotlin.collections.U.a6(f152198c));
            Vb vb2 = f152204i;
            if (vb2 != null) {
                vb2.f152529a = telemetryConfig;
            }
        }
    }

    public final void b() {
        if (f152199d.get()) {
            K3 eventConfig = f152200e.getEventConfig();
            eventConfig.f152163k = f152200e.getTelemetryUrl();
            N3 n32 = f152201f;
            if (n32 == null) {
                f152201f = new N3(AbstractC3531eb.e(), this, eventConfig, this);
            } else {
                n32.f152286i = eventConfig;
            }
            N3 n33 = f152201f;
            if (n33 != null) {
                K3 k32 = n33.f152286i;
                if (n33.f152283f.get() || k32 == null) {
                    return;
                }
                n33.a(k32.f152155c, true);
            }
        }
    }

    public static final void c(String eventType, Map keyValueMap, Qb telemetryEventType) {
        String str;
        kotlin.jvm.internal.G.p(eventType, "$eventType");
        kotlin.jvm.internal.G.p(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.G.p(telemetryEventType, "$telemetryEventType");
        Objects.toString(keyValueMap);
        try {
            if (f152202g == null) {
                return;
            }
            Lb lb2 = f152196a;
            if (a(eventType, keyValueMap, telemetryEventType)) {
                return;
            }
            C3476ac c3476ac = f152202g;
            if (c3476ac != null) {
                int iA = c3476ac.a(telemetryEventType, eventType);
                if (iA == 0) {
                    keyValueMap.put("samplingRate", Integer.valueOf(C4806d.K0((((double) 1) - f152200e.getSamplingFactor()) * ((double) 100))));
                } else if (iA != 1) {
                    return;
                } else {
                    keyValueMap.put("samplingRate", 100);
                }
                int iOrdinal = telemetryEventType.ordinal();
                if (iOrdinal == 0) {
                    str = ServiceProvider.NAMED_SDK;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "template";
                }
                Tb tb2 = new Tb(eventType, null, str);
                keyValueMap.put("eventType", tb2.f151967a);
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.G.o(string, "toString(...)");
                keyValueMap.put("eventId", string);
                keyValueMap.put("isTemplateEvent", Boolean.valueOf(telemetryEventType == Qb.f152403b));
                String string2 = new JSONObject(keyValueMap).toString();
                kotlin.jvm.internal.G.o(string2, "toString(...)");
                tb2.f151970d = string2;
                int iA2 = (F1.a((F1) AbstractC3531eb.e()) + 1) - f152200e.getMaxEventsToPersist();
                if (iA2 > 0) {
                    AbstractC3531eb.e().a(iA2);
                    int iA3 = Rb.a() + iA2;
                    if (iA3 != -1) {
                        Rb.f152415b = iA3;
                        K5 k52 = Rb.f152414a;
                        if (k52 != null) {
                            k52.a("count", iA3);
                        }
                    }
                }
                AbstractC3531eb.e().a(tb2);
                lb2.b();
                return;
            }
            kotlin.jvm.internal.G.S("mTelemetryValidator");
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r3, java.util.Map r4, com.inmobi.media.Qb r5) {
        /*
            com.inmobi.media.ac r0 = com.inmobi.media.Lb.f152202g
            if (r0 == 0) goto L93
            java.lang.String r1 = "telemetryEventType"
            kotlin.jvm.internal.G.p(r5, r1)
            java.lang.String r1 = "keyValueMap"
            kotlin.jvm.internal.G.p(r4, r1)
            java.lang.String r1 = "eventType"
            kotlin.jvm.internal.G.p(r3, r1)
            com.inmobi.media.Ob r1 = r0.f152707a
            boolean r1 = r1.f152344a
            r2 = 1
            if (r1 != 0) goto L1c
            goto L8e
        L1c:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L2c
            if (r5 != r2) goto L26
            goto L90
        L26:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L2c:
            com.inmobi.media.fb r5 = r0.f152708b
            r5.getClass()
            com.inmobi.media.Ob r0 = r5.f152931a
            boolean r1 = r0.f152348e
            if (r1 == 0) goto L40
            java.util.List r0 = r0.f152349f
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L40
            goto L8e
        L40:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L90
            java.lang.String r0 = "AssetDownloaded"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L90
            java.lang.String r3 = "assetType"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L90
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L69
            com.inmobi.media.Ob r0 = r5.f152931a
            boolean r0 = r0.f152345b
            if (r0 != 0) goto L69
            goto L8e
        L69:
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = "gif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7c
            com.inmobi.media.Ob r0 = r5.f152931a
            boolean r0 = r0.f152346c
            if (r0 != 0) goto L7c
            goto L8e
        L7c:
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r4 = "video"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L90
            com.inmobi.media.Ob r3 = r5.f152931a
            boolean r3 = r3.f152347d
            if (r3 != 0) goto L90
        L8e:
            r3 = 0
            goto L91
        L90:
            r3 = r2
        L91:
            r3 = r3 ^ r2
            return r3
        L93:
            java.lang.String r3 = "mTelemetryValidator"
            kotlin.jvm.internal.G.S(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Lb.a(java.lang.String, java.util.Map, com.inmobi.media.Qb):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // com.inmobi.media.InterfaceC3808y9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.M3 a() {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Lb.a():com.inmobi.media.M3");
    }
}
