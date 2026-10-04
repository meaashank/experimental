package com.prism.commons.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f162065a;

    public interface a {
        String a(Context context);
    }

    public V(final String str) {
        this.f162065a = new a() { // from class: com.prism.commons.utils.U
            @Override // com.prism.commons.utils.V.a
            public final String a(Context context) {
                return str;
            }
        };
    }

    public static /* synthetic */ String a(String str, Context context) {
        return str;
    }

    public boolean b(Context context, String str) {
        return f(context).contains(str);
    }

    public boolean c(Context context, String str, boolean z10) {
        return f(context).getBoolean(str, z10);
    }

    public int d(Context context, String str, int i10) {
        return f(context).getInt(str, i10);
    }

    public long e(Context context, String str, long j10) {
        return f(context).getLong(str, j10);
    }

    public SharedPreferences f(Context context) {
        return context.getSharedPreferences(this.f162065a.a(context), 0);
    }

    public String g(Context context, String str, String str2) {
        return f(context).getString(str, str2);
    }

    public Set<String> h(Context context, String str, Set<String> set) {
        return f(context).getStringSet(str, set);
    }

    public void i(Context context, String str) {
        f(context).edit().remove(str).apply();
    }

    public void j(Context context, String str, boolean z10) {
        f(context).edit().putBoolean(str, z10).apply();
    }

    public void k(Context context, String str, int i10) {
        f(context).edit().putInt(str, i10).apply();
    }

    public void l(Context context, String str, long j10) {
        f(context).edit().putLong(str, j10).apply();
    }

    public void m(Context context, String str, String str2) {
        f(context).edit().putString(str, str2).apply();
    }

    public void n(Context context, String str, Set<String> set) {
        f(context).edit().remove(str).apply();
        f(context).edit().putStringSet(str, set).apply();
    }

    public V(a aVar) {
        this.f162065a = aVar;
    }
}
