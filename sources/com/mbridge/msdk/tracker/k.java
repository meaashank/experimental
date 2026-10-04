package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f159907o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f159908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f159909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f159910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f159911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f159912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f159913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f159914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f159915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f159916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f159917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f159918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile s f159919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f159920m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f159921n;

    public k(String str, m mVar) {
        this.f159908a = str;
        this.f159909b = mVar;
    }

    public void a(Context context) {
        this.f159910c = context;
    }

    public void b() {
        this.f159920m = true;
        try {
            q().j();
            this.f159919l = null;
            this.f159918k = null;
        } catch (Exception e10) {
            if (a.f159874a) {
                Log.e("TrackManager", "report manager shutdown exception", e10);
            }
        }
    }

    public x c() {
        x xVar = this.f159911d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f159911d = xVarA;
        return xVarA;
    }

    public Context d() {
        return this.f159910c;
    }

    public c e() {
        if (y.b(this.f159915h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f159915h)) {
                        String strU = u();
                        this.f159915h = new c(new b(d(), f(), strU), strU);
                    }
                } finally {
                }
            }
        }
        return this.f159915h;
    }

    public String f() {
        return TextUtils.isEmpty(w()) ? String.format("track_manager_%s.db", "default") : String.format("track_manager_%s.db", w());
    }

    public d g() {
        if (y.b(this.f159917j)) {
            this.f159917j = c().f160152h;
        }
        return this.f159917j;
    }

    public l h() {
        if (y.b(this.f159916i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f159916i)) {
                        this.f159916i = new q(new g(e(), q()));
                    }
                } finally {
                }
            }
        }
        return this.f159916i;
    }

    public j i() {
        if (y.b(this.f159918k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f159918k)) {
                        this.f159918k = new j();
                    }
                } finally {
                }
            }
        }
        return this.f159918k;
    }

    public int j() {
        if (c().f160145a < 0) {
            return 50;
        }
        return c().f160145a;
    }

    public int k() {
        return Math.max(c().f160149e, 0);
    }

    public int l() {
        if (c().f160148d <= 0) {
            return 2;
        }
        return c().f160148d;
    }

    public int m() {
        return Math.max(c().f160146b, 0);
    }

    public o n() {
        if (y.b(this.f159921n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f159921n)) {
                        this.f159921n = new o(l(), o(), s(), r());
                    }
                } finally {
                }
            }
        }
        return this.f159921n;
    }

    public p o() {
        return c().f160151g;
    }

    public JSONObject p() {
        JSONObject jSONObject = this.f159912e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f159912e = jSONObject2;
        return jSONObject2;
    }

    public s q() {
        if (y.b(this.f159919l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f159919l)) {
                        this.f159919l = new s(this);
                    }
                } finally {
                }
            }
        }
        return this.f159919l;
    }

    public int r() {
        return c().f160147c;
    }

    public w s() {
        return c().f160153i;
    }

    public String t() {
        if (!TextUtils.isEmpty(f159907o)) {
            return f159907o;
        }
        String string = UUID.randomUUID().toString();
        f159907o = string;
        return string;
    }

    public String u() {
        return "event_table";
    }

    public m v() {
        return this.f159909b;
    }

    public String w() {
        return this.f159908a;
    }

    public boolean x() {
        return this.f159920m;
    }

    public String y() {
        if (!y.b(this.f159910c) && !y.b(this.f159911d)) {
            try {
                q().k();
                this.f159920m = false;
                if (TextUtils.isEmpty(f159907o)) {
                    f159907o = UUID.randomUUID().toString();
                }
                return f159907o;
            } catch (Exception e10) {
                if (a.f159874a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f159920m = true;
            }
        }
        return "";
    }

    public void a(x xVar) {
        this.f159911d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.f159912e = jSONObject;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = c().f160154j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f159874a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if (this.f159914g != null) {
            try {
                return !r0.contains(strG);
            } catch (Exception e11) {
                if (a.f159874a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list = this.f159913f;
        if (list != null) {
            try {
                return list.contains(strG);
            } catch (Exception e12) {
                if (a.f159874a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public boolean a() throws IllegalStateException {
        if (!y.b(c())) {
            if (!y.b(g())) {
                if (!y.b(s())) {
                    if (!y.b(o()) && !y.b(o().b())) {
                        if (TextUtils.isEmpty(o().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
