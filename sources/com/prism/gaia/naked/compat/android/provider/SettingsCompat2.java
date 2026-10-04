package com.prism.gaia.naked.compat.android.provider;

import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.metadata.android.provider.SettingsCAG;

/* JADX INFO: loaded from: classes6.dex */
public class SettingsCompat2 {
    private static final String TAG = l0.b("SettingsCompat2");

    public static class Util {
        public static void clearContentProvider(Object obj) {
            if (obj == null) {
                return;
            }
            if (!C3841e.s()) {
                SettingsCAG._O26.NameValueCache.mContentProvider().set(obj, null);
                return;
            }
            Object obj2 = SettingsCAG.O26.NameValueCache.mProviderHolder().get(obj);
            if (obj2 != null) {
                SettingsCAG.O26.ContentProviderHolder.mContentProvider().set(obj2, null);
            } else {
                String unused = SettingsCompat2.TAG;
            }
        }
    }
}
