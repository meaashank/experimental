package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import W6.n;
import W6.p;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ApplicationConfigCAGI {

    @l
    @W6.j("android.security.net.config.ApplicationConfig")
    public interface N24 extends ClassAccessor {
        @p("ensureInitialized")
        NakedMethod<Void> ensureInitialized();

        @s("getDefaultInstance")
        NakedStaticMethod<Object> getDefaultInstance();

        @p("isCleartextTrafficPermitted")
        NakedMethod<Boolean> isCleartextTrafficPermitted();

        @n("mConfigSource")
        NakedObject<Object> mConfigSource();

        @n("mInitialized")
        NakedBoolean mInitialized();

        @W6.g({"android.security.net.config.ApplicationConfig"})
        @s("setDefaultInstance")
        NakedStaticMethod<Void> setDefaultInstance();
    }
}
