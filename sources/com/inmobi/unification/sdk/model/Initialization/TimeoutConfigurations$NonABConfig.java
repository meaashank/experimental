package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C3602jc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$NonABConfig {

    @NotNull
    private TimeoutConfigurations$AdNonABConfig audio;

    @NotNull
    private TimeoutConfigurations$AdNonABConfig banner;

    /* JADX INFO: renamed from: int, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdNonABConfig f4int;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdNonABConfig f5native;

    public TimeoutConfigurations$NonABConfig() {
        C3602jc.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdNonABConfig(C3602jc.defaultNonABBannerloadTimeout, C3602jc.defaultNonABBannerMuttTimeout, C3602jc.defaultNonABBannerRetryInterval, C3602jc.defaultNonABBannerMaxRetries);
        this.f4int = new TimeoutConfigurations$AdNonABConfig(C3602jc.defaultNonABIntloadTimeout, C3602jc.defaultNonABIntMuttTimeout, C3602jc.defaultNonABIntRetryInterval, C3602jc.defaultNonABIntMaxRetries);
        this.f5native = new TimeoutConfigurations$AdNonABConfig(C3602jc.defaultNonABNativeloadTimeout, C3602jc.defaultNonABNativeMuttTimeout, C3602jc.defaultNonABNativeRetryInterval, C3602jc.defaultNonABNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdNonABConfig(C3602jc.defaultNonABAudioloadTimeout, C3602jc.defaultNonABAudioMuttTimeout, C3602jc.defaultNonABAudioRetryInterval, C3602jc.defaultNonABAudioMaxRetries);
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getInterstitial() {
        return this.f4int;
    }

    @NotNull
    public final TimeoutConfigurations$AdNonABConfig getNative() {
        return this.f5native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f4int.isValid() && this.f5native.isValid() && this.audio.isValid();
    }
}
