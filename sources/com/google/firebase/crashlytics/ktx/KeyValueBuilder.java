package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        G.p(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, boolean z10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, z10);
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, double d10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, d10);
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, float f10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, f10);
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, int i10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, i10);
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, long j10) {
        G.p(key, "key");
        this.crashlytics.setCustomKey(key, j10);
    }

    @InterfaceC4982o(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @InterfaceC4852c0(expression = "", imports = {}))
    public final void key(@NotNull String key, @NotNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
