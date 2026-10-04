package com.bytedance.adsdk.ugeno.Ht;

import java.util.Collection;
import kotlinx.coroutines.internal.C5091z;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public static int ZRu(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - C5091z.f220373j;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean ZRu(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
