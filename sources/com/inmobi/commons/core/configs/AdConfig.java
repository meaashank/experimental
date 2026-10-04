package com.inmobi.commons.core.configs;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.activity.C1477d;
import androidx.annotation.Keep;
import com.inmobi.media.AbstractC3620l2;
import com.inmobi.media.C3492c0;
import com.inmobi.media.C3602jc;
import com.inmobi.media.W3;
import e.f0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nAdConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdConfig.kt\ncom/inmobi/commons/core/configs/AdConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n1#2:776\n*E\n"})
@Keep
public final class AdConfig extends Config {

    @NotNull
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final int DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;

    @NotNull
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;

    @NotNull
    private static final String GESTURE_LIST = "gestures";
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;

    @NotNull
    private static final String SKIP_FIELDS = "skipFields";

    @NotNull
    private AdQualityConfig adQuality;

    @NotNull
    private AdReportConfig adReport;

    @Nullable
    private C3492c0 adReqDeprecateChecker;
    private boolean applyGzipReq;

    @NotNull
    private AssetCacheConfig assetCache;

    @NotNull
    private AudioConfig audio;

    @NotNull
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;

    @NotNull
    private ContextualDataConfig contextualData;

    @Nullable
    private CustomNetworkValidation customNwValidation;
    private int defaultRefreshInterval;

    @Nullable
    private String deprecate;
    private boolean enableCookiesOnInAppBrowser;

    @NotNull
    private ImaiConfig imai;
    private int maxPoolSize;
    private int minimumRefreshInterval;

    @NotNull
    private MraidConfig mraid;

    @NotNull
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private boolean skipNetworkValidationFeatureEnabled;

    @NotNull
    private C3602jc timeouts;

    @NotNull
    private String url;

    @NotNull
    private VastVideoConfig vastVideo;

    @NotNull
    private ViewabilityConfig viewability;
    private boolean watermarkEnabled;

    @NotNull
    private WebAssetCacheConfig webAssetCache;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = EmptyList.f217510a;

