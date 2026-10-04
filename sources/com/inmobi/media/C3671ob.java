package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3671ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3671ob f153246a = new C3671ob();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f153247b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f153248c = "dir";

    public static final void a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f153248c = str;
    }

    @dd.o
    public static /* synthetic */ void b() {
    }

    @dd.o
    @e.f0
    @NotNull
    public static final String c() {
        return "10.8.0";
    }

    @Nullable
    public static final String d() {
        return f153248c;
    }

    @dd.o
    public static /* synthetic */ void e() {
    }

    @Nullable
    public static final String f() {
        return f153247b;
    }

    @dd.o
    public static /* synthetic */ void g() {
    }

    public static final void b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f153247b = str;
    }

    @NotNull
    public static final String a() {
        return !TextUtils.isEmpty("") ? "pr-SAND-10.8.0-20241113-" : "pr-SAND-10.8.0-20241113";
    }

    public final boolean b(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        return J5.a(context, "sdk_version_store").f152165a.getBoolean("db_deletion_failed", false);
    }

    @Nullable
    public final String a(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        return J5.a(context, "sdk_version_store").f152165a.getString("sdk_version", null);
    }

    public final void a(@NotNull Context context, @Nullable String str) {
        kotlin.jvm.internal.G.p(context, "context");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        J5.a(context, "sdk_version_store").a("sdk_version", str);
    }

    public final void a(@NotNull Context context, boolean z10) {
        kotlin.jvm.internal.G.p(context, "context");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        J5.a(context, "sdk_version_store").a("db_deletion_failed", z10);
    }
}
