package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class K5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f152164b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f152165a;

    public K5(Context context, String str) {
        this.f152165a = context.getSharedPreferences(str, 0);
    }

    @dd.o
    @NotNull
    public static final K5 a(@NotNull Context context, @NotNull String str) {
        return J5.a(context, str);
    }

    public final void b() {
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.G.p(key, "key");
        if (!this.f152165a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public final void a(String key, String str) {
        kotlin.jvm.internal.G.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.putString(key, str);
        editorEdit.apply();
    }

    public final void a(String key, int i10) {
        kotlin.jvm.internal.G.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.putInt(key, i10);
        editorEdit.apply();
    }

    public final void a(String key, long j10) {
        kotlin.jvm.internal.G.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.putLong(key, j10);
        editorEdit.apply();
    }

    public final void a(String key, boolean z10) {
        kotlin.jvm.internal.G.p(key, "key");
        SharedPreferences.Editor editorEdit = this.f152165a.edit();
        editorEdit.putBoolean(key, z10);
        editorEdit.apply();
    }
}
