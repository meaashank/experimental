package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class E9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K5 f151907a;

    public E9(@NotNull Context context, @NotNull String sharePrefFile) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        this.f151907a = J5.a(context, sharePrefFile);
    }

    public final void a(@NotNull String key, @NotNull String value) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        this.f151907a.a(key, value);
    }

    public final void b(@NotNull String key, @NotNull String value) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        this.f151907a.a(key, value);
        a(System.currentTimeMillis() / ((long) 1000));
    }

    @e.g0
    public final boolean c(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        return this.f151907a.a(key);
    }

    public final void a(@NotNull String key, boolean z10) {
        kotlin.jvm.internal.G.p(key, "key");
        this.f151907a.a(key, z10);
    }

    @e.g0
    @Nullable
    public final String a(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        K5 k52 = this.f151907a;
        k52.getClass();
        return k52.f152165a.getString(key, null);
    }

    @e.g0
    public final long b() {
        K5 k52 = this.f151907a;
        k52.getClass();
        return k52.f152165a.getLong("last_ts", 0L);
    }

    public final void a(long j10) {
        this.f151907a.a("last_ts", j10);
    }

    @e.g0
    public final boolean b(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        K5 k52 = this.f151907a;
        k52.getClass();
        return k52.f152165a.contains(key);
    }

    @e.g0
    public final void a() {
        this.f151907a.b();
    }
}
