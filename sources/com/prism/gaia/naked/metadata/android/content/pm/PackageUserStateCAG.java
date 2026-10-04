package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.metadata.android.content.pm.PackageUserStateCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class PackageUserStateCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165668G = new Impl_G();

    @W6.l
    public static final class Impl_G implements PackageUserStateCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.PackageUserState");
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.h2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165732a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.PackageUserStateCAGI.G
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
