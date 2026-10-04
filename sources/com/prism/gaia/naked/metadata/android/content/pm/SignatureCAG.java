package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.Signature;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.content.pm.SignatureCAGI;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SignatureCAG {
    public static Impl_L21 L21 = new Impl_L21();

    @W6.l
    public static final class Impl_L21 implements SignatureCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) Signature.class);
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.x2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165796a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Certificate[].class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SignatureCAGI.L21
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
