package yb;

import C4.q;
import C4.s;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes7.dex */
public class d {
    public static Map<String, List<String>> a(URL url) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split("&")) {
                int iIndexOf = str.indexOf("=");
                String strG = iIndexOf > 0 ? g(str.substring(0, iIndexOf)) : str;
                if (!linkedHashMap.containsKey(strG)) {
                    linkedHashMap.put(strG, new LinkedList());
                }
                ((List) linkedHashMap.get(strG)).add((iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : g(str.substring(i10)));
            }
        }
        return linkedHashMap;
    }

    public static Map<String, List<String>> b(URL url) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split("&")) {
                int iIndexOf = str.indexOf("=");
                String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
                if (!linkedHashMap.containsKey(strSubstring)) {
                    linkedHashMap.put(strSubstring, new LinkedList());
                }
                ((List) linkedHashMap.get(strSubstring)).add((iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : str.substring(i10));
            }
        }
        return linkedHashMap;
    }

    public static boolean c(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof HttpRetryException) || (th instanceof NoRouteToHostException)) {
            return true;
        }
        return (th instanceof SSLHandshakeException) && !(th.getCause() instanceof CertificateException);
    }

    public static long[] d(String str) {
        if (e.d(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(q.f17581a);
        int iIndexOf = str.indexOf(com.prism.gaia.download.a.f164606q);
        int iIndexOf2 = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (iLastIndexOf == -1 || iIndexOf == -1 || iIndexOf2 == -1) {
            return null;
        }
        return new long[]{Long.parseLong(str.substring(iLastIndexOf + 1, iIndexOf)), Long.parseLong(str.substring(iIndexOf + 1, iIndexOf2)), Long.parseLong(str.substring(iIndexOf2 + 1))};
    }

    public static String e(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z10) {
                sb2.append("&");
            }
            sb2.append(entry.getKey() + "=" + entry.getValue());
            z10 = false;
        }
        return sb2.toString();
    }

    public static Map<String, List<String>> f(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(entry.getValue());
            map2.put(entry.getKey(), arrayList);
        }
        return map2;
    }

    public static String g(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String h(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            String[] strArrSplit = str.split(q.f17581a, -1);
            int length = strArrSplit.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == 0 && "".equals(strArrSplit[i10])) {
                    sb2.append(s.f17586c);
                } else {
                    if (length > 1 && i10 == length - 1 && "".equals(strArrSplit[i10])) {
                        break;
                    }
                    sb2.append(URLEncoder.encode(strArrSplit[i10], "UTF-8"));
                    if (i10 != length - 1) {
                        sb2.append(s.f17586c);
                    }
                }
            }
            return sb2.toString().replaceAll("\\*", "%2A");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String i(String str) {
        if (str == null || str.length() <= 0 || str.equals(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str;
        }
        String[] strArrSplit = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = h(strArrSplit[i10]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(str2);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        }
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
