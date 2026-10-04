package com.prism.gaia.helper.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f165223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f165224b;

    public w(Context context, String str) {
        this.f165223a = context;
        this.f165224b = str;
    }

    public boolean a(String str, boolean z10) {
        return d().getBoolean(str, z10);
    }

    public int b(String str, int i10) {
        return d().getInt(str, i10);
    }

    public long c(String str, long j10) {
        return d().getLong(str, j10);
    }

    public SharedPreferences d() {
        return this.f165223a.getSharedPreferences(this.f165224b, 0);
    }

    public String e(String str, @Nullable String str2) {
        return d().getString(str, str2);
    }

    public void f(String str, boolean z10) {
        d().edit().putBoolean(str, z10).apply();
    }

    public void g(String str, int i10) {
        d().edit().putInt(str, i10).apply();
    }

    public void h(String str, long j10) {
        d().edit().putLong(str, j10).apply();
    }

    public void i(String str, @Nullable String str2) {
        d().edit().putString(str, str2).apply();
    }
}
