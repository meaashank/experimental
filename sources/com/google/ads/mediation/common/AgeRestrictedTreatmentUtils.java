package com.google.ads.mediation.common;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import dd.k;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AgeRestrictedTreatmentUtils {

    @NotNull
    public static final AgeRestrictedTreatmentUtils INSTANCE = new AgeRestrictedTreatmentUtils();

    private AgeRestrictedTreatmentUtils() {
    }

    @k
    @o
    public static final boolean runtimeGmaSdkSupportsChildAgeRestrictedTreatment() {
        return runtimeGmaSdkSupportsChildAgeRestrictedTreatment$default(null, 1, null);
    }

    public static /* synthetic */ boolean runtimeGmaSdkSupportsChildAgeRestrictedTreatment$default(VersionInfo versionInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            versionInfo = MobileAds.getVersion();
            G.o(versionInfo, "getVersion(...)");
        }
        return runtimeGmaSdkSupportsChildAgeRestrictedTreatment(versionInfo);
    }

    @k
    @o
    public static final boolean runtimeGmaSdkSupportsChildAgeRestrictedTreatment(@NotNull VersionInfo gmaVersion) {
        G.p(gmaVersion, "gmaVersion");
        return VersionInfoCompareUtils.isVersionGreaterThanOrEqualTo(gmaVersion, new VersionInfo(1, 2, 0));
    }
}
