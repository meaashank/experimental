package com.mbridge.msdk.splash.common;

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
    public String f158646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f158647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f158648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f158649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f158650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f158651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f158652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f158653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f158654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f158655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f158656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f158657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f158658q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f158644c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f158642a = m0.u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f158643b = m0.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f158645d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f158646e = String.valueOf(iS);
        this.f158647f = m0.a(context, iS);
        this.f158648g = m0.l(context);
        this.f158649h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f158650i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f158651j = String.valueOf(v0.g(context));
        this.f158652k = String.valueOf(v0.f(context));
        this.f158654m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f158653l = "landscape";
        } else {
            this.f158653l = "portrait";
        }
        this.f158655n = m0.w();
        this.f158656o = g.e();
        this.f158657p = g.a();
        this.f158658q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f158642a);
                jSONObject.put("system_version", this.f158643b);
                jSONObject.put("network_type", this.f158646e);
                jSONObject.put("network_type_str", this.f158647f);
                jSONObject.put("device_ua", this.f158648g);
                jSONObject.put("has_wx", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.G());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f158657p);
                jSONObject.put("adid_limit_dev", this.f158658q);
            }
            jSONObject.put("plantform", this.f158644c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f158645d);
                jSONObject.put("az_aid_info", this.f158656o);
            }
            jSONObject.put("appkey", this.f158649h);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f158650i);
            jSONObject.put("screen_width", this.f158651j);
            jSONObject.put("screen_height", this.f158652k);
            jSONObject.put("orientation", this.f158653l);
            jSONObject.put("scale", this.f158654m);
            if (m0.A() != 0) {
                jSONObject.put("tun", m0.A());
            }
            jSONObject.put("f", this.f158655n);
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
