package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f156450A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f156451B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f156452C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f156453D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f156454E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f156455F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f156456G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f156457H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f156458I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f156459J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f156460K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private String f156461L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f156462M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f156463N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f156464O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f156465P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f156466Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f156467R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f156468S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f156469T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f156470U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private String f156471V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f156472W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f156473X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f156474Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f156475Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f156476a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f156477a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f156478b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f156479b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f156480c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f156481c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f156482d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f156483d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f156484e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f156485e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f156486f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f156487f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f156488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f156489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f156490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f156491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f156492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f156493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f156494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f156496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f156497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f156498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f156499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f156500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f156501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f156502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f156503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f156504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f156505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f156506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f156507z;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f156508a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.f156462M = this.f156486f + this.f156461L;
    }

    private void c() {
        this.f156450A = this.f156506y + this.f156507z;
        this.f156457H = this.f156506y + this.f156456G;
        i.b().f(this.f156506y);
    }

    public static d h() {
        return b.f156508a;
    }

    public void d(int i10) {
        this.f156487f0 = i10;
    }

    public void e() {
        this.f156466Q = this.f156490i + this.f156465P;
        this.f156452C = this.f156490i + this.f156451B;
        this.f156469T = this.f156490i + this.f156468S;
        this.f156459J = this.f156490i + this.f156458I;
        this.f156472W = this.f156490i + this.f156471V;
    }

    public void f() {
        this.f156467R = this.f156494m + this.f156465P;
        this.f156453D = this.f156494m + this.f156451B;
        this.f156470U = this.f156494m + this.f156468S;
        this.f156460K = this.f156494m + this.f156458I;
        this.f156473X = this.f156494m + this.f156471V;
    }

    public boolean g() {
        try {
            if (this.f156500s) {
                ArrayList<String> arrayList = this.f156505x;
                if (arrayList != null && this.f156504w <= arrayList.size() - 1) {
                    if (!a(this.f156505x.get(this.f156504w))) {
                        this.f156494m = this.f156505x.get(this.f156504w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f156502u;
                if (arrayList2 != null && this.f156503v <= arrayList2.size() - 1) {
                    this.f156490i = this.f156502u.get(this.f156503v);
                    e();
                    return true;
                }
            }
            if (this.f156499r) {
                this.f156503v = 0;
                this.f156504w = 0;
            }
            return false;
        } catch (Throwable th) {
            q0.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f156487f0;
    }

    public void j() {
        HashMap<String, String> mapE;
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(com.mbridge.msdk.setting.i.b());
        if (gVarA != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarA.j();
            if (aVarJ != null) {
                this.f156493l = aVarJ.f();
                this.f156497p = aVarJ.g();
                this.f156489h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarA = gVarA.A();
            if (dVarA != null) {
                this.f156492k = dVarA.d();
                this.f156496o = dVarA.e();
                this.f156486f = dVarA.c();
                b();
                a(gVarA);
            }
            this.f156500s = gVarA.t0() == 2;
            this.f156501t = gVarA.t0();
            a(!gVarA.b(2));
            if (gVarA.E() != null && gVarA.E().size() > 0 && (mapE = gVarA.E()) != null && mapE.size() > 0) {
                if (mapE.containsKey("v") && !TextUtils.isEmpty(mapE.get("v")) && a(mapE.get("v"))) {
                    this.f156484e = mapE.get("v");
                    d();
                }
                if (mapE.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapE.get(CampaignEx.JSON_KEY_HB)) && a(mapE.get(CampaignEx.JSON_KEY_HB))) {
                    this.f156506y = mapE.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapE.containsKey("lg") && !TextUtils.isEmpty(mapE.get("lg"))) {
                    String str = mapE.get("lg");
                    if (a(str)) {
                        this.f156482d = str;
                    } else {
                        this.f156491j = str;
                    }
                }
                if (mapE.containsKey("lgt") && !TextUtils.isEmpty(mapE.get("lgt"))) {
                    String str2 = mapE.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f156491j = strB;
                        }
                    } else {
                        this.f156491j = str2;
                    }
                }
            }
            String strV = gVarA.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f156490i = strV;
                e();
                this.f156502u.add(0, strV);
            }
            String strW = gVarA.w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            this.f156494m = strW;
            f();
            this.f156505x.add(0, strW);
        }
    }

    private d() {
        this.f156476a = "RequestUrlUtil";
        this.f156478b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f156480c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f156482d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f156484e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f156486f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f156488g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f156489h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f156490i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f156491j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f156492k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f156493l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f156494m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f156495n = 9377;
        this.f156496o = 9377;
        this.f156497p = 9988;
        this.f156498q = 9377;
        this.f156499r = false;
        this.f156500s = false;
        this.f156501t = 1;
        this.f156502u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f156503v = 0;
        this.f156504w = 0;
        this.f156505x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f156506y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f156507z = "/bid";
        this.f156450A = this.f156506y + this.f156507z;
        this.f156451B = "/sdk/customid";
        this.f156452C = this.f156490i + this.f156451B;
        this.f156453D = this.f156494m + this.f156451B;
        this.f156454E = "/image";
        this.f156455F = this.f156484e + this.f156454E;
        this.f156456G = "/load";
        this.f156457H = this.f156506y + this.f156456G;
        this.f156458I = "/mapping";
        this.f156459J = this.f156490i + this.f156458I;
        this.f156460K = this.f156494m + this.f156458I;
        this.f156461L = "";
        this.f156462M = this.f156489h + this.f156461L;
        this.f156463N = "/batchPaidEvent";
        this.f156464O = this.f156489h + this.f156463N;
        this.f156465P = "/setting";
        this.f156466Q = this.f156490i + this.f156465P;
        this.f156467R = this.f156494m + this.f156465P;
        this.f156468S = "/rewardsetting";
        this.f156469T = this.f156490i + this.f156468S;
        this.f156470U = this.f156494m + this.f156468S;
        this.f156471V = "/appwall/setting";
        this.f156472W = this.f156490i + this.f156471V;
        this.f156473X = this.f156494m + this.f156471V;
        this.f156474Y = "/openapi/ad/v3";
        this.f156475Z = this.f156484e + this.f156474Y;
        this.f156477a0 = "/openapi/ad/v4";
        this.f156479b0 = this.f156484e + this.f156477a0;
        this.f156481c0 = "/openapi/ad/v5";
        this.f156483d0 = this.f156484e + this.f156481c0;
        this.f156485e0 = true;
        this.f156487f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            q0.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    private void d() {
        this.f156475Z = this.f156484e + this.f156474Y;
        this.f156479b0 = this.f156484e + this.f156477a0;
        this.f156483d0 = this.f156484e + this.f156481c0;
        this.f156455F = this.f156484e + this.f156454E;
    }

    public void c(int i10) {
        this.f156498q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f156483d0 : this.f156475Z;
    }

    public void b(int i10) {
        this.f156495n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.f156457H.contains(Ib.b.f53002g) && !TextUtils.isEmpty(str)) {
                return this.f156457H.replace(Ib.b.f53002g, str + com.prism.gaia.download.a.f164606q);
            }
            return this.f156457H.replace(Ib.b.f53002g, "");
        }
        return this.f156450A.replace(Ib.b.f53002g, "");
    }

    public void a(boolean z10) {
        this.f156485e0 = z10;
    }

    private void a() {
        this.f156464O = this.f156489h + this.f156463N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarA;
        if (gVar == null || (dVarA = gVar.A()) == null || dVarA.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarA.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f156492k, h().f156496o);
        }
        return new p(new h(), h().f156462M, 0);
    }
}
