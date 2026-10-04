package com.bytedance.sdk.component.TFq.mZ.mZ;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static void ZRu(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
