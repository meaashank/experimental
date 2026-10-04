package com.bytedance.sdk.openadsdk.core.lp.mZ;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    public static final List<String> ZRu = Arrays.asList("video/mp4", "video/3gpp");

    public static double ZRu(int i10, double d10, int i11, int i12, int i13, @Nullable String str) {
        double dZRu = ZRu(i10, d10, i11, i12);
        return (1.0d / ((dZRu + 1.0d) + ZRu(i13))) * ZRu(str);
    }

    private static double ZRu(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? ((double) i11) / ((double) i12) : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double ZRu(int i10) {
        int iMax = Math.max(i10, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static double ZRu(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }
}
