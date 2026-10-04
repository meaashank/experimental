package com.mbridge.msdk.setting;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f158533A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f158536D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f158537E;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f158541I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private String f158543K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f158546N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f158548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f158549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f158550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f158551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f158552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f158553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f158554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f158555i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f158557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f158558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f158559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f158560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f158561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f158562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f158563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f158564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f158565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f158566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f158567u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f158572z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f158547a = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f158556j = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f158568v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f158569w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f158570x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f158571y = 60;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f158534B = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f158535C = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f158538F = 100;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f158539G = 60;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f158540H = 5000;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f158542J = 1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private String f158544L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private String f158545M = "";

    public static m a(JSONObject jSONObject) {
        m mVar = null;
        if (jSONObject != null) {
            try {
                m mVar2 = new m();
                try {
                    mVar2.e(jSONObject.optString("unitId"));
                    mVar2.a(jSONObject.optString("ab_id"));
                    mVar2.f(jSONObject.optString("rid"));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                        }
                        mVar2.a(arrayList);
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                        }
                        mVar2.b(arrayList2);
                    }
                    mVar2.x(jSONObject.optInt("tpqn"));
                    mVar2.c(jSONObject.optInt("aqn"));
                    mVar2.b(jSONObject.optInt("acn"));
                    mVar2.z(jSONObject.optInt("wt"));
                    int i12 = 1;
                    mVar2.o(jSONObject.optInt("iscasf", 1));
                    mVar2.w(jSONObject.optInt("spmxrt", 5000));
                    mVar2.c(jSONObject.optLong("current_time"));
                    mVar2.r(jSONObject.optInt(x.c.f238293R));
                    mVar2.d(jSONObject.optLong("dlct", com.prism.gaia.server.content.e.f167098H));
                    mVar2.d(jSONObject.optInt("autoplay", 0));
                    mVar2.k(jSONObject.optInt("dlnet", 2));
                    mVar2.c(jSONObject.optString("no_offer"));
                    mVar2.f(jSONObject.optInt("cb_type"));
                    mVar2.b(jSONObject.optLong("clct", 86400L));
                    mVar2.a(jSONObject.optLong("clcq", 300L));
                    mVar2.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                    mVar2.g(jSONObject.optInt("cd_rate", 0));
                    mVar2.i(jSONObject.optInt("content", 1));
                    mVar2.m(jSONObject.optInt("impt", 0));
                    mVar2.l(jSONObject.optInt("icon_type", 1));
                    mVar2.b(jSONObject.optString("no_ads_url", ""));
                    mVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                    mVar2.s(jSONObject.optInt("play_ctdown", 0));
                    mVar2.h(jSONObject.optInt("close_alert", 0));
                    mVar2.n(jSONObject.optInt("intershowlimit", 30));
                    mVar2.v(jSONObject.optInt("refreshFq", 60));
                    mVar2.e(jSONObject.optInt("closeBtn", 0));
                    int iOptInt = jSONObject.optInt("tmorl", 1);
                    if (iOptInt <= 2 && iOptInt > 0) {
                        i12 = iOptInt;
                    }
                    mVar2.y(i12);
                    mVar2.d(jSONObject.optString("placementid", ""));
                    mVar2.p(jSONObject.optInt("ltafemty", 10));
                    mVar2.q(jSONObject.optInt("ltorwc", 60));
                    mVar2.g(jSONObject.optString("vtag", ""));
                    return mVar2;
                } catch (Exception e10) {
                    e = e10;
                    mVar = mVar2;
                    e.printStackTrace();
                    return mVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return mVar;
    }

    public int A() {
        return this.f158536D;
    }

    public int B() {
        return this.f158537E;
    }

    public int C() {
        return this.f158538F;
    }

    public int D() {
        return this.f158539G;
    }

    public int E() {
        return this.f158540H;
    }

    public int F() {
        return this.f158541I;
    }

    public int G() {
        return this.f158542J;
    }

    public String H() {
        return this.f158543K;
    }

    public String I() {
        return this.f158544L;
    }

    public String J() {
        return this.f158545M;
    }

    public int K() {
        return this.f158546N;
    }

    public int L() {
        return this.f158553g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put(x.c.f238293R, y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public List<Integer> b() {
        return this.f158548b;
    }

    public void c(String str) {
        this.f158533A = str;
    }

    public void d(int i10) {
        this.f158553g = i10;
    }

    public int e() {
        return this.f158551e;
    }

    public int f() {
        return this.f158552f;
    }

    public int g() {
        return this.f158554h;
    }

    public int h() {
        return this.f158555i;
    }

    public int i() {
        return this.f158556j;
    }

    public long j() {
        return this.f158557k;
    }

    public long k() {
        return this.f158558l;
    }

    public int l() {
        return this.f158559m;
    }

    public int m() {
        return this.f158560n;
    }

    public int n() {
        return this.f158561o;
    }

    public long o() {
        return this.f158562p;
    }

    public long p() {
        return this.f158563q;
    }

    public int q() {
        return this.f158564r;
    }

    public int r() {
        return this.f158566t;
    }

    public int s() {
        return this.f158567u;
    }

    public int t() {
        return this.f158569w;
    }

    public String toString() {
        List<Integer> list = this.f158548b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f158548b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb2 = new StringBuilder("offset = ");
        sb2.append(y());
        sb2.append(" unitId = ");
        sb2.append(this.f158543K);
        sb2.append(" fbPlacementId = ");
        return android.support.v4.media.e.a(sb2, this.f158565s, str);
    }

    public int u() {
        return this.f158570x;
    }

    public int v() {
        return this.f158571y;
    }

    public String w() {
        return this.f158572z;
    }

    public String x() {
        return this.f158533A;
    }

    public void y(int i10) {
        this.f158542J = i10;
    }

    public String z() {
        return this.f158535C;
    }

    public void b(List<Integer> list) {
        this.f158549c = list;
    }

    public List<Integer> c() {
        return this.f158549c;
    }

    public int d() {
        return this.f158550d;
    }

    public void e(int i10) {
        this.f158554h = i10;
    }

    public void f(int i10) {
        this.f158555i = i10;
    }

    public void g(int i10) {
        this.f158556j = i10;
    }

    public void h(int i10) {
        this.f158559m = i10;
    }

    public void i(int i10) {
        this.f158560n = i10;
    }

    public void j(int i10) {
        this.f158561o = i10;
    }

    public void k(int i10) {
        this.f158564r = i10;
    }

    public void l(int i10) {
        this.f158566t = i10;
    }

    public void m(int i10) {
        this.f158567u = i10;
    }

    public void n(int i10) {
        this.f158568v = i10;
    }

    public void o(int i10) {
        this.f158569w = i10;
    }

    public void p(int i10) {
        this.f158570x = i10;
    }

    public void q(int i10) {
        this.f158571y = i10;
    }

    public void r(int i10) {
        this.f158534B = i10;
    }

    public void s(int i10) {
        this.f158536D = i10;
    }

    public void t(int i10) {
        this.f158537E = i10;
    }

    public void u(int i10) {
        this.f158538F = i10;
    }

    public void v(int i10) {
        this.f158539G = i10;
    }

    public void w(int i10) {
        this.f158540H = i10;
    }

    public void x(int i10) {
        this.f158541I = i10;
    }

    public int y() {
        return this.f158534B;
    }

    public void z(int i10) {
        this.f158546N = i10;
    }

    public void b(int i10) {
        this.f158551e = i10;
    }

    public void c(int i10) {
        this.f158552f = i10;
    }

    public void d(long j10) {
        this.f158563q = j10;
    }

    public void e(String str) {
        this.f158543K = str;
    }

    public void f(String str) {
        this.f158544L = str;
    }

    public void g(String str) {
        this.f158545M = str;
    }

    public void b(long j10) {
        this.f158558l = j10;
    }

    public void c(long j10) {
        this.f158562p = j10;
    }

    public void d(String str) {
        this.f158535C = str;
    }

    public void b(String str) {
        this.f158572z = str;
    }

    public String a() {
        return this.f158547a;
    }

    public void a(String str) {
        this.f158547a = str;
        com.mbridge.msdk.foundation.controller.a.f155936r.put(this.f158543K, str);
    }

    public void a(List<Integer> list) {
        this.f158548b = list;
    }

    public void a(int i10) {
        this.f158550d = i10;
    }

    public void a(long j10) {
        this.f158557k = j10;
    }
}
