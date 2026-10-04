package com.prism.fusionadsdk.internal.activity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class NativeIntersitialActivityParams implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f162253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f162254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f162255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f162256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f162257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f162258f;

    public NativeIntersitialActivityParams(String str, String str2, int i10, boolean z10, boolean z11) {
        this.f162258f = true;
        this.f162253a = str;
        this.f162254b = str2;
        this.f162255c = i10;
        this.f162256d = z10;
        this.f162257e = z11;
    }

    public NativeIntersitialActivityParams(String str, int i10, boolean z10, boolean z11) {
        this.f162258f = true;
        this.f162253a = str;
        this.f162255c = i10;
        this.f162256d = z10;
        this.f162257e = z11;
    }

    public NativeIntersitialActivityParams(String str, String str2, int i10) {
        this.f162256d = true;
        this.f162257e = false;
        this.f162258f = true;
        this.f162253a = str;
        this.f162254b = str2;
        this.f162255c = i10;
    }

    public NativeIntersitialActivityParams(String str, int i10) {
        this.f162256d = true;
        this.f162257e = false;
        this.f162258f = true;
        this.f162253a = str;
        this.f162255c = i10;
    }

    private NativeIntersitialActivityParams() {
        this.f162256d = true;
        this.f162257e = false;
        this.f162258f = true;
    }
}
