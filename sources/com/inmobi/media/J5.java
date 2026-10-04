package com.inmobi.media;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J5 {
    public static K5 a(Context context, String fileKey) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(fileKey, "fileKey");
        String strConcat = "com.im.keyValueStore.".concat(fileKey);
        K5 k52 = (K5) K5.f152164b.get(strConcat);
        if (k52 == null) {
            k52 = new K5(context, strConcat);
            K5 k53 = (K5) K5.f152164b.putIfAbsent(strConcat, k52);
            if (k53 != null) {
                return k53;
            }
        }
        return k52;
    }
}
