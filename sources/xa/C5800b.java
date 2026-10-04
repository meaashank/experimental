package xa;

import com.prism.commons.async.Priority;
import com.prism.commons.exception.BadStrEncodeException;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.C3860y;
import com.prism.lib.downloader.common.DownloadError;
import com.prism.lib.downloader.common.DownloadProgress;
import com.prism.lib.downloader.common.DownloadStatus;
import g6.C4455a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sa.InterfaceC5585b;
import sa.InterfaceC5586c;
import sa.InterfaceC5587d;
import sa.InterfaceC5588e;
import wa.InterfaceC5771b;

/* JADX INFO: renamed from: xa.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5800b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f240534A = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Comparator<C5800b> f240535z = new C5799a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Priority f240536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f240537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f240538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f240539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f240540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f240541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f240542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f240543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f240544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f240545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f240546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f240547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f240548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f240549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f240550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC5771b f240551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap<String, List<String>> f240552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC5588e f240553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC5586c f240554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public sa.f f240555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC5587d f240556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC5585b f240557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f240558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Future f240559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DownloadStatus f240560y;

    /* JADX INFO: renamed from: xa.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadError f240561a;

        public a(DownloadError downloadError) {
            this.f240561a = downloadError;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240554s.a(this.f240561a);
        }
    }

    /* JADX INFO: renamed from: xa.b$b, reason: collision with other inner class name */
    public class RunnableC0906b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5800b f240563a;

        public RunnableC0906b(C5800b c5800b) {
            this.f240563a = c5800b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240554s.b(this.f240563a);
        }
    }

    /* JADX INFO: renamed from: xa.b$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240555t.a();
        }
    }

    /* JADX INFO: renamed from: xa.b$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240556u.onPause();
        }
    }

    /* JADX INFO: renamed from: xa.b$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadProgress f240567a;

        public e(DownloadProgress downloadProgress) {
            this.f240567a = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240553r.a(this.f240567a);
        }
    }

    /* JADX INFO: renamed from: xa.b$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5800b.this.f240557v.onCancel();
        }
    }

    /* JADX INFO: renamed from: xa.b$g */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f240570a = "readTimeout";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f240571b = "connTimeout";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f240572c = "userAgent";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f240573d = "headerMap";
    }

    public C5800b() {
        this.f240560y = DownloadStatus.UNKNOWN;
    }

    public static C5800b m() {
        return new C5800b();
    }

    public int A() {
        return this.f240548m;
    }

    public void A0() {
        ta.c.p(this, true);
    }

    public JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(g.f240570a, this.f240548m);
            jSONObject.put(g.f240571b, this.f240549n);
            jSONObject.put(g.f240572c, this.f240550o);
            JSONObject jSONObjectU = u();
            if (jSONObjectU == null) {
                return jSONObject;
            }
            jSONObject.put(g.f240573d, jSONObjectU);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String C() {
        return B().toString();
    }

    public int D() {
        return this.f240558w;
    }

    public DownloadStatus E() {
        return this.f240560y;
    }

    public Object F() {
        return this.f240537b;
    }

    public File G() throws BadStrEncodeException {
        return new File(com.prism.lib.downloader.a.f().getExternalCacheDir(), C3860y.j(I()));
    }

    public long H() {
        return this.f240545j;
    }

    public String I() {
        return this.f240539d;
    }

    public String J() {
        return this.f240550o;
    }

    public boolean K() {
        return (this.f240542g & 2) != 0;
    }

    public void L() {
        R();
    }

    public void M(DownloadProgress downloadProgress) {
        ta.c.p(this, false);
        S(downloadProgress);
    }

    public void N() {
        T();
    }

    public void O() {
        this.f240560y = DownloadStatus.COMPLETED;
        C5802d.f().l(this);
        ta.c.k(this);
        U(this);
    }

    public final void P() {
        if (this.f240557v != null) {
            C4455a.b().b().execute(new f());
        }
    }

    public final void Q(DownloadError downloadError) {
        if (this.f240560y == DownloadStatus.CANCELLED || this.f240554s == null) {
            return;
        }
        C4455a.b().b().execute(new a(downloadError));
    }

    public final void R() {
        if (this.f240560y == DownloadStatus.CANCELLED || this.f240556u == null) {
            return;
        }
        C4455a.b().b().execute(new d());
    }

    public final void S(DownloadProgress downloadProgress) {
        if (this.f240553r != null) {
            C4455a.b().b().execute(new e(downloadProgress));
        }
    }

    public final void T() {
        if (this.f240560y == DownloadStatus.CANCELLED || this.f240555t == null) {
            return;
        }
        C4455a.b().b().execute(new c());
    }

    public final void U(C5800b c5800b) {
        if (this.f240560y == DownloadStatus.CANCELLED || this.f240554s == null) {
            return;
        }
        C4455a.b().b().execute(new RunnableC0906b(c5800b));
    }

    public void V(DownloadError downloadError) {
        this.f240560y = DownloadStatus.FAILED;
        ta.c.m(this, downloadError.toString());
        Q(downloadError);
    }

    public void W() {
        this.f240560y = DownloadStatus.RUNNING;
    }

    public void X() {
        this.f240560y = DownloadStatus.PAUSED;
    }

    public void Y() {
        DownloadStatus downloadStatus = this.f240560y;
        DownloadStatus downloadStatus2 = DownloadStatus.QUEUED;
        if (downloadStatus == downloadStatus2) {
            return;
        }
        if (this.f240558w < 0) {
            C5802d.f().k(this);
        }
        this.f240560y = downloadStatus2;
        this.f240559x = C4455a.b().g().submit(new com.prism.lib.downloader.internal.a(this));
    }

    public void Z(int i10) {
        this.f240549n = i10;
    }

    public void a0(String str) {
        this.f240540e = str;
    }

    public void b0(long j10) {
        this.f240544i = j10;
    }

    public void c0(String str) {
        this.f240543h = str;
    }

    public void d0(long j10) {
        this.f240546k = j10;
    }

    public void e0(int i10) {
        this.f240542g = i10;
    }

    public void f0(Map<String, List<String>> map) {
        this.f240552q = new HashMap<>(map);
    }

    public void g(String str, List<String> list) {
        if (this.f240552q == null) {
            this.f240552q = new HashMap<>();
        }
        List<String> arrayList = this.f240552q.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f240552q.put(str, arrayList);
        }
        arrayList.addAll(list);
    }

    public void g0(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f240552q = null;
            return;
        }
        this.f240552q = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
                this.f240552q.put(next, arrayList);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void h(Map<String, List<String>> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue());
        }
    }

    public void h0(InterfaceC5771b interfaceC5771b) {
        this.f240551p = interfaceC5771b;
    }

    public void i(String str, String str2) {
        if (this.f240552q == null) {
            this.f240552q = new HashMap<>();
        }
        List<String> arrayList = this.f240552q.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f240552q.put(str, arrayList);
        }
        arrayList.add(str2);
    }

    public void i0(long j10) {
        this.f240538c = j10;
    }

    public void j() {
        if (this.f240560y == DownloadStatus.COMPLETED) {
            return;
        }
        this.f240560y = DownloadStatus.CANCELLED;
        Future future = this.f240559x;
        if (future != null) {
            future.cancel(true);
        }
        k();
        C5802d.f().l(this);
        ta.c.l(this);
        P();
    }

    public void j0(long j10) {
        this.f240547l = j10;
    }

    public void k() {
        try {
            C3858w.l(G());
        } catch (BadStrEncodeException unused) {
        }
    }

    public C5800b k0(InterfaceC5585b interfaceC5585b) {
        this.f240557v = interfaceC5585b;
        return this;
    }

    public long l(InterfaceC5586c interfaceC5586c) {
        this.f240554s = interfaceC5586c;
        long j10 = ta.c.j(this);
        if (j10 >= 0) {
            Y();
        }
        return j10;
    }

    public C5800b l0(InterfaceC5587d interfaceC5587d) {
        this.f240556u = interfaceC5587d;
        return this;
    }

    public C5800b m0(InterfaceC5588e interfaceC5588e) {
        this.f240553r = interfaceC5588e;
        return this;
    }

    public int n() {
        return this.f240549n;
    }

    public C5800b n0(sa.f fVar) {
        this.f240555t = fVar;
        return this;
    }

    public String o() {
        return this.f240540e;
    }

    public void o0(Priority priority) {
        this.f240536a = priority;
    }

    public long p() {
        return this.f240544i;
    }

    public void p0(String str) {
        this.f240541f = str;
    }

    public String q() {
        return this.f240543h;
    }

    public void q0(int i10) {
        this.f240548m = i10;
    }

    public long r() {
        return this.f240546k;
    }

    public void r0(boolean z10) {
        if (z10) {
            this.f240542g |= 2;
        } else {
            this.f240542g ^= 2;
        }
    }

    public int s() {
        return this.f240542g;
    }

    public void s0(String str) {
        try {
            t0(new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public HashMap<String, List<String>> t() {
        return this.f240552q;
    }

    public void t0(JSONObject jSONObject) {
        try {
            this.f240548m = jSONObject.getInt(g.f240570a);
            this.f240549n = jSONObject.getInt(g.f240571b);
            this.f240550o = jSONObject.getString(g.f240572c);
            g0(jSONObject.getJSONObject(g.f240573d));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public JSONObject u() {
        if (this.f240552q == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : this.f240552q.entrySet()) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(entry.getKey(), jSONArray);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    public void u0(int i10) {
        this.f240558w = i10;
    }

    public InterfaceC5771b v() {
        return this.f240551p;
    }

    public void v0(DownloadStatus downloadStatus) {
        this.f240560y = downloadStatus;
    }

    public long w() {
        return this.f240538c;
    }

    public void w0(Object obj) {
        this.f240537b = obj;
    }

    public long x() {
        return this.f240547l;
    }

    public void x0(long j10) {
        this.f240545j = j10;
    }

    public Priority y() {
        return this.f240536a;
    }

    public void y0(String str) {
        this.f240539d = str;
    }

    public String z() {
        return this.f240541f;
    }

    public void z0(String str) {
        this.f240550o = str;
    }

    public C5800b(C5801c c5801c) {
        this.f240560y = DownloadStatus.UNKNOWN;
        this.f240536a = c5801c.f240578e;
        this.f240537b = c5801c.f240579f;
        this.f240538c = -1L;
        this.f240539d = c5801c.f240574a;
        this.f240540e = c5801c.f240575b;
        this.f240541f = c5801c.f240576c;
        this.f240542g = 0;
        r0(c5801c.f240577d);
        this.f240544i = 0L;
        this.f240545j = 0L;
        this.f240546k = System.currentTimeMillis();
        this.f240548m = c5801c.f240580g;
        this.f240549n = c5801c.f240581h;
        this.f240550o = c5801c.f240582i;
        this.f240551p = c5801c.f240583j;
        this.f240552q = c5801c.f240584k;
        this.f240558w = -1;
    }
}
