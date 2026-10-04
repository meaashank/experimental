package com.google.ads.mediation.common;

import com.google.android.gms.ads.VersionInfo;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionInfoCompareUtils {

    @NotNull
    public static final VersionInfoCompareUtils INSTANCE = new VersionInfoCompareUtils();

    private VersionInfoCompareUtils() {
    }

    @o
    public static final boolean isVersionGreaterThanOrEqualTo(@NotNull VersionInfo version1, @NotNull VersionInfo version2) {
        G.p(version1, "version1");
        G.p(version2, "version2");
        if (version1.getMajorVersion() > version2.getMajorVersion()) {
            return true;
        }
        if (version1.getMajorVersion() == version2.getMajorVersion()) {
            if (version1.getMinorVersion() > version2.getMinorVersion()) {
                return true;
            }
            if (version1.getMinorVersion() == version2.getMinorVersion() && version1.getMicroVersion() >= version2.getMicroVersion()) {
                return true;
            }
        }
        return false;
    }
}
