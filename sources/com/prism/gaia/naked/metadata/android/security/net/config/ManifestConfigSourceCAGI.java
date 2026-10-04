package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import android.content.pm.ApplicationInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ManifestConfigSourceCAGI {

    @l
    @W6.j("android.security.net.config.ManifestConfigSource")
    public interface N24_N25 extends ClassAccessor {

        @l
        @W6.j("android.security.net.config.ManifestConfigSource$DefaultConfigSource")
        public interface DefaultConfigSource extends ClassAccessor {
            @W6.f({boolean.class, int.class})
            @W6.k
            NakedConstructor<Object> ctor();
        }
    }

    @l
    @W6.j("android.security.net.config.ManifestConfigSource")
    public interface O26_O27 extends ClassAccessor {

        @l
        @W6.j("android.security.net.config.ManifestConfigSource$DefaultConfigSource")
        public interface DefaultConfigSource extends ClassAccessor {
            @W6.f({boolean.class, int.class, int.class})
            @W6.k
            NakedConstructor<Object> ctor();
        }
    }

    @l
    @W6.j("android.security.net.config.ManifestConfigSource")
    public interface P28 extends ClassAccessor {

        @l
        @W6.j("android.security.net.config.ManifestConfigSource$DefaultConfigSource")
        public interface DefaultConfigSource extends ClassAccessor {
            @W6.f({boolean.class, ApplicationInfo.class})
            @W6.k
            NakedConstructor<Object> ctor();
        }
    }
}
