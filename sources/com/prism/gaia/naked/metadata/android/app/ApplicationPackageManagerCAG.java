package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.app.ApplicationPackageManagerCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class ApplicationPackageManagerCAG {
    public static Impl_I14 I14 = new Impl_I14();

    @W6.l
    public static final class Impl_I14 implements ApplicationPackageManagerCAGI.I14 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.app.ApplicationPackageManager");
        private InitOnce<NakedConstructor<?>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.app.T1
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165387a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor((Class<?>) ORG_CLASS(), new String[]{"android.app.ContextImpl", "android.content.pm.IPackageManager"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.app.ApplicationPackageManagerCAGI.I14
        public NakedConstructor<?> ctor() {
            return this.__ctor.get();
        }
    }
}
