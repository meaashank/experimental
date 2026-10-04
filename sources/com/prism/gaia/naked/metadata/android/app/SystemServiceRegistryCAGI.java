package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class SystemServiceRegistryCAGI {

    @W6.l
    @W6.j("android.app.SystemServiceRegistry")
    public interface N extends ClassAccessor {

        @W6.l
        @W6.j("android.app.SystemServiceRegistry$ServiceFetcher")
        public interface ServiceFetcherN extends ClassAccessor {
        }

        @W6.q("SYSTEM_SERVICE_FETCHERS")
        NakedStaticObject<Map> SYSTEM_SERVICE_FETCHERS();
    }
}
