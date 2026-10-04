package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile a f155324m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f155325n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f155326o = 5000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f155327p = 5000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f155328q = 5000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f155329r = 3000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.pipeline.a f155331b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f155338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f155339j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f155332c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.manager.callback.a f155333d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f155334e = "g0.npc";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final AtomicInteger f155335f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f155336g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f155337h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final AtomicReference<com.mbridge.msdk.config.component.common.util.a<Integer>> f155340k = new AtomicReference<>(new com.mbridge.msdk.config.component.common.util.a());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.mbridge.msdk.config.dynamic.binddata.wrapper.c f155341l = new C0555a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f155330a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    public class C0555a extends com.mbridge.msdk.config.dynamic.binddata.wrapper.c {
        public C0555a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            Map map;
            int i10 = 2;
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            String message = "";
            try {
                String strValueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                    message = "Pipeline is null";
                    a.this.f155335f.set(0);
                } else {
                    a.this.f155331b.a(new e().a(strValueOf));
                    if (!b.f155343a.get()) {
                        if (a.this.f155332c != null) {
                            map = a.this.f155332c;
                        } else {
                            HashMap map2 = new HashMap();
                            map2.put("app_id", a.this.f155338i);
                            map2.put("app_key", a.this.f155339j);
                            map = map2;
                        }
                        b.a(com.mbridge.msdk.foundation.controller.c.n().d(), (Map<String, Object>) map, a.this.f155333d);
                    }
                    i10 = 1;
                }
                HashMap map3 = new HashMap();
                map3.put(x.h.f238399b, Long.valueOf(System.currentTimeMillis() - a.this.f155337h));
                map3.put(R9.c.f67796d, Integer.valueOf(i10));
                if (!TextUtils.isEmpty(message)) {
                    map3.put("reason", message);
                }
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", map3);
            } catch (Throwable th) {
                try {
                    message = th.getMessage();
                    q0.b("ComponentManager", th.getMessage());
                } finally {
                    HashMap map4 = new HashMap();
                    map4.put(x.h.f238399b, Long.valueOf(System.currentTimeMillis() - a.this.f155337h));
                    map4.put(R9.c.f67796d, 2);
                    if (!TextUtils.isEmpty(message)) {
                        map4.put("reason", message);
                    }
                    com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", map4);
                }
            }
        }
    }

    private a() {
    }

    public static a c() {
        if (f155324m == null) {
            synchronized (f155325n) {
                try {
                    if (f155324m == null) {
                        f155324m = new a();
                    }
                } finally {
                }
            }
        }
        return f155324m;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.f155330a;
    }

    public boolean d() {
        if (this.f155335f.get() == -1) {
            a("");
        }
        return this.f155335f.get() > 0;
    }

    public boolean e() {
        return this.f155335f.get() == 2;
    }

    public void a(Map<String, Object> map, com.mbridge.msdk.config.manager.callback.a aVar) {
        if (map != null) {
            this.f155332c = map;
        }
        this.f155333d = aVar;
    }

    public void a() {
        this.f155332c = null;
        this.f155333d = null;
    }

    private synchronized void a(final String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f155336g.get()) {
                this.f155336g.compareAndSet(true, false);
            }
            if (this.f155336g.compareAndSet(false, true)) {
                final Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD == null) {
                    this.f155336g.compareAndSet(true, false);
                } else {
                    com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.manager.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f155344a.a(contextD, str);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        Map<String, Object> mapB;
        try {
            this.f155338i = com.mbridge.msdk.foundation.controller.c.n().b();
            this.f155339j = com.mbridge.msdk.foundation.controller.c.n().c();
            if (TextUtils.isEmpty(this.f155338i)) {
                this.f155338i = com.mbridge.msdk.config.component.common.util.b.a(context).a("app_id", "");
            }
            if (TextUtils.isEmpty(this.f155339j)) {
                this.f155339j = com.mbridge.msdk.config.component.common.util.b.a(context).a("app_key", "");
            }
            if (TextUtils.isEmpty(this.f155338i)) {
                this.f155336g.compareAndSet(true, false);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                mapB = new e().a(str);
            } else {
                mapB = com.mbridge.msdk.config.component.common.util.c.b(this.f155338i);
            }
            if (mapB == null || mapB.isEmpty()) {
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a(mapB.get("p_p_c_id")) <= 0) {
                this.f155335f.set(0);
                return;
            }
            String strValueOf = String.valueOf(mapB.get("p_p_c"));
            if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
                a(strValueOf, this.f155338i, this.f155339j, mapB);
                return;
            }
            this.f155335f.set(0);
        } catch (Throwable unused) {
            this.f155336g.set(false);
        }
    }

    private synchronized void a(String str, String str2, String str3, Map<String, Object> map) {
        a(map);
        if (this.f155335f.get() == 1) {
            return;
        }
        this.f155335f.set(1);
        if (this.f155331b == null) {
            this.f155337h = System.currentTimeMillis();
            this.f155330a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) this.f155341l);
            this.f155331b = new com.mbridge.msdk.config.component.pipeline.a(str, this.f155330a);
            HashMap map2 = new HashMap();
            map2.put("app_id", str2);
            map2.put("app_key", str3);
            HashMap map3 = new HashMap();
            map3.put("app_setting", map);
            map3.put("device_info", m0.k());
            map2.put("info", map3);
            a(com.mbridge.msdk.config.component.common.util.c.a(), "c30", map2);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_start", new HashMap());
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap(map);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("577"), str2);
            HashMap map4 = new HashMap();
            map4.put("id", str);
            if (map3.containsKey("sdk_context")) {
                map2.put("sdk_context", map3.get("sdk_context"));
                map3.remove("sdk_context");
            }
            map4.put("api_params", map3);
            HashMap map5 = new HashMap();
            map5.put("context_id", str);
            map4.put("metrics", map5);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("51"), map4);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a("_");
            bVar.b("922001");
            bVar.a(map2);
            if (this.f155331b != null) {
                this.f155331b.a(bVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    private void a(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String strValueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(strValueOf) && TextUtils.isDigitsOnly(strValueOf)) {
                    f155326o = Integer.parseInt(strValueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String strValueOf2 = String.valueOf(map.get("t_o_ar"));
                if (!TextUtils.isEmpty(strValueOf2) && TextUtils.isDigitsOnly(strValueOf2)) {
                    f155327p = Integer.parseInt(strValueOf2) * 1000;
                }
            }
            if (map.containsKey("t_o_al")) {
                String strValueOf3 = String.valueOf(map.get("t_o_al"));
                if (!TextUtils.isEmpty(strValueOf3) && TextUtils.isDigitsOnly(strValueOf3)) {
                    f155328q = Integer.parseInt(strValueOf3) * 1000;
                }
            }
            if (map.containsKey("t_o_as")) {
                String strValueOf4 = String.valueOf(map.get("t_o_as"));
                if (TextUtils.isEmpty(strValueOf4) || !TextUtils.isDigitsOnly(strValueOf4)) {
                    return;
                }
                f155329r = Integer.parseInt(strValueOf4) * 1000;
            }
        } catch (Throwable th) {
            q0.b("ComponentManager", "refreshTimeout error: " + th.getMessage(), th);
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            a(str2);
            com.mbridge.msdk.config.component.common.util.c.b(str, str2);
        } catch (Throwable th) {
            q0.b("ComponentManager", th.getMessage());
        }
    }

    public boolean a(long j10) {
        if (this.f155335f.get() == 2) {
            return true;
        }
        try {
            Integer numA = this.f155340k.get().a(j10);
            if (numA != null) {
                if (numA.intValue() == 2) {
                    return true;
                }
            }
            return false;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            q0.b("ComponentManager", "awaitComponentReady interrupted: " + e10.getMessage(), e10);
            return false;
        }
    }
}
