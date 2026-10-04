package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f154404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154406c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.c("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f154405b;
    }

    public Object c() {
        return this.f154404a;
    }

    public void b(String str) {
        this.f154405b = str;
    }

    public void a(Object obj) {
        this.f154404a = obj;
    }

    public String a() {
        return this.f154406c;
    }

    public void a(String str) {
        this.f154406c = str;
    }
}
