package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.e;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f154635a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154636b = 15000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154637c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f154638d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f154639e = 50;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154640f = 50;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154641g = 604800000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f154642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f154643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f154644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f154645k;

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String strA = e.a("181", map);
                if (!TextUtils.isEmpty(strA) && !"null".equalsIgnoreCase(strA)) {
                    try {
                        this.f154635a = Integer.parseInt(strA);
                    } catch (Exception e10) {
                        q0.b("LogSenderModel", e10.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String strA2 = e.a("162", map);
                if (!TextUtils.isEmpty(strA2) && !"null".equalsIgnoreCase(strA2)) {
                    try {
                        this.f154636b = Integer.parseInt(strA2) * 1000;
                    } catch (Exception e11) {
                        q0.b("LogSenderModel", e11.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String strA3 = e.a("182", map);
                if (!TextUtils.isEmpty(strA3) && !"null".equalsIgnoreCase(strA3)) {
                    try {
                        this.f154637c = Integer.parseInt(strA3);
                    } catch (Exception e12) {
                        q0.b("LogSenderModel", e12.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String strA4 = e.a("183", map);
                if (!TextUtils.isEmpty(strA4) && !"null".equalsIgnoreCase(strA4)) {
                    try {
                        this.f154638d = Integer.parseInt(strA4);
                    } catch (Exception e13) {
                        q0.b("LogSenderModel", e13.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String strA5 = e.a("174", map);
                if (!TextUtils.isEmpty(strA5) && !"null".equalsIgnoreCase(strA5)) {
                    try {
                        this.f154639e = Integer.parseInt(strA5);
                    } catch (Exception e14) {
                        q0.b("LogSenderModel", e14.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String strA6 = e.a("184", map);
                if (!TextUtils.isEmpty(strA6) && !"null".equalsIgnoreCase(strA6)) {
                    try {
                        this.f154640f = Integer.parseInt(strA6);
                    } catch (Exception e15) {
                        q0.b("LogSenderModel", e15.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String strA7 = e.a("185", map);
                if (!TextUtils.isEmpty(strA7) && !"null".equalsIgnoreCase(strA7)) {
                    try {
                        this.f154641g = Integer.parseInt(strA7) * 1000;
                    } catch (Exception e16) {
                        q0.b("LogSenderModel", e16.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String strA8 = e.a("178", map);
                if (!TextUtils.isEmpty(strA8) && !"null".equalsIgnoreCase(strA8)) {
                    try {
                        this.f154642h = Integer.parseInt(strA8);
                    } catch (Exception e17) {
                        q0.b("LogSenderModel", e17.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.f154643i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f154643i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.f154644j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f154644j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.f154645k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f154645k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.f154636b;
    }

    public String c() {
        Map<String, Object> map = this.f154643i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String strA = e.a("116", this.f154643i);
        return (TextUtils.isEmpty(strA) || "null".equalsIgnoreCase(strA)) ? "" : strA;
    }

    public int d() {
        return this.f154640f;
    }

    public int e() {
        return this.f154642h;
    }

    public int f() {
        Map<String, Object> map = this.f154643i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f154639e;
    }

    public Map<String, Object> h() {
        return this.f154645k;
    }

    public String i() {
        Map<String, Object> map = this.f154644j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String strA = e.a("114", this.f154644j);
        return (TextUtils.isEmpty(strA) || "null".equalsIgnoreCase(strA)) ? "" : strA;
    }

    public int j() {
        Map<String, Object> map = this.f154644j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String strA = e.a("172", this.f154644j);
        if (TextUtils.isEmpty(strA) || "null".equals(strA)) {
            return 9377;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception e10) {
            q0.b("LogSenderModel", e10.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.f154641g;
    }

    public int a() {
        return this.f154635a;
    }
}
