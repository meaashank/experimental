package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.prism.gaia.server.content.e;
import com.prism.remoteconfig.firebase.FirebaseRemoteConfigs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f161593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f161594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f161595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f161596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f161597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f161598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f161599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f161600h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f161602j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f161601i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f161603k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f161604l = "";

    public String a() {
        return this.f161602j;
    }

    public void b(String str) {
        this.f161602j = str;
    }

    public void c(String str) {
        this.f161604l = str;
    }

    public void d(String str) {
        this.f161603k = str;
    }

    public void e(long j10) {
        this.f161596d = j10;
    }

    public String f() {
        return this.f161604l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f161594b;
    }

    public long h() {
        return this.f161596d * 1000;
    }

    public long i() {
        return this.f161599g;
    }

    public String j() {
        return this.f161603k;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f161593a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f161593a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f161594b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f161594b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put(RewardPlus.AMOUNT, value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f161595c);
            jSONObject.put("ruct", this.f161596d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f161597e);
            jSONObject.put("dlct", this.f161598f);
            jSONObject.put("vcct", this.f161599g);
            jSONObject.put("current_time", this.f161600h);
            jSONObject.put("vtag", this.f161603k);
            jSONObject.put("isDefault", this.f161601i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j10) {
        this.f161600h = j10;
    }

    public void b(long j10) {
        this.f161598f = j10;
    }

    public void c(long j10) {
        this.f161595c = j10;
    }

    public long d() {
        return this.f161595c * 1000;
    }

    public long e() {
        return this.f161597e * 1000;
    }

    public void f(long j10) {
        this.f161599g = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f161593a = map;
    }

    public long b() {
        return this.f161600h;
    }

    public long c() {
        return this.f161598f;
    }

    public void d(long j10) {
        this.f161597e = j10;
    }

    public void a(int i10) {
        this.f161601i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f161594b = map;
    }

    public static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                aVar.b(jSONObject.optString("ab_id", ""));
                aVar.c(jSONObject.optString("rid", ""));
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                map.put(next, 1000);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    aVar.a(map);
                }
                aVar.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                aVar.c(jSONObject.optLong("getpf", FirebaseRemoteConfigs.f194124c));
                aVar.e(jSONObject.optLong("ruct", 5400L));
                aVar.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, e.f167098H));
                aVar.b(jSONObject.optLong("dlct", e.f167098H));
                aVar.f(jSONObject.optLong("vcct", 5L));
                aVar.a(jSONObject.optLong("current_time"));
                aVar.d(jSONObject.optString("vtag", ""));
                return aVar;
            } catch (Exception e11) {
                e = e11;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
