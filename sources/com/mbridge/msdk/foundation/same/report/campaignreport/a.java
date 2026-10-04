package com.mbridge.msdk.foundation.same.report.campaignreport;

import Jb.d;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.tracker.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f156536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected h f156537b;

    public a(h hVar) {
        this.f156537b = hVar;
        Context contextD = c.n().d();
        this.f156536a = contextD;
        if (this.f156537b == null || contextD == null) {
            return;
        }
        int iS = m0.s(contextD);
        this.f156537b.c(iS);
        this.f156537b.a(m0.a(this.f156536a, iS));
    }

    public void a() {
        if (this.f156537b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f156537b.f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f156537b.i());
                jSONObject.put("fb", this.f156537b.b());
                jSONObject.put("num", this.f156537b.e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f156537b.a());
                jSONObject.put(d.f58184l, this.f156537b.g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f156537b.h());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f156537b.d());
                    jSONObject.put("network_str", this.f156537b.c());
                }
                e eVar = new e("2000006");
                eVar.a(0);
                eVar.b(0);
                eVar.a(jSONObject);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().e().d(eVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void b(int i10) {
        h hVar = this.f156537b;
        if (hVar != null) {
            hVar.a(i10);
        }
    }

    public void c(int i10) {
        h hVar = this.f156537b;
        if (hVar != null) {
            hVar.b(i10);
        }
    }

    public void b(String str) {
        h hVar = this.f156537b;
        if (hVar != null) {
            hVar.c(str);
        }
    }

    public void a(int i10) {
        h hVar = this.f156537b;
        if (hVar != null) {
            hVar.d(i10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f156537b.b(str);
    }
}
