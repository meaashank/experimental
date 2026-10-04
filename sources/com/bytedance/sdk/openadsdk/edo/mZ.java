package com.bytedance.sdk.openadsdk.edo;

import Y6.d;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.edo;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.settings.yBV;
import com.bytedance.sdk.openadsdk.edo.ZRu.uR;
import com.bytedance.sdk.openadsdk.utils.OCA;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import java.io.File;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static volatile mZ ZRu;

    private mZ() {
    }

    public static void NOt(final qF qFVar) {
        if (Yx.ZRu(qFVar) == null || TextUtils.isEmpty(qFVar.CXy())) {
            return;
        }
        ZRu("download_gecko_start", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.19
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", qFVar.Gis());
                jSONObject.put("channel_name", qFVar.CXy());
                return uR.NOt().ZRu("download_gecko_start").ZRu(qFVar.dkT()).NOt(jSONObject.toString());
            }
        });
    }

    public static mZ ZRu() {
        if (ZRu == null) {
            synchronized (mZ.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new mZ();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    private boolean mZ(uR uRVar) {
        return uRVar == null;
    }

    public static void uR() {
        ZRu("disk_log", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.11
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jZRu = mZ.ZRu(file2);
                        j10 += jZRu;
                        jSONObject.put(file2.getName(), jZRu);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return uR.NOt().ZRu("disk_log").NOt(jSONObject.toString());
            }
        });
    }

    public void mZ() {
        ZRu("blind_mode_status", true, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.9
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uR.NOt().ZRu("blind_mode_status");
            }
        });
    }

    public static void mZ(final String str) {
        ZRu("request_monitor_daily", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.15
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uR.NOt().ZRu("request_monitor_daily").NOt(str);
            }
        });
    }

    public static void mZ(final String str, final String str2) {
        ZRu("playable_url_mime", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.17
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = str;
                    Object obj = "not validate";
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "not validate";
                    }
                    jSONObject.put("original_mime", str3);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str2));
                    if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                        obj = mimeTypeFromExtension;
                    }
                    jSONObject.put("new_mime", obj);
                    jSONObject.put("url", str2);
                    jSONObject.put("is_same", str3.equals(obj) ? 1 : 0);
                } catch (Throwable unused) {
                }
                return uR.NOt().ZRu("playable_url_mime").NOt(jSONObject.toString());
            }
        });
    }

    public void NOt(final uR uRVar) {
        if (mZ(uRVar)) {
            return;
        }
        uRVar.ZRu("show_backup_endcard");
        WMI.TFq().ZRu(new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.22
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uRVar;
            }
        });
    }

    public static void ZRu(final qF qFVar) {
        if (qFVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ZRu("bidding_receive", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.1
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (qFVar.dkT() == 3) {
                    jSONObject.put("is_icon_only", qFVar.oZ() ? 1 : 0);
                }
                return uR.NOt().ZRu("bidding_receive").NOt(jSONObject.toString());
            }
        });
    }

    public void NOt(final String str) {
        ZRu("close_playable_test_tool", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.3
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return uR.NOt().ZRu("close_playable_test_tool").NOt(jSONObject.toString());
            }
        });
    }

    public static void NOt() {
        WD.mZ(new FA("showFailLog") { // from class: com.bytedance.sdk.openadsdk.edo.mZ.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    mZ.ZRu().ZRu("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    lp.ZRu("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public static void NOt(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final uR uRVarNOt = uR.NOt().ZRu(str).NOt(str2);
                WMI.TFq().ZRu(new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.13
                    @Override // com.bytedance.sdk.openadsdk.edo.NOt
                    public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                        return uRVarNOt;
                    }
                }, false);
            }
        } catch (Throwable th) {
            lp.ZRu("StatsLogManager", th.getMessage());
        }
    }

    public static void ZRu(qF qFVar, final long j10) {
        if (qFVar == null) {
            return;
        }
        ZRu("bidding_load", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.12
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(x.h.f238399b, j10);
                return uR.NOt().ZRu("bidding_load").NOt(jSONObject.toString());
            }
        });
    }

    public static void ZRu(final String str, final com.bytedance.sdk.openadsdk.uR.TFq.NOt.ZRu zRu) {
        if (zRu == null) {
            return;
        }
        ZRu(str, false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.18
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObjectMZ = zRu.mZ();
                if (jSONObjectMZ == null) {
                    jSONObjectMZ = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ mZVarUR = zRu.uR();
                if (mZVarUR != null) {
                    mZVarUR.ZRu(jSONObjectMZ);
                }
                return uR.NOt().ZRu(str).ZRu(zRu.ZRu().dkT()).NOt(jSONObjectMZ.toString());
            }
        });
    }

    public static void ZRu(final qF qFVar, final JSONObject jSONObject) {
        if (Yx.ZRu(qFVar) == null || TextUtils.isEmpty(qFVar.CXy())) {
            return;
        }
        ZRu("download_gecko_end", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.20
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", qFVar.Gis());
                jSONObject2.put("channel_name", qFVar.CXy());
                jSONObject2.put("data", jSONObject);
                return uR.NOt().ZRu("download_gecko_end").ZRu(qFVar.dkT()).NOt(jSONObject2.toString());
            }
        });
    }

    public void ZRu(final uR uRVar) {
        if (mZ(uRVar)) {
            return;
        }
        uRVar.ZRu("express_ad_render");
        WMI.TFq().ZRu(new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.21
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uRVar;
            }
        });
    }

    public void ZRu(final String str) {
        ZRu("click_playable_test_tool", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.2
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return uR.NOt().ZRu("click_playable_test_tool").NOt(jSONObject.toString());
            }
        });
    }

    public void ZRu(final String str, final int i10, final String str2) {
        ZRu("use_playable_test_tool_error", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.4
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return uR.NOt().ZRu("use_playable_test_tool_error").NOt(jSONObject.toString());
            }
        });
    }

    public void ZRu(final long j10, final long j11) {
        final long j12 = j11 - j10;
        ZRu("general_label", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.5
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                int i10 = !edo.NOt.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return uR.NOt().ZRu("general_label").FA(String.valueOf(j12)).NOt(jSONObject.toString());
            }
        });
    }

    public void ZRu(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        ZRu(str, false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.7
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uR.NOt().ZRu(str).NOt(jSONObject.toString());
            }
        });
    }

    public void ZRu(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ZRu(str, false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.8
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                return uR.NOt().ZRu(str).NOt(str2);
            }
        });
    }

    public void ZRu(final JSONObject jSONObject) {
        if (jSONObject == null) {
            OCA.ZRu("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            OCA.ZRu("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            OCA.ZRu("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            ZRu("ad_revenue", true, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.10
                @Override // com.bytedance.sdk.openadsdk.edo.NOt
                public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.lp.mZ(WMI.ZRu()));
                        String strZRu = "";
                        try {
                            if (com.bytedance.sdk.openadsdk.core.lp.ZRu(WMI.ZRu()) != null) {
                                strZRu = com.bytedance.sdk.openadsdk.core.lp.ZRu(WMI.ZRu());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strZRu);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return uR.NOt().ZRu("ad_revenue").NOt(jSONObject.toString());
                }
            });
        }
    }

    public static long ZRu(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jZRu = 0;
        for (File file2 : file.listFiles()) {
            jZRu += ZRu(file2);
        }
        return jZRu;
    }

    public static void ZRu(String str, boolean z10, NOt nOt) {
        int iNOt = yBV.CH().NOt(str);
        if (TextUtils.isEmpty(str) || iNOt == 0 || nOt == null) {
            return;
        }
        boolean z11 = iNOt == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iNOt;
        }
        if (z11) {
            WMI.TFq().ZRu(nOt, z10);
        }
    }

    public static void ZRu(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        ZRu("ad_show_cost_time", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.14
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(x.h.f238399b, j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put(d.C0152d.f79310d, str);
                jSONObject.put("renderType", i10);
                return uR.NOt().ZRu("ad_show_cost_time").NOt(jSONObject.toString());
            }
        });
    }

    public static void ZRu(int i10, String str) {
        ZRu(i10, str, 0, (String) null);
    }

    public static void ZRu(final int i10, final String str, final int i11, final String str2) {
        ZRu("ipv6_req", false, (NOt) new NOt<com.bytedance.sdk.openadsdk.edo.ZRu.mZ>() { // from class: com.bytedance.sdk.openadsdk.edo.mZ.16
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            @Nullable
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return uR.NOt().ZRu("ipv6_req").NOt(jSONObject.toString());
            }
        });
    }
}
