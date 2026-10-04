package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class V3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f152510e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152511a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f152512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f152513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f152514d;

    public V3() {
        JSONObject jSONObject = new JSONObject();
        try {
            C3774w3 c3774w3D = AbstractC3760v3.d();
            jSONObject.put(InMobiNetworkValues.WIDTH, c3774w3D.f153495a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, c3774w3D.f153496b);
            jSONObject.put("useCustomClose", this.f152513c);
            jSONObject.put("isModal", this.f152511a);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        this.f152512b = string;
    }
}
