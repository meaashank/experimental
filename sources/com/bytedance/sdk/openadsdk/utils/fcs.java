package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class fcs {
    public static void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, Double d10) {
        if (qFVar == null || qFVar.zkn() == null) {
            return;
        }
        Map<String, Object> mapZkn = qFVar.zkn();
        try {
            Object obj = qFVar.zkn().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapZkn.get("nurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.WMI.mZ().ZRu(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.lp.NOt("report Win error");
        }
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, Double d10, String str, String str2) {
        if (qFVar == null || qFVar.zkn() == null) {
            return;
        }
        Map<String, Object> mapZkn = qFVar.zkn();
        try {
            Object obj = qFVar.zkn().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapZkn.get("lurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d10));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.WMI.mZ().ZRu(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.lp.NOt("report Loss error");
        }
    }
}
