package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C3602jc;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$AdNonABConfig {

    @NotNull
    private JSONObject loadRetryInterval;

    @NotNull
    private JSONObject loadTimeout;

    @NotNull
    private JSONObject maxLoadRetries;

    @NotNull
    private JSONObject muttTimeout;

    public TimeoutConfigurations$AdNonABConfig() {
        this.loadTimeout = new JSONObject();
        this.muttTimeout = new JSONObject();
        this.loadRetryInterval = new JSONObject();
        this.maxLoadRetries = new JSONObject();
    }

    @NotNull
    public final JSONObject getLoadTimeout() {
        return this.loadTimeout;
    }

    @NotNull
    public final JSONObject getMaxRetries() {
        return this.maxLoadRetries;
    }

    @NotNull
    public final JSONObject getMuttTimeout() {
        return this.muttTimeout;
    }

    @NotNull
    public final JSONObject getRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        C3602jc.Companion.getClass();
        return ((Boolean) C3602jc.validator.invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) C3602jc.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) C3602jc.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) C3602jc.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdNonABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
        this();
        G.p(loadTimeout, "loadTimeout");
        G.p(muttTimeout, "muttTimeout");
        G.p(retryInterval, "retryInterval");
        G.p(maxRetries, "maxRetries");
        this.loadTimeout = loadTimeout;
        this.muttTimeout = muttTimeout;
        this.loadRetryInterval = retryInterval;
        this.maxLoadRetries = maxRetries;
    }
}
