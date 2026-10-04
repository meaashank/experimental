package com.prism.gaia.naked.metadata.android.security;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class FrameworkNetworkSecurityPolicyCAGI {

    @l
    @j("android.security.FrameworkNetworkSecurityPolicy")
    public interface N24 extends ClassAccessor {
        @n("mCleartextTrafficPermitted")
        NakedBoolean mCleartextTrafficPermitted();
    }
}
