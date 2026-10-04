package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.support.v4.media.f;
import android.text.TextUtils;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.stub.n;
import com.prism.gaia.helper.utils.t;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ru {
    private static int Ht = Integer.MAX_VALUE;
    public static boolean NOt = false;
    private static String TFq = null;
    public static boolean ZRu = false;
    private static final CharSequence mZ = "amigo";
    private static final CharSequence uR = "funtouch";
    private static final ConcurrentHashMap<String, String> Mm = new ConcurrentHashMap<>();

    public static class ZRu implements Callable<String> {
        private final String ZRu;

        public ZRu(String str) {
            this.ZRu = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) ru.Mm.get(this.ZRu);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strMZ = ru.mZ(this.ZRu);
            System.currentTimeMillis();
            if (strMZ != null) {
                ru.Mm.put(this.ZRu, strMZ);
            }
            return strMZ;
        }
    }

    public static boolean FA() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(mZ);
    }

    public static String Ht() {
        return uR("ro.vivo.os.build.display.id") + "_" + uR("ro.vivo.product.version");
    }

    public static boolean Mm() {
        String strUR = uR("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strUR) && strUR.toLowerCase().contains(uR);
    }

    public static boolean OCA() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith(C3841e.f162086b)) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith(C3841e.f162086b)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean TFq() {
        if (!NOt) {
            try {
                Class.forName("miui.os.Build");
                ZRu = true;
                NOt = true;
                return true;
            } catch (Exception unused) {
                NOt = true;
            }
        }
        return ZRu;
    }

    public static String Vor() {
        return Build.DISPLAY + "_" + uR("ro.gn.sv.version");
    }

    public static String WMI() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean ZH() {
        return !TextUtils.isEmpty(uR("ro.letv.release.version"));
    }

    public static String ZRu() {
        if (!TextUtils.isEmpty(TFq)) {
            return TFq;
        }
        String strZRu = com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_local_rom_info", n.f164456n);
        TFq = strZRu;
        if (TextUtils.isEmpty(strZRu)) {
            String strXY = xY();
            TFq = strXY;
            com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_local_rom_info", strXY);
        }
        return TFq;
    }

    public static String aT() {
        if (!ZH()) {
            return "";
        }
        return "eui_" + uR("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static String edo() {
        return uR(t.f165214e);
    }

    public static String lp() {
        if (!TFq()) {
            return "";
        }
        return "miui_" + uR(t.f165216g) + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String mZ() {
        return uR("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean oK() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String om() {
        if (!qF()) {
            return "";
        }
        return "coloros_" + uR(Yx.Mm("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean qF() {
        if (Ht == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strMm = Yx.Mm("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strMm)) {
                Ht = 0;
            } else {
                Ht = 1;
            }
        }
        return Ht == 1;
    }

    public static String sAl() {
        String strEdo = edo();
        if (strEdo == null || !strEdo.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sbA = f.a(strEdo, "_");
        sbA.append(Build.DISPLAY);
        return sbA.toString();
    }

    public static boolean uR() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    private static String xY() {
        if (oK()) {
            return yBV();
        }
        if (TFq()) {
            return lp();
        }
        if (NOt()) {
            return WMI();
        }
        if (qF()) {
            return om();
        }
        String strSAl = sAl();
        if (!TextUtils.isEmpty(strSAl)) {
            return strSAl;
        }
        if (Mm()) {
            return Ht();
        }
        if (FA()) {
            return Vor();
        }
        if (uR()) {
            return mZ();
        }
        String strAT = aT();
        return !TextUtils.isEmpty(strAT) ? strAT : Build.DISPLAY;
    }

    public static String yBV() {
        if (oK()) {
            try {
                return "smartisan_".concat(String.valueOf(uR("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean NOt() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(4:49|3|43|4)|(2:51|5)|39|6|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        com.bytedance.sdk.component.utils.lp.ZRu("ToolUtils", "Exception while closing InputStream", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String mZ(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.String r5 = "getprop "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.Process r4 = r4.exec(r5)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.io.InputStream r7 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L39 java.lang.IllegalThreadStateException -> L3b
            r4.exitValue()     // Catch: java.lang.Throwable -> L39 java.lang.IllegalThreadStateException -> L3b
        L30:
            r5.close()     // Catch: java.io.IOException -> L34
            goto L6e
        L34:
            r8 = move-exception
            com.bytedance.sdk.component.utils.lp.ZRu(r1, r0, r8)
            goto L6e
        L39:
            r3 = move-exception
            goto L43
        L3b:
            r3 = r4
            goto L68
        L3d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L43
        L41:
            r5 = r3
            goto L3b
        L43:
            java.lang.String r4 = "Unable to read sysprop "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = r4.concat(r8)     // Catch: java.lang.Throwable -> L5b
            com.bytedance.sdk.component.utils.lp.ZRu(r1, r8, r3)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5a
            r5.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r8 = move-exception
            com.bytedance.sdk.component.utils.lp.ZRu(r1, r0, r8)
        L5a:
            return r2
        L5b:
            r8 = move-exception
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r2 = move-exception
            com.bytedance.sdk.component.utils.lp.ZRu(r1, r0, r2)
        L66:
            throw r8
        L67:
            r5 = r3
        L68:
            r3.destroy()     // Catch: java.lang.Throwable -> L6b
        L6b:
            if (r5 == 0) goto L6e
            goto L30
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.ru.mZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String uR(String str) {
        String str2;
        String str3 = Mm.get(str);
        if (str3 != null) {
            return str3;
        }
        if (!TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            final com.bytedance.sdk.component.FA.Mm mm = new com.bytedance.sdk.component.FA.Mm(new ZRu(str), 5, 2);
            WD.NOt(new com.bytedance.sdk.component.FA.FA("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.ru.1
                @Override // java.lang.Runnable
                public void run() {
                    mm.run();
                }
            });
            str2 = (String) mm.get(1L, TimeUnit.SECONDS);
        }
        return str2 == null ? "" : str2;
    }

    public static boolean ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            str = edo();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || OCA();
    }
}
