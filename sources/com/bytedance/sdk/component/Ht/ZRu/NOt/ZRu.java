package com.bytedance.sdk.component.Ht.ZRu.NOt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static boolean Ht() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.Ht())) ? false : true;
    }

    private static long NOt(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean TFq() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.mZ())) ? false : true;
    }

    public static long ZRu(int i10, Context context) {
        return NOt(i10, context);
    }

    public static boolean mZ() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.uR())) ? false : true;
    }

    public static boolean uR() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.TFq())) ? false : true;
    }

    public static boolean ZRu() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.ZRu())) ? false : true;
    }

    public static boolean NOt() {
        TFq tFqUR = FA.Mm().uR();
        return (tFqUR == null || TextUtils.isEmpty(tFqUR.NOt())) ? false : true;
    }
}
