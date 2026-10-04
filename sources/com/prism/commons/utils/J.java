package com.prism.commons.utils;

import com.mbridge.msdk.MBridgeConstans;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public class J {
    public static String a(String str) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        for (int i10 = 0; i10 < bArrDigest.length; i10++) {
            byte b10 = bArrDigest[i10];
            if ((b10 & 255) < 16) {
                stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL + Integer.toHexString(bArrDigest[i10] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(b10 & 255));
            }
        }
        return stringBuffer.toString();
    }
}
