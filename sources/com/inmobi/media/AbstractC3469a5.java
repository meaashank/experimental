package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3469a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f152686a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f152687b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f152688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f152689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f152690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f152691f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f152687b) {
            try {
                Objects.toString(f152691f);
                Objects.toString(jSONObject);
                f152691f = jSONObject;
                f152689d = true;
                Context contextD = C3657nb.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = K5.f152164b;
                    K5 k5A = J5.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f152691f;
                    if (jSONObject2 == null) {
                        k5A.a("publisher_provided_unified_id");
                    } else {
                        k5A.a("publisher_provided_unified_id", String.valueOf(jSONObject2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f152686a) {
            if (f152688c) {
                return f152690e;
            }
            f152688c = true;
            Context contextD = C3657nb.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                String string = J5.a(contextD, "unified_id_info_store").f152165a.getString("ufids", null);
                if (string != null) {
                    try {
                        f152690e = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    return f152690e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f152687b) {
            if (f152689d) {
                Objects.toString(f152691f);
                return f152691f;
            }
            f152689d = true;
            Context contextD = C3657nb.d();
            String string = null;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = K5.f152164b;
                string = J5.a(contextD, "unified_id_info_store").f152165a.getString("publisher_provided_unified_id", null);
            }
            try {
                f152691f = new JSONObject(string);
            } catch (NullPointerException | JSONException unused) {
            }
            Objects.toString(f152691f);
            return f152691f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f152686a) {
            try {
                f152690e = jSONObject;
                f152688c = true;
                Context contextD = C3657nb.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = K5.f152164b;
                    K5 k5A = J5.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f152690e;
                    if (jSONObject2 == null) {
                        k5A.a("ufids");
                    } else {
                        String strValueOf = String.valueOf(jSONObject2);
                        SharedPreferences.Editor editorEdit = k5A.f152165a.edit();
                        editorEdit.putString("ufids", strValueOf);
                        editorEdit.apply();
                    }
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(contextD).edit();
                    JSONObject jSONObject3 = f152690e;
                    if (jSONObject3 == null) {
                        editorEdit2.remove("InMobi_unifiedId");
                    } else {
                        editorEdit2.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit2.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
