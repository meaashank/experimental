package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f156759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.k f156760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f156761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f156762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IntentFilter f156763e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0 f156764a = new g0();
    }

    public static g0 a() {
        return b.f156764a;
    }

    public String b() {
        try {
            if (this.f156759a == null) {
                this.f156759a = new JSONObject();
            }
            if (this.f156759a.length() < 2) {
                try {
                    this.f156759a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f156759a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f156759a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f156759a.optLong("KEY_TIME") > (gVarD != null ? gVarD.T() : com.prism.gaia.server.content.e.f167098H) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b()).U() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f156763e = intentFilter;
            intentFilter.addAction(q4.c.f226807e);
            contextD.registerReceiver(this.f156762d, this.f156763e);
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f156761c > androidx.appcompat.widget.e0.f86341n) {
            if (this.f156760b == null) {
                this.f156760b = new com.mbridge.msdk.setting.k();
            }
            this.f156760b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f156761c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f156762d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private g0() {
        this.f156759a = new JSONObject();
        this.f156762d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f156763e = intentFilter;
        intentFilter.addAction(q4.c.f226807e);
    }

    public void a(String str) {
        if (this.f156759a == null) {
            this.f156759a = new JSONObject();
        }
        try {
            if (!this.f156759a.optString("KEY_INFO", "").equals(str)) {
                this.f156759a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f156759a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }
}
