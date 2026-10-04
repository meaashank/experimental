package com.prism.gaia.naked.compat.android.security;

import com.prism.gaia.naked.metadata.android.security.FrameworkNetworkSecurityPolicyCAG;

/* JADX INFO: loaded from: classes6.dex */
public class FrameworkNetworkSecurityPolicyCompat2 {

    public static class Util {
        public static void changeCleartextTrafficPermitted(Object obj, boolean z10) {
            FrameworkNetworkSecurityPolicyCAG.N24.mCleartextTrafficPermitted().set(obj, z10);
        }

        public static boolean isInstanceOf(Object obj) {
            return (obj == null || FrameworkNetworkSecurityPolicyCAG.N24.ORG_CLASS() == null || !FrameworkNetworkSecurityPolicyCAG.N24.ORG_CLASS().isInstance(obj)) ? false : true;
        }
    }
}
