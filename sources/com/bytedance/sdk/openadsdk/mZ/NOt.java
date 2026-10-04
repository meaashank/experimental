package com.bytedance.sdk.openadsdk.mZ;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private static volatile NOt ZRu;
    private final om<com.bytedance.sdk.openadsdk.uR.ZRu> NOt = WMI.mZ();

    private NOt() {
    }

    public static NOt ZRu() {
        if (ZRu == null) {
            synchronized (NOt.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new NOt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public void ZRu(@NonNull String str, List<FilterWord> list, String str2) {
        ZRu(str, list, null, null, str2);
    }

    public void ZRu(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.NOt.ZRu(str, list, str2, str3, str4);
    }
}
