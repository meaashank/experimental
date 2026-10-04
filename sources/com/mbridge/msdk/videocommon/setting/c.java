package com.mbridge.msdk.videocommon.setting;

import Jb.d;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static g f161613W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static String f161614X;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f161619E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f161621G;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private JSONArray f161635U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private JSONObject f161636V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f161637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f161638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.entity.b> f161639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f161640d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<Integer> f161656t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f161641e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f161642f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f161643g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f161644h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f161645i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f161646j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f161647k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f161648l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f161649m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f161650n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f161651o = 80;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f161652p = 100;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f161653q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f161654r = 1.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f161655s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f161657u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f161658v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f161659w = 100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f161660x = 60;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f161661y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f161662z = 70;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f161615A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f161616B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f161617C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f161618D = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f161620F = 20;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f161622H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f161623I = 1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private String f161624J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f161625K = 1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private String f161626L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f161627M = 1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f161628N = "Virtual Item";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f161629O = "";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f161630P = "";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f161631Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f161632R = 1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f161633S = 60;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f161634T = "";

    public void A(int i10) {
        this.f161661y = i10;
    }

    public void B(int i10) {
        this.f161658v = i10;
    }

    public void C(int i10) {
        this.f161651o = i10;
    }

    public int D() {
        return this.f161618D;
    }

    public int E() {
        return this.f161617C;
    }

    public int F() {
        return this.f161616B;
    }

    public void G(int i10) {
        this.f161618D = i10;
    }

    public void H(int i10) {
        this.f161617C = i10;
    }

    public void I(int i10) {
        this.f161616B = i10;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f161656t = arrayList;
    }

    public void b(String str) {
        this.f161629O = str;
        com.mbridge.msdk.foundation.controller.a.f155936r.put(this.f161637a, str);
    }

    public void c(int i10) {
        if (i10 <= 0) {
            this.f161625K = 1;
        } else {
            this.f161625K = i10;
        }
    }

    public void d(int i10) {
        this.f161622H = i10;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f161628N = this.f161624J;
        } else {
            this.f161628N = str;
        }
    }

    public void f(String str) {
        this.f161638b = str;
    }

    public void g(String str) {
        this.f161630P = str;
    }

    public int h() {
        return this.f161643g;
    }

    public void i(String str) {
        this.f161624J = str;
    }

    public void j(int i10) {
        this.f161643g = i10;
    }

    public int k() {
        return this.f161615A;
    }

    public void l(int i10) {
        this.f161627M = i10;
    }

    public void m(int i10) {
        this.f161615A = i10;
    }

    public void n(int i10) {
        this.f161649m = i10;
    }

    public void o(int i10) {
        this.f161621G = i10;
    }

    public int p() {
        return this.f161659w;
    }

    public int q() {
        return this.f161660x;
    }

    public int r() {
        return this.f161648l;
    }

    public void s(int i10) {
        this.f161659w = i10;
    }

    public void t(int i10) {
        this.f161660x = i10;
    }

    public int u() {
        return this.f161641e;
    }

    public void v(int i10) {
        this.f161642f = i10;
    }

    public void w(int i10) {
        this.f161641e = i10;
    }

    public String x() {
        return this.f161630P;
    }

    public int y() {
        return this.f161661y;
    }

    public void z(int i10) {
        this.f161655s = i10;
    }

    public int A() {
        return this.f161658v;
    }

    public JSONArray B() {
        return this.f161635U;
    }

    public int C() {
        return this.f161632R;
    }

    public void D(int i10) {
        this.f161650n = i10;
    }

    public void E(int i10) {
        this.f161647k = i10;
    }

    public void F(int i10) {
        this.f161632R = i10;
    }

    public String G() {
        return this.f161634T;
    }

    public JSONObject H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f161637a);
            jSONObject.put("callbackType", this.f161644h);
            List<com.mbridge.msdk.videocommon.entity.b> list = this.f161639c;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.entity.b bVar : this.f161639c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put(d.f58184l, bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f161645i);
            jSONObject.put("acn", this.f161646j);
            jSONObject.put("vcn", this.f161647k);
            jSONObject.put(x.c.f238293R, this.f161648l);
            jSONObject.put("dlnet", this.f161649m);
            jSONObject.put("tv_start", this.f161650n);
            jSONObject.put("tv_end", this.f161651o);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f161652p);
            jSONObject.put("endscreen_type", this.f161621G);
            jSONObject.put("daily_play_cap", this.f161615A);
            jSONObject.put("video_skip_time", this.f161616B);
            jSONObject.put("video_skip_result", this.f161617C);
            jSONObject.put("video_interactive_type", this.f161618D);
            jSONObject.put("orientation", this.f161661y);
            jSONObject.put("close_button_delay", this.f161619E);
            jSONObject.put("playclosebtn_tm", this.f161641e);
            jSONObject.put("play_ctdown", this.f161642f);
            jSONObject.put("close_alert", this.f161643g);
            jSONObject.put("rfpv", this.f161655s);
            jSONObject.put("vdcmp", this.f161654r);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f161656t;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    ArrayList<Integer> arrayList2 = this.f161656t;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Integer num = arrayList2.get(i10);
                        i10++;
                        jSONArray2.put(num);
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f161657u);
            jSONObject.put("tmorl", this.f161658v);
            jSONObject.put("placementid", this.f161638b);
            jSONObject.put("ltafemty", this.f161659w);
            jSONObject.put("ltorwc", this.f161660x);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f161622H);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f161623I);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f161624J);
            jSONObject.put(RewardPlus.AMOUNT, this.f161625K);
            jSONObject.put("icon", this.f161626L);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f161627M);
            jSONObject.put("name", this.f161628N);
            jSONObject.put("isDefault", this.f161631Q);
            jSONObject.put("video_error_rule", this.f161632R);
            jSONObject.put("loadtmo", this.f161633S);
            jSONObject.put("vtag", this.f161634T);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String a() {
        return this.f161629O;
    }

    public int d() {
        return this.f161625K;
    }

    public int f() {
        return this.f161657u;
    }

    public void g(int i10) {
        this.f161623I = i10;
    }

    public void h(int i10) {
        this.f161644h = i10;
    }

    public int i() {
        return this.f161619E;
    }

    public void j(String str) {
        this.f161634T = str;
    }

    public void k(int i10) {
        this.f161619E = i10;
    }

    public int l() {
        return this.f161649m;
    }

    public int m() {
        return this.f161621G;
    }

    public int n() {
        return this.f161662z;
    }

    public int o() {
        return this.f161633S;
    }

    public void p(int i10) {
        this.f161662z = i10;
    }

    public void q(int i10) {
        this.f161631Q = i10;
    }

    public void r(int i10) {
        this.f161633S = i10;
    }

    public String s() {
        return this.f161628N;
    }

    public String t() {
        return this.f161638b;
    }

    public void u(int i10) {
        this.f161648l = i10;
    }

    public int v() {
        return this.f161620F;
    }

    public int w() {
        return this.f161652p;
    }

    public void x(int i10) {
        this.f161620F = i10;
    }

    public void y(int i10) {
        this.f161652p = i10;
    }

    public Queue<Integer> z() {
        LinkedList linkedList;
        Exception e10;
        try {
            List<com.mbridge.msdk.videocommon.entity.b> list = this.f161639c;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i10 = 0; i10 < this.f161639c.size(); i10++) {
                try {
                    linkedList.add(Integer.valueOf(this.f161639c.get(i10).b()));
                } catch (Exception e11) {
                    e10 = e11;
                }
            }
            return linkedList;
        } catch (Exception e12) {
            linkedList = null;
            e10 = e12;
        }
        e10.printStackTrace();
        return linkedList;
    }

    public void a(long j10) {
        this.f161640d = j10;
    }

    public int b() {
        return this.f161646j;
    }

    public String c() {
        return f161614X;
    }

    public void d(String str) {
        this.f161626L = str;
    }

    public void f(int i10) {
        this.f161657u = i10;
    }

    public int g() {
        return this.f161653q;
    }

    public void h(String str) {
        this.f161637a = str;
    }

    public void i(int i10) {
        this.f161653q = i10;
    }

    public long j() {
        return this.f161640d;
    }

    public void a(List<com.mbridge.msdk.videocommon.entity.b> list) {
        this.f161639c = list;
    }

    public void b(int i10) {
        this.f161646j = i10;
    }

    public void c(String str) {
        f161614X = str;
    }

    public int e() {
        return this.f161645i;
    }

    public void a(double d10) {
        this.f161654r = d10;
    }

    public void b(JSONObject jSONObject) {
        this.f161636V = jSONObject;
    }

    public void e(int i10) {
        this.f161645i = i10;
    }

    public boolean a(int i10) {
        ArrayList<Integer> arrayList = this.f161656t;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f161656t.contains(Integer.valueOf(i10));
    }

    public static c a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (f161613W == null) {
            f161613W = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("vtag", "");
                String strOptString2 = jSONObject.optString("rid", "");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("unitId");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        c cVar2 = new c();
                        try {
                            cVar2.j(strOptString);
                            cVar2.g(strOptString2);
                            List<com.mbridge.msdk.videocommon.entity.b> listA = com.mbridge.msdk.videocommon.entity.b.a(jSONObjectOptJSONObject.optJSONArray("adSourceList"));
                            cVar2.h(strOptString3);
                            cVar2.a(listA);
                            cVar2.h(jSONObjectOptJSONObject.optInt("callbackType"));
                            int iOptInt = jSONObjectOptJSONObject.optInt("aqn", 1);
                            if (iOptInt <= 0) {
                                iOptInt = 1;
                            }
                            cVar2.e(iOptInt);
                            int iOptInt2 = jSONObjectOptJSONObject.optInt("acn", 1);
                            if (iOptInt2 < 0) {
                                iOptInt2 = 1;
                            }
                            cVar2.b(iOptInt2);
                            cVar2.E(jSONObjectOptJSONObject.optInt("vcn", 5));
                            cVar2.u(jSONObjectOptJSONObject.optInt(x.c.f238293R, 5));
                            cVar2.n(jSONObjectOptJSONObject.optInt("dlnet", 1));
                            cVar2.o(jSONObjectOptJSONObject.optInt("endscreen_type", 2));
                            cVar2.D(jSONObjectOptJSONObject.optInt("tv_start", 3));
                            cVar2.C(jSONObjectOptJSONObject.optInt("tv_end", 80));
                            cVar2.y(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                            cVar2.i(jSONObjectOptJSONObject.optInt("cd_rate", 0));
                            cVar2.a(jSONObject.optLong("current_time"));
                            cVar2.A(jSONObjectOptJSONObject.optInt("orientation", 0));
                            cVar2.m(jSONObjectOptJSONObject.optInt("daily_play_cap", 0));
                            cVar2.I(jSONObjectOptJSONObject.optInt("video_skip_time", -1));
                            cVar2.H(jSONObjectOptJSONObject.optInt("video_skip_result", 2));
                            cVar2.G(jSONObjectOptJSONObject.optInt("video_interactive_type", -1));
                            cVar2.k(jSONObjectOptJSONObject.optInt("close_button_delay", 1));
                            cVar2.w(jSONObjectOptJSONObject.optInt("playclosebtn_tm", -1));
                            cVar2.v(jSONObjectOptJSONObject.optInt("play_ctdown", 0));
                            cVar2.j(jSONObjectOptJSONObject.optInt("close_alert", 0));
                            cVar2.x(jSONObjectOptJSONObject.optInt("rdrct", 20));
                            cVar2.p(jSONObjectOptJSONObject.optInt("load_global_timeout", 70));
                            cVar2.z(jSONObjectOptJSONObject.optInt("rfpv", -1));
                            cVar2.a(jSONObjectOptJSONObject.optDouble("vdcmp", 1.0d));
                            cVar2.c(jSONObjectOptJSONObject.optString("atzu"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("atl_type");
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            try {
                                if (jSONArrayOptJSONArray2 != null) {
                                    for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i10)));
                                    }
                                } else {
                                    arrayList.add(4);
                                    arrayList.add(6);
                                }
                                cVar2.a(arrayList);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            int iOptInt3 = jSONObjectOptJSONObject.optInt("atl_dyt", 0);
                            cVar2.f(iOptInt3 > 0 ? iOptInt3 : 3);
                            int iOptInt4 = jSONObjectOptJSONObject.optInt("tmorl", 1);
                            if (iOptInt4 > 2 || iOptInt4 <= 0) {
                                iOptInt4 = 1;
                            }
                            cVar2.B(iOptInt4);
                            cVar2.f(jSONObjectOptJSONObject.optString("placementid"));
                            cVar2.s(jSONObjectOptJSONObject.optInt("ltafemty", 10));
                            cVar2.t(jSONObjectOptJSONObject.optInt("ltorwc", 60));
                            cVar2.b(jSONObjectOptJSONObject.optString("ab_id"));
                            cVar2.d(jSONObjectOptJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                            cVar2.g(jSONObjectOptJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                            cVar2.i(jSONObjectOptJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                            cVar2.c(jSONObjectOptJSONObject.optInt(RewardPlus.AMOUNT, 1));
                            cVar2.d(jSONObjectOptJSONObject.optString("icon", ""));
                            cVar2.l(jSONObjectOptJSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                            cVar2.e(jSONObjectOptJSONObject.optString("name", "Virtual Item"));
                            cVar2.F(jSONObjectOptJSONObject.optInt("video_error_rule", 1));
                            cVar2.r(jSONObjectOptJSONObject.optInt("loadtmo", 60));
                            cVar2.a(jSONObjectOptJSONObject.optJSONArray("local_cache_info"));
                            try {
                                String strOptString4 = jSONObjectOptJSONObject.optString("retry_strategy");
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    String strA = k0.a(strOptString4);
                                    if (!TextUtils.isEmpty(strA)) {
                                        cVar2.b(new JSONObject(strA));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            return cVar2;
                        } catch (Exception e11) {
                            e = e11;
                            cVar = cVar2;
                            e.printStackTrace();
                            return cVar;
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return cVar;
    }

    public static c a(JSONObject jSONObject) {
        c cVar;
        c cVar2 = null;
        if (jSONObject != null) {
            try {
                cVar = new c();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                cVar.a(com.mbridge.msdk.videocommon.entity.b.a(jSONObject.optJSONArray("adSourceList")));
                cVar.h(jSONObject.optInt("callbackType"));
                int iOptInt = jSONObject.optInt("aqn", 1);
                if (iOptInt <= 0) {
                    iOptInt = 1;
                }
                cVar.e(iOptInt);
                int iOptInt2 = jSONObject.optInt("acn", 1);
                if (iOptInt2 < 0) {
                    iOptInt2 = 1;
                }
                cVar.b(iOptInt2);
                cVar.E(jSONObject.optInt("vcn", 5));
                cVar.u(jSONObject.optInt(x.c.f238293R, 5));
                cVar.n(jSONObject.optInt("dlnet", 1));
                cVar.o(jSONObject.optInt("endscreen_type", 2));
                cVar.D(jSONObject.optInt("tv_start", 3));
                cVar.C(jSONObject.optInt("tv_end", 80));
                cVar.y(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                cVar.a(jSONObject.optLong("current_time"));
                cVar.A(jSONObject.optInt("orientation", 0));
                cVar.m(jSONObject.optInt("daily_play_cap", 0));
                cVar.I(jSONObject.optInt("video_skip_time", -1));
                cVar.H(jSONObject.optInt("video_skip_result", 2));
                cVar.G(jSONObject.optInt("video_interactive_type", -1));
                cVar.k(jSONObject.optInt("close_button_delay", 1));
                cVar.w(jSONObject.optInt("playclosebtn_tm", -1));
                cVar.v(jSONObject.optInt("play_ctdown", 0));
                cVar.j(jSONObject.optInt("close_alert", 0));
                cVar.x(jSONObject.optInt("rdrct", 20));
                cVar.z(jSONObject.optInt("rfpv", -1));
                cVar.a(jSONObject.optDouble("vdcmp", 1.0d));
                cVar.p(jSONObject.optInt("load_global_timeout", 70));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (jSONArrayOptJSONArray != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i10)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar.a(arrayList);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                cVar.f(jSONObject.optInt("atl_dyt", 3));
                int iOptInt3 = jSONObject.optInt("tmorl", 1);
                if (iOptInt3 > 2 || iOptInt3 <= 0) {
                    iOptInt3 = 1;
                }
                cVar.B(iOptInt3);
                cVar.f(jSONObject.optString("placementid"));
                cVar.s(jSONObject.optInt("ltafemty", 10));
                cVar.t(jSONObject.optInt("ltorwc", 60));
                cVar.b(jSONObject.optString("ab_id"));
                cVar.g(jSONObject.optString("rid", ""));
                cVar.d(jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0));
                cVar.g(jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1));
                cVar.i(jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, ""));
                cVar.c(jSONObject.optInt(RewardPlus.AMOUNT, 1));
                cVar.d(jSONObject.optString("icon", ""));
                cVar.l(jSONObject.optInt(RewardPlus.CURRENCY_ID, 1));
                cVar.e(jSONObject.optString("name", "Virtual Item"));
                cVar.F(jSONObject.optInt("video_error_rule", 1));
                cVar.r(jSONObject.optInt("loadtmo", 60));
                cVar.j(jSONObject.optString("vtag", ""));
                cVar.a(jSONObject.optJSONArray("local_cache_info"));
                try {
                    String strOptString = jSONObject.optString("retry_strategy");
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strA = k0.a(strOptString);
                        if (!TextUtils.isEmpty(strA)) {
                            cVar.b(new JSONObject(strA));
                        }
                    }
                } catch (Exception unused) {
                }
                return cVar;
            } catch (Exception e12) {
                e = e12;
                cVar2 = cVar;
                e.printStackTrace();
                return cVar2;
            }
        }
        return cVar2;
    }

    public void a(JSONArray jSONArray) {
        this.f161635U = jSONArray;
    }
}
