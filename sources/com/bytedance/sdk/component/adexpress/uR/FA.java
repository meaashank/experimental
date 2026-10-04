package com.bytedance.sdk.component.adexpress.uR;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.om;
import java.util.Locale;
import q8.C5443b;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static boolean ZRu;

    public static int NOt(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt();
        }
        float fUR = uR(context);
        if (fUR <= 0.0f) {
            fUR = 1.0f;
        }
        return (int) ((f10 / fUR) + 0.5f);
    }

    public static int ZRu(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float mZ(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt();
        }
        return f10 * uR(context);
    }

    private static float uR(Context context) {
        try {
            if (ZRu) {
                context.getClassLoader().loadClass("android.util.DisplayMetrics").getDeclaredMethod("getDeviceDensity", null).setAccessible(true);
                return ((Integer) r1.invoke(r0, null)).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static float ZRu(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt();
        }
        return (f10 * uR(context)) + 0.5f;
    }

    public static int NOt(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String mZ(@NonNull Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = om.NOt(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return ZRu(language);
    }

    public static int ZRu(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().NOt();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String ZRu(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
