package com.mbridge.msdk.config.component.midi.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154664b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f154666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f154667e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f154669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f154670h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CusPlayerView f154672j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154665c = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154668f = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f154671i = 1;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.c("116"));
                if (obj != null) {
                    String strValueOf = String.valueOf(obj);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        f(strValueOf);
                    }
                }
                Object obj2 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    String strValueOf2 = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        a(strValueOf2);
                    }
                }
                Object obj3 = map.get(c.c("122"));
                if (obj3 != null) {
                    String strValueOf3 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        c(strValueOf3);
                    }
                }
                Object obj4 = map.get(c.c("123"));
                if (obj4 != null) {
                    String strValueOf4 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        d(strValueOf4);
                    }
                }
                Object obj5 = map.get(c.c("124"));
                if (obj5 != null) {
                    b(String.valueOf(obj5));
                }
                Object obj6 = map.get(c.c("200"));
                if (obj6 != null) {
                    String strValueOf5 = String.valueOf(obj6);
                    if (TextUtils.isEmpty(strValueOf5)) {
                        return;
                    }
                    e(strValueOf5);
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.containsKey(c.c("162"))) {
                    Object obj = map.get(c.c("162"));
                    Map<String, Object> mapB = obj instanceof Map ? (Map) obj : obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b() : null;
                    if (mapB == null || mapB.isEmpty()) {
                        return;
                    }
                    Object obj2 = mapB.get("playTimeout");
                    if (obj2 instanceof String) {
                        try {
                            b(Integer.parseInt(obj2.toString()) * 1000);
                        } catch (Throwable th) {
                            q0.b("PlayerModel", th.getMessage());
                        }
                    } else if (obj2 instanceof Integer) {
                        b(((Integer) obj2).intValue() * 1000);
                    }
                    Object obj3 = mapB.get("bufferTimeout");
                    if (!(obj3 instanceof String)) {
                        if (obj3 instanceof Integer) {
                            a(((Integer) obj3).intValue() * 1000);
                        }
                    } else {
                        try {
                            a(Integer.parseInt(obj3.toString()) * 1000);
                        } catch (Throwable th2) {
                            q0.b("PlayerModel", th2.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("PlayerModel", e10.getMessage(), e10);
            }
        }
    }

    public void c(String str) {
        this.f154665c = str;
    }

    public CusPlayerView d() {
        return this.f154672j;
    }

    public String e() {
        return this.f154670h;
    }

    public void f(String str) {
        this.f154663a = str;
    }

    public int g() {
        return this.f154668f;
    }

    public String h() {
        return this.f154669g;
    }

    public int i() {
        return this.f154671i;
    }

    public String j() {
        return this.f154663a;
    }

    public int c() {
        return this.f154666d;
    }

    public void d(String str) {
        this.f154669g = str;
    }

    public void e(String str) {
        try {
            this.f154671i = Integer.parseInt(str);
        } catch (Throwable th) {
            q0.b("PlayerModel", th.getMessage());
        }
    }

    public String f() {
        return this.f154665c;
    }

    public String b() {
        return this.f154664b;
    }

    public void b(String str) {
        this.f154670h = str;
    }

    public void b(int i10) {
        this.f154668f = i10;
    }

    public void a(CusPlayerView cusPlayerView) {
        this.f154672j = cusPlayerView;
    }

    public void a(String str) {
        this.f154664b = str;
    }

    public int a() {
        return this.f154667e;
    }

    public void a(int i10) {
        this.f154667e = i10;
    }
}
