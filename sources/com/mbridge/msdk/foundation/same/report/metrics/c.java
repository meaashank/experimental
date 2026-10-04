package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class c implements Serializable, Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f156610A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f156611B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CampaignEx f156612C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f156613D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f156614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f156615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f156616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f156617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Long> f156618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f156619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f156620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f156621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f156622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f156623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f156624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f156625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f156626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f156627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f156628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f156629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f156630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f156631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f156632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f156633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f156634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f156635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f156636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f156637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f156638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f156639z;

    public c() {
        this.f156614a = false;
        this.f156615b = new HashMap();
        this.f156616c = new HashMap();
        this.f156617d = new HashMap();
        this.f156618e = new HashMap();
        this.f156620g = "";
        this.f156621h = new CopyOnWriteArrayList<>();
        this.f156632s = -1;
        this.f156634u = false;
        this.f156636w = false;
        this.f156613D = new CopyOnWriteArrayList<>();
    }

    public int A() {
        return this.f156611B;
    }

    public String B() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f156622i)) {
            return this.f156622i;
        }
        try {
            if (TextUtils.isEmpty(this.f156622i)) {
                String str = this.f156620g + this.f156631r;
                Map<String, Map<String, String>> map2 = this.f156615b;
                if (map2 != null && map2.containsKey(str) && (map = this.f156615b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f156622i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f156622i;
    }

    public String C() {
        return this.f156627n;
    }

    public boolean D() {
        return this.f156634u;
    }

    public boolean E() {
        return this.f156636w;
    }

    public boolean F() {
        return this.f156635v;
    }

    public boolean G() {
        return this.f156614a;
    }

    public void a(boolean z10) {
        this.f156634u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.f156613D.isEmpty()) {
                        this.f156613D.clear();
                    }
                    this.f156613D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarU;
        com.mbridge.msdk.foundation.error.b bVarU2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f156631r = str;
            eVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(B())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, B());
            }
            if (this.f156623j != 0) {
                eVar.a("adtp", Integer.valueOf(g()));
            }
            if (!TextUtils.isEmpty(s())) {
                eVar.a(CampaignEx.JSON_KEY_HB, s());
            }
            if (!TextUtils.isEmpty(l())) {
                eVar.a("bid_tk", l());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f156595a).contains(str)) {
                eVar.a("from_cache", D() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarU2 = u()) != null) {
                eVar.a("type", Integer.valueOf(bVarU2.h()));
                eVar.a("reason", bVarU2.l());
                if (!TextUtils.isEmpty(bVarU2.m())) {
                    eVar.a("reason_d", bVarU2.m());
                    eVar.a("type_d", Integer.valueOf(bVarU2.n()));
                }
            }
            if ("2000048".contains(str) && (bVarU = u()) != null && !TextUtils.isEmpty(bVarU.m())) {
                eVar.a("type", Integer.valueOf(bVarU.n()));
                eVar.a("reason", bVarU.m());
            }
            if (this.f156623j == 296) {
                eVar.a("auto_load", j());
                eVar.a("auto_refresh", Integer.valueOf(i()));
                eVar.a("auto_refresh_interval", Integer.valueOf(k()));
                eVar.a(FirebaseAnalytics.Param.CONTENT_TYPE, Integer.valueOf(p()));
                eVar.a("temp_display_type", Integer.valueOf(A()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.f156618e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f156618e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f156632s = i10;
    }

    public void f(String str) {
        this.f156630q = str;
    }

    public int g() {
        return this.f156623j;
    }

    public void h(String str) {
        this.f156629p = str;
    }

    public void i(String str) {
        this.f156620g = str;
    }

    public void j(String str) {
        this.f156631r = str;
    }

    public void k(String str) {
        this.f156625l = str;
    }

    public String l() {
        return this.f156624k;
    }

    public List<CampaignEx> m() {
        return this.f156621h;
    }

    public CampaignEx n() {
        return this.f156612C;
    }

    public List<CampaignEx> o() {
        return this.f156613D;
    }

    public int p() {
        return this.f156610A;
    }

    public int q() {
        return this.f156632s;
    }

    public int r() {
        return this.f156633t;
    }

    public String s() {
        return this.f156629p;
    }

    public String t() {
        return this.f156620g;
    }

    public com.mbridge.msdk.foundation.error.b u() {
        return this.f156619f;
    }

    public Map<String, Map<String, String>> v() {
        return this.f156617d;
    }

    public Map<String, Map<String, String>> w() {
        return this.f156615b;
    }

    public String x() {
        return this.f156625l;
    }

    public String y() {
        return this.f156628o;
    }

    public String z() {
        return this.f156626m;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f156621h.isEmpty()) {
                    this.f156621h.clear();
                }
                this.f156621h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f156620g + str;
            Map<String, Map<String, String>> map = this.f156615b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f156615b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void f(int i10) {
        this.f156633t = i10;
    }

    public void g(String str) {
        this.f156624k = str;
    }

    public int i() {
        return this.f156638y;
    }

    public String j() {
        return this.f156630q;
    }

    public int k() {
        return this.f156639z;
    }

    public void l(String str) {
        this.f156628o = str;
    }

    public void m(String str) {
        this.f156626m = str;
    }

    public void n(String str) {
        this.f156622i = str;
    }

    public void o(String str) {
        this.f156627n = str;
    }

    public void d(boolean z10) {
        this.f156637x = z10;
    }

    public void g(int i10) {
        this.f156611B = i10;
    }

    public void d(int i10) {
        this.f156610A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f156620g + str;
            Map<String, Map<String, String>> map2 = this.f156616c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f156616c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f156616c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f156612C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f156613D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.f156613D.size()) {
                        break;
                    }
                    if (this.f156613D.get(i10) != null && this.f156613D.get(i10).getId().equals(campaignEx.getId())) {
                        this.f156613D.set(i10, campaignEx);
                        break;
                    }
                    i10++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f156621h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f156621h.size(); i11++) {
                if (this.f156621h.get(i11) != null && this.f156621h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f156621h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c(boolean z10) {
        this.f156614a = false;
        this.f156615b = new HashMap();
        this.f156616c = new HashMap();
        this.f156617d = new HashMap();
        this.f156618e = new HashMap();
        this.f156620g = "";
        this.f156621h = new CopyOnWriteArrayList<>();
        this.f156632s = -1;
        this.f156634u = false;
        this.f156636w = false;
        this.f156613D = new CopyOnWriteArrayList<>();
        this.f156614a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f156618e) != null && map.containsKey(str)) {
                Long l10 = this.f156618e.get(str);
                return System.currentTimeMillis() - (l10 != null ? l10.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public void a(int i10) {
        this.f156623j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f156616c.containsKey(str) ? this.f156616c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f156636w = z10;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f156620g + str;
            Map<String, Map<String, String>> map2 = this.f156615b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f156615b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f156615b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f156638y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f156631r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(l());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f156619f = bVar;
    }

    public void c(boolean z10) {
        this.f156635v = z10;
    }

    public void c(int i10) {
        this.f156639z = i10;
    }
}
