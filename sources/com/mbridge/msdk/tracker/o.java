package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f160098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f160099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f160100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f160101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f160102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f160103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f160104g;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f160106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f160107b;

        public b(r rVar, t tVar) {
            this.f160106a = rVar;
            this.f160107b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f160106a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f159874a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f160106a.a(this.f160107b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }
    }

    public static final class c implements v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f160108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f160109b;

        public c(r rVar, t tVar) {
            this.f160108a = rVar;
            this.f160109b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f160108a)) {
                try {
                    this.f160108a.a(this.f160109b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f159874a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f160099b = i10;
        this.f160100c = pVar;
        this.f160101d = wVar;
        this.f160102e = i11;
        this.f160104g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f160098a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f160098a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f159874a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f160103f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f160098a)) {
                this.f160098a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f160102e == 1 ? new v<>(this.f160100c.c(), 1, this.f160100c.a()) : new v<>(this.f160100c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f160101d);
        vVar.a(z10 ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.f160098a, tVar));
        vVar.a((v.a) new b(this.f160098a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f160103f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f160100c.b()), new com.mbridge.msdk.tracker.network.f(this.f160104g), this.f160099b, null);
        this.f160103f = uVarA;
        uVarA.b();
    }
}
