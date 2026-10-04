package com.inmobi.media;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class P implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ScheduledExecutorService f152360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f152361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlin.G f152362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static N f152363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AdConfig f152364e;

    static {
        P p10 = new P();
        f152362c = kotlin.I.a(O.f152328a);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        Config configA = C3745u2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C3657nb.b(), p10);
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        f152364e = (AdConfig) configA;
    }

    public static void a(long j10, final C3505d execute) {
        kotlin.jvm.internal.G.p(execute, "execute");
        ScheduledExecutorService scheduledExecutorService = f152360a;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new V4("AdQualityComponent-aqHandler"));
            kotlin.jvm.internal.G.o(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
            f152360a = scheduledExecutorServiceNewScheduledThreadPool;
        }
        ScheduledExecutorService scheduledExecutorService2 = f152360a;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.schedule(new Runnable() { // from class: F5.r0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.P.b(execute);
                }
            }, j10, TimeUnit.MILLISECONDS);
        } else {
            kotlin.jvm.internal.G.S("aqHandlerExecutor");
            throw null;
        }
    }

    public static final void b(InterfaceC4376a tmp0) {
        kotlin.jvm.internal.G.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static void a(final C3491c execute) {
        kotlin.jvm.internal.G.p(execute, "execute");
        ExecutorService executorService = f152361b;
        if (executorService == null || executorService.isShutdown()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new V4("AdQualityComponent-aqBeacon"));
            kotlin.jvm.internal.G.o(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            f152361b = executorServiceNewSingleThreadExecutor;
        }
        ExecutorService executorService2 = f152361b;
        if (executorService2 != null) {
            executorService2.submit(new Runnable() { // from class: F5.s0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.P.a(execute);
                }
            });
        } else {
            kotlin.jvm.internal.G.S("aqBeaconExecutor");
            throw null;
        }
    }

    public static final void a(InterfaceC4376a tmp0) {
        kotlin.jvm.internal.G.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (config instanceof AdConfig) {
            AdConfig adConfig = (AdConfig) config;
            f152364e = adConfig;
            N n10 = f152363d;
            if (n10 != null) {
                n10.f152261a = adConfig;
                if (!n10.f152262b.get()) {
                    if (adConfig.getAdQuality().getEnabled()) {
                        n10.a();
                        return;
                    }
                    return;
                }
                if (!n10.f152262b.get() || adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                Log.i("AdQualityBeaconExecutor", "kill switch encountered. shut down.");
                n10.f152262b.set(false);
                ExecutorService executorService = f152361b;
                if (executorService != null) {
                    executorService.shutdown();
                    try {
                        try {
                            executorService.shutdownNow();
                        } catch (InterruptedException unused) {
                            executorService.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                    } catch (Exception e10) {
                        Log.e("AdQualityComponent", "shutdown fail", e10);
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3809ya renderView, String url, boolean z10, JSONObject extras, C3670oa listener) {
        C3670oa c3670oa;
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(renderView, "renderView");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(extras, "extras");
        kotlin.jvm.internal.G.p(listener, "listener");
        C3464a0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.f152671j = url;
            adQualityManager.f152672k = extras;
            adQualityManager.a("report ad starting");
            if (z10) {
                adQualityManager.a("report ad capture");
                c3670oa = listener;
                adQualityManager.a(activity, 0L, true, c3670oa);
            } else {
                c3670oa = listener;
                adQualityManager.a("report ad report");
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            c3670oa = listener;
            c3670oa.f153245a.b("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        N n10 = f152363d;
        if (n10 != null) {
            n10.f152264d.put(url, new WeakReference(c3670oa));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                kotlin.G g10 = f152362c;
                if (((CopyOnWriteArrayList) g10.getValue()).size() < f152364e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) g10.getValue()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.G.S("executor");
        throw null;
    }

    public static void a(GestureDetectorOnGestureListenerC3809ya adView, GestureDetectorOnGestureListenerC3809ya renderView, String url, boolean z10, JSONObject extras, C3670oa listener) {
        C3670oa c3670oa;
        kotlin.jvm.internal.G.p(adView, "adView");
        kotlin.jvm.internal.G.p(renderView, "renderView");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(extras, "extras");
        kotlin.jvm.internal.G.p(listener, "listener");
        C3464a0 adQualityManager = renderView.getAdQualityManager();
        adQualityManager.getClass();
        if (extras.length() > 0 && url.length() > 0) {
            adQualityManager.f152671j = url;
            adQualityManager.f152672k = extras;
            if (z10) {
                c3670oa = listener;
                adQualityManager.a((View) adView, 0L, true, c3670oa);
            } else {
                c3670oa = listener;
                adQualityManager.a(new AdQualityResult("", null, url, extras.toString()), false);
            }
        } else {
            c3670oa = listener;
            c3670oa.f153245a.b("window.mraidview.broadcastEvent('AdReportFailed')");
            adQualityManager.a((Exception) null, "Incorrect parameters for reporting. url - " + url + " , extras - " + extras);
        }
        N n10 = f152363d;
        if (n10 != null) {
            n10.f152264d.put(url, new WeakReference(c3670oa));
            String creativeID = renderView.getCreativeID();
            if (creativeID.length() > 0) {
                kotlin.G g10 = f152362c;
                if (((CopyOnWriteArrayList) g10.getValue()).size() < f152364e.getAdReport().getCridls()) {
                    ((CopyOnWriteArrayList) g10.getValue()).add(creativeID);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.G.S("executor");
        throw null;
    }
}
