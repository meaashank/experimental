package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.A5;
import com.inmobi.media.C3484b6;
import com.inmobi.media.InterfaceC3692q4;
import com.inmobi.media.K3;
import com.inmobi.media.Mb;
import com.inmobi.media.Nb;
import com.inmobi.media.Ua;
import com.inmobi.media.Va;
import com.inmobi.media.W3;
import com.inmobi.media.Y8;
import com.inmobi.media.Z8;
import e.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p8.C5397a;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nTelemetryConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelemetryConfig.kt\ncom/inmobi/commons/core/configs/TelemetryConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n1855#2,2:359\n*S KotlinDebug\n*F\n+ 1 TelemetryConfig.kt\ncom/inmobi/commons/core/configs/TelemetryConfig\n*L\n167#1:359,2\n*E\n"})
@Keep
public final class TelemetryConfig extends Config {

    @NotNull
    public static final Nb Companion = new Nb();
    public static final long DEFAULT_DEEPLINK_FALLBACK_INTERVAL = 1000;
    public static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    public static final long DEFAULT_EVENT_TTL_SEC = 604800;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final boolean DEFAULT_IS_ENABLED = true;
    public static final boolean DEFAULT_LOG_ENABLED = false;
    public static final long DEFAULT_LOG_EXPIRY = 86400;

    @NotNull
    private static final String DEFAULT_LOG_LEVEL = "ERROR";
    public static final int DEFAULT_LOG_MAX_RETRIES = 3;
    public static final long DEFAULT_LOG_RETRY_INTERVAL = 5000;
    public static final double DEFAULT_LOG_SAMPLING_FACTOR = 0.0d;

    @NotNull
    public static final String DEFAULT_LOG_URL = "https://log-activity.templates.inmobi.com/api/v1/ingest";
    public static final int DEFAULT_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_MAX_ENTRIES = 20;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_MAX_TEMPLATE_EVENTS = 50;
    public static final int DEFAULT_MIN_BATCH_SIZE = 5;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    public static final long DEFAULT_REDIRECTION_INTERVAL = 1000;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    public static final double DEFAULT_SAMPLING_FACTOR = 0.0d;

    @NotNull
    public static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";

    @InterfaceC3692q4
    private final String TAG;

    @NotNull
    private AssetReportingConfig assetReporting;

    @NotNull
    private Base base;
    private boolean disableAllGeneralEvents;
    private long eventTTL;

    @NotNull
    private LoggingConfig loggingConfig;

    @NotNull
    private LandingPageConfig lpConfig;
    private int maxEventsToPersist;
    private int maxRetryCount;
    private int maxTemplateEvents;

    @NotNull
    private Z8 networkType;

    @NotNull
    private List<String> priorityEvents;
    private long processingInterval;
    private double samplingFactor;
    private boolean sendCrashEvents;

    @NotNull
    private String telemetryUrl;
    private long txLatency;

    @Keep
    public static final class AdTypeLoggingConfig {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        @NotNull
        private PlacementTypeLoggingConfig f151734ab = new PlacementTypeLoggingConfig();

        @NotNull
        private PlacementTypeLoggingConfig nonAb = new PlacementTypeLoggingConfig();

        @NotNull
        public final PlacementTypeLoggingConfig getAb() {
            return this.f151734ab;
        }

        @NotNull
        public final PlacementTypeLoggingConfig getNonAb() {
            return this.nonAb;
        }
    }

    @Keep
    public static final class AssetReportingConfig {
        private boolean gif;
        private boolean image;
        private boolean video;

        public final boolean getGif() {
            return this.gif;
        }

        public final boolean getImage() {
            return this.image;
        }

        public final boolean getVideo() {
            return this.video;
        }

        public final boolean isGifEnabled() {
            return this.gif;
        }

        public final boolean isImageEnabled() {
            return this.image;
        }

        public final boolean isVideoEnabled() {
            return this.video;
        }

        public final void setGif(boolean z10) {
            this.gif = z10;
        }

        public final void setImage(boolean z10) {
            this.image = z10;
        }

        public final void setVideo(boolean z10) {
            this.video = z10;
        }
    }

    @Keep
    public static final class Base {
        private boolean enabled = true;

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    @Keep
    public static final class LandingPageConfig {
        private int maxFunnelsToTrackPerAd = 10;
        private boolean nativeEnabled;

