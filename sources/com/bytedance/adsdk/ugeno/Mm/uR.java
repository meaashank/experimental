package com.bytedance.adsdk.ugeno.Mm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.github.appintro.AppIntroBaseFragmentKt;

/* JADX INFO: loaded from: classes2.dex */
public final class uR {
    private static Resources NOt;
    private static String ZRu;

    @SuppressLint({"StaticFieldLeak"})
    private static Context mZ;

    public static void ZRu(String str) {
        ZRu = str;
    }

    private static String ZRu(Context context) {
        if (ZRu == null) {
            ZRu = context.getPackageName();
        }
        return ZRu;
    }

    private static int ZRu(Context context, String str, String str2) {
        if (NOt == null) {
            NOt = context.getResources();
        }
        return NOt.getIdentifier(str, str2, ZRu(context));
    }

    public static int ZRu(Context context, String str) {
        return ZRu(context, str, AppIntroBaseFragmentKt.ARG_DRAWABLE);
    }
}
