package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.lang.reflect.Method;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public final class om {
    private static boolean Ht = false;
    private static String NOt = null;
    private static boolean TFq = false;

    @SuppressLint({"StaticFieldLeak"})
    private static Context ZRu;
    private static Resources mZ;
    private static String uR;

    public static int FA(Context context, String str) {
        return ZRu(context, str, "color");
    }

    public static int Ht(Context context, String str) {
        return ZRu(context, str, "style");
    }

    public static int Mm(Context context, String str) {
        return NOt(context).getColor(FA(context, str));
    }

    public static int NOt(Context context, String str) {
        return ZRu(context, str, x.b.f238264e);
    }

    public static int TFq(Context context, String str) {
        return ZRu(context, str, "id");
    }

    public static int Vor(Context context, String str) {
        return ZRu(context, str, "anim");
    }

    public static void ZRu(Context context) {
        ZRu = context;
    }

    public static Drawable mZ(Context context, String str) {
        try {
            return NOt(context).getDrawable(uR(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String uR(Context context) {
        if (uR == null) {
            uR = context.getPackageName();
        }
        return uR;
    }

    public static Resources NOt(Context context) {
        Resources resources = mZ;
        if (resources == null) {
            resources = null;
        }
        Context context2 = ZRu;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void ZRu(String str) {
        uR = str;
    }

    private static int ZRu(Context context, String str, String str2) {
        int identifier = NOt(context).getIdentifier(str, str2, uR(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!TFq) {
            mZ(context);
            return NOt(context).getIdentifier(str, str2, uR(context));
        }
        return context.getResources().getIdentifier(str, str2, uR(context));
    }

    public static synchronized void mZ(Context context) {
        try {
            if (TextUtils.isEmpty(NOt)) {
                return;
            }
            Resources resources = context.getResources();
            mZ = new Resources(NOt(resources.getAssets(), NOt + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
            uR = context.getPackageName();
            TFq = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    public static int uR(Context context, String str) {
        try {
            return ZRu(context, str, AppIntroBaseFragmentKt.ARG_DRAWABLE);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static AssetManager NOt(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(null).newInstance(null);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            ZRu(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            ZRu(assetManager, str);
        }
        try {
            le.ZRu(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static String ZRu(Context context, String str) {
        return NOt(context).getString(NOt(context, str));
    }

    public static boolean ZRu(AssetManager assetManager, String str) {
        Method methodZRu = le.ZRu((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (methodZRu == null) {
            methodZRu = le.ZRu((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (methodZRu != null) {
            int i10 = 3;
            while (true) {
                int i11 = i10 - 1;
                if (i10 < 0) {
                    break;
                }
                if (((Integer) methodZRu.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                }
                i10 = i11;
            }
        }
        return false;
    }
}
