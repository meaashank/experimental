package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.X;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f160024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f160025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f160026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f160027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f160028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f160029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f160030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f160031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f160032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f160033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f160034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f160035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f160036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f160037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f160038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f160039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f160040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f160041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f160042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f160043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f160044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f160045v;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f160042s;
    }

    public final boolean B() {
        return this.f160041r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t10);

    public void a(String str) {
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f160044u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f160025b)) {
            return this.f160025b;
        }
        if (this.f160024a == null) {
            this.f160024a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f160024a.a(this);
        this.f160025b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f160029f;
    }

    public p h() {
        return this.f160026c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "UTF-8";
    }

    public int k() {
        return this.f160031h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f160045v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f160027d;
    }

    public x o() {
        return this.f160043t;
    }

    public String p() {
        return this.f160032i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f160033j;
    }

    public String t() {
        return this.f160030g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(C4.q.f17581a);
        sb2.append(str);
        sb2.append(C4.q.f17581a);
        sb2.append(l());
        sb2.append(C4.q.f17581a);
        sb2.append(this.f160036m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f160034k) {
            z10 = this.f160040q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f160034k) {
            z10 = this.f160039p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f160034k) {
            this.f160040q = true;
        }
    }

    public void x() {
        synchronized (this.f160034k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f160038o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        u uVar = this.f160037n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f160028e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f160028e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f160034k = new Object();
        this.f160038o = false;
        this.f160039p = false;
        this.f160040q = false;
        this.f160041r = false;
        this.f160042s = false;
        this.f160044u = null;
        this.f160045v = 0L;
        this.f160029f = i10;
        this.f160030g = str;
        this.f160031h = i11;
        this.f160032i = str2;
        a((x) new e());
        this.f160033j = b(str);
        this.f160027d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f160035l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f160043t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public void a(int i10) {
        u uVar = this.f160037n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f160036m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f160041r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f160045v = bArrA.length;
            return bArrA;
        }
        this.f160045v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f160037n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(SignatureVisitor.INSTANCEOF);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append(X.f218302d);
                    }
                }
            }
            if (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) {
                return ("p=" + URLEncoder.encode(v0.b(sb2.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(w.y.a("Encoding not supported: ", str), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f160042s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f160034k) {
            aVar = this.f160035l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f160038o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f160034k) {
        }
    }

    public void a(p pVar) {
        this.f160026c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f160028e == null) {
            this.f160028e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f160028e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f160036m.intValue() - tVar.f160036m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
