package com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ;

import B0.z;
import C4.q;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.F;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.FA.Ht;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.download.a;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ZRu {
    private static final Handler NOt = new Handler(Looper.getMainLooper());
    public static final Charset ZRu = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu$1, reason: invalid class name */
    public static class AnonymousClass1 implements FilenameFilter {
        private Pattern ZRu = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.ZRu.matcher(str).matches();
        }
    }

    public static int NOt(String str) {
        return ZRu(str, 0);
    }

    public static void ZRu(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean mZ(String str) {
        if (str != null) {
            return str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str);
        }
        return false;
    }

    public static String NOt(int i10, int i11) {
        if (i10 >= 0 && i11 > 0) {
            return i10 + a.f164606q + i11;
        }
        if (i10 > 0) {
            return z.a(i10, a.f164606q);
        }
        if (i10 >= 0 || i11 <= 0) {
            return null;
        }
        return a.f164606q.concat(String.valueOf(i11));
    }

    public static void ZRu(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void ZRu(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void ZRu(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean ZRu(String str) {
        if (str != null) {
            return str.startsWith(R3.a.f67725c) || str.startsWith(R3.a.f67726d);
        }
        return false;
    }

    public static int ZRu(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static String ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu zRu, int i10) {
        int iZRu;
        if (zRu == null || !zRu.NOt()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zRu.TFq().toUpperCase());
        sb2.append(' ');
        sb2.append(zRu.ZRu());
        sb2.append(' ');
        sb2.append(zRu.Ht());
        sb2.append("\r\n");
        if (TFq.mZ) {
            Log.i("TAG_PROXY_headers", zRu.TFq().toUpperCase() + q.f17581a + zRu.ZRu() + q.f17581a + zRu.Ht());
        }
        List<Vor.NOt> listZRu = ZRu(zRu.mZ());
        boolean z10 = true;
        if (listZRu != null) {
            int size = listZRu.size();
            for (int i11 = 0; i11 < size; i11++) {
                Vor.NOt nOt = listZRu.get(i11);
                if (nOt != null) {
                    String str = nOt.ZRu;
                    String str2 = nOt.NOt;
                    F.a(sb2, str, ": ", str2, "\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z10 = false;
                    }
                }
            }
        }
        if (z10 && (iZRu = ZRu(zRu)) > 0) {
            sb2.append("Content-Range: bytes ");
            sb2.append(Math.max(i10, 0));
            sb2.append(a.f164606q);
            androidx.viewpager.widget.a.a(sb2, iZRu - 1, RemoteSettings.FORWARD_SLASH_STRING, iZRu, "\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String string = sb2.toString();
        if (TFq.mZ) {
            Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static boolean NOt() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String NOt(List<Vor.NOt> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Vor.NOt nOt = list.get(0);
                if (nOt != null) {
                    sb2.append(nOt.ZRu);
                    sb2.append(": ");
                    sb2.append(nOt.NOt);
                    sb2.append("\r\n");
                }
            }
            return sb2.toString();
        }
        return "";
    }

    public static String NOt(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append((Object) entry.getKey());
                sb2.append(": ");
                sb2.append((Object) entry.getValue());
                sb2.append("\r\n");
            }
            return sb2.toString();
        }
        return "";
    }

    public static String ZRu(int i10, int i11) {
        String strNOt = NOt(i10, i11);
        if (strNOt == null) {
            return null;
        }
        return "bytes=".concat(strNOt);
    }

    public static List<String> ZRu(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (ZRu(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu zRu, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 <= 0) {
            sb2.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb2.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb2.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb2.append(zRu.NOt);
        sb2.append("\r\n");
        if (i10 <= 0) {
            sb2.append("Content-Length: ");
            sb2.append(zRu.mZ);
            sb2.append("\r\n");
        } else {
            sb2.append("Content-Range: bytes ");
            sb2.append(i10);
            sb2.append(a.f164606q);
            sb2.append(zRu.mZ - 1);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(zRu.mZ);
            sb2.append("\r\nContent-Length: ");
            sb2.append(zRu.mZ - i10);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close\r\n\r\n");
        String string = sb2.toString();
        if (TFq.mZ) {
            Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static int ZRu() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    public static int ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu zRu) {
        int iLastIndexOf;
        if (zRu == null) {
            return -1;
        }
        if (zRu.ZRu() == 200) {
            return ZRu(zRu.ZRu("Content-Length", null), -1);
        }
        if (zRu.ZRu() == 206) {
            String strZRu = zRu.ZRu("Content-Range", null);
            if (!TextUtils.isEmpty(strZRu) && (iLastIndexOf = strZRu.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING)) >= 0 && iLastIndexOf < strZRu.length() - 1) {
                return ZRu(strZRu.substring(iLastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static String ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu zRu, boolean z10, boolean z11) {
        String strZRu;
        if (zRu == null) {
            if (TFq.mZ) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if (!zRu.NOt()) {
            if (TFq.mZ) {
                Log.e("TAG_PROXY_Response", "response code: " + zRu.ZRu());
            }
            return "response code: " + zRu.ZRu();
        }
        String strZRu2 = zRu.ZRu("Content-Type", null);
        if (!mZ(strZRu2)) {
            if (TFq.mZ) {
                Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(strZRu2)));
            }
            return "Content-Type: ".concat(String.valueOf(strZRu2));
        }
        int iZRu = ZRu(zRu);
        if (iZRu <= 0) {
            if (TFq.mZ) {
                Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(iZRu)));
            }
            return "Content-Length: ".concat(String.valueOf(iZRu));
        }
        if (z10 && ((strZRu = zRu.ZRu("Accept-Ranges", null)) == null || !strZRu.contains("bytes"))) {
            if (TFq.mZ) {
                Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(strZRu)));
            }
            return "Accept-Ranges: ".concat(String.valueOf(strZRu));
        }
        if (!z11 || zRu.uR() != null) {
            return null;
        }
        if (TFq.mZ) {
            Log.e("TAG_PROXY_Response", "response body null");
        }
        return "response body null";
    }

    public static void ZRu(FA fa2) {
        if (fa2 != null) {
            if (NOt()) {
                Ht.NOt(fa2);
                if (TFq.mZ) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            fa2.run();
            if (TFq.mZ) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void ZRu(Runnable runnable) {
        if (runnable != null) {
            if (NOt()) {
                runnable.run();
            } else {
                NOt.post(runnable);
            }
        }
    }

    public static List<Vor.NOt> ZRu(List<Vor.NOt> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (TFq.mZ) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Vor.NOt nOt = list.get(i10);
                if (nOt != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", nOt.ZRu + ": " + nOt.ZRu);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Vor.NOt nOt2 : list) {
            if ("Host".equals(nOt2.ZRu) || "Keep-Alive".equals(nOt2.ZRu) || "Connection".equals(nOt2.ZRu) || "Proxy-Connection".equals(nOt2.ZRu)) {
                arrayList.add(nOt2);
            }
        }
        list.removeAll(arrayList);
        if (TFq.mZ) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Vor.NOt nOt3 = list.get(i11);
                if (nOt3 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", nOt3.ZRu + ": " + nOt3.NOt);
                }
            }
        }
        return list;
    }

    public static List<Vor.NOt> ZRu(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : setEntrySet) {
                    arrayList.add(new Vor.NOt(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.ZRu zRu, mZ mZVar, String str, int i10) {
        String strNOt;
        String str2;
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu ZRu2 = mZVar.ZRu(str, i10);
        if (ZRu2 == null) {
            int iZRu = ZRu(zRu);
            String strZRu = zRu.ZRu("Content-Type", null);
            if (iZRu > 0 && !TextUtils.isEmpty(strZRu)) {
                com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.TFq tFqMm = zRu.Mm();
                String string = "";
                if (tFqMm == null) {
                    strNOt = "";
                    str2 = strNOt;
                } else {
                    str2 = tFqMm.NOt;
                    strNOt = NOt(tFqMm.TFq);
                }
                String strNOt2 = NOt(zRu.mZ());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str2);
                    jSONObject.put("requestHeaders", strNOt);
                    jSONObject.put("responseHeaders", strNOt2);
                    string = jSONObject.toString();
                } catch (Throwable unused) {
                }
                com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu zRu2 = new com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.ZRu(str, strZRu, iZRu, i10, string);
                mZVar.ZRu(zRu2);
                return zRu2;
            }
        }
        return ZRu2;
    }
}
