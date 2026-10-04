package com.bytedance.sdk.openadsdk.Ht;

import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.core.mZ;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private static volatile ZRu ZRu;
    private int[] FA;
    private int[] Ht;
    private int[] Mm;
    private boolean NOt;
    private int[] TFq;
    private int[] Vor;
    private boolean WMI;
    private boolean ZH;
    private boolean aT;
    private boolean edo;
    private int[] lp;
    private boolean mZ;
    private int oK;
    private boolean sAl;
    private boolean uR;
    private boolean yBV;

    private ZRu() {
        NOt();
    }

    public boolean WMI() {
        return this.sAl;
    }

    public int[] ZH() {
        return this.Mm;
    }

    public int[] aT() {
        return this.Ht;
    }

    public boolean edo() {
        return this.aT;
    }

    public int[] lp() {
        return this.FA;
    }

    public boolean oK() {
        return this.ZH;
    }

    public boolean qF() {
        return this.WMI;
    }

    public int[] sAl() {
        return this.Vor;
    }

    public int[] yBV() {
        return this.lp;
    }

    public boolean FA() {
        return this.uR;
    }

    public boolean Mm() {
        return this.mZ;
    }

    public int[] Vor() {
        return this.TFq;
    }

    public boolean Ht() {
        return this.NOt;
    }

    public boolean TFq() {
        return this.yBV;
    }

    public int uR() {
        return this.oK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] mZ(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void NOt() {
        edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Ht.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                ZRu.this.edo = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("feature_switch", false);
                if (ZRu.this.edo) {
                    try {
                        ZRu.this.WMI = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("exclude_banner_native", false);
                        ZRu.this.oK = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("feature_timer_interval", 10000);
                        ZRu.this.yBV = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_dislike_cnt", "1,3,5session").split(",");
                        ZRu zRu = ZRu.this;
                        zRu.NOt = zRu.ZRu(strArrSplit);
                        ZRu zRu2 = ZRu.this;
                        zRu2.mZ = zRu2.ZRu(strArrSplit2);
                        ZRu zRu3 = ZRu.this;
                        zRu3.uR = zRu3.ZRu(strArrSplit3);
                        ZRu zRu4 = ZRu.this;
                        zRu4.TFq = zRu4.NOt(strArrSplit);
                        ZRu zRu5 = ZRu.this;
                        zRu5.Ht = zRu5.NOt(strArrSplit2);
                        ZRu zRu6 = ZRu.this;
                        zRu6.Mm = zRu6.NOt(strArrSplit3);
                        ZRu zRu7 = ZRu.this;
                        zRu7.lp = zRu7.mZ(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_video_stay_time", "1,3,5&session").split("&");
                        ZRu zRu8 = ZRu.this;
                        zRu8.aT = zRu8.ZRu(strArrSplit5);
                        ZRu zRu9 = ZRu.this;
                        zRu9.ZH = zRu9.ZRu(strArrSplit6);
                        ZRu zRu10 = ZRu.this;
                        zRu10.FA = zRu10.NOt(strArrSplit5);
                        ZRu zRu11 = ZRu.this;
                        zRu11.Vor = zRu11.NOt(strArrSplit6);
                        ZRu.this.sAl = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] NOt(String[] strArr) {
        if (strArr.length > 0) {
            return mZ(strArr[0].split(","));
        }
        return new int[0];
    }

    public static ZRu ZRu() {
        if (ZRu == null) {
            synchronized (mZ.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new ZRu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public boolean mZ() {
        return this.edo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ZRu(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
