package com.prism.gaia.naked.metadata.android.security;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.metadata.android.security.FrameworkNetworkSecurityPolicyCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class FrameworkNetworkSecurityPolicyCAG {
    public static Impl_N24 N24 = new Impl_N24();

    @l
    public static final class Impl_N24 implements FrameworkNetworkSecurityPolicyCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.security.FrameworkNetworkSecurityPolicy");
        private InitOnce<NakedBoolean> __mCleartextTrafficPermitted = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.security.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165939a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedBoolean lambda$new$0() throws Exception {
            return new NakedBoolean((Class<?>) ORG_CLASS(), "mCleartextTrafficPermitted");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.security.FrameworkNetworkSecurityPolicyCAGI.N24
        public NakedBoolean mCleartextTrafficPermitted() {
            return this.__mCleartextTrafficPermitted.get();
        }
    }
}
