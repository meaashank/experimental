package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticObject;
import com.prism.gaia.naked.metadata.android.app.SystemServiceRegistryCAGI;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SystemServiceRegistryCAG {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static Impl_N f165384N = new Impl_N();

    @W6.l
    public static final class Impl_N implements SystemServiceRegistryCAGI.N {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.SystemServiceRegistry");
        private InitOnce<NakedStaticObject<Map>> __SYSTEM_SERVICE_FETCHERS = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.J3
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165336a.lambda$new$0();
            }
        });
        public Impl_ServiceFetcherN ServiceFetcherN = new Impl_ServiceFetcherN();

        @W6.l
        public static final class Impl_ServiceFetcherN implements SystemServiceRegistryCAGI.N.ServiceFetcherN {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.SystemServiceRegistry$ServiceFetcher");

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticObject lambda$new$0() throws Exception {
            return new NakedStaticObject((Class<?>) ORG_CLASS(), "SYSTEM_SERVICE_FETCHERS");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.SystemServiceRegistryCAGI.N
        public NakedStaticObject<Map> SYSTEM_SERVICE_FETCHERS() {
            return this.__SYSTEM_SERVICE_FETCHERS.get();
        }
    }
}
