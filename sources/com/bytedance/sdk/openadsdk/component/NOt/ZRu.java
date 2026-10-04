package com.bytedance.sdk.openadsdk.component.NOt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.Ht;
import com.bytedance.sdk.openadsdk.core.FA;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.NOt;
import com.bytedance.sdk.openadsdk.core.model.OCA;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.om;
import com.bytedance.sdk.openadsdk.edo.mZ;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fWk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static volatile ZRu ZRu;
    private final om NOt = WMI.mZ();

    private ZRu() {
    }

    public static ZRu ZRu() {
        if (ZRu == null) {
            synchronized (ZRu.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public void ZRu(final Context context, final AdSlot adSlot, final Ht ht) {
        final fWk fwkZRu = fWk.ZRu();
        this.NOt.ZRu(adSlot, new OCA(), 5, new om.ZRu() { // from class: com.bytedance.sdk.openadsdk.component.NOt.ZRu.1
            @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
            public void ZRu(int i10, String str) {
                ht.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
            public void ZRu(com.bytedance.sdk.openadsdk.core.model.ZRu zRu, NOt nOt) {
                if (zRu.mZ() == null || zRu.mZ().isEmpty()) {
                    ht.onError(-3, FA.ZRu(-3));
                    nOt.ZRu(-3);
                    NOt.ZRu(nOt);
                    return;
                }
                List<qF> listMZ = zRu.mZ();
                ArrayList arrayList = new ArrayList(listMZ.size());
                for (qF qFVar : listMZ) {
                    if (qF.TFq(qFVar) || (qFVar != null && qFVar.Pzo())) {
                        PAGNativeAd pAGNativeAdZRu = ZRu(context, qFVar, adSlot);
                        if (ht instanceof PAGNativeAdLoadListener) {
                            arrayList.add(pAGNativeAdZRu);
                        }
                    }
                    if (qF.TFq(qFVar) && qFVar.Qg() != null && qFVar.Qg().ZH() != null) {
                        if (WMI.uR().TFq(String.valueOf(qFVar.GE())) && WMI.uR().Gis()) {
                            if (qFVar.Qg() != null) {
                                qFVar.Qg().Ht(1);
                            }
                            if (qFVar.jQo() != null) {
                                qFVar.jQo().Ht(1);
                            }
                            com.bytedance.sdk.openadsdk.core.sAl.ZRu.NOt nOtZRu = qF.ZRu(CacheDirFactory.getICacheDir(qFVar.aNu()).mZ(), qFVar);
                            nOtZRu.ZRu("material_meta", qFVar);
                            nOtZRu.ZRu("ad_slot", adSlot);
                            com.bytedance.sdk.openadsdk.core.sAl.TFq.ZRu.ZRu(nOtZRu, null);
                        }
                        IPMiBroadcastReceiver.ZRu(context, qFVar);
                    }
                }
                if (!(ht instanceof PAGNativeAdLoadListener) || arrayList.isEmpty()) {
                    ht.onError(-4, FA.ZRu(-4));
                    nOt.ZRu(-4);
                    NOt.ZRu(nOt);
                    return;
                }
                AdSlot adSlot2 = adSlot;
                if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                    mZ.ZRu(listMZ.get(0), fwkZRu.mZ());
                }
                Ht ht2 = ht;
                if (ht2 instanceof PAGNativeAdLoadListener) {
                    ((PAGNativeAdLoadListener) ht2).onAdLoaded(arrayList.get(0));
                }
                if (nOt.TFq() == null || nOt.TFq().isEmpty()) {
                    return;
                }
                NOt.ZRu(nOt);
            }

            private PAGNativeAd ZRu(Context context2, qF qFVar, AdSlot adSlot2) {
                if (qFVar.xY() != 2) {
                    return new com.bytedance.sdk.openadsdk.ZRu.NOt.NOt(context2, qFVar, 5, adSlot2);
                }
                if (qFVar.Qg() != null) {
                    return new com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.NOt(context2, qFVar, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.ZRu.NOt.ZRu.mZ(context2, qFVar, adSlot2);
            }
        });
    }
}
