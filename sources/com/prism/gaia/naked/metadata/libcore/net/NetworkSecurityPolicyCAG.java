package com.prism.gaia.naked.metadata.libcore.net;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.libcore.net.NetworkSecurityPolicyCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class NetworkSecurityPolicyCAG {
    public static Impl_N24 N24 = new Impl_N24();

    @l
    public static final class Impl_N24 implements NetworkSecurityPolicyCAGI.N24 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("libcore.net.NetworkSecurityPolicy");
        private InitOnce<NakedStaticMethod<Object>> __getInstance = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.libcore.net.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f166019a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
            return new NakedStaticMethod((Class<?>) ORG_CLASS(), "getInstance");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.libcore.net.NetworkSecurityPolicyCAGI.N24
        public NakedStaticMethod<Object> getInstance() {
            return this.__getInstance.get();
        }
    }
}
