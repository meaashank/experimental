package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C3602jc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$PreloadConfig {

    @NotNull
    private TimeoutConfigurations$AdPreloadConfig audio;

    @NotNull
    private TimeoutConfigurations$AdPreloadConfig banner;

    /* JADX INFO: renamed from: int, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdPreloadConfig f6int;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @NotNull
    private TimeoutConfigurations$AdPreloadConfig f7native;

    public TimeoutConfigurations$PreloadConfig() {
        C3602jc.Companion.getClass();
        this.banner = new TimeoutConfigurations$AdPreloadConfig(C3602jc.defaultPreloadBannerPreloadTimeout, C3602jc.defaultPreloadBannerMuttTimeout, C3602jc.defaultPreloadBannerLoadTimeout, C3602jc.defaultPreloadBannerRetryInterval, C3602jc.defaultPreloadBannerMaxRetries);
        this.f6int = new TimeoutConfigurations$AdPreloadConfig(C3602jc.defaultPreloadIntPreloadTimeout, C3602jc.defaultPreloadIntMuttTimeout, C3602jc.defaultPreloadIntloadTimeout, C3602jc.defaultPreloadIntRetryInterval, C3602jc.defaultPreloadIntMaxRetries);
        this.f7native = new TimeoutConfigurations$AdPreloadConfig(C3602jc.defaultPreloadNativePreloadTimeout, C3602jc.defaultPreloadNativeMuttTimeout, C3602jc.defaultPreloadNativeloadTimeout, C3602jc.defaultPreloadNativeRetryInterval, C3602jc.defaultPreloadNativeMaxRetries);
        this.audio = new TimeoutConfigurations$AdPreloadConfig(C3602jc.defaultPreloadAudioPreloadTimeout, C3602jc.defaultPreloadAudioMuttTimeout, C3602jc.defaultPreloadAudioloadTimeout, C3602jc.defaultPreloadAudioRetryInterval, C3602jc.defaultPreloadAudioMaxRetries);
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getBanner() {
        return this.banner;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getInterstitial() {
        return this.f6int;
    }

    @NotNull
    public final TimeoutConfigurations$AdPreloadConfig getNative() {
        return this.f7native;
    }

    public final boolean isValid() {
        return this.banner.isValid() && this.f6int.isValid() && this.f7native.isValid() && this.audio.isValid();
    }
}
