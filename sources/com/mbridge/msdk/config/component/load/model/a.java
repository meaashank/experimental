package com.mbridge.msdk.config.component.load.model;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154625a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154627c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f154631g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f154626b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f154628d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f154629e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f154632h = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                this.f154625a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("191"));
            if (obj2 != null) {
                try {
                    float f10 = Float.parseFloat(String.valueOf(obj2));
                    if (f10 <= 0.0f || f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    this.f154626b = f10;
                } catch (Throwable th) {
                    q0.b("DownloadModel", th.getMessage());
                    this.f154626b = 1.0f;
                }
            }
            Object obj3 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj3 != null) {
                this.f154627c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.c("162"));
            if (obj4 != null) {
                try {
                    int i10 = Integer.parseInt(String.valueOf(obj4));
                    if (i10 == 0) {
                        i10 = 30;
                    }
                    this.f154628d = i10;
                } catch (Throwable th2) {
                    q0.b("DownloadModel", th2.getMessage());
                    this.f154628d = 30;
                }
            }
            Object obj5 = map.get(c.c("174"));
            if (obj5 != null) {
                try {
                    this.f154629e = Integer.parseInt(String.valueOf(obj5));
                } catch (Throwable th3) {
                    q0.b("DownloadModel", th3.getMessage());
                    this.f154629e = 0;
                }
            }
            Object obj6 = map.get(c.c("192"));
            if (obj6 != null) {
                try {
                    this.f154630f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th4) {
                    q0.b("DownloadModel", th4.getMessage());
                    this.f154630f = 15;
                }
            }
            Object obj7 = map.get(c.c("201"));
            if (obj7 != null) {
                this.f154631g = String.valueOf(obj7);
            } else {
                try {
                    URL url = new URL(f());
                    this.f154631g = url.getProtocol() + "://" + url.getHost() + url.getPath();
                } catch (Throwable th5) {
                    q0.b("DownloadModel", th5.getMessage());
                }
            }
            Object obj8 = map.get(c.c("202"));
            if (obj8 != null) {
                this.f154632h = String.valueOf(obj8);
            }
        }
    }

    public String b() {
        return this.f154631g;
    }

    public String c() {
        return this.f154627c;
    }

    public float d() {
        return this.f154626b;
    }

    public int e() {
        return this.f154630f;
    }

    public String f() {
        return this.f154625a;
    }

    public int g() {
        return this.f154629e;
    }

    public int h() {
        return this.f154628d * 1000;
    }

    public String a() {
        return this.f154632h;
    }
}
