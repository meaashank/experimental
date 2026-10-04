package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ParametersBuilder {

    @NotNull
    private final Bundle zza = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(@NonNull String key, double d10) {
        G.p(key, "key");
        this.zza.putDouble(key, d10);
    }

    public final void param(@NonNull String key, long j10) {
        G.p(key, "key");
        this.zza.putLong(key, j10);
    }

    public final void param(@NonNull String key, @NonNull Bundle value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putBundle(key, value);
    }

    public final void param(@NonNull String key, @NonNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putString(key, value);
    }

    public final void param(@NonNull String key, @NonNull Bundle[] value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
