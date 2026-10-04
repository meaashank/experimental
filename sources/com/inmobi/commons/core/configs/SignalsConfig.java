package com.inmobi.commons.core.configs;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.inmobi.media.InterfaceC3692q4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class SignalsConfig extends Config {

    @NotNull
    public static final f Companion = new f();

    @InterfaceC3692q4
    private final String TAG;

    @Nullable
    private JSONObject ext;

    @NotNull
    private IceConfig ice;

    @NotNull
    private String kA;

    @NotNull
    private NovatiqConfig novatiqConfig;

    @NotNull
    private PublisherConfig publisher;

    @NotNull
    private Purchases purchases;

    @NotNull
    private SessionConfig session;

    @NotNull
    private UnifiedIdServiceConfig unifiedIdServiceConfig;
    private int vAK;

    @Keep
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    @Keep
    public static final class IceConfig {
        private boolean locationEnabled;
        private boolean sessionEnabled;
        private int sampleInterval = 300;
        private int stopRequestTimeout = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        private WifiIceConfig f151733w = new WifiIceConfig();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private CellIceConfig f151732c = new CellIceConfig();

        public final int getCellOperatorFlag() {
            return this.f151732c.getCof();
        }

        public final int getSampleInterval() {
            return this.sampleInterval;
        }

        public final int getStopRequestTimeout() {
            return this.stopRequestTimeout;
        }

        public final int getWifiFlag() {
            return this.f151733w.getWf();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f151732c.getCce();
        }

        public final boolean isConnectedWifiEnabled() {
            return this.f151733w.getCwe();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getSampleInterval() >= 0 && getStopRequestTimeout() >= 0 && getWifiFlag() >= 0 && getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f151732c.getVce();
        }

        public final boolean isVisibleWifiEnabled() {
            return this.f151733w.getVwe();
        }
    }

    @Keep
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;

        @NotNull
        private List<String> carrierNames = EmptyList.f217510a;

        @NotNull
        private String beaconUrl = "https://spadsync.com/sync";

        @NotNull
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        @NotNull
        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }
    }

    @Keep
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;

        @NotNull
        private final Map<String, String> generalKeys = new LinkedHashMap();

        @NotNull
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 1500;

        @NotNull
        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        @NotNull
        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Keep
    public static final class Purchases {
        private boolean inapp;

        @NotNull
        private List<String> versionList = I.Q("7.0.0", "7.1.0", "7.1.1");

        public final boolean getInapp() {
            return this.inapp;
        }

        @NotNull
        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z10) {
            this.inapp = z10;
        }

        public final void setVersionList(@NotNull List<String> list) {
            G.p(list, "<set-?>");
            this.versionList = list;
        }
    }

    @Keep
    public static final class SessionConfig {

        @NotNull
        private List<Integer> control = I.Q(0, 1, 2, 3, 4, 5, 6);

        @NotNull
        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Keep
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;

        @NotNull
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(@NotNull String str) {
            G.p(str, "<set-?>");
            this.url = str;
        }
    }

    @Keep
    public static final class WifiIceConfig {
        private boolean cwe;
        private boolean vwe;
        private int wf;

        public final boolean getCwe() {
            return this.cwe;
        }

        public final boolean getVwe() {
            return this.vwe;
        }

        public final int getWf() {
            return this.wf;
        }

        public final void setCwe(boolean z10) {
            this.cwe = z10;
        }

        public final void setVwe(boolean z10) {
            this.vwe = z10;
        }

        public final void setWf(int i10) {
            this.wf = i10;
        }
    }

    public SignalsConfig(@Nullable String str) {
        super(str);
        this.TAG = "SignalsConfig";
        this.ice = new IceConfig();
        this.unifiedIdServiceConfig = new UnifiedIdServiceConfig();
        this.novatiqConfig = new NovatiqConfig();
        this.session = new SessionConfig();
        this.publisher = new PublisherConfig();
        this.kA = "wWFMAWbSEtvl5VxZbQGMK7";
        this.vAK = 1;
        this.purchases = new Purchases();
    }

    @NotNull
    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    @Nullable
    public final JSONObject getExt() {
        return this.ext;
    }

    @NotNull
    public final IceConfig getIceConfig() {
        return this.ice;
    }

    @NotNull
    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    @NotNull
    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    @NotNull
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @NotNull
    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "signals";
    }

    @NotNull
    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setPurchases(@NotNull Purchases purchases) {
        G.p(purchases, "<set-?>");
        this.purchases = purchases;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = f.a().a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        G.o(TAG, "TAG");
        return new JSONObject();
    }
}
