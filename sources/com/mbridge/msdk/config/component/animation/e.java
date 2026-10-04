package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f154163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<e> f154164c;

    public e() {
        this.f154162a = "";
        this.f154163b = new HashMap();
        this.f154164c = new ArrayList();
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.f154163b = map;
    }

    public Map<String, Object> b() {
        return this.f154163b;
    }

    public String c() {
        return this.f154162a;
    }

    public List<e> a() {
        return this.f154164c;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f154164c = list;
    }

    public void a(String str, Object obj) {
        if (this.f154163b == null) {
            this.f154163b = new HashMap();
        }
        this.f154163b.put(str, obj);
    }

    public e(String str) {
        this.f154162a = "";
        this.f154163b = new HashMap();
        this.f154164c = new ArrayList();
        this.f154162a = str;
    }
}
