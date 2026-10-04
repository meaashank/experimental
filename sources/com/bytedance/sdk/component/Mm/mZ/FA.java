package com.bytedance.sdk.component.Mm.mZ;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static HashMap<Integer, Ht> NOt;
    private static volatile FA ZRu;
    private static HashMap<Integer, ZRu> mZ;

    private FA() {
        NOt = new HashMap<>();
        mZ = new HashMap<>();
    }

    public static synchronized FA ZRu() {
        try {
            if (ZRu == null) {
                synchronized (FA.class) {
                    try {
                        if (ZRu == null) {
                            ZRu = new FA();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return ZRu;
    }

    public Ht ZRu(int i10) {
        Ht ht = NOt.get(Integer.valueOf(i10));
        if (ht != null) {
            return ht;
        }
        Ht ht2 = new Ht(i10);
        NOt.put(Integer.valueOf(i10), ht2);
        return ht2;
    }

    public ZRu ZRu(int i10, Context context) {
        ZRu zRu = mZ.get(Integer.valueOf(i10));
        if (zRu != null) {
            return zRu;
        }
        ZRu zRu2 = new ZRu(context, i10);
        mZ.put(Integer.valueOf(i10), zRu2);
        return zRu2;
    }
}
