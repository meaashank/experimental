package com.inmobi.media;

import F5.RunnableC1094o1;
import F5.RunnableC1098p1;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3558ga implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3568h6 f152942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3638m6 f152943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f152944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static TelemetryConfig f152945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static CrashConfig f152946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ReentrantLock f152947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3544fa f152948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReferenceQueue f152949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f152950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f152951j;

    static {
        C3558ga c3558ga = new C3558ga();
        f152942a = EnumC3568h6.f152975c;
        f152944c = new AtomicBoolean(false);
        f152947f = new ReentrantLock();
        f152948g = C3544fa.f152930a;
        f152949h = new ReferenceQueue();
        f152950i = new ConcurrentHashMap();
        f152951j = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        Config configA = C3745u2.a("telemetry", C3657nb.b(), c3558ga);
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f152945d = (TelemetryConfig) configA;
        Config configA2 = C3745u2.a("crashReporting", C3657nb.b(), c3558ga);
        kotlin.jvm.internal.G.n(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.CrashConfig");
        f152946e = (CrashConfig) configA2;
    }

    public static O4 a(String logType, String placementType, boolean z10) {
        kotlin.jvm.internal.G.p(logType, "logType");
        kotlin.jvm.internal.G.p(placementType, "placementType");
        Context contextD = C3657nb.d();
        if (contextD != null) {
            try {
                b();
                TelemetryConfig.LoggingConfig loggingConfig = f152945d.getLoggingConfig();
                double dB = b(logType, placementType, loggingConfig);
                EnumC3568h6 logLevel = a(logType, placementType, loggingConfig);
                boolean z11 = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * ((long) 1000);
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                kotlin.jvm.internal.G.p(logLevel, "logLevel");
                return new O4(contextD, dB, logLevel, z11, z10, maxNoOfEntries, expiry, false);
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        return null;
    }

    public static void b() {
        if (f152943b != null) {
            return;
        }
        ReentrantLock reentrantLock = f152947f;
        if (reentrantLock.tryLock()) {
            try {
                if (f152943b == null && f152944c.get()) {
                    Context contextD = C3657nb.d();
                    if (contextD != null) {
                        TelemetryConfig.LoggingConfig loggingConfig = f152945d.getLoggingConfig();
                        f152943b = new C3638m6(contextD, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * ((long) 1000), loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    C3638m6 c3638m6 = f152943b;
                    if (c3638m6 != null) {
                        R4.a(c3638m6);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                f152947f.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c() throws InterruptedException {
        WeakReference weakReference;
        N4 n42;
        while (f152944c.get()) {
            Reference referenceRemove = f152949h.remove();
            ConcurrentHashMap concurrentHashMap = f152950i;
            if (kotlin.collections.U.a2(concurrentHashMap.keySet(), referenceRemove)) {
                Pair pair = (Pair) concurrentHashMap.get(referenceRemove);
                if (pair != null && (weakReference = (WeakReference) pair.f217468b) != null && (n42 = (N4) weakReference.get()) != null) {
                    ((O4) n42).a("ReferenceTracker", android.support.v4.media.e.a(new StringBuilder(" reference "), (String) pair.f217467a, " reference is GCed."));
                }
                kotlin.jvm.internal.Y.k(concurrentHashMap).remove(referenceRemove);
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((WeakReference) ((Pair) entry.getValue()).f217468b).get() == null) {
                    f152950i.remove(entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC3568h6 a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.G.g(str2, "AB")) {
                        return AbstractC3582i6.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return AbstractC3582i6.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.G.g(str2, "AB")) {
                        return AbstractC3582i6.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return AbstractC3582i6.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.G.g(str2, "AB")) {
                        return AbstractC3582i6.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return AbstractC3582i6.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return AbstractC3582i6.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.G.g(str2, "AB")) {
                        return AbstractC3582i6.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return AbstractC3582i6.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return AbstractC3582i6.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f152942a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.G.g(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.G.g(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.G.g(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.G.g(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static void a(Object obj, N4 n42) {
        kotlin.jvm.internal.G.p(obj, "obj");
        try {
            if (f152945d.getLoggingConfig().getEnabled()) {
                if (n42 != null) {
                    ((O4) n42).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (n42 != null) {
                    f152950i.put(new PhantomReference(obj, f152949h), new Pair(obj.toString(), new WeakReference(n42)));
                    if (f152951j.getAndSet(true)) {
                        return;
                    }
                    ScheduledExecutorService scheduledExecutorService = AbstractC3721s6.f153342a;
                    try {
                        AbstractC3721s6.f153343b.submit(new RunnableC1094o1());
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (config instanceof TelemetryConfig) {
            f152945d = (TelemetryConfig) config;
            C3638m6 c3638m6 = f152943b;
            if (c3638m6 != null) {
                c3638m6.f153143g.set(true);
            }
            f152943b = null;
            Cc.f151826a.execute(new RunnableC1098p1());
            return;
        }
        if (config instanceof CrashConfig) {
            f152946e = (CrashConfig) config;
        }
    }

    public static final void a() {
        b();
    }
}
