package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.android.content.pm.UserInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class UserInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165685G = new Impl_G();

    @W6.l
    public static final class Impl_G implements UserInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.UserInfo");
        private InitOnce<NakedStaticInt> __FLAG_PRIMARY = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.C2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165618a.lambda$new$0();
            }
        });
        private InitOnce<NakedConstructor<Object>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.D2
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165622a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "FLAG_PRIMARY");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$1() throws Exception {
            Class clsORG_CLASS = ORG_CLASS();
            Class cls = Integer.TYPE;
            return new NakedConstructor((Class<?>) clsORG_CLASS, (Class<?>[]) new Class[]{cls, String.class, cls});
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.UserInfoCAGI.G
        public NakedStaticInt FLAG_PRIMARY() {
            return this.__FLAG_PRIMARY.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.UserInfoCAGI.G
        public NakedConstructor<Object> ctor() {
            return this.__ctor.get();
        }
    }
}
