package com.prism.gaia.naked.metadata.com.android.server;

import W6.j;
import W6.m;
import W6.n;
import W6.p;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class SystemConfigCAGI {

    @m
    @j("com.android.server.SystemConfig")
    public interface G extends ClassAccessor {
        @s("getInstance")
        NakedStaticMethod<Object> getInstance();
    }

    @m
    @j("com.android.server.SystemConfig")
    public interface Q29 extends ClassAccessor {

        @m
        @j("com.android.server.SystemConfig$SharedLibraryEntry")
        public interface SharedLibraryEntry extends ClassAccessor {
            @n("dependencies")
            NakedObject<String[]> dependencies();

            @n("filename")
            NakedObject<String> filename();

            @n("name")
            NakedObject<String> name();
        }

        @p("getSharedLibraries")
        NakedMethod<Map<String, Object>> getSharedLibraries();
    }

    @m
    @j("com.android.server.SystemConfig")
    public interface _P28 extends ClassAccessor {
        @p("getSharedLibraries")
        NakedMethod<Map<String, String>> getSharedLibraries();
    }
}
