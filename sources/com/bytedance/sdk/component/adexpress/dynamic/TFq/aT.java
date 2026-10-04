package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aT {
    public static float ZRu(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<NOt.ZRu> ZRu(float f10, List<NOt.ZRu> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NOt.ZRu> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((NOt.ZRu) it.next().clone());
        }
        int size = arrayList.size();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            NOt.ZRu zRu = (NOt.ZRu) obj;
            if (zRu.NOt) {
                i10 = (int) (i10 + zRu.ZRu);
            } else {
                i11 = (int) (i11 + zRu.ZRu);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z11 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    NOt.ZRu zRu2 = (NOt.ZRu) obj2;
                    if (!zRu2.NOt) {
                        float f14 = zRu2.mZ;
                        if (f14 != 0.0f && zRu2.ZRu * f13 > f14) {
                            zRu2.ZRu = f14;
                            zRu2.NOt = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(zRu2);
                }
                if (z11) {
                    return ZRu(f10, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                NOt.ZRu zRu3 = (NOt.ZRu) obj3;
                if (zRu3.NOt) {
                    zRu3.ZRu = ZRu(zRu3.ZRu * f12);
                } else {
                    zRu3.ZRu = ZRu(zRu3.ZRu * f13);
                }
                i14 = (int) (i14 + zRu3.ZRu);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size4 = 0; size4 < arrayList.size() && f16 > 0.0f; size4 = (size4 + 1) % arrayList.size()) {
                    NOt.ZRu zRu4 = (NOt.ZRu) arrayList.get(size4);
                    if ((f10 < f11 && zRu4.NOt) || (f10 > f11 && !zRu4.NOt)) {
                        zRu4.ZRu += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
