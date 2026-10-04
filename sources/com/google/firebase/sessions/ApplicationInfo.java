package com.google.firebase.sessions;

import androidx.compose.foundation.text.modifiers.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ApplicationInfo {

    @NotNull
    private final AndroidApplicationInfo androidAppInfo;

    @NotNull
    private final String appId;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final LogEnvironment logEnvironment;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String sessionSdkVersion;

    public ApplicationInfo(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        G.p(appId, "appId");
        G.p(deviceModel, "deviceModel");
        G.p(sessionSdkVersion, "sessionSdkVersion");
        G.p(osVersion, "osVersion");
        G.p(logEnvironment, "logEnvironment");
        G.p(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationInfo.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        if ((i10 & 4) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = applicationInfo.osVersion;
        }
        if ((i10 & 16) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        if ((i10 & 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        AndroidApplicationInfo androidApplicationInfo2 = androidApplicationInfo;
        return applicationInfo.copy(str, str2, str3, str4, logEnvironment2, androidApplicationInfo2);
    }

    @NotNull
    public final String component1() {
        return this.appId;
    }

    @NotNull
    public final String component2() {
        return this.deviceModel;
    }

    @NotNull
    public final String component3() {
        return this.sessionSdkVersion;
    }

    @NotNull
    public final String component4() {
        return this.osVersion;
    }

    @NotNull
    public final LogEnvironment component5() {
        return this.logEnvironment;
    }

    @NotNull
    public final AndroidApplicationInfo component6() {
        return this.androidAppInfo;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        G.p(appId, "appId");
        G.p(deviceModel, "deviceModel");
        G.p(sessionSdkVersion, "sessionSdkVersion");
        G.p(osVersion, "osVersion");
        G.p(logEnvironment, "logEnvironment");
        G.p(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return G.g(this.appId, applicationInfo.appId) && G.g(this.deviceModel, applicationInfo.deviceModel) && G.g(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && G.g(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && G.g(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return this.androidAppInfo.hashCode() + ((this.logEnvironment.hashCode() + l.a(this.osVersion, l.a(this.sessionSdkVersion, l.a(this.deviceModel, this.appId.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }
}
