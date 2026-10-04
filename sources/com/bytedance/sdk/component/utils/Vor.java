package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class Vor {

    @SuppressLint({"StaticFieldLeak"})
    private static Context ZRu;

    private static Configuration NOt(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void ZRu(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            ZRu = context.createConfigurationContext(NOt(context, str, str2));
        } catch (Throwable th) {
            lp.NOt(th.getMessage());
        }
        om.ZRu(ZRu);
    }
}
