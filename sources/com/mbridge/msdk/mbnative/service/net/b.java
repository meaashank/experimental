package com.mbridge.msdk.mbnative.service.net;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f157482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f157483b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f157484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f157485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f157486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f157487d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        public class RunnableC0593a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f157489a;

            public RunnableC0593a(CampaignUnit campaignUnit) {
                this.f157489a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f157489a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f157489a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f157487d, aVar.f157484a.optString("msg"));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f157486c, this.f157489a);
                    b.this.saveRequestTime(this.f157489a.getAds().size());
                }
            }
        }

        public a(JSONObject jSONObject, String str, List list, int i10) {
            this.f157484a = jSONObject;
            this.f157485b = str;
            this.f157486c = list;
            this.f157487d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f157484a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0593a("v5".equals(this.f157485b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject)));
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f157483b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f157483b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f156417a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
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
        int i10 = this.f157482a;
        if (i10 == 0) {
            b(aVar.f156438b, eVar.f156416c);
        } else if (i10 == 1) {
            a(aVar.f156438b, eVar.f156416c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public void a(int i10) {
        this.f157482a = i10;
    }

    public int a() {
        return this.f157482a;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString("msg"));
                return;
            }
        }
        a(iOptInt, jSONObject.optString("msg"));
    }
}
