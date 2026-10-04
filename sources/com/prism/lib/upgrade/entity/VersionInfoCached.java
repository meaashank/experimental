package com.prism.lib.upgrade.entity;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.V;
import com.prism.commons.utils.W;
import ib.C4600a;
import u4.g;

/* JADX INFO: loaded from: classes7.dex */
public class VersionInfoCached {
    private static final String KEY_CHECKSUM = "KEY_VIC_CHECKSUM";
    private static final String KEY_PKG_CHANNEL = "KEY_VIC_PKG_CHANNEL";
    private static final String KEY_PKG_SIZE = "KEY_VIC_PKG_SIZE";
    private static final String KEY_PKG_URL = "KEY_VIC_PKG_URL";
    private static final String KEY_PKG_VERSION_CODE = "KEY_VIC_PKG_VERSION_CODE";
    private static final String KEY_PKG_VERSION_NAME = "KEY_VIC_PKG_VERSION_NAME";
    private static final String KEY_POPUP_COUNT = "KEY_VIC_POPUP_COUNT";
    private static final String KEY_POPUP_INTERVAL_TIME = "KEY_VIC_POPUP_INTERVAL_TIME";
    private static final String KEY_POPUP_INTERVAL_TYPE = "KEY_VIC_POPUP_INTERVAL_TYPE";
    private static final String KEY_POPUP_THEME = "KEY_VIC_POPUP_THEME";
    private static final String KEY_POPUP_TYPE = "KEY_VIC_POPUP_TYPE";
    private static final String KEY_TIMESTAMP = "KEY_VIC_TIMESTAMP";
    private static final String KEY_UPGRADE_DESC = "KEY_VIC_UPGRADE_DESC";
    private static final String KEY_UPGRADE_TIME = "KEY_VIC_UPGRADE_TIME";
    private static final String TAG = "VersionInfoCached";
    private static volatile VersionInfo versionInfoCached;

    public static boolean cacheVersionInfo(@NonNull Context context, @NonNull VersionInfo versionInfo) {
        if (versionInfoCached != null && (versionInfoCached.upgradeTime > versionInfo.upgradeTime || versionInfoCached.equals(versionInfo))) {
            return false;
        }
        synchronized (VersionInfoCached.class) {
            V vA = W.a(C4600a.f202917a);
            vA.m(context, KEY_POPUP_TYPE, versionInfo.popupType);
            vA.k(context, KEY_POPUP_COUNT, versionInfo.popupCount);
            vA.m(context, KEY_POPUP_INTERVAL_TYPE, versionInfo.popupIntervalType);
            vA.k(context, KEY_POPUP_INTERVAL_TIME, versionInfo.popupIntervalTime);
            vA.m(context, KEY_POPUP_THEME, versionInfo.popupTheme);
            vA.m(context, KEY_PKG_VERSION_NAME, versionInfo.pkgVersionName);
            vA.l(context, KEY_PKG_VERSION_CODE, versionInfo.pkgVersionCode);
            vA.m(context, KEY_PKG_CHANNEL, versionInfo.pkgChannel);
            vA.l(context, KEY_PKG_SIZE, versionInfo.pkgSize);
            vA.m(context, KEY_PKG_URL, versionInfo.pkgUrl);
            vA.l(context, KEY_UPGRADE_TIME, versionInfo.upgradeTime);
            vA.m(context, KEY_UPGRADE_DESC, versionInfo.upgradeDesc);
            vA.l(context, KEY_TIMESTAMP, versionInfo.timestamp);
            vA.m(context, KEY_CHECKSUM, versionInfo.checksum);
            versionInfoCached = versionInfo;
        }
        return true;
    }

    public static long getLatestVersionTimestamp(Context context) {
        return 0L;
    }

    @Nullable
    public static VersionInfo getVersionInfoCached(@NonNull Context context) {
        if (versionInfoCached != null) {
            return versionInfoCached;
        }
        synchronized (VersionInfoCached.class) {
            try {
                if (versionInfoCached != null) {
                    return versionInfoCached;
                }
                V vA = W.a(C4600a.f202917a);
                String strG = vA.g(context, KEY_POPUP_TYPE, "unknown");
                if (!strG.equals("limit") && !strG.equals(g.f239555d)) {
                    Log.e(TAG, "read popupType unknown");
                    return null;
                }
                int iD = vA.d(context, KEY_POPUP_COUNT, -1);
                String strG2 = vA.g(context, KEY_POPUP_INTERVAL_TYPE, "unknown");
                if (!strG2.equals("open") && !strG2.equals("trigger") && !strG2.equals("time")) {
                    Log.e(TAG, "read popupIntervalType unknown");
                    return null;
                }
                int iD2 = vA.d(context, KEY_POPUP_INTERVAL_TIME, 0);
                String strG3 = vA.g(context, KEY_POPUP_THEME, "default");
                String strG4 = vA.g(context, KEY_PKG_VERSION_NAME, "0.0.0");
                long jE = vA.e(context, KEY_PKG_VERSION_CODE, 0L);
                String strG5 = vA.g(context, KEY_PKG_CHANNEL, "unknown");
                long jE2 = vA.e(context, KEY_PKG_SIZE, 0L);
                String strG6 = vA.g(context, KEY_PKG_URL, "");
                long jE3 = vA.e(context, KEY_UPGRADE_TIME, 0L);
                String strG7 = vA.g(context, KEY_UPGRADE_DESC, "");
                long jE4 = vA.e(context, KEY_TIMESTAMP, 0L);
                String strG8 = vA.g(context, KEY_CHECKSUM, "unknown");
                versionInfoCached = new VersionInfo();
                versionInfoCached.popupType = strG;
                versionInfoCached.popupCount = iD;
                versionInfoCached.popupIntervalType = strG2;
                versionInfoCached.popupIntervalTime = iD2;
                versionInfoCached.popupTheme = strG3;
                versionInfoCached.pkgVersionName = strG4;
                versionInfoCached.pkgVersionCode = jE;
                versionInfoCached.pkgChannel = strG5;
                versionInfoCached.pkgSize = jE2;
                versionInfoCached.pkgUrl = strG6;
                versionInfoCached.upgradeTime = jE3;
                versionInfoCached.upgradeDesc = strG7;
                versionInfoCached.timestamp = jE4;
                versionInfoCached.checksum = strG8;
                if (!versionInfoCached.verifyChecksum()) {
                    Log.e(TAG, "read cached versionInfo verify checksum failed");
                    versionInfoCached = null;
                    return null;
                }
                if (strG2.equals("time") && iD2 <= 0) {
                    versionInfoCached.popupIntervalTime = 60;
                }
                Log.i(TAG, "read cached versionInfo successful");
                return versionInfoCached;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saveLatestVersionTimestamp(Context context, long j10) {
    }
}
