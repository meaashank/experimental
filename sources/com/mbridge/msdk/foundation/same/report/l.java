package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.commons.utils.C3843g;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f156581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f156582b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f156583a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f156584b;

        public b(String str) {
            this.f156584b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f156582b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", this.f156582b);
            a(this.f156581a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("SameCommonReporter", th.getMessage());
        }
    }

    private l(b bVar) {
        this.f156582b = bVar.f156584b;
        this.f156581a = bVar.f156583a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, C3843g.f162098b);
        } catch (Exception unused) {
            return str;
        }
    }
}
