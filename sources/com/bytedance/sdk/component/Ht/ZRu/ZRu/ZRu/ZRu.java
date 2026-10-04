package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends NOt {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ZRu ZRu;

    private ZRu(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.NOt
    public /* bridge */ /* synthetic */ NOt.C0405NOt ZRu() {
        return super.ZRu();
    }

    public static ZRu ZRu(Context context) {
        if (ZRu == null) {
            synchronized (ZRu.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new ZRu(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }
}
