package com.prism.gaia.naked.compat.android.security.net.config;

import android.annotation.TargetApi;
import com.prism.gaia.naked.metadata.android.security.net.config.ConfigNetworkSecurityPolicyCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigNetworkSecurityPolicyCompat2 {

    public static class Util {
        public static Object getConfig(Object obj) {
            if (obj == null) {
                return null;
            }
            return ConfigNetworkSecurityPolicyCAG.N24.mConfig().get(obj);
        }

        @TargetApi(24)
        public static boolean isCleartextTrafficPermitted(Object obj) {
            return ConfigNetworkSecurityPolicyCAG.N24.isCleartextTrafficPermitted().call(obj, new Object[0]).booleanValue();
        }

        public static boolean isInstanceOf(Object obj) {
            return (obj == null || ConfigNetworkSecurityPolicyCAG.N24.ORG_CLASS() == null || !ConfigNetworkSecurityPolicyCAG.N24.ORG_CLASS().isInstance(obj)) ? false : true;
        }
    }
}
