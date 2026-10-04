package com.google.firebase.sessions;

import androidx.compose.foundation.text.modifiers.l;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class AndroidApplicationInfo {

    @NotNull
    private final String appBuildVersion;

    @NotNull
    private final List<ProcessDetails> appProcessDetails;

    @NotNull
    private final ProcessDetails currentProcessDetails;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String packageName;

    @NotNull
    private final String versionName;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        G.p(packageName, "packageName");
        G.p(versionName, "versionName");
        G.p(appBuildVersion, "appBuildVersion");
        G.p(deviceManufacturer, "deviceManufacturer");
        G.p(currentProcessDetails, "currentProcessDetails");
        G.p(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i10 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i10 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i10 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((i10 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i10 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails2, list2);
    }

    @NotNull
    public final String component1() {
        return this.packageName;
    }

    @NotNull
    public final String component2() {
        return this.versionName;
    }

    @NotNull
    public final String component3() {
        return this.appBuildVersion;
    }

    @NotNull
    public final String component4() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final ProcessDetails component5() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        G.p(packageName, "packageName");
        G.p(versionName, "versionName");
        G.p(appBuildVersion, "appBuildVersion");
        G.p(deviceManufacturer, "deviceManufacturer");
        G.p(currentProcessDetails, "currentProcessDetails");
        G.p(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        return G.g(this.packageName, androidApplicationInfo.packageName) && G.g(this.versionName, androidApplicationInfo.versionName) && G.g(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && G.g(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && G.g(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && G.g(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + l.a(this.deviceManufacturer, l.a(this.appBuildVersion, l.a(this.versionName, this.packageName.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
