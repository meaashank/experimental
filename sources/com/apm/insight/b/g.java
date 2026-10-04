package com.apm.insight.b;

import C4.q;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f137066r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f137067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f137069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f137071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f137072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f137073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f137074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f137075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f137076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f137077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f137078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f137079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f137080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f137081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f137082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f137083q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f137084s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f137093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f137094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f137095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f137096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        StackTraceElement[] f137098f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f137099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f137100b;

        public final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f137101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f137102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f137103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f137104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f137106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f137107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f137108h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f137109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f137110j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f137111k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f137108h));
                jSONObject.put("cpuDuration", this.f137107g);
                jSONObject.put(x.h.f238399b, this.f137106f);
                jSONObject.put("type", this.f137104d);
                jSONObject.put("count", this.f137105e);
                jSONObject.put("messageCount", this.f137105e);
                jSONObject.put("lastDuration", this.f137102b - this.f137103c);
                jSONObject.put("start", this.f137101a);
                jSONObject.put("end", this.f137102b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f137104d = -1;
            this.f137105e = -1;
            this.f137106f = -1L;
            this.f137108h = null;
            this.f137110j = null;
            this.f137111k = null;
            this.f137109i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ r e() {
        return null;
    }

    private g(byte b10) {
        this.f137068b = 0;
        this.f137069c = 0;
        this.f137070d = 100;
        this.f137071e = 200;
        this.f137073g = -1L;
        this.f137074h = -1L;
        this.f137075i = -1;
        this.f137076j = -1L;
        this.f137080n = false;
        this.f137081o = false;
        this.f137083q = false;
        this.f137084s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f137087b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f137086a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f137088c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f137089d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f137090e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f137099a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f137088c == g.this.f137069c) {
                    this.f137089d++;
                } else {
                    this.f137089d = 0;
                    this.f137090e = 0;
                    this.f137087b = jUptimeMillis;
                }
                this.f137088c = g.this.f137069c;
                int i10 = this.f137089d;
                if (i10 > 0 && i10 - this.f137090e >= g.f137066r && this.f137086a != 0 && jUptimeMillis - this.f137087b > 700 && g.this.f137083q) {
                    aVar.f137098f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f137090e = this.f137089d;
                }
                aVar.f137096d = g.this.f137083q;
                aVar.f137095c = (jUptimeMillis - this.f137086a) - 300;
                aVar.f137093a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f137086a = jUptimeMillis2;
                aVar.f137094b = jUptimeMillis2 - jUptimeMillis;
                aVar.f137097e = g.this.f137069c;
                g.e().a(g.this.f137084s, 300L);
                g.c().a(aVar);
            }
        };
        this.f137067a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f137082p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f137068b;
        gVar.f137068b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f137072f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f137080n) {
            return;
        }
        this.f137080n = true;
        this.f137070d = 100;
        this.f137071e = 300;
        this.f137072f = new f(100);
        this.f137079m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f137060a);
                g gVar = g.this;
                gVar.f137077k = gVar.f137078l;
                g.this.f137078l = "no message running";
                g.this.f137083q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f137083q = true;
                g.this.f137078l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f137060a);
            }
        };
        h.a();
        h.a(this.f137079m);
        j.a(j.a());
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f137112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f137113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f137114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f137115d = new ArrayList();

        public f(int i10) {
            this.f137112a = i10;
        }

        public final e a(int i10) {
            e eVar = this.f137114c;
            if (eVar != null) {
                eVar.f137104d = i10;
                this.f137114c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f137104d = i10;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f137115d.size();
            int i10 = this.f137112a;
            if (size < i10) {
                this.f137115d.add(eVar);
                this.f137113b = this.f137115d.size();
                return;
            }
            int i11 = this.f137113b % i10;
            this.f137113b = i11;
            e eVar2 = this.f137115d.set(i11, eVar);
            eVar2.b();
            this.f137114c = eVar2;
            this.f137113b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f137115d.size() == this.f137112a) {
                for (int i11 = this.f137113b; i11 < this.f137115d.size(); i11++) {
                    arrayList.add(this.f137115d.get(i11));
                }
                while (i10 < this.f137113b - 1) {
                    arrayList.add(this.f137115d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f137115d.size()) {
                    arrayList.add(this.f137115d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f137081o = true;
        e eVarA = this.f137072f.a(i10);
        eVarA.f137106f = j10 - this.f137073g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f137107g = jCurrentThreadTimeMillis - this.f137076j;
            this.f137076j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f137107g = -1L;
        }
        eVarA.f137105e = this.f137068b;
        eVarA.f137108h = str;
        eVarA.f137109i = this.f137077k;
        eVarA.f137101a = this.f137073g;
        eVarA.f137102b = j10;
        eVarA.f137103c = this.f137074h;
        this.f137072f.a(eVarA);
        this.f137068b = 0;
        this.f137073g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f137108h = this.f137078l;
        eVar.f137109i = this.f137077k;
        eVar.f137106f = j10 - this.f137074h;
        eVar.f137107g = a(this.f137075i) - this.f137076j;
        eVar.f137105e = this.f137068b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(com.prism.gaia.server.accounts.b.f166434b0);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(q.f17581a)) {
                str = str.replace(q.f17581a, "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.f.a(i10);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f137069c + 1;
        gVar.f137069c = i10;
        gVar.f137069c = i10 & 65535;
        gVar.f137081o = false;
        if (gVar.f137073g < 0) {
            gVar.f137073g = j10;
        }
        if (gVar.f137074h < 0) {
            gVar.f137074h = j10;
        }
        if (gVar.f137075i < 0) {
            gVar.f137075i = Process.myTid();
            gVar.f137076j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f137073g;
        int i11 = gVar.f137071e;
        if (j11 > i11) {
            long j12 = gVar.f137074h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f137078l);
            } else if (z10) {
                if (gVar.f137068b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f137077k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f137068b == 0) {
                gVar.a(8, j10, gVar.f137078l, true);
            } else {
                gVar.a(9, j12, gVar.f137077k, false);
                gVar.a(8, j10, gVar.f137078l, true);
            }
        }
        gVar.f137074h = j10;
    }
}
