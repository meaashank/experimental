package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.prism.gaia.download.j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f156117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f156118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f156119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f156120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f156121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f156122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f156123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f156124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f156125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f156126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f156127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f156128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f156129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f156130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f156131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f156132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f156133q;

    public String a() {
        return this.f156117a;
    }

    public String b() {
        return this.f156119c;
    }

    public int c() {
        return this.f156120d;
    }

    public String d() {
        return this.f156118b;
    }

    public void e(int i10) {
        this.f156129m = i10;
    }

    public void f(int i10) {
        this.f156132p = i10;
    }

    public String g() {
        return this.f156123g;
    }

    public void h(String str) {
        this.f156128l = str;
    }

    public void i(String str) {
        this.f156130n = str;
    }

    public String j() {
        return this.f156126j;
    }

    public void k(String str) {
        this.f156133q = str;
    }

    public String l() {
        return this.f156128l;
    }

    public int m() {
        return this.f156129m;
    }

    public String n() {
        return this.f156130n;
    }

    public String o() {
        return this.f156131o;
    }

    public int p() {
        return this.f156132p;
    }

    public String q() {
        return this.f156133q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickTime [campaignId=");
        sb2.append(this.f156117a);
        sb2.append(", click_duration=");
        sb2.append(this.f156118b);
        sb2.append(", lastUrl=");
        sb2.append(this.f156126j);
        sb2.append(", code=");
        sb2.append(this.f156121e);
        sb2.append(", excepiton=");
        sb2.append(this.f156123g);
        sb2.append(", header=");
        sb2.append(this.f156124h);
        sb2.append(", content=");
        sb2.append(this.f156122f);
        sb2.append(", type=");
        sb2.append(this.f156132p);
        sb2.append(", click_type=");
        return android.support.v4.media.d.a(sb2, this.f156120d, "]");
    }

    public void a(int i10) {
        this.f156120d = i10;
    }

    public void b(String str) {
        this.f156119c = str;
    }

    public void c(int i10) {
        this.f156125i = i10;
    }

    public void d(int i10) {
        this.f156127k = i10;
    }

    public int e() {
        return this.f156121e;
    }

    public String f() {
        return this.f156122f;
    }

    public void g(String str) {
        this.f156126j = str;
    }

    public String h() {
        return this.f156124h;
    }

    public int i() {
        return this.f156125i;
    }

    public void j(String str) {
        this.f156131o = str;
    }

    public int k() {
        return this.f156127k;
    }

    public void a(String str) {
        this.f156117a = str;
    }

    public void b(int i10) {
        this.f156121e = i10;
    }

    public void c(String str) {
        this.f156118b = str;
    }

    public void d(String str) {
        this.f156122f = str;
    }

    public void e(String str) {
        this.f156123g = str;
    }

    public void f(String str) {
        this.f156124h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put(Z3.f.f79422s, eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th) {
            q0.b("ClickTime", th.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put(Z3.f.f79422s, eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put(j.b.a.f164784c, eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f155936r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th) {
                q0.b("ClickTime", th.getMessage());
            }
        }
        return arrayList;
    }
}
