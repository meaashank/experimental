package com.mbridge.msdk.config.component.trans.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154843a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get(c.c("118"))) == null) {
            return;
        }
        a(String.valueOf(obj));
    }

    public String a() {
        return this.f154843a;
    }

    public void a(String str) {
        this.f154843a = str;
    }
}