    @Keep
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private int retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            return this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100;
        }

        @f0(otherwise = 2)
        public final void setEnableAdQuality(boolean z10) {
            this.enabled = z10;
        }

        @f0(otherwise = 2)
        public final void setMaxImageSize(int i10) {
            this.maxImageSize = i10;
        }
    }

    @Keep
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i10) {
            this.cridls = i10;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }
    }

    @Keep
    public static final class AssetCacheConfig {
        private int maxRetries = 3;
        private int retryInterval = 1;
        private long maxCacheSize = 104857600;
        private long timeToLive = CrashConfig.DEFAULT_EVENT_TTL_SEC;

        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return getRetryInterval() >= 0 && getTimeToLive() >= 0 && getMaxCacheSize() >= 0 && getMaxRetries() >= 0;
        }
    }

    @Keep
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        public final boolean isAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            return this.minDeviceVolume > 0 && this.minRefreshInterval > 0;
        }

        @f0(otherwise = 2)
        public final void setAudioEnabled(boolean z10) {
            this.isAudioEnabled = z10;
        }

        @f0(otherwise = 2)
        public final void setMinDeviceVolume(int i10) {
            this.minDeviceVolume = i10;
        }

        @f0(otherwise = 2)
        public final void setMinRefreshInterval(int i10) {
            this.minRefreshInterval = i10;
        }
    }

    @Keep
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    public static final class BitRateConfig {
        private boolean bitrate_mandatory;
        private int headerTimeout = 2000;

        public final int getHeaderTimeout() {
            return this.headerTimeout;
        }

        public final boolean isBitRateMandatory() {
            return this.bitrate_mandatory;
        }
    }

    @Keep
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return this.timeToLive >= 0;
        }

        public final void setTimeToLive(long j10) {
            this.timeToLive = j10;
        }
    }

    @Keep
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;

        @NotNull
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = 86400;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        @NotNull
        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            return this.maxAdRecords >= 0 && this.expiryTime >= 0;
        }
    }

    @Keep
    public static final class CustomNetworkValidation {
        private boolean enabled;

        @NotNull
        private String urlDomain = "supply.inmobicdn.net";
        private long refreshDebounceTime = 1000;
        private long validatedExpiry = 120000;
        private long nonValidatedExpiry = 30000;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getNonValidatedExpiry() {
            return this.nonValidatedExpiry;
        }

        public final long getRefreshDebounceTime() {
            return this.refreshDebounceTime;
        }

        @NotNull
        public final String getUrlDomain() {
            return this.urlDomain;
        }

        public final long getValidatedExpiry() {
            return this.validatedExpiry;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }

        public final void setNonValidatedExpiry(long j10) {
            this.nonValidatedExpiry = j10;
        }

        public final void setRefreshDebounceTime(long j10) {
            this.refreshDebounceTime = j10;
        }

        public final void setUrlDomain(@NotNull String str) {
            G.p(str, "<set-?>");
            this.urlDomain = str;
        }

        public final void setValidatedExpiry(long j10) {
            this.validatedExpiry = j10;
        }
    }

    @Keep
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = 120;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            return getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0;
        }
    }

    @Keep
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;

        @NotNull
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1080/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !W3.a(this.url);
        }
    }

    @Keep
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;

        @NotNull
        private String partnerKey = "Inmobi";

        @NotNull
        private String url = "https://supply.inmobicdn.net/javascript/1.3.37/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        @NotNull
        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            String url;
            String string;
            return getMaxRetries() >= 0 && getRetryInterval() >= 0 && (url = getUrl()) != null && (string = M.e6(url).toString()) != null && AbstractC3620l2.a(string) && !TextUtils.isEmpty(getPartnerKey());
        }

        public final void setOmidEnabled(boolean z10) {
            this.omidEnabled = z10;
        }
    }

    @Keep
    public static final class RenderingConfig {
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;

        @NotNull
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;

        @NotNull
        private List<Integer> gestures = I.U(0, 1, 2, 3, 4, 5);

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        @NotNull
        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * ((long) 1000);
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            String string;
            String str = this.webviewBackground;
            if (str != null && (((string = M.e6(str).toString()) == null || string.length() != 0) && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty())) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final boolean shouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Keep
    public static final class VastVideoConfig {
        private int maxWrapperLimit = 3;
        private long optimalVastVideoSize = 3145728;
        private long vastMaxAssetSize = M6.b.f58840g;

        @NotNull
        private BitRateConfig bitRate = new BitRateConfig();

        @NotNull
        private List<String> allowedContentType = I.U("video/mp4", "video/3gp", "video/3gpp", "video/webm", "image/jpeg", "image/jpg", "image/gif", "image/png");

        @NotNull
        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        @NotNull
        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            return getOptimalVastVideoSize() <= M6.b.f58840g && getOptimalVastVideoSize() > 0 && getMaxWrapperLimit() >= 0 && getVastMaxAssetSize() > 0 && getVastMaxAssetSize() <= M6.b.f58840g;
        }
    }

    @Keep
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setVideoMinPercentagePlay(int i10) {
            this.videoMinPercentagePlay = i10;
        }
    }

    @Keep
    public static final class ViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;
        private int displayMinPercentageAnimate = 67;

        @NotNull
        private VideoViewabilityConfig video = new VideoViewabilityConfig();

        @NotNull
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();

        @NotNull
        private WebViewabilityConfig web = new WebViewabilityConfig();

        @NotNull
        private OmidConfig omidConfig = new OmidConfig();

        @NotNull
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();

        /* JADX INFO: renamed from: int, reason: not valid java name */
        @NotNull
        private InterstitialImpressionTypeConfig f0int = new InterstitialImpressionTypeConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getDisplayMinPercentageAnimate() {
            return this.displayMinPercentageAnimate;
        }

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.f0int.getImpressionType();
        }

        @NotNull
        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final boolean isValid() {
            return getImpressionMinPercentageViewed() > 0 && getImpressionMinPercentageViewed() <= 100 && getImpressionMinTimeViewed() >= 0 && getDisplayMinPercentageAnimate() > 0 && getDisplayMinPercentageAnimate() <= 100 && getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getVisibilityThrottleMillis() * 5 <= getImpressionMinTimeViewed() && getImpressionPollIntervalMillis() >= 50 && getImpressionPollIntervalMillis() * 4 <= getImpressionMinTimeViewed() && this.omidConfig.isValid();
        }

        public final void setOmidConfig(@NotNull OmidConfig omidConfig) {
            G.p(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }

        public final void setVideoImpressionMinTimeViewed(int i10) {
            this.video.setImpressionMinTimeViewed(i10);
        }
    }

    @Keep
    public static final class WebAssetCacheConfig {

        @NotNull
        public static final c Companion = new c();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i10 = webAssetCacheConfig.cacheSize;
            }
            if ((i15 & 2) != 0) {
                i11 = webAssetCacheConfig.timeout;
            }
            if ((i15 & 4) != 0) {
                i12 = webAssetCacheConfig.maxRetries;
            }
            if ((i15 & 8) != 0) {
                i13 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            if ((i15 & 16) != 0) {
                i14 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            int i16 = i14;
            int i17 = i12;
            return webAssetCacheConfig.copy(i10, i11, i17, i13, i16);
        }

        public final int component1() {
            return this.cacheSize;
        }

        public final int component2() {
            return this.timeout;
        }

        public final int component3() {
            return this.maxRetries;
        }

        public final int component4() {
            return this.minAvailableDiskSpace;
        }

        public final int component5() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        @NotNull
        public final WebAssetCacheConfig copy(int i10, int i11, int i12, int i13, int i14) {
            return new WebAssetCacheConfig(i10, i11, i12, i13, i14);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) obj;
            return this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return this.cacheSizeToDiskSpaceMaxPercent + ((this.minAvailableDiskSpace + ((this.maxRetries + ((this.timeout + (this.cacheSize * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("WebAssetCacheConfig(cacheSize=");
            sb2.append(this.cacheSize);
            sb2.append(", timeout=");
            sb2.append(this.timeout);
            sb2.append(", maxRetries=");
            sb2.append(this.maxRetries);
            sb2.append(", minAvailableDiskSpace=");
            sb2.append(this.minAvailableDiskSpace);
            sb2.append(", cacheSizeToDiskSpaceMaxPercent=");
            return C1477d.a(sb2, this.cacheSizeToDiskSpaceMaxPercent, ')');
        }

        public WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14) {
            this.cacheSize = i10;
            this.timeout = i11;
            this.maxRetries = i12;
            this.minAvailableDiskSpace = i13;
            this.cacheSizeToDiskSpaceMaxPercent = i14;
        }

        public /* synthetic */ WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14, int i15, C4969v c4969v) {
            this((i15 & 1) != 0 ? 15 : i10, (i15 & 2) != 0 ? 5000 : i11, (i15 & 4) != 0 ? 1 : i12, (i15 & 8) != 0 ? 50 : i13, (i15 & 16) != 0 ? 10 : i14);
        }
    }

    @Keep
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionPollIntervalMillis(int i10) {
            this.impressionPollIntervalMillis = i10;
        }
    }

    public AdConfig(@Nullable String str) {
        super(str);
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.customNwValidation = new CustomNetworkValidation();
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.watermarkEnabled = true;
        C3602jc.Companion.getClass();
        C3602jc c3602jc = new C3602jc();
        c3602jc.a0();
        this.timeouts = c3602jc;
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.assetCache = new AssetCacheConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = n0.j0(new Pair("base", new CacheConfig()), new Pair("banner", new CacheConfig()), new Pair("audio", new CacheConfig()), new Pair("int", new CacheConfig()), new Pair("native", new CacheConfig()));
    }

    @NotNull
    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    @NotNull
    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    @Nullable
    public final C3492c0 getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            C3492c0 c3492c0 = null;
            if (str != null) {
                if (!AbstractC3620l2.a(str)) {
                    str = null;
                }
                if (str != null) {
                    c3492c0 = new C3492c0(str);
                }
            }
            this.adReqDeprecateChecker = c3492c0;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    @NotNull
    public final AssetCacheConfig getAssetCacheConfig() {
        return this.assetCache;
    }

    @NotNull
    public final AudioConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final CacheConfig getCacheConfig(@NotNull String adType) {
        G.p(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig != null) {
            return cacheConfig;
        }
        CacheConfig cacheConfig2 = this.cache.get("base");
        return cacheConfig2 == null ? new CacheConfig() : cacheConfig2;
    }

    @NotNull
    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    @Nullable
    public final CustomNetworkValidation getCustomNwValidation() {
        return this.customNwValidation;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final boolean getEnableCookiesOnInAppBrowser() {
        return this.enableCookiesOnInAppBrowser;
    }

    @NotNull
    public final ImaiConfig getImaiConfig() {
        return this.imai;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    @NotNull
    public final MraidConfig getMraidConfig() {
        return this.mraid;
    }

    @NotNull
    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final boolean getSkipNetworkValidationFeatureEnabled() {
        return this.skipNetworkValidationFeatureEnabled;
    }

    @NotNull
    public final C3602jc getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    @NotNull
    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    @NotNull
    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    public final boolean isCCTEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        int i10;
        int i11;
        if (this.maxPoolSize > 0 && !W3.a(this.url) && (i10 = this.minimumRefreshInterval) >= 0 && (i11 = this.defaultRefreshInterval) >= 0 && i10 <= i11) {
            Iterator<Map.Entry<String, CacheConfig>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    return false;
                }
            }
            this.timeouts.a0();
            if (this.contextualData.isValid() && this.adQuality.isValid() && this.imai.isValid() && this.mraid.isValid() && this.timeouts.Z() && this.rendering.isValid() && this.vastVideo.isValid() && this.assetCache.isValid() && this.viewability.isValid() && this.audio.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAdQuality(@NotNull AdQualityConfig adQualityConfig) {
        G.p(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(@NotNull AdReportConfig adReportConfig) {
        G.p(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(@Nullable C3492c0 c3492c0) {
        this.adReqDeprecateChecker = c3492c0;
    }

    public final void setApplyGzipReq(boolean z10) {
        this.applyGzipReq = z10;
    }

    public final void setAudio(@NotNull AudioConfig audioConfig) {
        G.p(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(@NotNull ContextualDataConfig contextualDataConfig) {
        G.p(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setCustomNwValidation(@Nullable CustomNetworkValidation customNetworkValidation) {
        this.customNwValidation = customNetworkValidation;
    }

    public final void setDefaultRefreshInterval(int i10) {
        this.defaultRefreshInterval = i10;
    }

    public final void setEnableCookiesOnInAppBrowser(boolean z10) {
        this.enableCookiesOnInAppBrowser = z10;
    }

    public final void setMinimumRefreshInterval(int i10) {
        this.minimumRefreshInterval = i10;
    }

    public final void setRendering(@NotNull RenderingConfig renderingConfig) {
        G.p(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z10) {
        this.skipNetCheckHB = z10;
    }

    public final void setSkipNetworkValidationFeatureEnabled(boolean z10) {
        this.skipNetworkValidationFeatureEnabled = z10;
    }

    public final void setTimeouts(@NotNull C3602jc c3602jc) {
        G.p(c3602jc, "<set-?>");
        this.timeouts = c3602jc;
    }

    public final void setUrl(@NotNull String str) {
        G.p(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(@NotNull VastVideoConfig vastVideoConfig) {
        G.p(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(@NotNull ViewabilityConfig viewabilityConfig) {
        G.p(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(@NotNull WebAssetCacheConfig webAssetCacheConfig) {
        G.p(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = b.a().a(this);
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }
}
