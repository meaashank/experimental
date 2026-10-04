package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f159922b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f159923a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f159923a.q().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f159925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f159926b;

        public b(e eVar, JSONObject jSONObject) {
            this.f159925a = eVar;
            this.f159926b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f159923a.h().a(this.f159925a);
                JSONObject jSONObject = this.f159926b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f159926b.put("track_time", jArrE[0]);
                    this.f159926b.put("track_count", jArrE[1]);
                    this.f159925a.a(this.f159926b);
                }
                this.f159925a.b(m.this.f159923a.c().f160150f);
                m.this.f159923a.h().b(this.f159925a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f159923a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f159922b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.f159923a.p();
    }

    public String d() {
        return this.f159923a.t();
    }

    public long[] e() {
        return this.f159923a.h().a();
    }

    public String f() {
        return this.f159923a.w();
    }

    public boolean g() {
        return !this.f159923a.x();
    }

    public String h() {
        if (!g()) {
            return this.f159923a.y();
        }
        if (com.mbridge.msdk.tracker.a.f159874a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void i() {
        this.f159923a.b();
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f159922b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f159923a.x()) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has(CampaignEx.JSON_KEY_ST_TS)) {
                try {
                    jSONObjectI.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f159923a.i().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public static m b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return f159922b.remove(str);
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "removeTrackManager error", e10);
            }
            return null;
        }
    }

    public void a() {
        try {
            this.f159923a.i().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f159923a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f159923a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
