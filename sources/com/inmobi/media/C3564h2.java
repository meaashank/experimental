package com.inmobi.media;

import F5.RunnableC1113t1;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.C3564h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3564h2 implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f152958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Z1 f152959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerThread f152960d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AdConfig.ImaiConfig f152963g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3550g2 f152968l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3564h2 f152957a = new C3564h2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List f152961e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f152962f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f152964h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f152965i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f152966j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kotlin.G f152967k = kotlin.I.a(C3522e2.f152837a);

    static {
        C3657nb.a(new RunnableC1113t1());
        f152968l = new C3550g2();
    }

    public static final HashMap a(C3564h2 c3564h2, V1 v12) {
        c3564h2.getClass();
        HashMap map = new HashMap();
        try {
            AdConfig.ImaiConfig imaiConfig = f152963g;
            int maxRetries = ((imaiConfig != null ? imaiConfig.getMaxRetries() : 0) - v12.f152505f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static final /* synthetic */ String f() {
        return "h2";
    }

    public static void i() {
        try {
            AtomicBoolean atomicBoolean = f152962f;
            atomicBoolean.set(false);
            synchronized (f152965i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = f152960d;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        f152960d = null;
                        f152959c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean g() {
        return ((Boolean) f152967k.getValue()).booleanValue();
    }

    public final void h() {
        HandlerThread handlerThread;
        try {
            boolean z10 = C3473a9.f152704a;
            if (C3473a9.a(false) != null) {
                return;
            }
            synchronized (f152965i) {
                try {
                    AtomicBoolean atomicBoolean = f152962f;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        if (f152960d == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            f152960d = handlerThread2;
                            W3.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f152959c == null && (handlerThread = f152960d) != null) {
                            Looper looper = handlerThread.getLooper();
                            kotlin.jvm.internal.G.o(looper, "getLooper(...)");
                            f152959c = new Z1(looper);
                        }
                        W1 w1B = AbstractC3531eb.b();
                        if (w1B == null || F1.a((F1) w1B) == 0) {
                            atomicBoolean.set(false);
                            i();
                        } else {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            Z1 z12 = f152959c;
                            if (z12 != null) {
                                z12.sendMessage(messageObtain);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void b(C3564h2 c3564h2, V1 v12) {
        c3564h2.getClass();
        LinkedHashMap linkedHashMap = f152966j;
        L1 l12 = (L1) linkedHashMap.get(Integer.valueOf(v12.f152500a));
        if (l12 != null) {
            l12.a(v12);
        }
        linkedHashMap.remove(Integer.valueOf(v12.f152500a));
    }

    public static final void c(C3564h2 c3564h2, V1 v12) {
        c3564h2.getClass();
        int i10 = v12.f152505f;
        if (i10 > 0) {
            v12.f152505f = i10 - 1;
            v12.f152506g = System.currentTimeMillis();
            W1 w1B = AbstractC3531eb.b();
            w1B.getClass();
            w1B.b(v12, "id = ?", new String[]{String.valueOf(v12.f152500a)});
        }
    }

    public static final /* synthetic */ void a(C3564h2 c3564h2) {
        c3564h2.getClass();
        i();
    }

    public static final void a() {
        C3564h2 c3564h2 = f152957a;
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new V4("h2"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f152958b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f152960d = handlerThread;
            W3.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f152960d;
            kotlin.jvm.internal.G.m(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            kotlin.jvm.internal.G.o(looper, "getLooper(...)");
            f152959c = new Z1(looper);
            LinkedHashMap linkedHashMap = C3773w2.f153489a;
            Config configA = C3745u2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C3657nb.b(), c3564h2);
            kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            f152963g = ((AdConfig) configA).getImaiConfig();
            C3657nb.f().a(new int[]{10, 11, 2, 1}, C3536f2.f152907a);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(C3564h2 c3564h2, String str, boolean z10, L1 l12, N4 n42, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            l12 = null;
        }
        c3564h2.b(str, z10, l12, n42);
    }

    public final void b(@NotNull final String url, final boolean z10, @Nullable final L1 l12, @Nullable final N4 n42) {
        kotlin.jvm.internal.G.p(url, "url");
        G9 g92 = AbstractC3578i2.f152996a;
        AbstractC3578i2.a(new Runnable() { // from class: F5.v1
            @Override // java.lang.Runnable
            public final void run() {
                C3564h2.b(url, z10, n42, l12);
            }
        }, F9.f151932b);
    }

    public static final void c(String url, boolean z10, N4 n42) {
        kotlin.jvm.internal.G.p(url, "$url");
        try {
            if (f152957a.g()) {
                AdConfig.ImaiConfig imaiConfig = f152963g;
                V1 v12 = new V1(url, null, z10, true, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, Opcodes.MULTIANEWARRAY);
                if (n42 != null) {
                    ((O4) n42).c("h2", "Received click (" + url + ") for pinging in WebView");
                }
                a(v12, (L1) null, n42);
            }
        } catch (Exception e10) {
            if (n42 != null) {
                ((O4) n42).b("h2", jd.a(e10, O5.a("h2", "TAG", "SDK encountered unexpected error in pinging click over WebView; ")));
            }
        }
    }

    public static final void b(String url, boolean z10, N4 n42, L1 l12) {
        kotlin.jvm.internal.G.p(url, "$url");
        try {
            if (f152957a.g()) {
                AdConfig.ImaiConfig imaiConfig = f152963g;
                V1 v12 = new V1(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, Opcodes.MULTIANEWARRAY);
                if (n42 != null) {
                    ((O4) n42).a("h2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(v12, l12, n42);
            }
        } catch (Exception e10) {
            if (n42 != null) {
                ((O4) n42).b("h2", jd.a(e10, O5.a("h2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public final void b(@NotNull final String url, final boolean z10, @Nullable final N4 n42) {
        kotlin.jvm.internal.G.p(url, "url");
        G9 g92 = AbstractC3578i2.f152996a;
        AbstractC3578i2.a(new Runnable() { // from class: F5.s1
            @Override // java.lang.Runnable
            public final void run() {
                C3564h2.c(url, z10, n42);
            }
        }, F9.f151933c);
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public void a(@NotNull Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        AdConfig adConfig = config instanceof AdConfig ? (AdConfig) config : null;
        f152963g = adConfig != null ? adConfig.getImaiConfig() : null;
    }

    public final void a(@NotNull String url, boolean z10, @Nullable N4 n42) {
        kotlin.jvm.internal.G.p(url, "url");
        a(url, z10, (L1) null, n42);
    }

    public static /* synthetic */ void a(C3564h2 c3564h2, String str, boolean z10, L1 l12, N4 n42, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            l12 = null;
        }
        c3564h2.a(str, z10, l12, n42);
    }

    public final void a(@NotNull final String url, final boolean z10, @Nullable final L1 l12, @Nullable final N4 n42) {
        kotlin.jvm.internal.G.p(url, "url");
        G9 g92 = AbstractC3578i2.f152996a;
        AbstractC3578i2.a(new Runnable() { // from class: F5.u1
            @Override // java.lang.Runnable
            public final void run() {
                C3564h2.a(url, z10, n42, l12);
            }
        }, F9.f151933c);
    }

    public static final void a(String url, boolean z10, N4 n42, L1 l12) {
        kotlin.jvm.internal.G.p(url, "$url");
        try {
            if (f152957a.g()) {
                AdConfig.ImaiConfig imaiConfig = f152963g;
                V1 v12 = new V1(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, Opcodes.MULTIANEWARRAY);
                if (n42 != null) {
                    ((O4) n42).a("h2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(v12, l12, n42);
            }
        } catch (Exception e10) {
            if (n42 != null) {
                ((O4) n42).b("h2", jd.a(e10, O5.a("h2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public static /* synthetic */ void a(C3564h2 c3564h2, String str, Map map, boolean z10, L1 l12, F9 f92, N4 n42, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l12 = null;
        }
        c3564h2.a(str, map, z10, l12, f92, n42);
    }

    public final void a(@NotNull final String url, @Nullable final Map<String, String> map, final boolean z10, @Nullable final L1 l12, @NotNull F9 priority, @Nullable final N4 n42) {
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(priority, "priority");
        G9 g92 = AbstractC3578i2.f152996a;
        AbstractC3578i2.a(new Runnable() { // from class: F5.r1
            @Override // java.lang.Runnable
            public final void run() {
                C3564h2.a(url, map, z10, n42, l12);
            }
        }, priority);
    }

    public static final void a(String url, Map map, boolean z10, N4 n42, L1 l12) {
        kotlin.jvm.internal.G.p(url, "$url");
        try {
            if (f152957a.g()) {
                AdConfig.ImaiConfig imaiConfig = f152963g;
                V1 v12 = new V1(url, map, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 193);
                if (n42 != null) {
                    ((O4) n42).a("h2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(v12, l12, n42);
            }
        } catch (Exception e10) {
            if (n42 != null) {
                ((O4) n42).b("h2", jd.a(e10, O5.a("h2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static void a(final V1 click, L1 l12, final N4 n42) {
        V1 v12;
        Z1 z12 = f152959c;
        if (z12 != null) {
            z12.f152639a = n42;
        }
        if (n42 != null) {
            ((O4) n42).c("h2", "record Click");
        }
        AdConfig.ImaiConfig imaiConfig = f152963g;
        if (imaiConfig != null) {
            W1 w1B = AbstractC3531eb.b();
            int maxDbEvents = imaiConfig.getMaxDbEvents();
            synchronized (w1B) {
                try {
                    kotlin.jvm.internal.G.p(click, "click");
                    if (F1.a((F1) w1B) >= maxDbEvents && (v12 = (V1) w1B.b("ts= (SELECT MIN(ts) FROM click LIMIT 1)", null)) != null) {
                        f152957a.a(click, "DB_OVERLOAD");
                        w1B.a("id = ?", new String[]{String.valueOf(v12.f152500a)});
                    }
                    w1B.a(click);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (l12 != null) {
                f152966j.put(Integer.valueOf(click.f152500a), l12);
            }
        }
        boolean z10 = C3473a9.f152704a;
        if (C3473a9.a(false) != null) {
            if (n42 != null) {
                ((O4) n42).b("h2", "No network available. Saving click for later processing ...");
            }
            f152962f.set(false);
            i();
            return;
        }
        if (n42 != null) {
            StringBuilder sbA = O5.a("h2", "TAG", "submit click - ");
            sbA.append(click.f152500a);
            ((O4) n42).a("h2", sbA.toString());
        }
        ThreadPoolExecutor threadPoolExecutor = f152958b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new Runnable() { // from class: F5.w1
                @Override // java.lang.Runnable
                public final void run() {
                    C3564h2.a(click, n42);
                }
            });
        }
    }

    public static final void a(V1 click, N4 n42) {
        kotlin.jvm.internal.G.p(click, "$click");
        SystemClock.elapsedRealtime();
        if (click.f152504e) {
            if (n42 != null) {
                ((O4) n42).c("h2", "ping in web view");
            }
            new C3480b2(f152968l, n42).a(click);
        } else {
            if (n42 != null) {
                ((O4) n42).c("h2", "ping in http executor");
            }
            new C3494c2(f152968l, n42).a(click);
        }
    }

    public final void a(@NotNull V1 click, @NotNull String error) {
        kotlin.jvm.internal.G.p(click, "click");
        kotlin.jvm.internal.G.p(error, "error");
        LinkedHashMap linkedHashMap = f152966j;
        L1 l12 = (L1) linkedHashMap.get(Integer.valueOf(click.f152500a));
        if (l12 != null) {
            l12.a(click, error);
        }
        linkedHashMap.remove(Integer.valueOf(click.f152500a));
    }
}
