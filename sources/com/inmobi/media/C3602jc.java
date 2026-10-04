package com.inmobi.media;

import com.inmobi.unification.sdk.model.Initialization.TimeoutConfigurations$MediationConfig;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3602jc implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;

    @NotNull
    public static final C3574hc Companion = new C3574hc();

    @NotNull
    private static final String DEFAULT_KEY = "default";

    @NotNull
    private static final String APPLOVIN_KEY = "c_applovin";

    @NotNull
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);

    @NotNull
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);

    @NotNull
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);

    @NotNull
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 14500);

    @NotNull
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultABBannerloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultABBannerMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultABBannerRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultABIntloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 29500, APPLOVIN_KEY, 29500);

    @NotNull
    private static final JSONObject defaultABIntMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultABIntRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultABNativeloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 14500);

    @NotNull
    private static final JSONObject defaultABNativeMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultABNativeRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultABAudioloadTimeout = AbstractC3600ja.a(DEFAULT_KEY, 14500, APPLOVIN_KEY, 9500);

    @NotNull
    private static final JSONObject defaultABAudioMaxRetries = AbstractC3600ja.a(DEFAULT_KEY, 3, APPLOVIN_KEY, 3);

    @NotNull
    private static final JSONObject defaultABAudioRetryInterval = AbstractC3600ja.a(DEFAULT_KEY, 1000, APPLOVIN_KEY, 1000);

    @NotNull
    private static final JSONObject defaultPreloadBannerPreloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMuttTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerLoadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 14500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMaxRetries = AbstractC3546fc.a(DEFAULT_KEY, 3);

    @NotNull
    private static final JSONObject defaultPreloadBannerRetryInterval = AbstractC3546fc.a(DEFAULT_KEY, 1000);

    @NotNull
    private static final JSONObject defaultPreloadIntPreloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMuttTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMaxRetries = AbstractC3546fc.a(DEFAULT_KEY, 3);

    @NotNull
    private static final JSONObject defaultPreloadIntRetryInterval = AbstractC3546fc.a(DEFAULT_KEY, 1000);

    @NotNull
    private static final JSONObject defaultPreloadNativePreloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMuttTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 14500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMaxRetries = AbstractC3546fc.a(DEFAULT_KEY, 3);

    @NotNull
    private static final JSONObject defaultPreloadNativeRetryInterval = AbstractC3546fc.a(DEFAULT_KEY, 1000);

    @NotNull
    private static final JSONObject defaultPreloadAudioPreloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMuttTimeout = AbstractC3546fc.a(DEFAULT_KEY, 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioloadTimeout = AbstractC3546fc.a(DEFAULT_KEY, 14500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMaxRetries = AbstractC3546fc.a(DEFAULT_KEY, 3);

    @NotNull
    private static final JSONObject defaultPreloadAudioRetryInterval = AbstractC3546fc.a(DEFAULT_KEY, 1000);

    @NotNull
    private static final ed.p<JSONObject, Integer, Boolean> validator = C3560gc.f152955a;
    private int step4s = 15000;

    @NotNull
    private TimeoutConfigurations$MediationConfig mediationConfig = new TimeoutConfigurations$MediationConfig();

    @NotNull
    public final TimeoutConfigurations$MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return Y() >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }
}
