package com.mbridge.msdk.setting;

import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f158405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f158406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f158407g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f158401a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f158402b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f158403c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f158404d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f158408h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e11) {
            e10 = e11;
            aVar = null;
        }
        try {
            aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f156489h));
            aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f156493l));
            aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f156497p));
            aVar.f(jSONObject.optInt("type", 0));
            aVar.a(jSONObject.optInt("batch_size", 1));
            aVar.c(jSONObject.optInt(x.h.f238399b, 0));
            aVar.b(jSONObject.optInt("disable", 0));
            aVar.d(jSONObject.optInt("e_t_l", 0));
            return aVar;
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
            return aVar;
        }
    }

    public int b() {
        return this.f158402b;
    }

    public int c() {
        return this.f158403c;
    }

    public int d() {
        return this.f158404d;
    }

    public String e() {
        return this.f158405e;
    }

    public String f() {
        return this.f158406f;
    }

    public int g() {
        return this.f158407g;
    }

    public int h() {
        return this.f158408h;
    }

    public void b(int i10) {
        this.f158402b = i10;
    }

    public void c(int i10) {
        this.f158403c = i10;
    }

    public void d(int i10) {
        this.f158404d = i10;
    }

    public void e(int i10) {
        this.f158407g = i10;
    }

    public void f(int i10) {
        this.f158408h = i10;
    }

    public void b(String str) {
        this.f158405e = str;
    }

    public void c(String str) {
        this.f158406f = str;
    }

    public int a() {
        return this.f158401a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f158401a = i10;
    }
}
