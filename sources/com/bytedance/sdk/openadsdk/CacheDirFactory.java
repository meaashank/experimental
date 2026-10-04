package com.bytedance.sdk.openadsdk;

import android.support.v4.media.e;
import android.text.TextUtils;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.ZRu;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt;
import com.bytedance.sdk.component.utils.Ht;
import com.bytedance.sdk.openadsdk.core.WMI;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile NOt MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String ZRu;

    private static NOt ZRu() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        ZRu zRu = new ZRu();
                        MEDIA_CACHE_DIR = zRu;
                        zRu.ZRu(getRootDir());
                        MEDIA_CACHE_DIR.uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return e.a(sb2, File.separator, str);
    }

    public static NOt getICacheDir(int i10) {
        return ZRu();
    }

    public static String getImageCacheDir() {
        if (ZRu == null) {
            ZRu = getDiskCacheDirPath("image");
        }
        return ZRu;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileZRu = Ht.ZRu(WMI.ZRu(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ(), "tt_ad");
        if (fileZRu.isFile()) {
            fileZRu.delete();
        }
        if (!fileZRu.exists()) {
            fileZRu.mkdirs();
        }
        String absolutePath = fileZRu.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
