package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.SigningInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class InstallSourceInfoCAG {
    public static Impl_P28 P28 = new Impl_P28();
    public static Impl_U34 U34 = new Impl_U34();

    @W6.l
    public static final class Impl_P28 implements InstallSourceInfoCAGI.P28 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) H.a());
        private InitOnce<NakedObject<String>> __mInitiatingPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.I
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165634a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<SigningInfo>> __mInitiatingPackageSigningInfo = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.J
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165644a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<String>> __mOriginatingPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.K
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165647a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<String>> __mInstallingPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.L
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165650a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInitiatingPackageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInitiatingPackageSigningInfo");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mOriginatingPackageName");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mInstallingPackageName");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI.P28
        public NakedObject<String> mInitiatingPackageName() {
            return this.__mInitiatingPackageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI.P28
        public NakedObject<SigningInfo> mInitiatingPackageSigningInfo() {
            return this.__mInitiatingPackageSigningInfo.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI.P28
        public NakedObject<String> mInstallingPackageName() {
            return this.__mInstallingPackageName.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI.P28
        public NakedObject<String> mOriginatingPackageName() {
            return this.__mOriginatingPackageName.get();
        }
    }

    @W6.l
    public static final class Impl_U34 implements InstallSourceInfoCAGI.U34 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) H.a());
        private InitOnce<NakedObject<String>> __mUpdateOwnerPackageName = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.M
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165654a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mUpdateOwnerPackageName");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.InstallSourceInfoCAGI.U34
        public NakedObject<String> mUpdateOwnerPackageName() {
            return this.__mUpdateOwnerPackageName.get();
        }
    }
}
