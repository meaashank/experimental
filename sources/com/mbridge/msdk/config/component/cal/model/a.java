package com.mbridge.msdk.config.component.cal.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.e;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f154210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f154211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f154214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f154215h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj != null) {
                this.f154208a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("106"));
            if (obj2 != null) {
                this.f154209b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.c("103"));
            if (obj3 instanceof Map) {
                this.f154210c = (Map) obj3;
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f154210c = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
            }
            Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_IO_ERROR));
            if (obj4 != null) {
                this.f154211d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.c("102"));
            if (obj5 != null) {
                this.f154212e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.c("104"));
            if (obj6 instanceof String) {
                this.f154213f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f154213f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.c("115"));
            if (obj7 instanceof String) {
                this.f154214g = String.valueOf(obj7);
            }
            String strA = e.a("init_status", map);
            if (strA.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(strA));
            }
        }
    }

    public String b() {
        return this.f154208a;
    }

    public String c() {
        return this.f154212e;
    }

    public int d() {
        return this.f154215h;
    }

    public int e() {
        return this.f154213f;
    }

    public Map<String, Object> f() {
        return this.f154210c;
    }

    public String g() {
        return this.f154209b;
    }

    public String a() {
        return this.f154214g;
    }

    public void a(int i10) {
        this.f154215h = i10;
    }
}
