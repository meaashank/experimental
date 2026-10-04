package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    static volatile boolean Ht;
    static volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ NOt;
    public static volatile Integer Vor;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context ZH;
    static volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.NOt ZRu;
    private static volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ aT;
    public static volatile boolean uR;
    public static final boolean mZ = com.bytedance.sdk.component.utils.lp.uR();
    static volatile boolean TFq = true;
    static volatile int Mm = 0;
    public static volatile int FA = 3;

    public static void NOt(boolean z10) {
        Ht = z10;
    }

    public static Context ZRu() {
        return ZH;
    }

    public static com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.NOt mZ() {
        return ZRu;
    }

    public static com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ NOt() {
        return NOt;
    }

    public static void ZRu(boolean z10) {
        TFq = z10;
    }

    public static void ZRu(int i10) {
        Mm = i10;
    }

    public static void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZVar, Context context) {
        if (mZVar != null && context != null) {
            ZH = context.getApplicationContext();
            if (NOt != null) {
                return;
            }
            if (ZRu == null) {
                NOt = mZVar;
                aT = com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ.ZRu(context);
                NOt.ZRu(new mZ.ZRu() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.1
                    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.ZRu
                    public void ZRu(String str) {
                        if (TFq.mZ) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)));
                        }
                    }

                    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ.ZRu
                    public void ZRu(Set<String> set) {
                        TFq.aT.ZRu(set, 0);
                        if (TFq.mZ) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)));
                        }
                    }
                });
                Ht htZRu = Ht.ZRu();
                htZRu.ZRu(mZVar);
                htZRu.ZRu(aT);
                uR uRVarMZ = uR.mZ();
                uRVarMZ.ZRu(mZVar);
                uRVarMZ.ZRu(aT);
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }
}
