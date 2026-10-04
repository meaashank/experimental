package com.bytedance.sdk.openadsdk.uR;

import com.bytedance.sdk.openadsdk.uR.mZ.ZRu;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static final String ZRu = ZRu.InterfaceC0473ZRu.ZRu;
    public static final String NOt = ZRu.InterfaceC0473ZRu.NOt;
    public static final String mZ = ZRu.InterfaceC0473ZRu.mZ;
    public static final String uR = ZRu.InterfaceC0473ZRu.uR;
    public static final String TFq = ZRu.InterfaceC0473ZRu.TFq;
    public static final String Ht = ZRu.InterfaceC0473ZRu.Ht;
    public static final Set<String> Mm = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uR.NOt$NOt, reason: collision with other inner class name */
    public static class C0469NOt {
        public static int NOt = 2;
        public static int ZRu = 1;
        public static int mZ = 100;
    }

    public static class ZRu {
        public static String NOt = "openAdLandPageLinks";
        public static String ZRu = "openDetailPage";
        public static String mZ = "direct";
        public static String uR = "saLandingPageLinks";
    }

    public static boolean ZRu(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
