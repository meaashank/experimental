package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z3 f152641a = new Z3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f152642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static JSONObject f152643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static JSONObject f152644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static RootConfig f152645e;

    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @e.g0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.json.JSONObject c() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Z3.c():org.json.JSONObject");
    }

    @dd.o
    public static /* synthetic */ void d() {
    }

    @e.f0
    @e.g0
    public static final byte e() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return (byte) -1;
        }
        if (jSONObjectC.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            return (byte) 1;
        }
        if (!jSONObjectC.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            return (byte) -1;
        }
        try {
            return jSONObjectC.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
        } catch (JSONException unused) {
            return (byte) -1;
        }
    }

    @dd.o
    public static /* synthetic */ void f() {
    }

    @dd.o
    @e.f0
    public static final void h() {
        HashMap map = AbstractC3537f3.f152908a;
        Config configA = AbstractC3537f3.a(C3657nb.b(), "root");
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
        f152645e = (RootConfig) configA;
    }

    @dd.o
    public static final void i() {
        f152642b = null;
        f152643c = null;
        f152644d = null;
        f152645e = null;
    }

    public final void a(@Nullable JSONObject jSONObject) {
        f152644d = jSONObject;
    }

    @Nullable
    public final JSONObject b() {
        return f152644d;
    }

    @Nullable
    public final JSONObject g() {
        return f152642b;
    }

    public final void j() {
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        f152645e = (RootConfig) D4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
    }

    public static /* synthetic */ boolean a(Z3 z32, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return z32.a(z10);
    }

    public static final void b(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            f152642b = jSONObject;
        }
    }

    public final boolean a(boolean z10) {
        if (f152645e == null) {
            j();
        }
        byte bE = e();
        RootConfig rootConfig = f152645e;
        return bE == 1 || kotlin.jvm.internal.G.g(rootConfig != null ? Boolean.valueOf(rootConfig.shouldTransmitRequest()) : null, Boolean.TRUE) || z10;
    }

    public final boolean a() {
        return a(this, false, 1, null);
    }

    @dd.o
    public static final void c(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            f152643c = jSONObject;
        }
    }
}