        public final int getMaxFunnelsToTrackPerAd() {
            return this.maxFunnelsToTrackPerAd;
        }

        public final boolean getNativeEnabled() {
            return this.nativeEnabled;
        }

        public final void setMaxFunnelsToTrackPerAd(int i10) {
            this.maxFunnelsToTrackPerAd = i10;
        }

        public final void setNativeEnabled(boolean z10) {
            this.nativeEnabled = z10;
        }
    }

    @Keep
    public static final class LoggingConfig {
        private boolean enabled;

        @NotNull
        private String loggingUrl = TelemetryConfig.DEFAULT_LOG_URL;
        private int maxNoOfEntries = 20;
        private long expiry = 86400;
        private int maxRetries = 3;
        private long retryInterval = 5000;

        @NotNull
        private AdTypeLoggingConfig banner = new AdTypeLoggingConfig();

        @NotNull
        private AdTypeLoggingConfig audio = new AdTypeLoggingConfig();

        @NotNull
        private AdTypeLoggingConfig int_html = new AdTypeLoggingConfig();

        @NotNull
        private AdTypeLoggingConfig int_native = new AdTypeLoggingConfig();

        /* JADX INFO: renamed from: native, reason: not valid java name */
        @NotNull
        private AdTypeLoggingConfig f1native = new AdTypeLoggingConfig();

        @NotNull
        private PlacementTypeLoggingConfig getToken = new PlacementTypeLoggingConfig();

