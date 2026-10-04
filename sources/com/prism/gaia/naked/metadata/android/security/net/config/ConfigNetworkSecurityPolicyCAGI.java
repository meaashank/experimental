package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ConfigNetworkSecurityPolicyCAGI {

    @l
    @W6.j("android.security.net.config.ConfigNetworkSecurityPolicy")
    public interface N24 extends ClassAccessor {
        @p("isCleartextTrafficPermitted")
        NakedMethod<Boolean> isCleartextTrafficPermitted();

        @n("mConfig")
        NakedObject<Object> mConfig();
    }
}
