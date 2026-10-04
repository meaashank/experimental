package com.bytedance.sdk.openadsdk.WMI;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.lp;
import com.bytedance.sdk.openadsdk.utils.Yx;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements com.bytedance.sdk.component.Mm.mZ.NOt {
    public static String ZRu = "sp_multi_ttadnet_config";
    private final Context NOt;

    public NOt(Context context) {
        this.NOt = context;
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public String[] Ht() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String strBO = WMI.uR().bO();
        if (TextUtils.isEmpty(strBO)) {
            int iYBV = Yx.yBV();
            if (iYBV == 2 || iYBV == 1) {
                return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
            }
        } else if ("SG".equals(strBO) || "CN".equals(strBO)) {
            return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
        }
        return strArr;
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public String NOt() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public String TFq() {
        return lp.ZRu(this.NOt);
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public Address ZRu(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public String mZ() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public int uR() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public int ZRu() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public String ZRu(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt(ZRu, str, str2);
    }

    @Override // com.bytedance.sdk.component.Mm.mZ.NOt
    public void ZRu(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu(ZRu, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu(ZRu, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu(ZRu, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu(ZRu, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu(ZRu, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
