package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f158390d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f158391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f158392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f158393c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f158394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f158395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f158396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f158397d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        public class RunnableC0616a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f158399a;

            public RunnableC0616a(CampaignUnit campaignUnit) {
                this.f158399a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f158399a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f158399a.getAds().size() > 0) {
                    this.f158399a.setMetricsData(c.this.f158393c);
                    a aVar = a.this;
                    c.this.a(aVar.f158396c, this.f158399a);
                    c.this.saveRequestTime(this.f158399a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f158399a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f158394a.optString("msg");
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f158397d, msg, cVar.f158393c);
            }
        }

        public a(JSONObject jSONObject, String str, List list, int i10) {
            this.f158394a = jSONObject;
            this.f158395b = str;
            this.f158396c = list;
            this.f158397d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f158394a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0616a("v5".equals(this.f158395b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, c.this.f158392b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, c.this.f158392b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f158390d, "errorCode = " + aVar.f156417a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f156417a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f156418b);
        this.f158393c.a(bVar);
        a(aVar.f156417a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f158393c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f156415b) == null) {
            return;
        }
        int i10 = this.f158391a;
        if (i10 == 0) {
            b(aVar.f156438b, eVar.f156416c);
        } else if (i10 == 1) {
            a(aVar.f156438b, eVar.f156416c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f158393c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public void a(String str) {
        this.f158392b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f158393c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f158392b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f158392b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString("msg");
                }
                a(iOptInt, msg, this.f158393c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f158393c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString("msg");
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA2.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strL);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strL);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA.l();
            }
        }
        a(i10, strL, cVar);
    }
}
