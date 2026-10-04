package com.prism.hider.ui;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.C2589b;

/* JADX INFO: loaded from: classes6.dex */
public class X0 extends C2589b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.P<C4213h0<String>> f168214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.P<Integer> f168215d;

    public X0(@NonNull Application application) {
        super(application);
        this.f168214c = new androidx.lifecycle.P<>(null);
        this.f168215d = new androidx.lifecycle.P<>(null);
    }

    public androidx.lifecycle.K<C4213h0<String>> i() {
        return this.f168214c;
    }

    public androidx.lifecycle.K<Integer> j() {
        return this.f168215d;
    }

    public void k(@NonNull C4213h0<String> c4213h0) {
        this.f168214c.r(c4213h0);
    }

    public void l(int i10) {
        this.f168215d.r(Integer.valueOf(i10));
    }
}
