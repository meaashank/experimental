package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class to {
    private static volatile String ZRu;

    public static String ZRu() {
        if (!TextUtils.isEmpty(ZRu)) {
            return ZRu;
        }
        String str = Build.MODEL;
        ZRu = str;
        return str;
    }
}
