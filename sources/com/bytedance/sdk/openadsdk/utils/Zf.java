package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class Zf {
    public static boolean ZRu = ZRu();

    private static boolean ZRu() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.WMI.ZRu() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
        }
        return true;
    }

    public static void ZRu(int i10) {
        try {
            SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i10);
            editorEdit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
        }
    }
}
