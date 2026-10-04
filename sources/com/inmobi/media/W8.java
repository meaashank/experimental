package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class W8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3686pc f152554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f152555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N4 f152556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f152557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f152558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f152559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f152560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f152561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f152562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JSONObject f152563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f152564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public X8 f152565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f152566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f152567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f152568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f152569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f152570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f152571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f152572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f152573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public La f152574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f152575x;

    public W8(String requestType, String str, C3686pc c3686pc, boolean z10, N4 n42, String requestContentType, boolean z11) {
        kotlin.jvm.internal.G.p(requestType, "requestType");
        kotlin.jvm.internal.G.p(requestContentType, "requestContentType");
        this.f152552a = requestType;
        this.f152553b = str;
        this.f152554c = c3686pc;
        this.f152555d = z10;
        this.f152556e = n42;
        this.f152557f = requestContentType;
        this.f152558g = z11;
        this.f152559h = "W8";
        this.f152560i = new HashMap();
        this.f152564m = C3657nb.b();
        this.f152567p = 60000;
        this.f152568q = 60000;
        this.f152569r = true;
        this.f152571t = true;
        this.f152572u = true;
        this.f152573v = true;
        this.f152575x = true;
        if ("GET".equals(requestType)) {
            this.f152561j = new HashMap();
        } else if ("POST".equals(requestType)) {
            this.f152562k = new HashMap();
            this.f152563l = new JSONObject();
        }
    }

    public final void a(ed.l onResponse) {
        kotlin.jvm.internal.G.p(onResponse, "onResponse");
        N4 n42 = this.f152556e;
        if (n42 != null) {
            String str = this.f152559h;
            StringBuilder sbA = O5.a(str, "TAG", "executeAsync: ");
            sbA.append(this.f152553b);
            ((O4) n42).a(str, sbA.toString());
        }
        e();
        if (this.f152555d) {
            Ma maA = a();
            maA.f152256l = new V8(this, onResponse);
            Oa.f152343a.add(maA);
            Oa.a(maA, 0L);
            return;
        }
        N4 n43 = this.f152556e;
        if (n43 != null) {
            String TAG = this.f152559h;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n43).c(TAG, "Dropping REQUEST FOR GDPR");
        }
        X8 x82 = new X8();
        x82.f152598c = new T8(J3.f152104j, "Network Request dropped as current request is not GDPR compliant.");
        onResponse.invoke(x82);
    }

    public final X8 b() {
        Sa saA;
        T8 t82;
        N4 n42 = this.f152556e;
        if (n42 != null) {
            String str = this.f152559h;
            StringBuilder sbA = O5.a(str, "TAG", "executeRequest: ");
            sbA.append(this.f152553b);
            ((O4) n42).c(str, sbA.toString());
        }
        e();
        if (!this.f152555d) {
            N4 n43 = this.f152556e;
            if (n43 != null) {
                String TAG = this.f152559h;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n43).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            X8 x82 = new X8();
            x82.f152598c = new T8(J3.f152104j, "Network Request dropped as current request is not GDPR compliant.");
            return x82;
        }
        if (this.f152565n != null) {
            N4 n44 = this.f152556e;
            if (n44 != null) {
                String str2 = this.f152559h;
                StringBuilder sbA2 = O5.a(str2, "TAG", "response has been failed before execute - ");
                X8 x83 = this.f152565n;
                sbA2.append(x83 != null ? x83.f152598c : null);
                ((O4) n44).c(str2, sbA2.toString());
            }
            X8 x84 = this.f152565n;
            kotlin.jvm.internal.G.m(x84);
            return x84;
        }
        Ma request = a();
        kotlin.jvm.internal.G.p(request, "request");
        do {
            saA = S8.a(request, (ed.p) null);
            t82 = saA.f152441a;
        } while ((t82 != null ? t82.f152457a : null) == J3.f152107m);
        X8 x85 = new X8();
        byte[] bArr = saA.f152443c;
        if (bArr != null) {
            if (bArr.length == 0) {
                x85.f152597b = new byte[0];
            } else {
                byte[] bArr2 = new byte[bArr.length];
                x85.f152597b = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        x85.f152600e = saA.f152442b;
        x85.f152599d = saA.f152445e;
        x85.f152598c = saA.f152441a;
        return x85;
    }

    public final String c() {
        String str = this.f152557f;
        if (kotlin.jvm.internal.G.g(str, "application/json")) {
            return String.valueOf(this.f152563l);
        }
        if (!kotlin.jvm.internal.G.g(str, "application/x-www-form-urlencoded")) {
            return "";
        }
        boolean z10 = C3473a9.f152704a;
        C3473a9.a(this.f152562k);
        return C3473a9.a("&", (Map) this.f152562k);
    }

    public final String d() {
        String strA = this.f152553b;
        HashMap map = this.f152561j;
        if (map != null) {
            boolean z10 = C3473a9.f152704a;
            C3473a9.a(map);
            String strA2 = C3473a9.a("&", (Map) this.f152561j);
            N4 n42 = this.f152556e;
            if (n42 != null) {
                String str = this.f152559h;
                ((O4) n42).c(str, P5.a(str, "TAG", "Get params: ", strA2));
            }
            int length = strA2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = kotlin.jvm.internal.G.t(strA2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (strA2.subSequence(i10, length + 1).toString().length() > 0) {
                if (strA != null && !kotlin.text.M.p3(strA, "?", false, 2, null)) {
                    strA = strA.concat("?");
                }
                if (strA != null && !kotlin.text.F.d2(strA, "&", false, 2, null) && !kotlin.text.F.d2(strA, "?", false, 2, null)) {
                    strA = strA.concat("&");
                }
                strA = androidx.compose.runtime.changelist.j.a(strA, strA2);
            }
        }
        kotlin.jvm.internal.G.m(strA);
        return strA;
    }

    public final void e() {
        f();
        this.f152560i.put("User-Agent", C3657nb.k());
        if ("POST".equals(this.f152552a)) {
            this.f152560i.put("Content-Type", this.f152557f);
            if (this.f152558g) {
                this.f152560i.put("Content-Encoding", "gzip");
            } else {
                this.f152560i.put("Content-Length", String.valueOf(c().length()));
            }
        }
    }

    public void f() {
        HashMap map;
        JSONObject jSONObjectC;
        HashMap map2;
        Z3 z32 = Z3.f152641a;
        z32.j();
        this.f152555d = z32.a(this.f152555d);
        if ("GET".equals(this.f152552a)) {
            HashMap map3 = this.f152561j;
            if (this.f152571t) {
                if (map3 != null) {
                    map3.putAll(Q0.f152384e);
                }
                if (map3 != null) {
                    map3.putAll(C3635m3.f153124a.a(this.f152566o));
                }
                if (map3 != null) {
                    map3.putAll(AbstractC3678p4.a());
                }
            }
            HashMap map4 = this.f152561j;
            if (this.f152572u) {
                a(map4);
            }
        } else if ("POST".equals(this.f152552a)) {
            HashMap map5 = this.f152562k;
            if (this.f152571t) {
                if (map5 != null) {
                    map5.putAll(Q0.f152384e);
                }
                if (map5 != null) {
                    map5.putAll(C3635m3.f153124a.a(this.f152566o));
                }
                if (map5 != null) {
                    map5.putAll(AbstractC3678p4.a());
                }
            }
            HashMap map6 = this.f152562k;
            if (this.f152572u) {
                a(map6);
            }
        }
        if (this.f152573v && (jSONObjectC = Z3.c()) != null) {
            if ("GET".equals(this.f152552a)) {
                HashMap map7 = this.f152561j;
                if (map7 != null) {
                    String string = jSONObjectC.toString();
                    kotlin.jvm.internal.G.o(string, "toString(...)");
                }
            } else if ("POST".equals(this.f152552a) && (map2 = this.f152562k) != null) {
                String string2 = jSONObjectC.toString();
                kotlin.jvm.internal.G.o(string2, "toString(...)");
            }
        }
        if (this.f152575x) {
            if ("GET".equals(this.f152552a)) {
                HashMap map8 = this.f152561j;
                if (map8 != null) {
                    return;
                }
                return;
            }
            if (!"POST".equals(this.f152552a) || (map = this.f152562k) == null) {
                return;
            }
        }
    }

    public final Ma a() {
        Ja method;
        String type = this.f152552a;
        kotlin.jvm.internal.G.p(type, "type");
        if (!type.equals("GET") && type.equals("POST")) {
            method = Ja.f152131b;
        } else {
            method = Ja.f152130a;
        }
        String str = this.f152553b;
        kotlin.jvm.internal.G.m(str);
        kotlin.jvm.internal.G.p(method, "method");
        Ia ia2 = new Ia(str, method);
        boolean z10 = C3473a9.f152704a;
        C3473a9.a(this.f152560i);
        HashMap header = this.f152560i;
        kotlin.jvm.internal.G.p(header, "header");
        ia2.f152058c = header;
        ia2.f152063h = Integer.valueOf(this.f152567p);
        ia2.f152064i = Integer.valueOf(this.f152568q);
        ia2.f152061f = Boolean.valueOf(this.f152569r);
        ia2.f152065j = Boolean.valueOf(this.f152570s);
        La la2 = this.f152574w;
        if (la2 != null) {
            ia2.f152062g = la2;
        }
        int iOrdinal = method.ordinal();
        if (iOrdinal == 0) {
            HashMap map = this.f152561j;
            if (map != null) {
                N4 n42 = this.f152556e;
                if (n42 != null) {
                    String TAG = this.f152559h;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    ((O4) n42).c(TAG, "getParams " + map);
                }
                ia2.f152059d = map;
            }
        } else if (iOrdinal == 1) {
            String postBody = c();
            N4 n43 = this.f152556e;
            if (n43 != null) {
                String str2 = this.f152559h;
                ((O4) n43).c(str2, P5.a(str2, "TAG", "httpPostBody ", postBody));
            }
            kotlin.jvm.internal.G.p(postBody, "postBody");
            ia2.f152060e = postBody;
        }
        return new Ma(ia2);
    }

    public /* synthetic */ W8(String str, String str2, C3686pc c3686pc, boolean z10, N4 n42, String str3, int i10) {
        this(str, str2, c3686pc, (i10 & 8) != 0 ? false : z10, n42, (i10 & 32) != 0 ? "application/x-www-form-urlencoded" : str3, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W8(String url, N4 n42) {
        this("GET", url, (C3686pc) null, false, n42, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.G.p(url, "url");
        this.f152573v = false;
    }

    public final void a(HashMap map) {
        H0 h0B;
        String strA;
        C3686pc c3686pc = this.f152554c;
        if (c3686pc == null || map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        try {
            if (c3686pc.f153279a.a() && (h0B = C3672oc.f153249a.b()) != null && (strA = h0B.a()) != null) {
                map3.put("GPID", strA);
            }
        } catch (Exception unused) {
        }
        String string = new JSONObject(map3).toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        map2.put("u-id-map", string);
        map.putAll(map2);
    }
}
