package com.prism.hider.vault.commons;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f173571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f173572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f173573d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f173574e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f173575f = false;

    public p(Context context, boolean z10) {
        this.f173570a = context;
        this.f173571b = z10;
    }

    public Context a() {
        return this.f173570a;
    }

    public String b() {
        return this.f173570a.getPackageName();
    }

    public y c() {
        return this.f173572c;
    }

    public boolean d() {
        return this.f173573d;
    }

    public boolean e() {
        return this.f173574e;
    }

    public boolean f() {
        return this.f173575f;
    }

    public boolean g() {
        return this.f173571b;
    }

    public p h(boolean z10) {
        this.f173573d = z10;
        return this;
    }

    public p i(boolean z10) {
        this.f173574e = z10;
        return this;
    }

    public p j(boolean z10) {
        this.f173575f = z10;
        return this;
    }

    public p k(y yVar) {
        this.f173572c = yVar;
        return this;
    }
}
