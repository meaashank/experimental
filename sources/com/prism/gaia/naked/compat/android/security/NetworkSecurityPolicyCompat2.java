package com.prism.gaia.naked.compat.android.security;

import com.prism.gaia.naked.metadata.libcore.net.NetworkSecurityPolicyCAG;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkSecurityPolicyCompat2 {

    public static class Util {
        public static Object getInstanceLibcore() {
            return NetworkSecurityPolicyCAG.N24.getInstance().call(new Object[0]);
        }
    }
}
