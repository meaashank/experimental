package com.google.firebase.crashlytics;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        G.p(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    public final void key(@NotNull String key, boolean z10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, z10);
    }

    public final void key(@NotNull String key, double d10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, d10);
    }

    public final void key(@NotNull String key, float f10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, f10);
    }

    public final void key(@NotNull String key, int i10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, i10);
    }

    public final void key(@NotNull String key, long j10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, j10);
    }

    public final void key(@NotNull String key, @NotNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
