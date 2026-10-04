package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionConfigs {

    @Nullable
    private final Integer cacheDuration;

    @Nullable
    private final Long cacheUpdatedTime;

    @Nullable
    private final Boolean sessionEnabled;

    @Nullable
    private final Integer sessionRestartTimeout;

    @Nullable
    private final Double sessionSamplingRate;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d10, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l10;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d10, Integer num, Integer num2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sessionConfigs.sessionEnabled;
        }
        if ((i10 & 2) != 0) {
            d10 = sessionConfigs.sessionSamplingRate;
        }
        if ((i10 & 4) != 0) {
            num = sessionConfigs.sessionRestartTimeout;
        }
        if ((i10 & 8) != 0) {
            num2 = sessionConfigs.cacheDuration;
        }
        if ((i10 & 16) != 0) {
            l10 = sessionConfigs.cacheUpdatedTime;
        }
        Long l11 = l10;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d10, num3, num2, l11);
    }

    @Nullable
    public final Boolean component1() {
        return this.sessionEnabled;
    }

    @Nullable
    public final Double component2() {
        return this.sessionSamplingRate;
    }

    @Nullable
    public final Integer component3() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    public final Integer component4() {
        return this.cacheDuration;
    }

    @Nullable
    public final Long component5() {
        return this.cacheUpdatedTime;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean bool, @Nullable Double d10, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10) {
        return new SessionConfigs(bool, d10, num, num2, l10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return G.g(this.sessionEnabled, sessionConfigs.sessionEnabled) && G.g(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && G.g(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && G.g(this.cacheDuration, sessionConfigs.cacheDuration) && G.g(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    @Nullable
    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    @Nullable
    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    @Nullable
    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    @Nullable
    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTime;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }
}
