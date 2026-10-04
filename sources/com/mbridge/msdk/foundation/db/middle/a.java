package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f156051a = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f156052b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f156053c = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f156054d = new JSONArray();

    private a() {
        c();
    }

    public static a b() {
        if (f156052b == null) {
            synchronized (a.class) {
                try {
                    if (f156052b == null) {
                        f156052b = new a();
                    }
                } finally {
                }
            }
        }
        return f156052b;
    }

    private void c() {
        try {
            String str = (String) y0.a(c.n().d(), f156053c, f156054d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f156054d = new JSONArray(str);
        } catch (Exception e10) {
            q0.b(f156051a, e10.getMessage());
        }
    }

    private void d() {
        try {
            if (f156054d != null) {
                y0.b(c.n().d(), f156053c, f156054d.toString());
            }
        } catch (Exception e10) {
            q0.b(f156051a, e10.getMessage());
        }
    }

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f156054d == null) {
            f156054d = new JSONArray();
        }
        f156054d.put(jSONObjectA);
        d();
    }

    public void a(String str) {
        if (f156054d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f156054d.length(); i10++) {
                try {
                    JSONObject jSONObject = f156054d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    q0.b(f156051a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f156054d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f156054d != null) {
            for (int i10 = 0; i10 < f156054d.length(); i10++) {
                try {
                    JSONObject jSONObject = f156054d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    q0.b(f156051a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) {
        if (f156054d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f156054d.length(); i10++) {
                try {
                    JSONObject jSONObject = f156054d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt(CampaignEx.JSON_KEY_ST_TS) >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    q0.b(f156051a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f156054d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
            jSONObject = null;
        }
        try {
            jSONObject.put("id", str);
            jSONObject.put("fc_a", i10);
            jSONObject.put("fc_b", i11);
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, j10);
            jSONObject.put("impression_count", i12);
            jSONObject.put("click_count", i13);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            q0.b(f156051a, e.getMessage());
            return jSONObject;
        }
    }
}
