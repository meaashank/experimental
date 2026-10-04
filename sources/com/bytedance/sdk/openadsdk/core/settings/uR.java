package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    private static volatile String NOt = "";
    private static volatile String ZRu = "";
    private static String mZ;
    private static volatile int uR;

    public static String mZ() {
        if (uR != 0) {
            return NOt;
        }
        ZRu();
        return NOt;
    }

    public static String uR() {
        if (TextUtils.isEmpty(mZ)) {
            mZ = WMI.ZRu().getPackageManager().getInstallerPackageName(Yx.TFq());
        }
        if (mZ == null) {
            mZ = "";
        }
        return mZ;
    }

    public static String NOt() {
        if (uR != 0) {
            return ZRu;
        }
        ZRu();
        return ZRu;
    }

    public static void ZRu() {
        try {
            AppSet.getClient(WMI.ZRu()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = uR.ZRu = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = uR.NOt = appSetIdInfo.getId();
                    int unused3 = uR.uR = 1;
                }
            });
        } catch (Throwable unused) {
            uR = 2;
        }
    }
}
