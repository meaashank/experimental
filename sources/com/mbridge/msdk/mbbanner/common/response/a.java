package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f157187b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f157188a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    public class RunnableC0583a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f157189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f157190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f157191c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        public class RunnableC0584a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f157193a;

            public RunnableC0584a(CampaignUnit campaignUnit) {
                this.f157193a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f157193a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f157193a.getAds().size() > 0) {
                    a.this.a(this.f157193a);
                    if (!TextUtils.isEmpty(a.this.f157188a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f157193a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f157193a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0583a.this.f157189a.optString("msg");
                }
                RunnableC0583a runnableC0583a = RunnableC0583a.this;
                a.this.a(runnableC0583a.f157191c, msg);
            }
        }

        public RunnableC0583a(JSONObject jSONObject, String str, int i10) {
            this.f157189a = jSONObject;
            this.f157190b = str;
            this.f157191c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f157189a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0584a("v5".equals(this.f157190b) ? b.parseV5CampaignUnit(jSONObjectOptJSONObject, a.this.f157188a) : b.parseCampaignUnit(jSONObjectOptJSONObject, a.this.f157188a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f157187b, "onFailed errorCode = " + aVar.f156417a);
        a(aVar.f156417a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f156415b.f156438b, eVar.f156416c);
    }

    public void a(String str) {
        this.f157188a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f157187b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0583a(jSONObject, jSONObject.optString("version"), iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString("msg"));
    }
}
