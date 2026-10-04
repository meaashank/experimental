package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import androidx.compose.ui.graphics.vector.f;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Map;
import yb.d;

/* JADX INFO: loaded from: classes7.dex */
public class StringUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101687s, 'b', f.f101679k, 'd', 'e', 'f'};

    public static String extractFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return str;
        }
        if (iLastIndexOf == str.length() - 1) {
            iLastIndexOf = str.substring(0, str.length() - 1).lastIndexOf(47);
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static String extractNameNoSuffix(String str) {
        String strExtractFileName = extractFileName(str);
        if (TextUtils.isEmpty(strExtractFileName)) {
            return "";
        }
        int iLastIndexOf = strExtractFileName.lastIndexOf(46);
        return iLastIndexOf > 0 ? strExtractFileName.substring(0, iLastIndexOf) : strExtractFileName;
    }

    public static String extractSuffix(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return RemoteSettings.FORWARD_SLASH_STRING;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(iLastIndexOf) : "";
    }

    public static String flat(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z10) {
                sb2.append("&");
            }
            sb2.append(key);
            if (!TextUtils.isEmpty(value)) {
                sb2.append("=");
                sb2.append(d.h(value));
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = HEX_DIGITS;
            sb2.append(cArr[(b10 & 240) >>> 4]);
            sb2.append(cArr[b10 & Ascii.SI]);
        }
        return sb2.toString();
    }
}
