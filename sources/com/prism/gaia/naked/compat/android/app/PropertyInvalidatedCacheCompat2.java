package com.prism.gaia.naked.compat.android.app;

import com.prism.gaia.naked.metadata.android.app.PropertyInvalidatedCacheCAG;

/* JADX INFO: loaded from: classes6.dex */
public class PropertyInvalidatedCacheCompat2 {

    public static class Util {
        public static boolean clearCache(Object obj) {
            if (obj == null || PropertyInvalidatedCacheCAG.f165370G.clear() == null) {
                return false;
            }
            PropertyInvalidatedCacheCAG.f165370G.clear().call(obj, new Object[0]);
            return true;
        }

        public static void disableCache(Object obj) {
            if (obj != null) {
                PropertyInvalidatedCacheCAG.f165370G.mDisabled().set(obj, true);
            }
        }
    }
}
