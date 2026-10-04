package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.R0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class AdQualityResult {

    @NotNull
    private final String beaconUrl;

    @Nullable
    private String extras;

    @NotNull
    private String imageLocation;

    @Nullable
    private String sdkModelResult;

    public AdQualityResult(@NotNull String imageLocation, @Nullable String str, @NotNull String beaconUrl, @Nullable String str2) {
        G.p(imageLocation, "imageLocation");
        G.p(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.imageLocation;
    }

    @Nullable
    public final String component2() {
        return this.sdkModelResult;
    }

    @NotNull
    public final String component3() {
        return this.beaconUrl;
    }

    @Nullable
    public final String component4() {
        return this.extras;
    }

    @NotNull
    public final AdQualityResult copy(@NotNull String imageLocation, @Nullable String str, @NotNull String beaconUrl, @Nullable String str2) {
        G.p(imageLocation, "imageLocation");
        G.p(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, str, beaconUrl, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        return G.g(this.imageLocation, adQualityResult.imageLocation) && G.g(this.sdkModelResult, adQualityResult.sdkModelResult) && G.g(this.beaconUrl, adQualityResult.beaconUrl) && G.g(this.extras, adQualityResult.extras);
    }

    @NotNull
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iA = l.a(this.beaconUrl, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.extras;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setImageLocation(@NotNull String str) {
        G.p(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(@Nullable String str) {
        this.sdkModelResult = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdQualityResult(imageLocation=");
        sb2.append(this.imageLocation);
        sb2.append(", sdkModelResult=");
        sb2.append(this.sdkModelResult);
        sb2.append(", beaconUrl=");
        sb2.append(this.beaconUrl);
        sb2.append(", extras=");
        return R0.a(sb2, this.extras, ')');
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, C4969v c4969v) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
