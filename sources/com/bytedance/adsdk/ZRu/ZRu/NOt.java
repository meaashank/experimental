package com.bytedance.adsdk.ZRu.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends RuntimeException {
    public NOt(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
