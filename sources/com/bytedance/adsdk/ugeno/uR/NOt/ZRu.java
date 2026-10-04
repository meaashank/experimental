package com.bytedance.adsdk.ugeno.uR.NOt;

import com.bytedance.adsdk.ugeno.uR.NOt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    public static final HashSet<String> ZRu = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo"));
    protected Map<String, String> Ht;
    protected String Mm;
    protected NOt.ZRu NOt;
    protected String TFq;
    protected com.bytedance.adsdk.ugeno.NOt.mZ mZ;
    protected String uR;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.uR.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0397ZRu {
        public static ZRu ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, NOt.ZRu zRu) {
            if (zRu == null) {
                return null;
            }
            String strNOt = zRu.NOt();
            if (ZRu.ZRu.contains(strNOt)) {
                return new mZ(mZVar, str, zRu);
            }
            strNOt.getClass();
            if (strNOt.equals("update")) {
                return new uR(mZVar, str, zRu);
            }
            if (strNOt.equals("emit")) {
                return new NOt(mZVar, str, zRu);
            }
            return null;
        }
    }

    public ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, NOt.ZRu zRu) {
        this.mZ = mZVar;
        this.NOt = zRu;
        this.Mm = str;
        NOt();
    }

    private void NOt() {
        NOt.ZRu zRu = this.NOt;
        if (zRu == null) {
            return;
        }
        this.uR = zRu.ZRu();
        this.TFq = this.NOt.NOt();
        this.Ht = this.NOt.mZ();
    }

    public abstract void ZRu();
}
