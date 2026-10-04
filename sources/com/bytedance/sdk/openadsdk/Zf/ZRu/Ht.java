package com.bytedance.sdk.openadsdk.Zf.ZRu;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.th;

/* JADX INFO: loaded from: classes3.dex */
public class Ht {
    public static boolean ZRu(View view, int i10) {
        return ZRu(view, false, i10);
    }

    public static boolean ZRu(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return th.ZRu(view, z10 ? 30 : 50, i10);
    }
}
