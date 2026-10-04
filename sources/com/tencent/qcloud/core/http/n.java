package com.tencent.qcloud.core.http;

import com.android.launcher3.IconCache;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f194334a;

    static {
        HashMap map = new HashMap();
        f194334a = map;
        map.put("bin", "application/octet-stream");
        map.put("bmp", "image/bmp");
        map.put("cgm", "image/cgm");
        map.put("djv", "image/vnd.djvu");
        map.put("djvu", "image/vnd.djvu");
        map.put("gif", "image/gif");
        map.put("ico", "image/x-icon");
        map.put("ief", "image/ief");
        map.put("jp2", "image/jp2");
        map.put("jpe", "image/jpeg");
        map.put("jpeg", "image/jpeg");
        map.put("jpg", "image/jpeg");
        map.put(com.prism.gaia.server.accounts.e.f166466e, "image/x-macpaint");
        map.put("pbm", "image/x-portable-bitmap");
        map.put("pct", "image/pict");
        map.put("pgm", "image/x-portable-graymap");
        map.put("pic", "image/pict");
        map.put("pict", "image/pict");
        map.put("png", "image/png");
        map.put("pnm", "image/x-portable-anymap");
        map.put("pnt", "image/x-macpaint");
        map.put("pntg", "image/x-macpaint");
        map.put("ppm", "image/x-portable-pixmap");
        map.put("qti", "image/x-quicktime");
        map.put("qtif", "image/x-quicktime");
        map.put("ras", "image/x-cmu-raster");
        map.put("rgb", "image/x-rgb");
        map.put("svg", "image/svg+xml");
        map.put("tif", "image/tiff");
        map.put("tiff", "image/tiff");
        map.put("wbmp", com.bumptech.glide.load.resource.bitmap.v.f139962l);
        map.put("xbm", "image/x-xbitmap");
        map.put("xpm", "image/x-xpixmap");
        map.put("xwd", "image/x-xwindowdump");
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String strSubstring = str.lastIndexOf(IconCache.EMPTY_CLASS_NAME) != -1 ? str.substring(str.lastIndexOf(IconCache.EMPTY_CLASS_NAME) + 1, str.length()) : "";
        Map<String, String> map = f194334a;
        String str2 = map.get(strSubstring.toLowerCase(Locale.ROOT));
        return str2 == null ? map.get("bin") : str2;
    }
}
