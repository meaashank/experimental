package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C3602jc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$ABConfig {

    @NotNull
    private TimeoutConfigurations$AdABConfig audio;

    @NotNull
    private TimeoutConfigurations$AdABConfig banner;

    /* JADX INFO: renamed from: int, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdABConfig f2int;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdABConfig f3native;

    public TimeoutConfigurations$ABConfig() {
        C3602jc.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdABConfig(C3602jc.defaultABBannerloadTimeout, C3602jc.defaultABBannerRetryInterval, C3602jc.defaultABBannerMaxRetries);
        this.f2int = new TimeoutConfigurations$AdABConfig(C3602jc.defaultABIntloadTimeout, C3602jc.defaultABIntRetryInterval, C3602jc.defaultABIntMaxRetries);
        this.f3native = new TimeoutConfigurations$AdABConfig(C3602jc.defaultABNativeloadTimeout, C3602jc.defaultABNativeRetryInterval, C3602jc.defaultABNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdABConfig(C3602jc.defaultABAudioloadTimeout, C3602jc.defaultABAudioRetryInterval, C3602jc.defaultABAudioMaxRetries);
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getInterstitial() {
        return this.f2int;
    }

    @NotNull
    public final TimeoutConfigurations$AdABConfig getNative() {
        return this.f3native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f2int.isValid() && this.f3native.isValid() && this.audio.isValid();
    }
}
