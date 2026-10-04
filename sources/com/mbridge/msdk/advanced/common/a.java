package com.mbridge.msdk.advanced.common;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f153732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f153733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f153734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f153735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f153736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f153737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f153738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f153739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f153740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f153741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f153742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f153743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f153744q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f153730c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f153728a = m0.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f153729b = m0.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f153731d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f153732e = String.valueOf(iS);
        this.f153733f = m0.a(context, iS);
        this.f153734g = m0.l(context);
        this.f153735h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f153736i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f153737j = String.valueOf(v0.g(context));
        this.f153738k = String.valueOf(v0.f(context));
        this.f153740m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f153739l = "landscape";
        } else {
            this.f153739l = "portrait";
        }
        this.f153741n = m0.w();
        this.f153742o = g.e();
        this.f153743p = g.a();
        this.f153744q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f153728a);
                jSONObject.put("system_version", this.f153729b);
                jSONObject.put("network_type", this.f153732e);
                jSONObject.put("network_type_str", this.f153733f);
                jSONObject.put("device_ua", this.f153734g);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("opensdk_ver", m0.D() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f153743p);
                jSONObject.put("adid_limit_dev", this.f153744q);
            }
            jSONObject.put("plantform", this.f153730c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f153731d);
                jSONObject.put("az_aid_info", this.f153742o);
            }
            jSONObject.put("appkey", this.f153735h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f153736i);
            jSONObject.put("screen_width", this.f153737j);
            jSONObject.put("screen_height", this.f153738k);
            jSONObject.put("orientation", this.f153739l);
            jSONObject.put("scale", this.f153740m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put("f", this.f153741n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
