package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.Signature;
import android.util.ArraySet;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.content.pm.SigningDetailsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SigningDetailsCAG {
    public static Impl_T33 T33 = new Impl_T33();

    @W6.l
    public static final class Impl_T33 implements SigningDetailsCAGI.T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.SigningDetails");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.y2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165800a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), (Class<?>[]) new Class[]{Signature[].class, Integer.TYPE, ArraySet.class, Signature[].class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SigningDetailsCAGI.T33
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
