package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.A5;
import com.inmobi.media.C3484b6;
import com.inmobi.media.InterfaceC3487b9;
import com.inmobi.media.InterfaceC3692q4;
import com.inmobi.media.Ua;
import com.inmobi.media.Va;
import com.inmobi.media.W3;
import e.f0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRootConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootConfig.kt\ncom/inmobi/commons/core/configs/RootConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1855#2,2:207\n1855#2,2:209\n1855#2,2:211\n1855#2,2:213\n*S KotlinDebug\n*F\n+ 1 RootConfig.kt\ncom/inmobi/commons/core/configs/RootConfig\n*L\n85#1:207,2\n96#1:209,2\n129#1:211,2\n141#1:213,2\n*E\n"})
@Keep
public final class RootConfig extends Config {
    public static final long DEFAULT_EXPIRY = 86400;

    @NotNull
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;

    @NotNull
    public static final String DEFAULT_URL = "";
    public static final int DEFAULT_WAIT_TIME = 3;

    @InterfaceC3692q4
    private final String TAG;

    @Nullable
    private List<ComponentConfig> components;

    @InterfaceC3487b9
    @Nullable
    private GDPR gdpr;
    private int maxRetries;
    private boolean monetizationDisabled;
    private int retryInterval;
    private int waitTime;

    @NotNull
    public static final e Companion = new e();

    @NotNull
    private static final Object sAcquisitionLock = new Object();

    @Keep
    public static final class ComponentConfig {

        @NotNull
        private String type = "";
        private long expiry = Long.MAX_VALUE;

        @NotNull
        private String url = "";

        @NotNull
        private String fallbackUrl = RootConfig.DEFAULT_FALLBACK_URL;

        public final long getExpiry() {
            return this.expiry;
        }

        @NotNull
        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (M.e6(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 864000 && !W3.a(this.url)) {
                return ("root".equals(getType()) && W3.a(this.fallbackUrl)) ? false : true;
            }
            return false;
        }
    }

    @Keep
    public static final class GDPR {

        @InterfaceC3487b9
        @Nullable
        private Boolean transmitRequest = Boolean.TRUE;

        @Nullable
        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    public RootConfig(@Nullable String str) {
        super(str);
        this.TAG = "RootConfig";
        this.maxRetries = 3;
        this.retryInterval = 60;
        this.waitTime = 3;
        this.gdpr = new GDPR();
        this.components = EmptyList.f217510a;
    }

    public final long getExpiryForType(@NotNull String type) {
        G.p(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (type.equals(componentConfig.getType())) {
                        return componentConfig.getExpiry();
                    }
                }
            }
            return 86400L;
        }
    }

    @NotNull
    public final String getFallbackUrlForRootType() {
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if ("root".equals(componentConfig.getType())) {
                        return componentConfig.getFallbackUrl();
                    }
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return "root";
    }

    @NotNull
    public final String getUrlForType(@NotNull String type) {
        G.p(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (type.equals(componentConfig.getType())) {
                        return componentConfig.getUrl();
                    }
                }
            }
            return "";
        }
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final boolean isMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    @f0
    public final boolean isSameAs(@NotNull RootConfig config) {
        G.p(config, "config");
        return ((getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && F.f2(getAccountId$media_release(), config.getAccountId$media_release(), false, 2, null))) && config.maxRetries == this.maxRetries && config.retryInterval == this.retryInterval && config.waitTime == this.waitTime && config.monetizationDisabled == this.monetizationDisabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        L0 l02;
        String TAG = this.TAG;
        G.o(TAG, "TAG");
        Objects.toString(this.gdpr);
        if (this.maxRetries < 0 || this.retryInterval < 0 || this.waitTime < 0) {
            return false;
        }
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((ComponentConfig) it.next()).isValid()) {
                        return false;
                    }
                }
                l02 = L0.f217464a;
            } else {
                l02 = null;
            }
            if (l02 == null) {
                return false;
            }
            GDPR gdpr = this.gdpr;
            return gdpr != null && gdpr.isValid();
        }
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr == null || (transmitRequest = gdpr.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new A5().a(new Va("components", RootConfig.class), (Ua) new C3484b6(new d(), ComponentConfig.class)).a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        G.o(TAG, "TAG");
        return new JSONObject();
    }
}
