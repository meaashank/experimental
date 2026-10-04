package com.prism.gaia.naked.compat.android.content.pm;

import W6.c;
import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import androidx.compose.runtime.C1979x1;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import java.io.File;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ApplicationInfoCompat2 {

    public static class Util {
        public static String getLibraryCpuAbiDirPart(ApplicationInfo applicationInfo) {
            return "lib" + File.separator + ApplicationInfoCAG.L21.primaryCpuAbi().get(applicationInfo);
        }

        public static long getLongVersionCode(ApplicationInfo applicationInfo) {
            return C3841e.v() ? ApplicationInfoCAG.P28.longVersionCode().get(applicationInfo) : ((long) ApplicationInfoCAG._O27.versionCode().get(applicationInfo)) & ZipKt.f225990j;
        }

        public static String getPrimaryCpuAbi(ApplicationInfo applicationInfo) {
            return ApplicationInfoCAG.L21.primaryCpuAbi().get(applicationInfo);
        }

        @TargetApi(26)
        public static int getTargetSandboxVersion(ApplicationInfo applicationInfo) {
            return ApplicationInfoCAG.O26.targetSandboxVersion().get(applicationInfo);
        }

        public static int getVersionCode(ApplicationInfo applicationInfo) {
            return C3841e.v() ? (int) ApplicationInfoCAG.P28.longVersionCode().get(applicationInfo) : ApplicationInfoCAG._O27.versionCode().get(applicationInfo);
        }

        @TargetApi(24)
        public static boolean usesCleartextTraffic(ApplicationInfo applicationInfo) {
            return C3841e.w() ? (applicationInfo.flags & C1979x1.f100279m) != 0 : C3841e.s() ? (applicationInfo.flags & C1979x1.f100279m) != 0 && getTargetSandboxVersion(applicationInfo) < 2 : (applicationInfo.flags & C1979x1.f100279m) != 0;
        }
    }
}
