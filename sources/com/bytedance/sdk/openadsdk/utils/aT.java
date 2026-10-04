package com.bytedance.sdk.openadsdk.utils;

import android.support.v4.media.e;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    private static String ZRu;

    public static String ZRu() {
        if (TextUtils.isEmpty(ZRu)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu().getCacheDir());
            ZRu = e.a(sb2, File.separator, "proxy_cache");
        }
        return ZRu;
    }

    public static void ZRu(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
