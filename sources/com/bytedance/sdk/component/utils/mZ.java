package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.prism.gaia.server.accounts.b;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static HashMap<String, ArrayList<String>> ZRu = new HashMap<>();

    private static Signature[] NOt(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e10) {
            lp.NOt(e10.toString());
            return null;
        }
    }

    public static ArrayList<String> ZRu(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (ZRu.get(str) != null) {
                return ZRu.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : NOt(context, packageName)) {
                    String strZRu = "error!";
                    if ("MD5".equals(str)) {
                        strZRu = ZRu(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strZRu = ZRu(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strZRu = ZRu(signature, "SHA256");
                    }
                    arrayList.add(strZRu);
                }
            } catch (Exception e10) {
                lp.NOt(e10.toString());
            }
            ZRu.put(str, arrayList);
        }
        return arrayList;
    }

    public static String ZRu(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListZRu = ZRu(context, "SHA1");
        if (arrayListZRu != null && arrayListZRu.size() != 0) {
            for (int i10 = 0; i10 < arrayListZRu.size(); i10++) {
                sb2.append(arrayListZRu.get(i10));
                if (i10 < arrayListZRu.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String ZRu(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(b.f166434b0);
            }
            return sb2.substring(0, sb2.length() - 1).toString();
        } catch (Exception e10) {
            lp.NOt(e10.toString());
            return "error!";
        }
    }
}
