package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.Ht;

/* JADX INFO: loaded from: classes3.dex */
public class TFq extends Ht {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile TFq ZRu;

    private TFq(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ht
    public /* bridge */ /* synthetic */ Ht.mZ ZRu() {
        return super.ZRu();
    }

    public static TFq ZRu(Context context) {
        if (ZRu == null) {
            synchronized (TFq.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new TFq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }
}
