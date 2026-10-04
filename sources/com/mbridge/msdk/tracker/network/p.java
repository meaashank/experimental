package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.cookiegames.smartcookie.settings.fragment.GeneralSettingsFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.d0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.jacoco.core.runtime.AgentOptions;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile long f159971A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile long f159972B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile long f159973C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile long f159974D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private volatile long f159975E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile long f159976F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile long f159977G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private volatile long f159978H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private volatile List<InetAddress> f159979I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private volatile InetSocketAddress f159980J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile Proxy f159981K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private volatile com.mbridge.msdk.thrid.okhttp.q f159982L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private volatile com.mbridge.msdk.thrid.okhttp.w f159983M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private volatile IOException f159984N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private volatile Exception f159986P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f159988R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f159989S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f159990T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f159991U;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f159995d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f159997f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile String f160001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile String f160002k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile long f160010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile long f160011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile IOException f160012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile long f160013v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile long f160014w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile long f160016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile long f160017z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile String f159992a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f159993b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile String f159994c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile String f159996e = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile int f159998g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f159999h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f160000i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile String f160003l = "okhttp";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f160004m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f160005n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile String f160006o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile long f160007p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile long f160008q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile long f160009r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile String f160015x = "system";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile boolean f159985O = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private volatile boolean f159987Q = false;

    public p(String str, String str2) {
        this.f159995d = "";
        this.f160001j = "un_known";
        this.f160002k = "";
        this.f160001j = str;
        this.f160002k = str2;
        this.f159995d = UUID.randomUUID().toString();
    }

    private void P() {
        try {
            JSONObject jSONObjectX = x();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectX, "m_request_end");
            if (MBridgeConstans.DEBUG) {
                q0.a("NetworkMonitor_" + H(), "request  end  monitor = " + jSONObjectX.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().e().d(eVarA);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "reportRequestEnd ", th);
            }
        }
    }

    private void Q() {
        try {
            JSONObject jSONObjectZ = z();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectZ, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                q0.a("NetworkMonitor_" + H(), "request start monitor = " + jSONObjectZ.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().e().d(eVarA);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "reportRequestStart ", th);
            }
        }
    }

    private void T() {
        this.f159984N = null;
        this.f160012u = null;
        this.f159986P = null;
        this.f160010s = 0L;
        this.f160011t = 0L;
        this.f160013v = 0L;
        this.f160014w = 0L;
        this.f160016y = 0L;
        this.f160017z = 0L;
        this.f159971A = 0L;
        this.f159972B = 0L;
        this.f159973C = 0L;
        this.f159974D = 0L;
        this.f159975E = 0L;
        this.f159976F = 0L;
        this.f159977G = 0L;
        this.f159978H = 0L;
        this.f160008q = 0L;
        this.f160009r = 0L;
        this.f160004m = false;
        this.f159998g = -1;
        this.f160000i = -1;
        this.f159999h = "";
        this.f160006o = "";
        this.f160007p = 0L;
        this.f159987Q = false;
    }

    private JSONObject x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_end");
        jSONObject.put("uuid", M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("url", L());
        jSONObject.put(Jb.d.f58184l, I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("lrid", n());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f159997f);
        jSONObject.put(x.h.f238399b, j());
        jSONObject.put("request_duration", w());
        jSONObject.put("response_code", E());
        String strH = h();
        jSONObject.put("dns_result", strH);
        jSONObject.put("dns_status", TextUtils.isEmpty(strH) ? 2 : 1);
        jSONObject.put("is_connection_acquired", O() ? 1 : 0);
        jSONObject.put(AgentOptions.ADDRESS, c());
        jSONObject.put(AgentOptions.PORT, p());
        jSONObject.put(GeneralSettingsFragment.f147946u, r());
        jSONObject.put("protocol", q());
        jSONObject.put("tls_version", J());
        jSONObject.put(FirebaseAnalytics.Param.CONTENT_TYPE, f());
        int iG = G();
        jSONObject.put(R9.c.f67796d, iG);
        if (iG != 1) {
            jSONObject.put("error_type", l());
            jSONObject.put("reason", k());
        }
        jSONObject.put("dns_duration", g());
        jSONObject.put("connect_duration", d());
        jSONObject.put("request_header_duration", y());
        jSONObject.put("request_body_duration", t());
        jSONObject.put("request_body_size", u());
        jSONObject.put("response_header_duration", F());
        jSONObject.put("response_body_duration", C());
        jSONObject.put("response_body_size", D());
        jSONObject.put("transmission_duration", K());
        jSONObject.put("current_response_body_size", B());
        jSONObject.put("dns_type", i());
        return jSONObject;
    }

    private JSONObject z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_start");
        jSONObject.put("uuid", M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("lrid", n());
        jSONObject.put("url", L());
        jSONObject.put(Jb.d.f58184l, I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f159997f);
        return jSONObject;
    }

    public String A() {
        return TextUtils.isEmpty(this.f159996e) ? "" : this.f159996e;
    }

    public long B() {
        return this.f160009r;
    }

    public long C() {
        return this.f159978H - this.f159977G;
    }

    public long D() {
        return this.f160008q;
    }

    public int E() {
        return this.f160000i;
    }

    public long F() {
        return this.f159976F - this.f159975E;
    }

    public int G() {
        return this.f159998g;
    }

    public String H() {
        return TextUtils.isEmpty(this.f160001j) ? "un_known" : this.f160001j;
    }

    public long I() {
        return this.f159988R;
    }

    public String J() {
        if (this.f159982L != null) {
            try {
                d0 d0VarC = this.f159982L.c();
                return d0VarC == null ? "" : d0VarC.d();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getTlsVersion ", e10);
                }
            }
        }
        return "";
    }

    public long K() {
        return this.f159975E - this.f159971A;
    }

    public String L() {
        return TextUtils.isEmpty(this.f159992a) ? "" : this.f159992a;
    }

    public String M() {
        return TextUtils.isEmpty(this.f159995d) ? "" : this.f159995d;
    }

    public long N() {
        return this.f159991U;
    }

    public boolean O() {
        return this.f160004m;
    }

    public void R() {
        this.f159973C = SystemClock.elapsedRealtime();
    }

    public void S() {
        this.f159971A = SystemClock.elapsedRealtime();
    }

    public void U() {
        this.f159977G = SystemClock.elapsedRealtime();
    }

    public void V() {
        this.f159975E = SystemClock.elapsedRealtime();
    }

    public void W() {
    }

    public void a(String str) {
        this.f159994c = str;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.h hVar) {
    }

    public void c(String str) {
        this.f160015x = str;
    }

    public void d(String str) {
        this.f159999h = str;
    }

    public void e(long j10) {
        this.f159989S = j10;
    }

    public void f(String str) {
        this.f159992a = str;
    }

    public long g() {
        return this.f160014w - this.f160013v;
    }

    public String h() {
        if (this.f159979I == null || this.f159979I.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f159979I.size(); i10++) {
            try {
                InetAddress inetAddress = this.f159979I.get(i10);
                if (inetAddress != null) {
                    sb2.append(inetAddress.getHostAddress());
                    if (i10 != this.f159979I.size() - 1) {
                        sb2.append(",");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getDnsResult ", e10);
                }
            }
        }
        return sb2.toString();
    }

    public void i(long j10) {
        this.f159988R = j10;
    }

    public void j(long j10) {
        this.f159991U = j10;
    }

    public String k() {
        try {
            if (this.f159984N != null) {
                String name = this.f159984N.getClass().getName();
                String message = this.f159984N.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return a("connection: %s ", name, message);
                }
            }
            if (this.f160012u != null) {
                String name2 = this.f160012u.getClass().getName();
                String message2 = this.f160012u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return a("call: %s ", name2, message2);
                }
            }
            if (this.f159986P == null) {
                return "un_known";
            }
            String name3 = this.f159986P.getClass().getName();
            String message3 = this.f159986P.getMessage();
            return !TextUtils.isEmpty(message3) ? a("error: %s ", name3, message3) : "un_known";
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return "un_known";
            }
            q0.b("NetworkMonitor", "getError ", e10);
            return "un_known";
        }
    }

    public String l() {
        return this.f159999h;
    }

    public String m() {
        return this.f160003l;
    }

    public String n() {
        return TextUtils.isEmpty(this.f159993b) ? "" : this.f159993b;
    }

    public String o() {
        return TextUtils.isEmpty(this.f160002k) ? "" : this.f160002k;
    }

    public int p() {
        if (this.f159980J != null) {
            return this.f159980J.getPort();
        }
        return -1;
    }

    public String q() {
        return this.f159983M != null ? this.f159983M.toString() : "";
    }

    public String r() {
        Proxy.Type type;
        return (this.f159981K == null || (type = this.f159981K.type()) == null) ? "" : type.toString();
    }

    public long s() {
        return this.f159990T;
    }

    public long t() {
        return this.f159974D - this.f159973C;
    }

    public long u() {
        return this.f160007p;
    }

    public int v() {
        return this.f160005n.getAndAdd(0);
    }

    public long w() {
        return this.f160011t - this.f160010s;
    }

    public long y() {
        return this.f159972B - this.f159971A;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.d dVar) {
        this.f160010s = SystemClock.elapsedRealtime();
    }

    public String b() {
        return TextUtils.isEmpty(this.f159994c) ? "" : this.f159994c;
    }

    public String c() {
        if (this.f159980J != null) {
            try {
                InetAddress address = this.f159980J.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                return TextUtils.isEmpty(hostAddress) ? "" : hostAddress;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getAddress ", e10);
                }
            }
        }
        return "";
    }

    public long d() {
        return this.f160017z - this.f160016y;
    }

    public long e() {
        return this.f159989S;
    }

    public void f(long j10) {
        this.f159990T = j10;
    }

    public void g(long j10) {
        this.f160007p = j10;
    }

    public String i() {
        return TextUtils.isEmpty(this.f160015x) ? "system" : this.f160015x;
    }

    public long j() {
        return (this.f160011t - this.f160010s) + this.f159997f;
    }

    public void a() {
        this.f160013v = SystemClock.elapsedRealtime();
    }

    public void b(int i10) {
        this.f160000i = i10;
    }

    public void d(long j10) {
        this.f159978H = SystemClock.elapsedRealtime();
    }

    public void e(String str) {
        this.f159993b = str;
    }

    public String f() {
        return com.mbridge.msdk.foundation.same.d.a(this.f160006o);
    }

    public void a(List<InetAddress> list) {
        this.f160014w = SystemClock.elapsedRealtime();
        this.f159979I = list;
    }

    public void b(long j10) {
        this.f159974D = SystemClock.elapsedRealtime();
    }

    public void b(String str) {
        this.f160006o = str;
    }

    public void a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f160016y = SystemClock.elapsedRealtime();
        this.f159980J = inetSocketAddress;
        this.f159981K = proxy;
        this.f159985O = true;
    }

    public void c(long j10) {
        this.f160009r = j10;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.q qVar) {
        this.f159982L = qVar;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.w wVar, IOException iOException) {
        this.f160017z = SystemClock.elapsedRealtime();
        this.f159983M = wVar;
        this.f159984N = iOException;
    }

    public void h(long j10) {
        this.f160008q = j10;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.h hVar) {
        this.f160004m = !this.f159985O;
        if (!this.f160004m || hVar == null) {
            return;
        }
        try {
            this.f159983M = hVar.a();
            com.mbridge.msdk.thrid.okhttp.c0 c0VarC = hVar.c();
            if (c0VarC != null) {
                this.f159980J = c0VarC.d();
                this.f159981K = c0VarC.b();
            }
            this.f159982L = hVar.b();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "connectionAcquired ", e10);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.y yVar) {
        this.f159972B = SystemClock.elapsedRealtime();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.a0 a0Var) {
        this.f159976F = SystemClock.elapsedRealtime();
        if (a0Var != null) {
            try {
                com.mbridge.msdk.thrid.okhttp.r rVarM = a0Var.m();
                if (rVarM != null) {
                    String strB = rVarM.b("Content-Type");
                    if (TextUtils.isEmpty(strB)) {
                        strB = "";
                    }
                    b(strB);
                }
            } catch (Exception e10) {
                b("unknown");
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "responseHeadersEnd ", e10);
                }
            }
        }
    }

    public void a(IOException iOException) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f160011t = jElapsedRealtime;
        this.f160012u = iOException;
        a(iOException, jElapsedRealtime);
    }

    private void a(IOException iOException, long j10) {
        if (iOException != null) {
            if (this.f160013v == 0) {
                this.f160013v = j10;
            }
            if (this.f160014w == 0) {
                this.f160014w = j10;
            }
            if (this.f160016y == 0) {
                this.f160016y = j10;
            }
            if (this.f160017z == 0) {
                this.f160017z = j10;
            }
            if (this.f159971A == 0) {
                this.f159971A = j10;
            }
            if (this.f159972B == 0) {
                this.f159972B = j10;
            }
            if (this.f159973C == 0) {
                this.f159973C = j10;
            }
            if (this.f159974D == 0) {
                this.f159974D = j10;
            }
            if (this.f159975E == 0) {
                this.f159975E = j10;
            }
            if (this.f159976F == 0) {
                this.f159976F = j10;
            }
            if (this.f159977G == 0) {
                this.f159977G = j10;
            }
            if (this.f159978H == 0) {
                this.f159978H = j10;
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        sb2.append(String.format(str, str2));
        sb2.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", C4.q.f17581a));
        return sb2.toString();
    }

    public void a(long j10) {
        this.f159996e = UUID.randomUUID().toString();
        this.f159997f = j10;
        this.f160005n.addAndGet(1);
        T();
        this.f159987Q = true;
        Q();
    }

    public void a(Exception exc) {
        this.f159986P = exc;
    }

    public void a(int i10) {
        this.f159998g = i10;
        if (this.f159987Q) {
            this.f159987Q = false;
            P();
        }
    }

    private static com.mbridge.msdk.tracker.e a(JSONObject jSONObject, String str) {
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        eVar.a(0);
        eVar.b(0);
        eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
        eVar.a(jSONObject);
        return eVar;
    }
}
