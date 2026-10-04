package com.bytedance.sdk.component.utils;

import B0.C0922f;
import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class edo {
    private static volatile edo mZ;
    private volatile boolean NOt = false;
    private Map<String, String> ZRu;
    private Context uR;

    private edo(Context context) {
        if (context != null && this.uR == null) {
            this.uR = context.getApplicationContext();
            ZRu();
        }
        this.uR = context;
    }

    private void Ht(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        if (strTrim.charAt(0) == '#') {
            return;
        }
        String strReplaceAll = strTrim.replaceAll("\\s*#.*", "");
        if (strReplaceAll.indexOf(61) <= 0) {
            String[] strArrSplit = strReplaceAll.split("\\s+");
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                ZRu(strArrSplit[i10], strArrSplit[0]);
            }
            return;
        }
        Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(strReplaceAll);
        if (matcher.find()) {
            String strSubstring = matcher.group().substring(5);
            if (strSubstring.charAt(0) == '\"') {
                strSubstring = C0922f.a(strSubstring, 1, 1);
            }
            Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(strReplaceAll);
            if (matcher2.find()) {
                String strSubstring2 = matcher2.group().substring(5);
                if (strSubstring2.charAt(0) == '\"') {
                    strSubstring2 = C0922f.a(strSubstring2, 1, 1);
                }
                for (String str2 : strSubstring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                    ZRu(str2, strSubstring);
                }
            }
        }
    }

    private static String NOt(String str) {
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0) {
            return null;
        }
        String strTrim = str.substring(0, iIndexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = strTrim.toLowerCase(locale);
        if (!mZ(lowerCase)) {
            return null;
        }
        int i10 = iIndexOf + 1;
        String lowerCase2 = (iIndexOf2 < 0 ? str.substring(i10) : str.substring(i10, iIndexOf2)).trim().toLowerCase(locale);
        if (!mZ(lowerCase2)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(a.a(lowerCase2, lowerCase.length(), 1));
        sb2.append(lowerCase);
        sb2.append('/');
        sb2.append(lowerCase2);
        return sb2.toString();
    }

    private static String TFq(String str) {
        int iIndexOf;
        return (str == null || str.isEmpty() || (iIndexOf = str.indexOf(46)) < 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(iIndexOf + 1);
    }

    private static boolean mZ(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (!ZRu(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    private String uR(String str) {
        String str2;
        String strTFq = TFq(str);
        if (strTFq.isEmpty()) {
            return null;
        }
        ZRu();
        Map<String, String> map = this.ZRu;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.ZRu.get(strTFq);
            if (str2 == null) {
                strTFq = TFq(strTFq);
            }
            if (str2 != null) {
                break;
            }
        } while (!strTFq.isEmpty());
        return str2;
    }

    public static String ZRu(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return ZRu(context).ZRu(str);
    }

    public static edo ZRu(Context context) {
        if (mZ == null) {
            synchronized (edo.class) {
                try {
                    if (mZ == null) {
                        mZ = new edo(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mZ;
    }

    public final String ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strUR = uR(str);
        if (TextUtils.isEmpty(strUR)) {
            return null;
        }
        return NOt(strUR);
    }

    private static boolean ZRu(char c10) {
        return c10 > ' ' && c10 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c10) < 0;
    }

    private void ZRu() {
        if (this.uR == null || this.NOt) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.NOt) {
                    List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.edo.1
                        @Override // java.security.PrivilegedAction
                        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                        public List<String> run() {
                            BufferedReader bufferedReader;
                            InputStream inputStream = null;
                            try {
                                ArrayList arrayList = new ArrayList();
                                InputStream inputStreamOpen = edo.this.uR.getAssets().open("tt_mime_type.pro");
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            if (!TextUtils.isEmpty(line)) {
                                                arrayList.add(line);
                                            }
                                        } catch (Throwable unused) {
                                            inputStream = inputStreamOpen;
                                            try {
                                                List<String> list2 = Collections.EMPTY_LIST;
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable unused3) {
                                                    }
                                                }
                                                return list2;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (inputStreamOpen != null) {
                                        try {
                                            inputStreamOpen.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused5) {
                                    }
                                    return arrayList;
                                } catch (Throwable unused6) {
                                    bufferedReader = null;
                                }
                            } catch (Throwable unused7) {
                                bufferedReader = null;
                            }
                        }
                    });
                    this.ZRu = new HashMap(list.size());
                    String strSubstring = "";
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = strSubstring + ((String) it.next());
                        if (str.endsWith("\\")) {
                            strSubstring = str.substring(0, str.length() - 1);
                        } else {
                            Ht(str);
                            strSubstring = "";
                        }
                    }
                    if (!strSubstring.isEmpty()) {
                        Ht(strSubstring);
                    }
                    this.NOt = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void ZRu(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.ZRu.containsKey(str)) {
            return;
        }
        this.ZRu.put(str, str2);
    }
}
