package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.A5;
import com.inmobi.media.InterfaceC3692q4;
import com.inmobi.media.K3;
import com.inmobi.media.P2;
import com.inmobi.media.W3;
import com.inmobi.media.Y8;
import com.inmobi.media.Z8;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p8.C5397a;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class CrashConfig extends Config {

    @NotNull
    public static final P2 Companion = new P2();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;

    @NotNull
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;

    @InterfaceC3692q4
    private final String TAG;

    @NotNull
    private ANRConfig anr;

    @NotNull
    private CatchConfig catchConfig;
    private boolean catchEnabled;

    @NotNull
    private CrashIncidentConfig crashConfig;
    private boolean crashEnabled;
    private long eventTTL;
    private int maxEventsToPersist;
    private int maxRetryCount;

    @NotNull
    private Z8 networkType;
    private long processingInterval;
    private long txLatency;

    @NotNull
    private String url;

    @Keep
    public static final class ANRConfig {

        @NotNull
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();

        @NotNull
        private WatchDogConfig watchdog = new WatchDogConfig();

        @NotNull
        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        @NotNull
        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    @Keep
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = 30000;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Keep
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    public static final class CrashIncidentConfig {
        private boolean enabled = true;
        private double samplingPercent = 1.0d;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    public CrashConfig(@Nullable String str) {
        super(str);
        this.TAG = "CrashConfig";
        this.url = DEFAULT_URL;
        this.processingInterval = 60L;
        this.maxRetryCount = 3;
        this.maxEventsToPersist = 50;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.txLatency = 86400L;
        this.crashEnabled = true;
        this.networkType = new Z8();
        this.anr = new ANRConfig();
        this.crashConfig = new CrashIncidentConfig();
        this.catchConfig = new CatchConfig();
        setDefaultNetworkConfig();
    }

    private final void setDefaultNetworkConfig() {
        Z8 z82 = this.networkType;
        Y8 y82 = new Y8();
        y82.a(10L);
        y82.c(1);
        y82.b(2);
        z82.getClass();
        z82.wifi = y82;
        Z8 z83 = this.networkType;
        Y8 y83 = new Y8();
        y83.a(10L);
        y83.c(1);
        y83.b(2);
        z83.getClass();
        z83.others = y83;
    }

    @NotNull
    public final ANRConfig getANRConfig() {
        return this.anr;
    }

    @NotNull
    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    @NotNull
    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    @NotNull
    public final K3 getEventConfig() {
        return new K3(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
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

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "crashReporting";
    }

    @NotNull
    public final String getUrl() {
        return this.url;
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

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (W3.a(this.url)) {
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
                return y83.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0;
            }
            G.S("others");
            throw null;
        }
        return false;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new A5().a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        G.o(TAG, "TAG");
        return new JSONObject();
    }
}
