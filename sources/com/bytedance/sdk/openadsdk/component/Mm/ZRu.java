package com.bytedance.sdk.openadsdk.component.Mm;

import android.content.Context;
import android.support.v4.media.e;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.Ht;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.multipro.NOt;
import com.bytedance.sdk.openadsdk.utils.aT;
import com.prism.gaia.client.stub.PermissionListActivity;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static File NOt(String str) {
        return ZRu(WMI.ZRu(), Ht.ZRu(WMI.ZRu()).NOt(), str);
    }

    public static File ZRu(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CacheDirFactory.getICacheDir(0).NOt());
        return new File(e.a(sb2, File.separator, str));
    }

    public static String NOt() {
        return com.bytedance.sdk.component.utils.Ht.ZRu(WMI.ZRu(), NOt.mZ(), Ht.ZRu(WMI.ZRu()).NOt()).getAbsolutePath();
    }

    public static String ZRu() {
        return aT.ZRu();
    }

    public static File ZRu(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.Ht.ZRu(context, NOt.mZ(), str, str2);
    }

    public static void ZRu(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.Ht.NOt(file);
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(Context context) {
        try {
            Ht.ZRu(context).ZRu();
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(JSONObject jSONObject, int i10, boolean z10) {
        try {
            String strHt = Vor.NOt().Ht();
            int iMm = Vor.NOt().Mm();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(PermissionListActivity.f164366k, strHt);
            if (!z10) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iMm)));
            } else if (Vor.NOt().Mm() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", WMI.uR().Zf(String.valueOf(i10)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e10) {
            lp.ZRu("TTAppOpenUtils", e10.getMessage());
        }
    }

    public static int ZRu(qF qFVar, int i10) {
        return i10 - qFVar.zr();
    }
}
