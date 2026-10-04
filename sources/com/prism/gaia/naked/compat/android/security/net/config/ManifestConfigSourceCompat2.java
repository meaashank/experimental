package com.prism.gaia.naked.compat.android.security.net.config;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.compat.android.content.pm.ApplicationInfoCompat2;
import com.prism.gaia.naked.metadata.android.security.net.config.ManifestConfigSourceCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ManifestConfigSourceCompat2 {

    public static class Util {
        @TargetApi(24)
        public static Object ctor(ApplicationInfo applicationInfo, int i10) {
            boolean zUsesCleartextTraffic = ApplicationInfoCompat2.Util.usesCleartextTraffic(applicationInfo);
            return C3841e.v() ? ManifestConfigSourceCAG.P28.DefaultConfigSource.ctor().newInstance(Boolean.valueOf(zUsesCleartextTraffic), applicationInfo) : C3841e.s() ? ManifestConfigSourceCAG.O26_O27.DefaultConfigSource.ctor().newInstance(Boolean.valueOf(zUsesCleartextTraffic), Integer.valueOf(i10), Integer.valueOf(ApplicationInfoCompat2.Util.getTargetSandboxVersion(applicationInfo))) : ManifestConfigSourceCAG.N24_N25.DefaultConfigSource.ctor().newInstance(Boolean.valueOf(zUsesCleartextTraffic), Integer.valueOf(i10));
        }

        @TargetApi(24)
        public static Object ctorFromContext(Context context) throws Exception {
            return Class.forName("android.security.net.config.ManifestConfigSource").getConstructor(Context.class).newInstance(context);
        }
    }
}
