package com.bytedance.sdk.openadsdk.multipro.uR;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.Ht;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static HashSet<String> ZRu = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.uR.ZRu.1
        {
            add("did");
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add("gaid");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static Ht NOt() {
        try {
            if (ZRu()) {
                return com.bytedance.sdk.openadsdk.multipro.ZRu.ZRu.ZRu(WMI.ZRu());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean ZRu() {
        if (WMI.ZRu() != null) {
            return true;
        }
        lp.NOt("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static Context mZ() {
        return WMI.ZRu();
    }

    private static String uR() {
        return e.a(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.uR.NOt, "/t_sp/");
    }

    private static String NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void ZRu(String str, String str2, Boolean bool) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.ZRu(mZ(), str, str2, bool);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    Uri uri = Uri.parse(uR() + "boolean/" + str2 + NOt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    htNOt.ZRu(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String NOt(String str, String str2, String str3) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    return ZRu(mZ(), str, str2, str3);
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    String strZRu = htNOt.ZRu(Uri.parse(uR() + "string/" + str2 + NOt(str)));
                    if (strZRu != null && !strZRu.equals("null")) {
                        return strZRu;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void NOt(String str, String str2) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.NOt(mZ(), str, str2);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    htNOt.ZRu(Uri.parse(uR() + "long/" + str2 + NOt(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ZRu(String str, String str2, String str3) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.ZRu(mZ(), str, str2, str3);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    Uri uri = Uri.parse(uR() + "string/" + str2 + NOt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    htNOt.ZRu(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ZRu(String str, String str2, Integer num) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.ZRu(mZ(), str, str2, num);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    Uri uri = Uri.parse(uR() + "int/" + str2 + NOt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    htNOt.ZRu(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ZRu(String str, String str2, Long l10) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.ZRu(mZ(), str, str2, l10);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    Uri uri = Uri.parse(uR() + "long/" + str2 + NOt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l10);
                    htNOt.ZRu(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void ZRu(String str, String str2, Float f10) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.ZRu(mZ(), str, str2, f10);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    Uri uri = Uri.parse(uR() + "float/" + str2 + NOt(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", f10);
                    htNOt.ZRu(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String ZRu(Context context, String str, String str2, String str3) {
        String strZRu = ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2, str3);
        }
        SharedPreferences sharedPreferencesZRu = NOt.ZRu(context, strZRu);
        return sharedPreferencesZRu == null ? str3 : sharedPreferencesZRu.getString(str2, str3);
    }

    public static String ZRu(String str, String str2) {
        return ZRu.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int ZRu(String str, String str2, int i10) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    return ZRu(mZ(), str, str2, i10);
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    String strZRu = htNOt.ZRu(Uri.parse(uR() + "int/" + str2 + NOt(str)));
                    if (strZRu != null && !strZRu.equals("null")) {
                        return Integer.parseInt(strZRu);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static int ZRu(Context context, String str, String str2, int i10) {
        String strZRu = ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2, i10);
        }
        SharedPreferences sharedPreferencesZRu = NOt.ZRu(context, strZRu);
        return sharedPreferencesZRu == null ? i10 : sharedPreferencesZRu.getInt(str2, i10);
    }

    public static float ZRu(Context context, String str, String str2, float f10) {
        String strZRu = ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2, f10);
        }
        SharedPreferences sharedPreferencesZRu = NOt.ZRu(context, strZRu);
        return sharedPreferencesZRu == null ? f10 : sharedPreferencesZRu.getFloat(str2, f10);
    }

    public static boolean ZRu(String str, String str2, boolean z10) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    return ZRu(mZ(), str, str2, z10);
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    String strZRu = htNOt.ZRu(Uri.parse(uR() + "boolean/" + str2 + NOt(str)));
                    if (strZRu != null && !strZRu.equals("null")) {
                        return Boolean.parseBoolean(strZRu);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    public static boolean ZRu(Context context, String str, String str2, boolean z10) {
        String strZRu = ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2, z10);
        }
        SharedPreferences sharedPreferencesZRu = NOt.ZRu(context, strZRu);
        return sharedPreferencesZRu == null ? z10 : sharedPreferencesZRu.getBoolean(str2, z10);
    }

    public static long ZRu(String str, String str2, long j10) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    return ZRu(mZ(), str, str2, j10);
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    String strZRu = htNOt.ZRu(Uri.parse(uR() + "long/" + str2 + NOt(str)));
                    if (strZRu != null && !strZRu.equals("null")) {
                        return Long.parseLong(strZRu);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    public static long ZRu(Context context, String str, String str2, long j10) {
        String strZRu = ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2, j10);
        }
        SharedPreferences sharedPreferencesZRu = NOt.ZRu(context, strZRu);
        return sharedPreferencesZRu == null ? j10 : sharedPreferencesZRu.getLong(str2, j10);
    }

    public static void ZRu(String str) {
        if (ZRu()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                    NOt.NOt(mZ(), str);
                    return;
                }
                Ht htNOt = NOt();
                if (htNOt != null) {
                    htNOt.ZRu(Uri.parse(uR() + "clean" + NOt(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
