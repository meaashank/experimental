package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.tools.m0;
import com.prism.commons.utils.C3843g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static int f156188N = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static int f156189O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f156190A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f156191B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f156192C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f156193D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f156194E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f156196G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f156197H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f156198I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f156199J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f156200K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private String f156201L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f156202M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f156204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f156205c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f156207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f156208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f156209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f156210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f156211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f156212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f156213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f156214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f156215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f156216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f156217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f156218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f156219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f156220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f156221s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f156223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f156224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f156225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f156226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f156227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f156228z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f156203a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f156206d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f156222t = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f156195F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f156219q = str;
        this.f156223u = i10;
        this.f156224v = str5;
        this.f156218p = i11;
        this.f156202M = i12;
        this.f156199J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f156225w = URLEncoder.encode(str2, C3843g.f162098b);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f156226x = str3;
        this.f156192C = i14;
        this.f156211i = str4;
        this.f156200K = i15;
    }

    public String A() {
        return this.f156197H;
    }

    public String B() {
        return this.f156198I;
    }

    public int C() {
        return this.f156199J;
    }

    public long D() {
        return this.f156200K;
    }

    public String E() {
        return this.f156201L;
    }

    public int F() {
        return this.f156202M;
    }

    public String a() {
        return this.f156204b;
    }

    public void b(String str) {
        this.f156208f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f156209g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f156208f;
    }

    public String e() {
        return this.f156209g;
    }

    public String f() {
        return this.f156210h;
    }

    public String g() {
        return this.f156211i;
    }

    public String h() {
        return this.f156212j;
    }

    public String i() {
        return this.f156213k;
    }

    public void j(String str) {
        this.f156219q = str;
    }

    public String k() {
        return this.f156215m;
    }

    public void l(String str) {
        this.f156224v = str;
    }

    public void m(String str) {
        this.f156226x = str;
    }

    public String n() {
        return this.f156219q;
    }

    public void o(String str) {
        this.f156228z = str;
    }

    public void p(String str) {
        this.f156190A = str;
    }

    public int q() {
        return this.f156223u;
    }

    public String r() {
        return this.f156224v;
    }

    public String s() {
        return this.f156225w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f156226x) ? "" : this.f156226x;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardReportData [key=");
        sb2.append(this.f156219q);
        sb2.append(", networkType=");
        sb2.append(this.f156223u);
        sb2.append(", isCompleteView=");
        sb2.append(this.f156218p);
        sb2.append(", watchedMillis=");
        sb2.append(this.f156202M);
        sb2.append(", videoLength=");
        sb2.append(this.f156199J);
        sb2.append(", offerUrl=");
        sb2.append(this.f156225w);
        sb2.append(", reason=");
        sb2.append(this.f156226x);
        sb2.append(", result=");
        sb2.append(this.f156192C);
        sb2.append(", duration=");
        sb2.append(this.f156211i);
        sb2.append(", videoSize=");
        return android.support.v4.media.session.f.a(sb2, this.f156200K, "]");
    }

    public void u(String str) {
        this.f156198I = str;
    }

    public String v() {
        return this.f156228z;
    }

    public String w() {
        return this.f156190A;
    }

    public int x() {
        return this.f156192C;
    }

    public int y() {
        return this.f156195F;
    }

    public String z() {
        return this.f156196G;
    }

    public void a(String str) {
        this.f156204b = str;
    }

    public int b() {
        return this.f156205c;
    }

    public void d(String str) {
        this.f156210h = str;
    }

    public void e(String str) {
        this.f156211i = str;
    }

    public void f(String str) {
        this.f156212j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f156213k = URLEncoder.encode(str, C3843g.f162098b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f156214l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f156217o = URLEncoder.encode(str, C3843g.f162098b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f156214l;
    }

    public void k(String str) {
        this.f156221s = str;
    }

    public String l() {
        return this.f156217o;
    }

    public int m() {
        return this.f156218p;
    }

    public void n(String str) {
        this.f156227y = str;
    }

    public String o() {
        return this.f156220r;
    }

    public int p() {
        return this.f156222t;
    }

    public void q(String str) {
        this.f156191B = str;
    }

    public void r(String str) {
        this.f156193D = str;
    }

    public void s(String str) {
        this.f156194E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f156196G = URLEncoder.encode(str, C3843g.f162098b);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f156227y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f156201L = URLEncoder.encode(str, C3843g.f162098b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f156205c = i10;
    }

    public void b(int i10) {
        this.f156222t = i10;
    }

    public void c(int i10) {
        this.f156223u = i10;
    }

    public void d(int i10) {
        this.f156192C = i10;
    }

    public void e(int i10) {
        this.f156195F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f156203a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f156203a == null) {
            this.f156203a = new HashMap();
        }
        try {
            this.f156203a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f156207e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f156219q = str;
        this.f156224v = str4;
        this.f156223u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f156225w = URLEncoder.encode(str2, C3843g.f162098b);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f156226x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f156219q = str;
        this.f156223u = i10;
        this.f156224v = str4;
        this.f156199J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f156225w = URLEncoder.encode(str2, C3843g.f162098b);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f156192C = i12;
        this.f156211i = str3;
        this.f156200K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f156219q = "m_download_end";
        } else if (i11 == 95) {
            this.f156219q = "2000025";
        }
        int iS = m0.s(context);
        this.f156223u = iS;
        this.f156224v = m0.a(context, iS);
        this.f156199J = campaignEx.getVideoLength();
        this.f156227y = campaignEx.getRequestId();
        this.f156228z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f156225w)) {
            try {
                this.f156225w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), C3843g.f162098b);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f156192C = i10;
        this.f156211i = str;
        this.f156200K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f156219q = str;
        this.f156215m = str2;
        this.f156197H = str3;
        this.f156220r = str4;
        this.f156198I = str5;
        this.f156208f = str6;
        this.f156223u = i10;
        this.f156224v = str7;
    }

    public n(String str) {
        this.f156216n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f156219q = str;
        this.f156192C = i10;
        this.f156211i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f156213k = URLEncoder.encode(str3, C3843g.f162098b);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f156208f = str4;
        this.f156198I = str5;
        this.f156226x = str6;
        this.f156212j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f156301L) {
            this.f156192C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f156219q = str;
        this.f156208f = str2;
        this.f156227y = str3;
        this.f156228z = str4;
        this.f156198I = str5;
        this.f156223u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f156219q = str;
        this.f156208f = str2;
        this.f156227y = str3;
        this.f156228z = str4;
        this.f156198I = str5;
        this.f156223u = i10;
        this.f156226x = str6;
        this.f156207e = i11;
    }
}
