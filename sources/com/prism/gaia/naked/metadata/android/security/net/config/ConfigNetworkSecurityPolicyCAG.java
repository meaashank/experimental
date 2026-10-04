package com.prism.gaia.naked.metadata.android.security.net.config;

import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.security.net.config.ConfigNetworkSecurityPolicyCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ConfigNetworkSecurityPolicyCAG {
    public static Impl_N24 N24 = new Impl_N24();

    @l
    public static final class Impl_N24 implements ConfigNetworkSecurityPolicyCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.net.config.ConfigNetworkSecurityPolicy");
        private InitOnce<NakedObject<Object>> __mConfig = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165946a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Boolean>> __isCleartextTrafficPermitted = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.net.config.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165947a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mConfig");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "isCleartextTrafficPermitted");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ConfigNetworkSecurityPolicyCAGI.N24
        public NakedMethod<Boolean> isCleartextTrafficPermitted() {
            return this.__isCleartextTrafficPermitted.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.net.config.ConfigNetworkSecurityPolicyCAGI.N24
        public NakedObject<Object> mConfig() {
            return this.__mConfig.get();
        }
    }
}
