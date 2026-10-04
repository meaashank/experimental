package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f158578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f158579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f158580h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f158573a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f158574b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f158575c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f158576d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f158577e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f158581i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            dVar = new d();
        } catch (Exception e11) {
            e10 = e11;
            dVar = null;
        }
        try {
            dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f156486f));
            dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f156492k));
            dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f156496o));
            dVar.d(jSONObject.optInt("type", 1));
            dVar.b(jSONObject.optInt("d_t", 30));
            dVar.a(jSONObject.optInt("d_a", 0));
            return dVar;
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
            return dVar;
        }
    }

    public int b() {
        return this.f158576d;
    }

    public String c() {
        return this.f158578f;
    }

    public String d() {
        return this.f158579g;
    }

    public int e() {
        return this.f158580h;
    }

    public void b(int i10) {
        this.f158576d = i10;
    }

    public void c(String str) {
        this.f158579g = str;
    }

    public void d(int i10) {
        this.f158581i = i10;
    }

    public void b(String str) {
        this.f158578f = str;
    }

    public void c(int i10) {
        this.f158580h = i10;
    }

    public int a() {
        return this.f158575c;
    }

    public void a(int i10) {
        this.f158575c = i10;
    }
}
