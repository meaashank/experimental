package com.bytedance.sdk.openadsdk.qF.ZRu.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.mZ;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static volatile ZRu NOt;
    private String ZRu = "";

    private ZRu() {
    }

    public static ZRu ZRu() {
        if (NOt == null) {
            synchronized (ZRu.class) {
                try {
                    if (NOt == null) {
                        NOt = new ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public String NOt() {
        if (!WMI.uR().Nb("gaid")) {
            return "";
        }
        if (!TextUtils.isEmpty(this.ZRu)) {
            return this.ZRu;
        }
        String strNOt = mZ.ZRu(WMI.ZRu()).NOt("gaid", "");
        this.ZRu = strNOt;
        return strNOt;
    }

    public void NOt(String str) {
        this.ZRu = str;
    }

    public static void ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mZ.ZRu(WMI.ZRu()).ZRu("gaid", str);
    }
}
