package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.client.stub.PermissionListActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private int Mm;
    private String ZRu = "";
    private String NOt = "";
    private String mZ = "";
    private String uR = "";
    private double TFq = -1.0d;
    private int Ht = -1;

    public JSONObject FA() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PermissionListActivity.f164366k, NOt());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, Ht());
            jSONObject.put("comment_num", TFq());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, ZRu());
            jSONObject.put("package_name", mZ());
            jSONObject.put(FirebaseAnalytics.Param.SCORE, uR());
            jSONObject.put("app_category", Mm());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.NOt(e10.toString());
            return jSONObject;
        }
    }

    public int Ht() {
        return this.Mm;
    }

    public String Mm() {
        return this.uR;
    }

    public String NOt() {
        return this.NOt;
    }

    public int TFq() {
        return this.Ht;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public String mZ() {
        return this.mZ;
    }

    public double uR() {
        return this.TFq;
    }

    public void NOt(String str) {
        this.NOt = str;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void mZ(String str) {
        this.mZ = str;
    }

    public void uR(String str) {
        this.uR = str;
    }

    public void NOt(int i10) {
        this.Mm = i10;
    }

    public void ZRu(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.TFq = d10;
        } else {
            this.TFq = -1.0d;
        }
    }

    public void ZRu(int i10) {
        if (i10 <= 0) {
            this.Ht = -1;
        } else {
            this.Ht = i10;
        }
    }
}
