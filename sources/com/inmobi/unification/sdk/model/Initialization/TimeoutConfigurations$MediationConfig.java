package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$MediationConfig {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @NotNull
    private TimeoutConfigurations$ABConfig f153699ab = new TimeoutConfigurations$ABConfig();

    @NotNull
    private TimeoutConfigurations$NonABConfig nonAb = new TimeoutConfigurations$NonABConfig();

    @NotNull
    private TimeoutConfigurations$PreloadConfig preload = new TimeoutConfigurations$PreloadConfig();

    @NotNull
    public final TimeoutConfigurations$ABConfig getABConfig() {
        return this.f153699ab;
    }

    @NotNull
    public final TimeoutConfigurations$NonABConfig getNonABConfig() {
        return this.nonAb;
    }

    @NotNull
    public final TimeoutConfigurations$PreloadConfig getPreloadConfig() {
        return this.preload;
    }

    public final boolean isValid() {
        return this.f153699ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
    }
}
