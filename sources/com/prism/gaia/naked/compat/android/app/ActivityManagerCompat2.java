package com.prism.gaia.naked.compat.android.app;

import com.prism.gaia.naked.metadata.android.app.ActivityManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityManagerCompat2 {

    public static class Util {
        public static Object ctorPendingIntentInfo(String str, int i10, boolean z10, int i11) {
            return ActivityManagerCAG.S31.PendingIntentInfo.ctor().newInstance(str, Integer.valueOf(i10), Boolean.valueOf(z10), Integer.valueOf(i11));
        }
    }
}
