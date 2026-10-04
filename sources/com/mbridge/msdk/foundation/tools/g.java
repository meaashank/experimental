package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f156749a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f156750b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f156751c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f156752d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f156753e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f156754f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f156755g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f156756h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f156757i = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f156758a;

        public a(Context context) {
            this.f156758a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f156758a);
                    g.a(advertisingIdInfo.getId());
                    g.f156752d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f156758a, advertisingIdInfo.getId(), g.f156752d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f156758a);
                        g.a(bVarA.a());
                        g.f156752d = bVarA.b() ? 1 : 0;
                        g.b(this.f156758a, bVarA.a(), g.f156752d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    q0.b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f156750b) ? "" : f156750b;
        }
        if (!TextUtils.isEmpty(f156750b)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f156752d == 0 ? f156750b : "" : f156750b;
        }
        if (!f156751c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f156751c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f156749a) ? "" : f156749a;
        }
        if (!TextUtils.isEmpty(f156749a)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f156752d == 0 ? f156749a : "" : f156749a;
        }
        m0.l();
        if (!f156751c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f156751c = true;
        }
        return TextUtils.isEmpty(f156749a) ? "" : f156749a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f156755g) && !f156754f) {
            b();
        }
        return f156755g;
    }

    public static int a() {
        return f156752d;
    }

    public static void a(int i10) {
        f156752d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f156754f) {
            return f156753e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f156755g = string2;
                    f156753e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th) {
            q0.b("DomainSameDiTool", th.getMessage());
        }
        f156754f = true;
        return f156753e;
    }

    public static void a(String str) {
        f156750b = k0.b(str);
        f156749a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f156756h = false;
        }
        if (f156757i) {
            return f156756h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f156756h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f156756h = true;
        }
        f156757i = true;
        return f156756h;
    }
}
