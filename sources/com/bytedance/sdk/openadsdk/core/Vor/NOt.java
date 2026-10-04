package com.bytedance.sdk.openadsdk.core.Vor;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class NOt {
    private static com.bytedance.sdk.openadsdk.core.Vor.ZRu ZRu;
    private String NOt;

    public static class ZRu {
        private static final NOt ZRu = new NOt();
    }

    public long Ht() {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            return zRu.Ht();
        }
        return 0L;
    }

    public int Mm() {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            return zRu.Mm();
        }
        return 1;
    }

    public void NOt(String str) {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu;
        if (TextUtils.isEmpty(str) || (zRu = ZRu) == null) {
            return;
        }
        zRu.NOt(str);
    }

    public String TFq() {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        return zRu != null ? zRu.TFq() : "";
    }

    public void ZRu(String str) {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu;
        if (TextUtils.isEmpty(str) || (zRu = ZRu) == null) {
            return;
        }
        zRu.ZRu(str);
    }

    public boolean mZ() {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu == null) {
            return false;
        }
        return zRu.NOt();
    }

    public String uR() {
        String strUR;
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        return (zRu == null || (strUR = zRu.uR()) == null) ? "" : strUR;
    }

    private NOt() {
        this.NOt = null;
        ZRu = new com.bytedance.sdk.openadsdk.core.Vor.ZRu();
    }

    public static NOt NOt() {
        return ZRu.ZRu;
    }

    public void ZRu() {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            zRu.mZ();
        }
    }

    public void ZRu(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            zRu.ZRu(str, map);
        }
    }

    public Map<String, String> ZRu(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            return zRu.ZRu(str, bArr);
        }
        return new HashMap();
    }

    public void ZRu(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.Vor.ZRu zRu = ZRu;
        if (zRu != null) {
            zRu.ZRu(motionEvent);
        }
    }
}
