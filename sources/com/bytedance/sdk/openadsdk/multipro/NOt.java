package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static Boolean ZRu;

    public static void NOt() {
        ZRu = Boolean.FALSE;
        BinderPoolService.ZRu = true;
    }

    public static void ZRu() {
        Boolean bool = Boolean.TRUE;
        ZRu = bool;
        com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean mZ() {
        Boolean bool = ZRu;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!edo.TFq()) {
            return false;
        }
        if (ZRu == null) {
            ZRu = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("sp_multi_info", "is_support_multi_process", false));
        }
        return ZRu.booleanValue();
    }
}
