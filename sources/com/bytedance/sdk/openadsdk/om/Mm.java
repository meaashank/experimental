package com.bytedance.sdk.openadsdk.om;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    private static ZRu ZRu;

    public interface ZRu {
        void ZRu(String str, String str2, Throwable th);
    }

    public static void ZRu(ZRu zRu) {
        ZRu = zRu;
    }

    public static boolean ZRu() {
        return ZRu != null;
    }

    public static void ZRu(String str, String str2, Throwable th) {
        if (ZRu == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        ZRu.ZRu(str, str2, th);
    }
}
