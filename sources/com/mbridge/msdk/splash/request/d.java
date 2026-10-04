package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f158854c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f158855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f158856b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f158857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f158858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f158859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f158860d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        public class RunnableC0625a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f158862a;

            public RunnableC0625a(CampaignUnit campaignUnit) {
                this.f158862a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f158862a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f158862a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f158859c, this.f158862a);
                    d.this.saveRequestTime(this.f158862a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f158862a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f158857a.optString("msg");
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f158860d, msg);
                }
            }
        }

        public a(JSONObject jSONObject, String str, List list, int i10) {
            this.f158857a = jSONObject;
            this.f158858b = str;
            this.f158859c = list;
            this.f158860d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f158857a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0625a("v5".equals(this.f158858b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, d.this.f158856b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, d.this.f158856b)));
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

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f158854c, "errorCode = " + aVar.f156417a);
        a(aVar.f156417a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f156415b) == null) {
            return;
        }
        int i10 = this.f158855a;
        if (i10 == 0) {
            b(aVar.f156438b, eVar.f156416c);
        } else if (i10 == 1) {
            a(aVar.f156438b, eVar.f156416c);
        }
    }

    public void a(String str) {
        this.f158856b = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f158856b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f158856b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString("msg"));
    }
}
