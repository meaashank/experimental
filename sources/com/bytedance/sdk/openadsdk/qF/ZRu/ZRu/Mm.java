package com.bytedance.sdk.openadsdk.qF.ZRu.ZRu;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.Yx;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    public static Ht ZRu(Context context, qF qFVar, String str) {
        return mZ.ZRu() ? new TFq(context, qFVar, str) : Yx.FA(context) ? new uR(context, qFVar, str) : new ZRu(context, qFVar, str);
    }
}