        @NotNull
        public final AdTypeLoggingConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdTypeLoggingConfig getBanner() {
            return this.banner;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getExpiry() {
            return this.expiry;
        }

        @NotNull
        public final PlacementTypeLoggingConfig getGetToken() {
            return this.getToken;
        }

        @NotNull
        public final AdTypeLoggingConfig getInt_html() {
            return this.int_html;
        }

        @NotNull
        public final AdTypeLoggingConfig getInt_native() {
            return this.int_native;
        }

        @NotNull
        public final String getLoggingUrl() {
            return this.loggingUrl;
        }

        public final int getMaxNoOfEntries() {
            return this.maxNoOfEntries;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        @NotNull
        public final AdTypeLoggingConfig getNative() {
            return this.f1native;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }
    }

    @Keep
    public static final class PlacementTypeLoggingConfig {

        @NotNull
        private String logLevel;
        private double samplePercent;

        public PlacementTypeLoggingConfig() {
            TelemetryConfig.Companion.getClass();
            this.logLevel = TelemetryConfig.DEFAULT_LOG_LEVEL;
        }

        @NotNull
        public final String getLogLevel() {
            return this.logLevel;
        }

        public final double getSamplePercent() {
            return this.samplePercent;
        }
    }

    public TelemetryConfig(@Nullable String str) {
        super(str);
        this.telemetryUrl = DEFAULT_URL;
        this.TAG = "TelemetryConfig";
        this.processingInterval = 30L;
        this.maxRetryCount = 1;
        this.maxEventsToPersist = 1000;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.maxTemplateEvents = 50;
        this.txLatency = 86400L;
        Companion.getClass();
        this.priorityEvents = I.U("ServerFill", "ServerNoFill", "ServerError", "AdLoadFailed", "AdLoadSuccessful", "BlockAutoRedirection", "AssetDownloaded", "CrashEventOccurred", "InvalidConfig", "ConfigFetched", "SdkInitialized", "AdGetSignalsFailed", "AdGetSignalsSucceeded", "AdShowFailed", "AdLoadCalled", "AdLoadDroppedAtSDK", "AdShowCalled", "AdShowSuccessful", "AdGetSignalsCalled", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "MUTTSuccess", "ParseSuccess", "WebViewLoadCalled", "PageStarted", "WebViewLoadFinished", "FireAdReady", "FireAdFailed", "TemplateEventDropped", "NetworkLoadLimitExceeded", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed");
        this.base = new Base();
        this.networkType = new Z8();
        this.loggingConfig = new LoggingConfig();
        this.lpConfig = new LandingPageConfig();
        setDefaultNetworkConfig();
        this.assetReporting = getDefaultAssetReportingConfig();
    }

    private final AssetReportingConfig getDefaultAssetReportingConfig() {
        AssetReportingConfig assetReportingConfig = new AssetReportingConfig();
        assetReportingConfig.setVideo(true);
        assetReportingConfig.setImage(false);
        assetReportingConfig.setGif(false);
        return assetReportingConfig;
    }

    private final void setDefaultNetworkConfig() {
        Z8 z82 = this.networkType;
        Y8 y82 = new Y8();
        y82.a(60L);
        y82.c(5);
        y82.b(20);
        z82.getClass();
        z82.wifi = y82;
        Z8 z83 = this.networkType;
        Y8 y83 = new Y8();
        y83.a(60L);
        y83.c(5);
        y83.b(20);
        z83.getClass();
        z83.others = y83;
    }

    @NotNull
    public final AssetReportingConfig getAssetConfig() {
        return this.assetReporting;
    }

    public final boolean getEnabled() {
        return this.base.getEnabled();
    }

    @NotNull
    public final K3 getEventConfig() {
        return new K3(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    @NotNull
    public final LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    @NotNull
    public final LandingPageConfig getLpConfig() {
        return this.lpConfig;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public final int getMaxTemplateEvents() {
        return this.maxTemplateEvents;
    }

    @NotNull
    public final Y8 getMobileConfig() {
        Y8 y82 = this.networkType.others;
        if (y82 != null) {
            return y82;
        }
        G.S("others");
        throw null;
    }

    @NotNull
    public final List<String> getPriorityEventsList() {
        return this.priorityEvents;
    }

    public final double getSamplingFactor() {
        return this.samplingFactor;
    }

    @NotNull
    public final String getTelemetryUrl() {
        return this.telemetryUrl;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "telemetry";
    }

    @NotNull
    public final String getUrl() {
        return this.telemetryUrl;
    }

    @NotNull
    public final Y8 getWifiConfig() {
        Y8 y82 = this.networkType.wifi;
        if (y82 != null) {
            return y82;
        }
        G.S(C5397a.f226370e);
        throw null;
    }

    public final boolean isGeneralEventsDisabled() {
        return this.disableAllGeneralEvents;
    }

    @f0
    public final boolean isSameAs(@NotNull TelemetryConfig config) {
        G.p(config, "config");
        boolean z10 = (getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && F.f2(getAccountId$media_release(), config.getAccountId$media_release(), false, 2, null));
        List<String> priorityEventsList = getPriorityEventsList();
        Iterator<T> it = config.getPriorityEventsList().iterator();
        while (it.hasNext()) {
            if (!priorityEventsList.contains((String) it.next())) {
                return false;
            }
        }
        return z10 && G.g(config.telemetryUrl, this.telemetryUrl) && config.samplingFactor == this.samplingFactor && config.eventTTL == this.eventTTL && config.maxEventsToPersist == this.maxEventsToPersist && config.maxRetryCount == this.maxRetryCount && config.getAssetConfig().isImageEnabled() == getAssetConfig().isImageEnabled() && config.getAssetConfig().isGifEnabled() == getAssetConfig().isGifEnabled() && config.getAssetConfig().isVideoEnabled() == getAssetConfig().isVideoEnabled();
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (W3.a(this.telemetryUrl)) {
            return false;
        }
        long j10 = this.txLatency;
        if (j10 < this.processingInterval || j10 > this.eventTTL) {
            return false;
        }
        Z8 z82 = this.networkType;
        int i10 = this.maxEventsToPersist;
        Y8 y82 = z82.wifi;
        if (y82 == null) {
            G.S(C5397a.f226370e);
            throw null;
        }
        if (y82.a(i10)) {
            Y8 y83 = z82.others;
            if (y83 != null) {
                return y83.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0 && this.samplingFactor >= 0.0d;
            }
            G.S("others");
            throw null;
        }
        return false;
    }

    public final void setTelemetryUrl(@NotNull String str) {
        G.p(str, "<set-?>");
        this.telemetryUrl = str;
    }

    public final boolean shouldSendCrashEvents() {
        return this.sendCrashEvents;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new A5().a(new Va("priorityEvents", TelemetryConfig.class), (Ua) new C3484b6(new Mb(), String.class)).a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        G.o(TAG, "TAG");
        return new JSONObject();
    }
}
