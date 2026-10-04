package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f157083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f157084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f157085c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f157086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f157087e;

    public b(String str, String str2, int i10, int i11) {
        this.f157083a = str;
        this.f157084b = str2;
        this.f157086d = i10;
        this.f157087e = i11;
    }

    public void a(int i10) {
        this.f157086d = i10;
    }

    public void b(String str) {
        this.f157084b = str;
    }

    public int c() {
        return this.f157086d;
    }

    public String d() {
        return this.f157084b;
    }

    public String a() {
        return this.f157085c;
    }

    public int b() {
        return this.f157087e;
    }

    public void a(String str) {
        this.f157085c = str;
    }
}
