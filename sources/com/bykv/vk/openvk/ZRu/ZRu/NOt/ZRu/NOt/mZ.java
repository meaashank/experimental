package com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.NOt;

import android.content.Context;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.TFq.ZRu;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    public static final ConcurrentHashMap<String, NOt> ZRu = new ConcurrentHashMap<>();

    public static synchronized void ZRu(Context context, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar, ZRu.InterfaceC0375ZRu interfaceC0375ZRu) {
        if (mZVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, NOt> concurrentHashMap = ZRu;
            NOt nOt = concurrentHashMap.get(mZVar.edo());
            if (nOt == null) {
                nOt = new NOt(context, mZVar);
                concurrentHashMap.put(mZVar.edo(), nOt);
                mZVar.mZ();
                mZVar.edo();
            }
            nOt.ZRu(interfaceC0375ZRu);
            mZVar.mZ();
            mZVar.edo();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        try {
            NOt nOtRemove = ZRu.remove(mZVar.edo());
            if (nOtRemove != null) {
                nOtRemove.ZRu(true);
            }
            mZVar.mZ();
            mZVar.edo();
        } catch (Throwable th) {
            throw th;
        }
    }
}
