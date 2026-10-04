package com.mbridge.msdk.splash.request;

import androidx.activity.C1477d;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f158864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f158865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f158866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f158867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f158868e;

    public void a(String str) {
        this.f158865b = str;
    }

    public int b() {
        return this.f158867d;
    }

    public int c() {
        return this.f158866c;
    }

    public int d() {
        return this.f158864a;
    }

    public String e() {
        return this.f158865b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f158864a);
        sb2.append(", session_id='");
        sb2.append(this.f158865b);
        sb2.append("', offset=");
        sb2.append(this.f158866c);
        sb2.append(", expectWidth=");
        sb2.append(this.f158867d);
        sb2.append(", expectHeight=");
        return C1477d.a(sb2, this.f158868e, '}');
    }

    public int a() {
        return this.f158868e;
    }

    public void b(int i10) {
        this.f158867d = i10;
    }

    public void c(int i10) {
        this.f158866c = i10;
    }

    public void d(int i10) {
        this.f158864a = i10;
    }

    public void a(int i10) {
        this.f158868e = i10;
    }
}
