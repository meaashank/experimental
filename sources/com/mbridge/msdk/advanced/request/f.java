package com.mbridge.msdk.advanced.request;

import androidx.activity.C1477d;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f153902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f153903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f153904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f153905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f153906e;

    public void a(String str) {
        this.f153903b = str;
    }

    public int b() {
        return this.f153905d;
    }

    public int c() {
        return this.f153904c;
    }

    public int d() {
        return this.f153902a;
    }

    public String e() {
        return this.f153903b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeAdvancedV3ParamsEntity{reqType=");
        sb2.append(this.f153902a);
        sb2.append(", session_id='");
        sb2.append(this.f153903b);
        sb2.append("', offset=");
        sb2.append(this.f153904c);
        sb2.append(", expectWidth=");
        sb2.append(this.f153905d);
        sb2.append(", expectHeight=");
        return C1477d.a(sb2, this.f153906e, '}');
    }

    public int a() {
        return this.f153906e;
    }

    public void b(int i10) {
        this.f153905d = i10;
    }

    public void c(int i10) {
        this.f153904c = i10;
    }

    public void d(int i10) {
        this.f153902a = i10;
    }

    public void a(int i10) {
        this.f153906e = i10;
    }
}
