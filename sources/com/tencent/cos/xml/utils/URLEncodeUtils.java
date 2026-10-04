package com.tencent.cos.xml.utils;

import C4.q;
import C4.s;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.utils.C3843g;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class URLEncodeUtils {
    public static String cosPathEncode(String str) throws CosXmlClientException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            String[] strArrSplit = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            int length = strArrSplit.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == 0 && "".equals(strArrSplit[i10])) {
                    sb2.append('/');
                } else {
                    if (length > 1 && i10 == length - 1 && "".equals(strArrSplit[i10])) {
                        break;
                    }
                    if (!"".equals(strArrSplit[i10])) {
                        String[] strArrSplit2 = strArrSplit[i10].split(q.f17581a, -1);
                        int length2 = strArrSplit2.length;
                        for (int i11 = 0; i11 < length2; i11++) {
                            if (i11 == 0 && "".equals(strArrSplit2[i11])) {
                                sb2.append(s.f17586c);
                            } else {
                                if (length2 > 1 && i11 == length2 - 1 && "".equals(strArrSplit2[i11])) {
                                    break;
                                }
                                sb2.append(URLEncoder.encode(strArrSplit2[i11], C3843g.f162098b));
                                if (i11 != length2 - 1) {
                                    sb2.append(s.f17586c);
                                }
                            }
                        }
                    }
                    if (i10 != length - 1) {
                        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                    }
                }
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e10);
        }
    }
}
