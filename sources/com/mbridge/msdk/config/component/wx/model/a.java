package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f154898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f154901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154903f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("145"));
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("147"));
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("148"));
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(c.c("193"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get(c.c("146"));
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f154898a;
    }

    public String c() {
        return this.f154900c;
    }

    public String d() {
        return this.f154901d;
    }

    public String e() {
        return this.f154899b;
    }

    public void b(String str) {
        this.f154903f = str;
    }

    public void c(String str) {
        this.f154900c = str;
    }

    public void d(String str) {
        this.f154901d = str;
    }

    public void e(String str) {
        this.f154899b = str;
    }

    public void a(Context context) {
        this.f154898a = context;
    }

    public String a() {
        return this.f154902e;
    }

    public void a(String str) {
        this.f154902e = str;
    }
}
