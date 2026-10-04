package com.google.ads.mediation.common;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeAdHelper {

    @NotNull
    public static final NativeAdHelper INSTANCE = new NativeAdHelper();

    private NativeAdHelper() {
    }

    @o
    public static final boolean runtimeGmaSdkListensToAdapterReportedImpressions() {
        VersionInfo version = MobileAds.getVersion();
        G.o(version, "getVersion(...)");
        return VersionInfoCompareUtils.isVersionGreaterThanOrEqualTo(version, new VersionInfo(24, 4, 0));
    }
}
