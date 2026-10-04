package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.support.v4.media.i;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.browser.browseractions.BrowserActionsIntent;
import com.bytedance.sdk.component.Vor.uR;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.server.accounts.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import w.y;

/* JADX INFO: loaded from: classes3.dex */
public class Yx {
    private static final HashSet<String> ZH;
    public static Integer ZRu;
    private static String edo;
    private static final byte[] lp;
    private static String oK;
    private static final byte[] sAl;
    private static final ExecutorService NOt = Executors.newSingleThreadExecutor();
    private static volatile boolean mZ = false;
    private static final AtomicInteger uR = new AtomicInteger(0);
    private static volatile String TFq = "";
    private static final ReentrantLock Ht = new ReentrantLock();
    private static String Mm = null;
    private static String FA = null;
    private static String Vor = null;
    private static final HashSet<String> aT = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.Yx$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(Yx.TFq)) {
                    com.bytedance.sdk.component.Vor.uR uRVar = new com.bytedance.sdk.component.Vor.uR(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
                    uRVar.setWebViewClient(new uR.ZRu());
                    String unused = Yx.TFq = uRVar.getUserAgentString();
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "", e11);
            }
        }
    }

    public static class NOt {
        public final int NOt;
        public final ComponentName ZRu;

        public NOt(ComponentName componentName, int i10) {
            this.ZRu = componentName;
            this.NOt = i10;
        }
    }

    public static class ZRu implements Callable<String> {
        private final int ZRu;

        public ZRu(int i10) {
            this.ZRu = i10;
        }

        private String NOt() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).ZRu("android_system_ua", property);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.lp.ZRu("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        private synchronized String mZ() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.Yx.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = Yx.le();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strNOt;
            try {
                strNOt = "unKnow";
                int i10 = this.ZRu;
                if (i10 == 1) {
                    strNOt = mZ();
                } else if (i10 == 2) {
                    strNOt = NOt();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strNOt;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        ZH = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        ZRu = null;
        lp = new byte[]{108, 111, 97, 100, 105, 110, 103};
        sAl = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String FA() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Ht(int i10) {
        return i10 == 6;
    }

    private static boolean MR() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int Mm(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static boolean NOt(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static String OCA() {
        String str = edo;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(lp);
        edo = str2;
        return str2;
    }

    public static boolean TFq(int i10) {
        return i10 == 5;
    }

    public static String Vor() {
        return mZ("MemTotal");
    }

    public static int WMI() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static void ZRu(@NonNull com.bytedance.sdk.openadsdk.core.model.qF qFVar, @NonNull View view) {
    }

    public static long aT() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String edo() {
        int iYBV = yBV();
        return (iYBV == 1 || iYBV == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String le() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
            webView.setWebViewClient(new uR.ZRu());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).ZRu("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static boolean lp() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int mZ(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String oK() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static boolean om() {
        return uR.get() == 1;
    }

    public static String qF() {
        int i10 = -WMI();
        return i10 >= 0 ? "Etc/GMT+".concat(String.valueOf(i10)) : "Etc/GMT".concat(String.valueOf(i10));
    }

    public static String sAl() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String to() {
        String str = oK;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(sAl);
        oK = str2;
        return str2;
    }

    public static boolean uR(int i10) {
        return i10 == 4;
    }

    public static int yBV() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (aT.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 == null || !id2.startsWith("America/")) {
                return 3;
            }
            return !ZH.contains(id2) ? 5 : 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static synchronized String Ht() {
        try {
            if (TextUtils.isEmpty(FA) && com.bytedance.sdk.openadsdk.core.WMI.ZRu() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getPackageManager().getPackageInfo(TFq(), 0);
                    FA = String.valueOf(packageInfo.versionCode);
                    Vor = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return FA;
    }

    public static synchronized String Mm() {
        try {
            if (TextUtils.isEmpty(Vor) && com.bytedance.sdk.openadsdk.core.WMI.ZRu() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getPackageManager().getPackageInfo(TFq(), 0);
                    FA = String.valueOf(packageInfo.versionCode);
                    Vor = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Vor;
    }

    public static synchronized String TFq() {
        Context contextZRu;
        try {
            if (TextUtils.isEmpty(Mm) && (contextZRu = com.bytedance.sdk.openadsdk.core.WMI.ZRu()) != null) {
                try {
                    Mm = contextZRu.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Mm;
    }

    public static boolean Vor(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static long ZH() {
        try {
            if (!MR()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static String lp(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", Ht()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static void sAl(Context context) {
        try {
            AtomicInteger atomicInteger = uR;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (!zIsEnabled || !zIsTouchExplorationEnabled) {
                atomicInteger.set(2);
            } else {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.edo.mZ.ZRu().mZ();
            }
        } catch (Exception unused) {
            uR.set(2);
        }
    }

    public static String uR() {
        return xY.ZRu();
    }

    public static Intent ZRu(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static long uR(Context context) {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("free_internal_storage", 0L).longValue();
    }

    @NonNull
    public static NOt NOt(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new NOt(new ComponentName(activityInfo.packageName, activityInfo.name), listQueryIntentActivities.size());
            }
            return new NOt(null, listQueryIntentActivities.size());
        }
        return new NOt(null, 0);
    }

    public static boolean Vor(String str) {
        if (com.bytedance.sdk.openadsdk.core.edo.TFq()) {
            return true;
        }
        com.bytedance.sdk.component.utils.lp.NOt("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static int edo(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = ZRu;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(BrowserActionsIntent.f86462c)), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        ZRu = Integer.valueOf(size);
        return size;
    }

    public static boolean mZ(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.NOt.ZRu(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String uR(String str) {
        return ZRu(str, false);
    }

    public static int aT(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static boolean uR(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        return qFVar != null && qFVar.IZ() == 3 && qFVar.NBW() && (qFVar.Nl() == 4 || qFVar.Nl() == 5);
    }

    public static boolean FA(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static long TFq(Context context) {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("total_sdcard_storage", 0L).longValue();
    }

    public static String TFq(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.WMI.uR().fWk();
        }
        if (!TextUtils.isEmpty(str)) {
            return !str.startsWith("http") ? R3.a.f67726d.concat(str) : str;
        }
        if (yBV() == 2) {
            return "https://log.sgsnssdk.com/service/2/app_log/";
        }
        return "https://log-mva.isnssdk.com/service/2/app_log/";
    }

    public static long ZH(Context context) {
        int i10 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.getMessage());
        }
        return i10;
    }

    public static void aT(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.lp.NOt("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int lp(Context context) {
        return Mm(com.bytedance.sdk.component.utils.xY.ZRu(context, 0L));
    }

    public static boolean ZRu(Context context, Intent intent) {
        return mZ(context, intent) > 0;
    }

    public static boolean ZRu() {
        return (com.bytedance.sdk.openadsdk.core.oK.ZRu() == null || com.bytedance.sdk.openadsdk.core.oK.ZRu().uR()) ? false : true;
    }

    public static String mZ(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 == 2) {
            return "interaction";
        }
        if (i10 == 3 || i10 == 4) {
            return "open_ad";
        }
        if (i10 == 7) {
            return "rewarded_video";
        }
        if (i10 != 8) {
            return "embeded_ad";
        }
        return "fullscreen_interstitial_ad";
    }

    public static void FA(final String str) {
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu();
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("reportMultiLog", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.utils.Yx.2
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                if (Yx.mZ || !com.bytedance.sdk.openadsdk.core.WMI.uR().Jem()) {
                    return null;
                }
                boolean unused = Yx.mZ = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("reportMultiLog").NOt(jSONObject.toString());
            }
        });
    }

    public static int Ht(Context context) {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("is_root", -1);
    }

    public static String Mm(@NonNull Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static String ZRu(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static boolean FA(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static boolean Ht(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String NOt(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return "splash_ad_landingpage";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static String mZ() {
        if (!TextUtils.isEmpty(TFq)) {
            return TFq;
        }
        com.bytedance.sdk.openadsdk.multipro.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
        String strZRu = com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_local_web_ua", 86400000L);
        TFq = strZRu;
        if (TextUtils.isEmpty(strZRu)) {
            ReentrantLock reentrantLock = Ht;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(TFq)) {
                            TFq = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
                        }
                        com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_local_web_ua", TFq);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "", e10);
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "", e11);
                    }
                }
            } finally {
                Ht.unlock();
            }
        }
        return TFq;
    }

    public static String Mm(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", C3841e.f162089e) : "";
    }

    public static String ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar == null) {
            return null;
        }
        try {
            return mZ(qFVar.klw());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int ZRu(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static int NOt(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar == null) {
            return -1;
        }
        int iKlw = qFVar.klw();
        int i10 = 1;
        if (iKlw == 1) {
            return 2;
        }
        if (iKlw == 3) {
            return 4;
        }
        if (iKlw != 5) {
            i10 = 7;
            if (iKlw != 7) {
                return iKlw != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static String ZRu(Context context) {
        String strNOt = com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("total_memory", (String) null);
        if (strNOt != null && NOt(strNOt) > 0) {
            return strNOt;
        }
        String strMZ = mZ("MemTotal");
        if (NOt(strMZ) <= 0) {
            strMZ = FA();
        }
        com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).ZRu("total_memory", strMZ);
        return strMZ;
    }

    public static String NOt() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
        try {
            String strNOt = com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).NOt("android_system_ua", "unKnow");
            if (strNOt != null && !"unKnow".equals(strNOt)) {
                return strNOt;
            }
            FutureTask futureTask = new FutureTask(new ZRu(2));
            NOt.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.lp.ZRu("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String ZRu(@NonNull String str, boolean z10) {
        String strA;
        String strWD = com.bytedance.sdk.openadsdk.core.WMI.uR().WD();
        if (TextUtils.isEmpty(strWD)) {
            int iYBV = yBV();
            if (iYBV == 1 || iYBV == 2) {
                strA = y.a("https://pangolin16.sgsnssdk.com", str);
            } else {
                strA = y.a("https://pangolin16.isnssdk.com", str);
            }
            if (!z10) {
                return th.ZRu(strA);
            }
            return lp(strA);
        }
        String strA2 = i.a(R3.a.f67726d, strWD, str);
        if (th.ZRu() && !z10) {
            strA2 = th.ZRu(strA2);
        }
        return z10 ? lp(strA2) : strA2;
    }

    public static long NOt(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String mZ(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String NOt(Context context) {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("total_memory", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public static long mZ(Context context) {
        return com.bytedance.sdk.openadsdk.core.mZ.ZRu(context).NOt("total_internal_storage", 0L).longValue();
    }

    public static boolean mZ(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar == null) {
            return true;
        }
        int iNOt = com.bytedance.sdk.openadsdk.core.WMI.uR().NOt(qFVar.GE());
        int iMZ = com.bytedance.sdk.component.utils.oK.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
        if (iNOt == 1) {
            return uR(iMZ);
        }
        if (iNOt == 2) {
            return TFq(iMZ) || uR(iMZ) || Ht(iMZ);
        }
        if (iNOt != 3) {
            return iNOt != 5 || uR(iMZ) || Ht(iMZ);
        }
        return false;
    }

    public static JSONObject ZRu(boolean z10, com.bytedance.sdk.openadsdk.core.model.qF qFVar, long j10, long j11, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, qFVar.vE());
            jSONObject.put("load_time", j10);
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg = qFVar.Qg();
            if (nOtQg != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, nOtQg.TFq());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, nOtQg.Vor());
            }
            if (!z10) {
                jSONObject.put("error_code", j11);
                if (TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "getVideoDownload json error", e10);
            return jSONObject;
        }
    }

    public static JSONObject ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, long j10, com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
        if (qFVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, qFVar.vE());
            jSONObject.put("buffers_time", j10);
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg = qFVar.Qg();
            if (nOtQg != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, nOtQg.TFq());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, nOtQg.Vor());
            }
            ZRu(jSONObject, zRu);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", "getVideoAction json error", e10);
            return jSONObject;
        }
    }

    private static void ZRu(JSONObject jSONObject, com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu zRu) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || zRu == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(zRu.uR()), Integer.valueOf(zRu.TFq())));
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, String str) {
        if (qFVar != null) {
            try {
                String strGis = qFVar.Gis();
                if (TextUtils.isEmpty(strGis) && qFVar.IOC() != null && qFVar.IOC().mZ() == 1 && !TextUtils.isEmpty(qFVar.IOC().NOt())) {
                    strGis = qFVar.IOC().NOt();
                }
                String str2 = strGis;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.WD.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), str2, qFVar, ZRu(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ZRu(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !Vor(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + com.prism.gaia.download.a.f164606q + i11 + b.f166434b0 + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + com.prism.gaia.download.a.f164606q + i11 + b.f166434b0 + str2.substring(i13));
                return;
            }
        }
    }

    public static void ZRu(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (iIndexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.uR ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, com.bytedance.sdk.component.Vor.uR uRVar, Context context, String str) {
        int iNl = qFVar.Nl();
        if (!qFVar.NBW()) {
            return null;
        }
        if (iNl != 1 && iNl != 3) {
            return null;
        }
        uRVar.ZRu(true, (View) new com.bytedance.sdk.openadsdk.common.mZ(context));
        return new com.bytedance.sdk.openadsdk.common.uR(qFVar, uRVar, str, false);
    }

    public static void ZRu(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairUR = com.bytedance.sdk.openadsdk.core.Vor.uR("oem_store");
            int i10 = -1;
            if (pairUR != null && ((iIntValue = Integer.valueOf((String) pairUR.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairUR.second).longValue() < com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, com.bytedance.sdk.component.Vor.uR uRVar) {
        com.bytedance.sdk.openadsdk.core.model.TFq tFqAT;
        if (qFVar == null || uRVar == null) {
            return;
        }
        int iNl = qFVar.Nl();
        if (qFVar.NBW()) {
            if ((iNl == 2 || iNl == 3 || iNl == 5) && (tFqAT = qFVar.aT()) != null) {
                uRVar.ZRu(true, tFqAT.uR(), tFqAT.TFq(), tFqAT.Ht(), tFqAT.Mm(), tFqAT.mZ());
            }
        }
    }

    public static int ZRu(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }
}
