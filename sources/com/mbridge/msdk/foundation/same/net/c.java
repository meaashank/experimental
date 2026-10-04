package com.mbridge.msdk.foundation.same.net;

import C4.q;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c<T> implements b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.campaignreport.b mRequestTime = null;
    private String key = "";
    private String isRKE = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public void calcRequestTime(long j10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = new com.mbridge.msdk.foundation.same.report.campaignreport.b(new h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j10 - this.startTime) + "");
    }

    public String getKey() {
        return this.key;
    }

    public String isRKE() {
        return this.isRKE;
    }

    public void onCancel() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    public void onProgressChange(long j10, long j11) {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<T> eVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.n().b() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            i.b().a(this.unitId);
            q0.b("Listener", eVar.f156416c + q.f17581a + str);
            T t10 = eVar.f156416c;
            if (t10 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, ((JSONObject) t10).optInt("status"), ((JSONObject) eVar.f156416c).toString(), System.currentTimeMillis());
            }
            if (eVar.f156416c instanceof String) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, new JSONObject((String) eVar.f156416c).optInt("status"), (String) eVar.f156416c, System.currentTimeMillis());
            }
        } catch (Exception e10) {
            q0.b("Listener", e10.getMessage());
        }
    }

    public void saveHbState(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void saveRequestTime(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i10);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i10) {
        this.adType = i10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRKE(String str) {
        this.isRKE = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }
}
