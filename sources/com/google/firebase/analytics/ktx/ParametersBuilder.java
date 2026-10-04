package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
public final class ParametersBuilder {

    @NotNull
    private final Bundle zza = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.zza;
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void param(@NonNull String key, double d10) {
        G.p(key, "key");
        this.zza.putDouble(key, d10);
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void param(@NonNull String key, long j10) {
        G.p(key, "key");
        this.zza.putLong(key, j10);
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void param(@NonNull String key, @NonNull Bundle value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putBundle(key, value);
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void param(@NonNull String key, @NonNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putString(key, value);
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void param(@NonNull String key, @NonNull Bundle[] value) {
        G.p(key, "key");
        G.p(value, "value");
        this.zza.putParcelableArray(key, value);
    }
}
