package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.prism.commons.utils.C3841e;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f161925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long[][] f161926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f161927c;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(u.f161927c)) {
                String unused = u.f161927c = u.d();
                u0.b(x.b(), "romtype", u.f161927c);
            }
        }
    }

    public static JSONArray[] c(Context context) {
        if (f161926b == null) {
            f161926b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = f161926b;
        if (jArr == null || jArr.length != 2) {
            f161926b = null;
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long[][] jArr2 = f161926b;
        long[] jArr3 = jArr2[0];
        long[] jArr4 = jArr2[1];
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jArr3.length; i10++) {
            try {
                jSONArray.put(i10, jCurrentTimeMillis - jArr3[i10]);
                jSONArray2.put(i10, jCurrentTimeMillis - jArr4[i10]);
            } catch (JSONException unused) {
            }
        }
        return new JSONArray[]{jSONArray, jSONArray2};
    }

    public static boolean d(Context context) {
        Object objMeta = com.pgl.ssdk.ces.a.meta(155, context, null);
        if (objMeta instanceof Boolean) {
            return ((Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static int e() {
        return ((Integer) com.pgl.ssdk.ces.a.meta(Opcodes.IF_ICMPGE, null, null)).intValue();
    }

    public static boolean b(Context context) {
        Object objMeta = com.pgl.ssdk.ces.a.meta(156, context, null);
        if (objMeta instanceof Boolean) {
            return ((Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static String a(Context context) {
        String str = f161925a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f161925a = Settings.Global.getString(context.getContentResolver(), "boot_count");
        } else {
            f161925a = "lowapi";
        }
        return f161925a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        return (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) ? C3841e.f162085a : (b("androidhnext.Manifest") || b("androidhnext.R")) ? "honor" : (b("androidhwext.Manifest") || b("androidhwext.R")) ? C3841e.f162086b : (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) ? C3841e.f162089e : (b("vivo.Manifest") || b("vivo.R")) ? C3841e.f162088d : (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) ? C3841e.f162087c : (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) ? "lineage" : c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f161927c)) {
            return f161927c;
        }
        String strA = u0.a(x.b(), "romtype", (String) null);
        f161927c = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f161927c;
        }
        o0.b(new a());
        return "";
    }
}
