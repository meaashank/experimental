package com.mbridge.msdk.foundation.tools;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBConfiguration;
import com.prism.gaia.download.j;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import q8.C5443b;
import t7.C5617a;

/* JADX INFO: loaded from: classes5.dex */
public class m0 extends v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static int f156778A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static String f156779B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static Object f156780C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static int f156781D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static int f156782E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static long f156783F = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static long f156784G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static String f156785H = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static String f156786I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static String f156787J = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f156788j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f156789k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f156790l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f156791m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f156792n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f156793o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f156794p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f156795q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f156796r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f156797s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile int f156798t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f156799u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f156800v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f156801w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f156802x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f156803y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f156804z = -1;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f156805a;

        public a(Context context) {
            this.f156805a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.f156805a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f156806a;

        public b(Context context) {
            this.f156806a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f156806a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(m0.f156803y)) {
                    return;
                }
                String unused2 = m0.f156803y = defaultUserAgent;
                m0.H(this.f156806a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f156807a;

        public c(Context context) {
            this.f156807a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f156807a.getSystemService(C5617a.f239212e);
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f156342z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = m0.f156798t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = m0.f156798t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f156807a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = m0.f156798t = 0;
                    } else {
                        int unused4 = m0.f156798t = m0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = m0.f156798t = 0;
            }
        }
    }

    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = m0.f156802x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    ActivityManager activityManager = (ActivityManager) contextD.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    long unused = m0.f156784G = memoryInfo.totalMem;
                    long unused2 = m0.f156783F = memoryInfo.availMem;
                }
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage());
            }
        }
    }

    private static void A(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int B() {
        try {
            if (v0.i()) {
                return 1;
            }
            return v0.j() ? 2 : 0;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage());
            return 0;
        }
    }

    public static int C() {
        return f156804z;
    }

    public static void D(Context context) {
        try {
            v.e(context);
            p();
            r();
            t(context);
            C(context);
            B(context);
            G(context);
            o();
            t();
            p(context);
            y();
            com.mbridge.msdk.foundation.same.a.f156291B = false;
            com.mbridge.msdk.foundation.same.a.f156342z = v0.b(s3.e.f238487b, context);
            x(context);
            m();
            g.b();
            g();
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static int E() {
        return f156795q;
    }

    public static boolean F(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static int G(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    private static void H() {
        String str = Build.VERSION.RELEASE;
        String strO = o();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strO)) {
            f156803y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Mozilla/5.0 (Linux; Android ", str, "; ", strO, " Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        f156803y = android.support.v4.media.e.a(sbA, str2, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (f156780C == null) {
            f156780C = v0.g(str);
        }
        return f156780C;
    }

    public static int e(String str) {
        if (f156782E == 0) {
            f156782E = v0.f(str);
        }
        return f156782E;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e10) {
            q0.b("SameDiTool", "", e10);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(f156803y)) {
            l(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f156803y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return "-1";
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? "-1" : str;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            return "-1";
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f156803y)) {
                    H();
                }
                A(context);
            } else if (TextUtils.isEmpty(f156803y)) {
                try {
                    f156803y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f156803y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f156803y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f156803y)) {
                        try {
                            f156803y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f156803y)) {
                        H();
                    }
                }
            } else {
                A(context);
            }
        } catch (Throwable th3) {
            q0.b("SameDiTool", th3.getMessage(), th3);
        }
        H(context);
        return f156803y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get(InMobiNetworkValues.HEIGHT) == null ? displayMetrics.heightPixels : ((Integer) mapV.get(InMobiNetworkValues.HEIGHT)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get(InMobiNetworkValues.WIDTH) == null ? displayMetrics.widthPixels : ((Integer) mapV.get(InMobiNetworkValues.WIDTH)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String o() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f156794p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f156794p = languageTag;
                return languageTag;
            } catch (Throwable th) {
                q0.a("SameDiTool", th.getMessage());
                f156794p = "en-US";
            }
        }
        return f156794p;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f156796r = "";
            } else if (TextUtils.isEmpty(f156796r)) {
                if (context == null) {
                    f156796r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f156796r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f156796r = "";
        }
        return f156796r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f156797s = "";
            } else if (TextUtils.isEmpty(f156797s)) {
                if (context == null) {
                    f156797s = "";
                    return f156796r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f156797s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f156797s = "";
        }
        return f156797s;
    }

    @SuppressLint({"MissingPermission"})
    public static int s(Context context) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f156798t;
            }
            if (contextD == null) {
                return f156798t;
            }
            if (f156798t != -1) {
                g(contextD);
                return f156798t;
            }
            f156798t = 0;
            return f156798t;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            f156798t = 0;
            return f156798t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return f156800v;
        }
        try {
            if (!TextUtils.isEmpty(f156800v)) {
                return f156800v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f156800v = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String u() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + C4.q.f17581a + Build.MODEL;
    }

    public static HashMap v(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            map.put(InMobiNetworkValues.HEIGHT, Integer.valueOf(displayMetrics.heightPixels));
            map.put(InMobiNetworkValues.WIDTH, Integer.valueOf(displayMetrics.widthPixels));
            return map;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return map;
        }
    }

    public static String w() {
        try {
            if (TextUtils.isEmpty(f156786I)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                long jA = l0.a();
                String strJ = j(contextD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strJ);
                    jSONObject.put("2", String.valueOf(f156784G));
                    jSONObject.put(t1.b.f238888Z4, String.valueOf(jA));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e10) {
                    q0.b("SameDiTool", e10.getMessage());
                }
                String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                f156786I = strB;
                if (strB == null) {
                    f156786I = "";
                }
            }
        } catch (Exception e11) {
            q0.b("SameDiTool", e11.getMessage());
        }
        return f156786I;
    }

    public static int x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j10 = f156784G;
        if (j10 > 0) {
            return Long.valueOf((j10 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static String y(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return "";
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static String z(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(f156784G) : "";
    }

    public static String C(Context context) {
        if (context == null) {
            return f156779B;
        }
        try {
            if (!TextUtils.isEmpty(f156779B)) {
                return f156779B;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f156779B = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int E(Context context) {
        if (f156790l == -1) {
            f156790l = v0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f156790l;
    }

    public static int F() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 != 0 && i10 != 9) {
            try {
                return (!com.mbridge.msdk.foundation.same.a.f156342z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage(), th);
            }
        }
        return "";
    }

    public static void f(String str) {
        f156787J = str;
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f156789k)) {
                    f156789k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f156789k = "";
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f156789k = "";
        }
        return f156789k;
    }

    public static String z() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f156785H)) {
            long j10 = f156784G;
            if (j10 > 0) {
                f156785H = Math.ceil(Float.valueOf(j10 / 1.0737418E9f).doubleValue()) + "GB";
            }
        }
        return f156785H;
    }

    public static int A() {
        try {
            if (!s0.a().a("v_a_d_p", false)) {
                return 0;
            }
            if (v0.i()) {
                f156793o = 1;
            } else if (v0.j()) {
                f156793o = 2;
            } else {
                f156793o = 0;
            }
        } catch (Exception e10) {
            f156793o = 0;
            q0.b("SameDiTool", e10.getMessage());
        }
        return f156793o;
    }

    public static int B(Context context) {
        if (context == null) {
            return f156778A;
        }
        int i10 = f156778A;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f156778A = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static int G() {
        if (f156792n == -1) {
            f156792n = v0.g() ? 1 : 0;
        }
        return f156792n;
    }

    public static void d(int i10) {
        f156795q = i10;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(f156803y)) {
            try {
                f156803y = y0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                q0.b("SameDiTool", th.getMessage(), th);
            }
        }
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
        return -1.0f;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService(Y7.a.f79330e)).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            return -1;
        }
    }

    public static int x(Context context) {
        if (context == null) {
            return f156801w;
        }
        if (f156801w == 0) {
            try {
                f156801w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
        return f156801w;
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j10 = f156783F;
            if (j10 > 0) {
                return Long.valueOf((j10 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
            return -1;
        }
    }

    public static String m() {
        String str;
        if (!TextUtils.isEmpty(f156791m)) {
            return f156791m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod(MobileAdsBridge.versionMethodName, null).invoke(cls2, null));
                } catch (Throwable th2) {
                    q0.b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    q0.b("SameDiTool", th3.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = k0.b(string);
                }
                f156791m = string;
            } else {
                f156791m = "android";
            }
        } catch (Throwable th4) {
            q0.b("SameDiTool", th4.getMessage());
        }
        return f156791m;
    }

    public static int n() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String y() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f156802x)) {
                new Thread(new d()).start();
                return f156802x;
            }
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
        }
        return f156802x;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
        }
        if (!TextUtils.isEmpty(f156788j)) {
            return f156788j;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f156788j = context.getPackageManager().getInstallerPackageName(str);
            q0.a("SameDiTool", "PKGSource:" + f156788j);
        }
        return f156788j;
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static Map<String, String> k() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        HashMap map = new HashMap();
        map.put("model", o());
        map.put("brand", t());
        map.put("screen_size", n(contextD) + "x" + m(contextD));
        map.put("network_type", String.valueOf(f156798t));
        map.put(j.b.f164698E, f156803y);
        map.put("language", p(contextD));
        map.put("os_version", r());
        map.put("timezone", y());
        map.put("coppa", String.valueOf(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c()));
        map.put("platform", "1");
        map.put("gaid", g.d());
        map.put("gaid2", g.f156750b);
        map.put("package_name", t(contextD));
        map.put("app_version_name", C(contextD));
        map.put("app_version_code", String.valueOf(B(contextD)));
        map.put("pkg_source", a(t(contextD), contextD));
        map.put("version_flag", "1");
        map.put("dyview_type", "1");
        map.put("unknown_source", String.valueOf(C()));
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("mcc", q(contextD));
        map.put("mnc", r(contextD));
        map.put("withGP", String.valueOf(E()));
        map.put("has_wx", String.valueOf(E(contextD)));
        map.put("opensdk_ver", String.valueOf(D()));
        map.put("adid_limit", String.valueOf(g.a()));
        map.put("orientation", String.valueOf(G(contextD)));
        map.put("network_str", a(contextD, s(contextD)));
        map.put("brt", w(contextD));
        map.put("dmf", String.valueOf(f156783F));
        map.put("dmt", String.valueOf(f156784G));
        map.put("font", String.valueOf(o(contextD)));
        map.put("fw_type", "2");
        map.put(K9.h.f58477a, String.valueOf(t0.c()));
        map.put("i", String.valueOf(t0.a()));
        map.put("lpm", String.valueOf(u(contextD)));
        map.put("simu", String.valueOf(F()));
        map.put("target_os_version", String.valueOf(x(contextD)));
        map.put("vol", k(contextD));
        map.put("ui_orientation", String.valueOf(G(contextD)));
        map.put("tun", String.valueOf(A()));
        map.put("gp_version", v());
        map.put("os_api_version", String.valueOf(n()));
        map.put("manufacturer", q());
        map.put("weChatSupportApi", String.valueOf(e("")));
        map.put("hasWXOpenSDK", String.valueOf(G()));
        map.put("az_aid_info_origin", g.e());
        return map;
    }

    public static String v() {
        return f156787J;
    }

    private static void p() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage());
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String r() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f156799u)) {
            f156799u = B0.z.a(s(), "");
        }
        return f156799u;
    }

    public static int s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String w(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
    }

    public static int D() {
        if (f156781D == 0) {
            f156781D = v0.e();
        }
        return f156781D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Context context) {
        try {
            y0.b(context, "mbridge_ua", f156803y);
        } catch (Throwable th) {
            q0.b("SameDiTool", th.getMessage(), th);
        }
    }

    public static void l() {
        try {
            Object objA = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    g.a(str);
                }
                if (objA2 instanceof Integer) {
                    g.a(((Integer) objA2).intValue());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }
}
