package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f154409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f154410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f154411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f154412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154413f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154414g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f154415h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f154416i;

    public a(Map<String, Object> map) {
        a(map);
        g();
    }

    private void g() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f154413f, this.f154414g, this.f154415h);
        this.f154416i = aVar;
        aVar.e();
        this.f154416i.c();
        this.f154416i.d();
    }

    public List<String> a() {
        return this.f154412e;
    }

    public List<String> b() {
        return this.f154411d;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapC = this.f154416i.c();
        Map<String, Object> mapD = this.f154416i.d();
        HashMap map = new HashMap();
        map.putAll(mapC);
        map.putAll(mapD);
        return map;
    }

    public List<String> d() {
        return this.f154409b;
    }

    public List<String> e() {
        return this.f154410c;
    }

    public String f() {
        return this.f154408a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("138"));
            if (obj != null) {
                this.f154408a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("199"));
            if (obj instanceof List) {
                this.f154409b = (List) obj2;
            }
            Object obj3 = map.get(c.c("140"));
            if (obj3 instanceof List) {
                this.f154410c = (List) obj3;
            }
            Object obj4 = map.get(c.c("196"));
            if (obj4 instanceof List) {
                this.f154411d = (List) obj4;
            }
            Object obj5 = map.get(c.c("197"));
            if (obj5 instanceof List) {
                this.f154412e = (List) obj5;
            }
            Object obj6 = map.get(c.c("139"));
            if (obj6 != null) {
                try {
                    this.f154413f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th) {
                    q0.b("DeviceModel", th.getMessage());
                }
            }
            Object obj7 = map.get(c.c("194"));
            if (obj7 != null) {
                try {
                    this.f154414g = Integer.parseInt(String.valueOf(obj7));
                } catch (Throwable th2) {
                    q0.b("DeviceModel", th2.getMessage());
                }
            }
            Object obj8 = map.get(c.c("195"));
            if (obj8 != null) {
                try {
                    this.f154415h = Integer.parseInt(String.valueOf(obj8));
                } catch (Throwable th3) {
                    q0.b("DeviceModel", th3.getMessage());
                }
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f154416i.a(str);
    }
}
