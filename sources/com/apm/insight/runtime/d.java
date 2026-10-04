package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f137483a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f137484b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f137485c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137486d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137487e;

    private d(JSONObject jSONObject, String str) {
        this.f137487e = str;
        a(jSONObject);
        f137483a.put(this.f137487e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f137484b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f137486d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = f137483a.get(str);
        if (dVar != null) {
            return dVar.f137484b;
        }
        return null;
    }

    public static d c(String str) {
        return f137483a.get(str);
    }

    public static long d(String str) {
        d dVar = f137483a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f137484b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f137483a.get(str);
        return (dVar == null || (jSONObject = dVar.f137484b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f137483a.get(str);
        return (dVar == null || (jSONObject = dVar.f137484b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f137483a.get(str);
        return (dVar == null || (jSONObject = dVar.f137484b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f137484b == null) {
            return false;
        }
        return this.f137486d;
    }

    public static boolean a(String str) {
        return f137483a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f137483a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
