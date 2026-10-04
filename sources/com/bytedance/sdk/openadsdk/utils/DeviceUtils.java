package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.core.settings.oK;
import com.bytedance.sdk.openadsdk.utils.TFq;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import u4.g;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {
    private static int FA = 0;
    private static int Vor = 0;
    private static int ZH = 0;
    public static String ZRu = "";
    private static int aT;
    private static int lp;
    private static int sAl;
    private static volatile long NOt = System.currentTimeMillis();
    private static volatile boolean mZ = false;
    private static volatile boolean uR = false;
    private static volatile boolean TFq = false;
    private static volatile boolean Ht = true;
    private static long Mm = 0;
    private static AtomicBoolean edo = new AtomicBoolean(false);

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.lp.Mm> ZRu = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void NOt(Context context) {
            if (DeviceUtils.uR || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                boolean unused = DeviceUtils.uR = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.lp = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.aT = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    Iterator<com.bytedance.sdk.openadsdk.lp.Mm> it = ZRu.iterator();
                    while (it.hasNext()) {
                        it.next().ZRu(DeviceUtils.aT);
                    }
                    if (DeviceUtils.Vor != 0) {
                        int unused3 = DeviceUtils.ZH = (int) ((((double) DeviceUtils.aT) / ((double) DeviceUtils.Vor)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void ZRu(com.bytedance.sdk.openadsdk.lp.Mm mm) {
            if (mm != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.lp.Mm> copyOnWriteArrayList = ZRu;
                if (copyOnWriteArrayList.contains(mm)) {
                    return;
                }
                copyOnWriteArrayList.add(mm);
            }
        }

        public static void NOt(com.bytedance.sdk.openadsdk.lp.Mm mm) {
            if (mm == null) {
                return;
            }
            ZRu.remove(mm);
        }
    }

    public static class NOt extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.Ht = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.Ht = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.NOt = System.currentTimeMillis();
            }
        }
    }

    public static class ZRu extends BroadcastReceiver {
        private ZRu() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void NOt(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new ZRu(), intentFilter, 2);
                } else {
                    context.registerReceiver(new ZRu(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.om(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.sAl = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    public static class mZ implements Runnable {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.bytedance.sdk.openadsdk.core.mZ] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r32;
            try {
                final AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
                if (advertisingIdInfo != null) {
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    DeviceUtils.NOt(advertisingIdInfo);
                    com.bytedance.sdk.openadsdk.core.settings.yBV.ZRu(new oK.ZRu() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.mZ.1
                        @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
                        public void NOt() {
                            DeviceUtils.NOt(advertisingIdInfo);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
                        public void ZRu() {
                            DeviceUtils.NOt(advertisingIdInfo);
                        }
                    });
                    r32 = zIsLimitAdTrackingEnabled;
                } else {
                    r32 = -1;
                }
                if (r32 != -1) {
                    com.bytedance.sdk.openadsdk.core.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).ZRu("limit_ad_track", r32);
                }
            } catch (IOException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e10);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    public static int FA(Context context) {
        return FA;
    }

    public static int Ht() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int Mm(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int OCA(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService(Y7.a.f79330e)).isPowerSaveMode() ? 1 : 0;
            }
            return to(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static JSONObject TFq(Context context) {
        return ZRu(context, false);
    }

    public static int Vor() {
        return Vor;
    }

    private static int WMI(Context context) {
        return sAl;
    }

    public static void ZH() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                FA = 1;
            } else if (ringerMode == 1) {
                FA = 2;
            } else {
                FA = 0;
            }
        } catch (Throwable unused) {
        }
    }

    @JProtect
    public static void aT() {
        new mZ().run();
        Context contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
        if (contextZRu != null) {
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("cpu_count", Mm.ZRu());
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("cpu_max_frequency", Mm.ZRu(Mm.ZRu()));
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("cpu_min_frequency", Mm.NOt(Mm.ZRu()));
            String strVor = Yx.Vor();
            if (strVor != null) {
                com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("total_memory", strVor);
            }
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("total_internal_storage", Yx.aT());
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("free_internal_storage", com.bytedance.sdk.component.utils.sAl.ZRu());
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("total_sdcard_storage", Yx.ZH());
            com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("is_root", Yx.lp() ? 1 : 0);
            if (TextUtils.isEmpty(Vor(contextZRu))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    ZRu = "unity";
                } catch (ClassNotFoundException unused) {
                    ZRu = "native";
                }
                com.bytedance.sdk.openadsdk.core.mZ.ZRu(contextZRu).ZRu("framework_name", ZRu);
            }
            ZH();
            qF(contextZRu);
            sAl = OCA(contextZRu);
        }
    }

    private static int oK(Context context) {
        return lp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void om(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        WD.NOt(new com.bytedance.sdk.component.FA.FA("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.sAl = DeviceUtils.OCA(applicationContext);
            }
        });
    }

    private static void qF(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            Vor = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            aT = streamVolume;
            ZH = (int) ((((double) streamVolume) / ((double) Vor)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    private static int to(Context context) {
        try {
            String str = Build.MANUFACTURER;
            return str.equalsIgnoreCase("XIAOMI") ? Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0 : (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void xY(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                DeviceUtils.om(applicationContext);
            }
        });
    }

    private static float yBV(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int FA() {
        return ZH;
    }

    public static int Mm() {
        return aT;
    }

    public static float TFq() {
        int i10 = -1;
        try {
            Context contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
            if (contextZRu != null) {
                i10 = Settings.System.getInt(contextZRu.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.DeviceUtils", th.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static String Vor(Context context) {
        if (TextUtils.isEmpty(ZRu)) {
            ZRu = com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("framework_name", "");
        }
        return ZRu;
    }

    private static int edo(Context context) {
        int i10;
        try {
            i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i10 == 32) {
            return 1;
        }
        return i10 == 16 ? 0 : -1;
    }

    public static boolean mZ(Context context) {
        return (context.getResources().getConfiguration().uiMode & 15) == 4;
    }

    public static int uR(Context context) {
        if (mZ(context)) {
            return 3;
        }
        return NOt(context) ? 2 : 1;
    }

    public static int Ht(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    @JProtect
    public static boolean NOt() {
        if (SystemClock.elapsedRealtime() - Mm >= 20000) {
            Mm = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService(Y7.a.f79330e);
                if (powerManager != null) {
                    Ht = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return Ht;
    }

    public static int mZ() {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).NOt("limit_ad_track", -1);
    }

    public static String uR() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void ZRu(Context context) {
        if (mZ) {
            return;
        }
        try {
            NOt nOt = new NOt();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(nOt, intentFilter);
            mZ = true;
        } catch (Throwable unused) {
        }
    }

    public static void ZH(Context context) {
        Context applicationContext;
        if (TFq || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                ZRu.NOt(applicationContext);
            } else {
                xY(applicationContext);
            }
            TFq = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean NOt(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static void NOt(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.WMI.uR().Nb("gaid")) {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu().NOt());
        }
    }

    public static long ZRu() {
        return NOt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(AdvertisingIdClient.Info info) {
        if (!com.bytedance.sdk.openadsdk.core.WMI.uR().Nb("gaid") || edo.getAndSet(true)) {
            return;
        }
        String id2 = info.getId();
        if (TextUtils.isEmpty(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu().NOt(id2);
        com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu(id2);
        com.bytedance.sdk.openadsdk.core.Vor.mZ.ZRu(id2);
    }

    private static void ZRu(JSONObject jSONObject) throws JSONException {
        NOt(jSONObject);
    }

    @JProtect
    public static JSONObject ZRu(Context context, boolean z10) {
        String strNOt;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", Ht(context));
            ZRu(jSONObject);
            jSONObject.put("type", uR(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", Yx.lp(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.uR.mZ());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.uR.NOt());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.uR.uR());
            jSONObject.put("screen_width", Cox.mZ(context));
            jSONObject.put("screen_height", Cox.uR(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.Vor.mZ.Ht());
            com.bytedance.sdk.openadsdk.core.settings.Ht htUR = com.bytedance.sdk.openadsdk.core.WMI.uR();
            if (htUR.Nb("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.lp.mZ(context));
            jSONObject.put("rom_version", ru.ZRu());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.lp.NOt(context));
            jSONObject.put("timezone", Yx.qF());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.lp.ZRu());
            jSONObject.put("carrier_name", MR.ZRu());
            if (z10) {
                strNOt = Yx.ZRu(context);
            } else {
                strNOt = Yx.NOt(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strNOt) * 1024));
            jSONObject.put("locale_language", uR());
            jSONObject.put("screen_bright", Math.ceil(TFq() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !NOt() ? 1 : 0);
            jSONObject.put("cpu_num", Mm.ZRu(context));
            jSONObject.put("cpu_max_freq", Mm.NOt(context));
            jSONObject.put("cpu_min_freq", Mm.mZ(context));
            TFq.ZRu ZRu2 = TFq.ZRu();
            jSONObject.put("battery_remaining_pct", (int) ZRu2.NOt);
            jSONObject.put("is_charging", ZRu2.ZRu);
            jSONObject.put("total_space", String.valueOf(Yx.mZ(context)));
            jSONObject.put("free_space_in", String.valueOf(Yx.uR(context)));
            jSONObject.put("sdcard_size", String.valueOf(Yx.TFq(context)));
            jSONObject.put("rooted", Yx.Ht(context));
            jSONObject.put("enable_assisted_clicking", Ht());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.om.ZRu(context, "tt_choose_language"));
            jSONObject.put("airplane", Mm(context));
            jSONObject.put(g.f239596w0, edo(context));
            jSONObject.put("headset", oK(context));
            jSONObject.put("ringmute", FA(context));
            jSONObject.put("screenscale", yBV(context));
            jSONObject.put("volume", FA());
            jSONObject.put("low_power_mode", WMI(context));
            if (htUR.Nb("mnc")) {
                jSONObject.put("mnc", MR.mZ());
            }
            if (htUR.Nb("mcc")) {
                jSONObject.put("mcc", MR.NOt());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.ZRu.NOt(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.ZRu.ZRu());
            String strMZ = com.bytedance.sdk.openadsdk.core.Vor.mZ.mZ();
            com.bytedance.sdk.openadsdk.core.Vor.mZ.uR();
            if (!TextUtils.isEmpty(strMZ)) {
                jSONObject.put("sof_chara", strMZ);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void aT(Context context) {
        AudioInfoReceiver.NOt(context);
    }
}
