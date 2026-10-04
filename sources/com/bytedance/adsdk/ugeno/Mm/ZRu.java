package com.bytedance.adsdk.ugeno.Mm;

import C4.q;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Mm.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0388ZRu {
        public int[] NOt;
        public GradientDrawable.Orientation ZRu;
        public float[] mZ;
    }

    public static C0388ZRu NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        int iZRu = ZRu(strSubstring, '%');
        int iIndexOf = strSubstring.indexOf(",");
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        C0388ZRu c0388ZRu = new C0388ZRu();
        c0388ZRu.ZRu = uR(strSubstring2);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1);
        int[] iArr = new int[iZRu];
        float[] fArr = new float[iZRu];
        for (int i10 = 0; i10 < iZRu; i10++) {
            int iIndexOf2 = strSubstring3.indexOf("%");
            String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
            int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(q.f17581a)) + 1;
            iArr[i10] = ZRu(strTrim.substring(0, iIndexOf3).trim());
            fArr[i10] = mZ.ZRu(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i11 = iIndexOf2 + 2;
            if (strSubstring3.length() <= i11) {
                break;
            }
            strSubstring3 = strSubstring3.substring(i11);
        }
        c0388ZRu.NOt = iArr;
        c0388ZRu.mZ = fArr;
        return c0388ZRu;
    }

    public static int ZRu(String str) {
        return ZRu(str, -16777216);
    }

    public static boolean mZ(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation uR(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i10 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i10 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i10 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i10 == 135 ? GradientDrawable.Orientation.TL_BR : i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int ZRu(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    sb2.append(charArray[i11]);
                    sb2.append(charArray[i11]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i10;
    }

    public static int ZRu(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static int ZRu(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i11 = 255;
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
