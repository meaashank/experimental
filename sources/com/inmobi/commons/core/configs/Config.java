package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.C3553g5;
import com.inmobi.media.C3662o2;
import com.inmobi.media.InterfaceC3692q4;
import dd.o;
import e.f0;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public abstract class Config {

    @NotNull
    public static final C3662o2 Companion = new C3662o2();

    @InterfaceC3692q4
    @Nullable
    private String accountId;

    @NotNull
    private C3553g5 includeIds = new C3553g5(false, 1, null);

    @InterfaceC3692q4
    private long lastUpdateTimeStamp;

    public Config(@Nullable String str) {
        this.accountId = str;
    }

    @o
    @Nullable
    public static final Config fromJSON(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable String str2, long j10) {
        Companion.getClass();
        return C3662o2.a(str, jSONObject, str2, j10);
    }

    @o
    @NotNull
    public static final Config newInstance(@NotNull String str, @Nullable String str2) {
        Companion.getClass();
        return C3662o2.a(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        if (G.g(config.getType(), getType())) {
            String str = this.accountId;
            if (str == null && config.accountId == null) {
                return true;
            }
            if (str != null && F.f2(str, config.accountId, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @f0
    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountId$media_release() {
        return this.accountId;
    }

    @NotNull
    public final C3553g5 getIncludeIdParams() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    @NotNull
    public abstract String getType();

    public int hashCode() {
        int iHashCode = getType().hashCode();
        String str = this.accountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public abstract boolean isValid();

    public final void setAccountId$media_release(@Nullable String str) {
        this.accountId = str;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    @NotNull
    public abstract JSONObject toJson();
}
