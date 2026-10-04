package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f154457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f154458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f154459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f154460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f154461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Object> f154462f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("159"));
            Map<String, Object> mapB = obj3 instanceof Map ? (Map) obj3 : obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b() : null;
            b(mapB);
            if (mapB != null && !mapB.isEmpty()) {
                c(String.valueOf(mapB.get(c.c("160"))));
            }
            Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f154459c = str;
    }

    public void c(String str) {
        this.f154460d = str;
    }

    public void d(String str) {
        this.f154458b = str;
    }

    public String e() {
        return this.f154460d;
    }

    public String f() {
        return this.f154458b;
    }

    public Map<String, Object> b() {
        return this.f154462f;
    }

    public String c() {
        return this.f154461e;
    }

    public String d() {
        return this.f154459c;
    }

    public void b(Map<String, Object> map) {
        this.f154462f = map;
    }

    public Context a() {
        return this.f154457a;
    }

    public void a(Context context) {
        this.f154457a = context;
    }

    public void a(String str) {
        this.f154461e = str;
    }
}
