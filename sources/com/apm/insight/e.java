package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.h;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f137148a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f137149b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f137150c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f137151d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f137152e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f137153f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f137156i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f137161n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f137154g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f137155h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static h f137157j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f137158k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f137159l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f137160m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f137162o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f137163p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f137164q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f137165r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f137166s = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f137153f == null) {
            f137153f = h.a(f137148a);
        }
        return f137153f;
    }

    public static a b() {
        return f137155h;
    }

    public static h c() {
        if (f137157j == null) {
            synchronized (e.class) {
                f137157j = new h();
            }
        }
        return f137157j;
    }

    public static void d(boolean z10) {
        f137166s = z10;
    }

    public static String e() {
        return f() + Ra.b.f67799c + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f137158k == null) {
            synchronized (f137159l) {
                try {
                    if (f137158k == null) {
                        f137158k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f137158k;
    }

    public static Context g() {
        return f137148a;
    }

    public static Application h() {
        return f137149b;
    }

    public static ConfigManager i() {
        return f137154g;
    }

    public static long j() {
        return f137150c;
    }

    public static String k() {
        return f137151d;
    }

    public static void l() {
        f137162o = 1;
    }

    public static int m() {
        return f137162o;
    }

    public static boolean n() {
        return f137152e;
    }

    public static void o() {
        f137152e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f137156i;
    }

    public static int q() {
        return f137160m;
    }

    public static String r() {
        return f137161n;
    }

    public static boolean s() {
        return f137163p;
    }

    public static boolean t() {
        return f137164q;
    }

    public static boolean u() {
        return f137165r;
    }

    public static boolean v() {
        return f137166s;
    }

    public static void b(int i10, String str) {
        f137160m = i10;
        f137161n = str;
    }

    public static boolean d() {
        if (!f137154g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f137153f = bVar;
    }

    public static void b(boolean z10) {
        f137164q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f137149b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f137149b == null) {
            f137150c = System.currentTimeMillis();
            f137148a = context;
            f137149b = application;
            f137158k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f137165r = z10;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f137153f = new com.apm.insight.nativecrash.b(f137148a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append(Ra.b.f67799c);
        sb2.append(f());
        sb2.append(Ra.b.f67799c);
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f137150c);
        sb2.append(Ra.b.f67799c);
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(String str) {
        f137151d = str;
    }

    public static void a(int i10, String str) {
        if (f137156i == null) {
            synchronized (e.class) {
                try {
                    if (f137156i == null) {
                        f137156i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f137156i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f137163p = z10;
    }
}
