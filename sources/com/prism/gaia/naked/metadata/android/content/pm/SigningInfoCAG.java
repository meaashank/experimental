package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.SigningInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.content.pm.SigningInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class SigningInfoCAG {
    public static Impl_P28 P28 = new Impl_P28();
    public static Impl_T33 T33 = new Impl_T33();

    @W6.l
    public static final class Impl_P28 implements SigningInfoCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) z2.a());
        private InitOnce<NakedConstructor<SigningInfo>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.A2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165609a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"android.content.pm.PackageParser$SigningDetails"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SigningInfoCAGI.P28
        public NakedConstructor<SigningInfo> ctor() {
            return this.__ctor.get();
        }
    }

    @W6.l
    public static final class Impl_T33 implements SigningInfoCAGI.T33 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) z2.a());
        private InitOnce<NakedConstructor<SigningInfo>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.B2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165614a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"android.content.pm.SigningDetails"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.SigningInfoCAGI.T33
        public NakedConstructor<SigningInfo> ctor() {
            return this.__ctor.get();
        }
    }
}
