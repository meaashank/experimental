package com.bytedance.sdk.openadsdk.multipro.uR;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.NOt;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.Vor;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
class NOt {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> ZRu;

    private static void NOt(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ZRu;
        if (softReference == null || softReference.get() == null || (map = ZRu.get().get(ZRu(str))) == null) {
            return;
        }
        map.clear();
    }

    @Nullable
    public static SharedPreferences ZRu(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(ZRu(str), 0);
        } catch (Throwable th) {
            lp.ZRu("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    public static Map<String, ?> mZ(Context context, String str) {
        SharedPreferences sharedPreferencesZRu = ZRu(context, str);
        if (sharedPreferencesZRu == null) {
            return null;
        }
        return sharedPreferencesZRu.getAll();
    }

    private static String ZRu(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object NOt(Context context, String str, String str2, String str3) {
        String strZRu = ZRu(str);
        if (!ZRu(context, strZRu, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(x.b.f238264e)) {
            return ZRu.ZRu(context, strZRu, str2, (String) null);
        }
        if (str3.equalsIgnoreCase(x.b.f238265f)) {
            return Boolean.valueOf(ZRu.ZRu(context, strZRu, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(ZRu.ZRu(context, strZRu, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(ZRu.ZRu(context, strZRu, str2, 0L));
        }
        if (str3.equalsIgnoreCase(x.b.f238262c)) {
            return Float.valueOf(ZRu.ZRu(context, strZRu, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return ZRu.ZRu(context, strZRu, str2, (String) null);
        }
        return null;
    }

    private static Object ZRu(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ZRu;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(ZRu(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void ZRu(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ZRu;
        if (softReference == null || softReference.get() == null) {
            ZRu = new SoftReference<>(new ConcurrentHashMap());
        }
        String strZRu = ZRu(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = ZRu.get();
        if (concurrentHashMap.get(strZRu) == null) {
            concurrentHashMap.put(strZRu, new HashMap());
        }
        concurrentHashMap.get(strZRu).put(str2, obj);
    }

    public static synchronized <T> void ZRu(Context context, String str, String str2, T t10) {
        String strZRu = ZRu.ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            com.bytedance.sdk.component.NOt nOtZRu = com.bytedance.sdk.component.NOt.ZRu(context, strZRu);
            if (t10.equals(ZRu(strZRu, str2))) {
                return;
            }
            NOt.mZ mZVarNOt = nOtZRu.NOt();
            ZRu(mZVarNOt, str2, (Object) t10);
            mZVarNOt.apply();
            ZRu(strZRu, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesZRu = ZRu(context, strZRu);
        if (sharedPreferencesZRu == null) {
            return;
        }
        if (t10.equals(ZRu(strZRu, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZRu.edit();
        ZRu(editorEdit, str2, t10);
        editorEdit.apply();
        ZRu(strZRu, str2, t10);
    }

    public static void NOt(Context context, String str, String str2) {
        try {
            String strZRu = ZRu.ZRu(str, str2);
            if (Vor.Mm(strZRu)) {
                com.bytedance.sdk.component.NOt.ZRu(context, strZRu).NOt().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesZRu = ZRu(context, strZRu);
            if (sharedPreferencesZRu == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesZRu.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = ZRu;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = ZRu.get().get(ZRu(strZRu));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void NOt(Context context, String str) {
        if (Vor.Mm(str)) {
            com.bytedance.sdk.component.NOt.ZRu(context, str).NOt().clear().apply();
            NOt(str);
            return;
        }
        SharedPreferences sharedPreferencesZRu = ZRu(context, str);
        if (sharedPreferencesZRu == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZRu.edit();
        editorEdit.clear();
        editorEdit.apply();
        NOt(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ZRu(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void ZRu(NOt.mZ mZVar, String str, T t10) {
        if (t10 instanceof Integer) {
            mZVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            mZVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            mZVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            mZVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            mZVar.putString(str, (String) t10);
        }
    }

    public static String ZRu(Context context, String str, String str2, String str3) {
        Object objZRu = ZRu(str, str2);
        if (objZRu != null) {
            return String.valueOf(objZRu);
        }
        Object objNOt = NOt(context, str, str2, str3);
        ZRu(str, str2, objNOt);
        return String.valueOf(objNOt);
    }

    public static boolean ZRu(Context context, String str, String str2) {
        String strZRu = ZRu.ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            return com.bytedance.sdk.component.NOt.ZRu(context, strZRu).ZRu(str2);
        }
        SharedPreferences sharedPreferencesZRu = ZRu(context, strZRu);
        return sharedPreferencesZRu != null && sharedPreferencesZRu.contains(str2);
    }
}
