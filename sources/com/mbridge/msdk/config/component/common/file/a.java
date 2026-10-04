package com.mbridge.msdk.config.component.common.file;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v4.media.e;
import android.support.v4.media.i;
import android.text.TextUtils;
import androidx.appcompat.widget.C1498d;
import androidx.multidex.MultiDexExtractor;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w.y;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f154302a;

    public static b a(String str, String str2, int i10, String str3) {
        b bVar;
        b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String strE = e(str);
            String strC = c(str, str2);
            bVar = new b();
            try {
                bVar.a(a());
                bVar.c(strE);
                if (!strE.contains("mp4")) {
                    strC = strC.concat(strE);
                }
                bVar.b(strC);
                if (strE.contains("zip")) {
                    bVar.d(e(str, str2));
                    String strB = b(str, str2, i10, str3);
                    bVar.a(b(strB));
                    bVar.e(strB);
                } else {
                    bVar.a(b(bVar.a()));
                }
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
                q0.b("ComponentFileUtil", th.getMessage());
                bVar = bVar2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (bVar != null) {
            a(bVar.a());
        }
        return bVar;
    }

    public static b b(String str, String str2) {
        return a(str, str2, 0, (String) null);
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return SameMD5.getMD5(str2);
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            URL url = new URL(str);
            return SameMD5.getMD5(url.getProtocol() + "://" + url.getHost() + url.getPath());
        } catch (Exception e10) {
            q0.b("ComponentFileUtil", e10.getMessage(), e10);
            return "";
        }
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + RemoteSettings.FORWARD_SLASH_STRING + c(str, str2) + RemoteSettings.FORWARD_SLASH_STRING;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.lang.String r1 = "\\."
            java.lang.String[] r3 = r3.split(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            if (r1 <= 0) goto L21
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r3 = move-exception
            goto L34
        L21:
            r3 = r0
        L22:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = "."
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L30
            return r3
        L30:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L34:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r1 = "ComponentFileUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.e(java.lang.String):java.lang.String");
    }

    public static b f(String str) {
        return a(str, (String) null, 0, (String) null);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strConcat = a().concat(c("", str));
            return new File(strConcat).exists() ? strConcat : "";
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "getLocalFilePathByCacheKey error: " + th.getMessage(), th);
            return "";
        }
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    return queryParameters.get(0);
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        return strSubstring.replace(MultiDexExtractor.f114845k, "");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean j(String str) {
        try {
            Context contextD = c.n().d();
            if (contextD != null && !TextUtils.isEmpty(str)) {
                AssetManager assets = contextD.getAssets();
                try {
                    assets.open(str).close();
                    return true;
                } catch (IOException unused) {
                    String[] list = assets.list(str);
                    if (list != null) {
                        return list.length > 0;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "isAssetPathExist error: " + th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    private static String b(String str, String str2, int i10, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strE = e(str, str2);
        String strI = i(str);
        String strH = h(str);
        if (!TextUtils.isEmpty(strI)) {
            if (i10 == 0) {
                return strE + strI + RemoteSettings.FORWARD_SLASH_STRING + strH;
            }
            if (i10 == 1) {
                return androidx.concurrent.futures.a.a(strE, strI, com.prism.gaia.download.a.f164603n);
            }
            if (i10 == 2) {
                StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strE);
                if (!TextUtils.isEmpty(strH)) {
                    strI = strH;
                }
                sbA.append(strI);
                sbA.append("_");
                if (str3.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                    str3 = "";
                }
                return e.a(sbA, str3, C1498d.f86308y);
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.f(java.lang.String, java.lang.String):boolean");
    }

    public static String d(String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                    bArr = new byte[4096];
                } finally {
                }
            } catch (Throwable th) {
                q0.b("ComponentFileUtil", th.getMessage());
            }
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 != -1) {
                    messageDigest.update(bArr, 0, i10);
                } else {
                    strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                    messageDigest.reset();
                    fileInputStream.close();
                    return strHexEncode;
                }
                q0.b("ComponentFileUtil", th.getMessage());
            }
        }
        return strHexEncode;
    }

    public static String c(String str) {
        Map<String, Object> map;
        Object obj;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Map<String, Object> map2 = f154302a;
            if (map2 == null || map2.isEmpty()) {
                String strB = b();
                if (TextUtils.isEmpty(strB)) {
                    f154302a = new HashMap();
                } else {
                    f154302a = new com.mbridge.msdk.config.dynamic.utils.e().a(strB);
                }
            }
            map = f154302a;
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "getAssetsResPathWithCacheKey error: " + th.getMessage(), th);
        }
        if (map != null && !map.isEmpty() && f154302a.containsKey(str)) {
            Object obj2 = f154302a.get(str);
            if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get("path")) == null) {
                return "";
            }
            String strValueOf = String.valueOf(obj);
            if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
                String strConcat = "template/".concat(strValueOf);
                if (j(strConcat)) {
                    return "assets://" + strConcat + RemoteSettings.FORWARD_SLASH_STRING;
                }
            }
            return "";
        }
        return "";
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a();
        String strC = c(str, str2);
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            String str3 = strA + strC + RemoteSettings.FORWARD_SLASH_STRING + strI + RemoteSettings.FORWARD_SLASH_STRING;
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static String a() {
        File file = new File(c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: I5.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.component.common.file.a.k(str);
            }
        });
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        return i.a(R3.a.f67727e, str2, TextUtils.isEmpty(strSubstring) ? "" : y.a("?", strSubstring));
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage(), th);
        }
        return new File(str).exists();
    }

    private static String b() {
        InputStream inputStreamOpen = null;
        try {
            Context contextD = c.n().d();
            if (contextD == null) {
                return "";
            }
            inputStreamOpen = contextD.getAssets().open("template/metadata.json");
            byte[] bArr = new byte[8192];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (i10 != -1) {
                    sb2.append(new String(bArr, 0, i10, "UTF-8"));
                } else {
                    String string = sb2.toString();
                    try {
                        inputStreamOpen.close();
                        return string;
                    } catch (IOException e10) {
                        q0.b("ComponentFileUtil", e10.getMessage());
                        return string;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                q0.b("ComponentFileUtil", "readAssetString error: " + th.getMessage(), th);
                return "";
            } finally {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e11) {
                        q0.b("ComponentFileUtil", e11.getMessage());
                    }
                }
            }
        }
    }

    public static b a(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM FileDB WHERE originalURL=".concat("'").concat(str).concat("'"));
            if (mapD != null) {
                Object obj = mapD.get("data");
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        Object obj2 = list.get(0);
                        if (obj2 instanceof Map) {
                            return a((Map<String, Object>) obj2, str, i10, str2);
                        }
                    }
                }
            }
            return a(mapD, str, i10, str2);
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage());
            return null;
        }
    }

    private static b a(Map<String, Object> map, String str, int i10, String str2) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    String strValueOf = String.valueOf(map.get("cacheKey"));
                    if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
                        return a(str, strValueOf, i10, str2);
                    }
                    return a(str, (String) null, i10, str2);
                }
            } catch (Throwable th) {
                q0.b("ComponentFileUtil", th.getMessage());
            }
        }
        return null;
    }
}
