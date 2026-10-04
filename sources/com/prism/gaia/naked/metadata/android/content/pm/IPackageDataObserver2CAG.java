package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.Intent;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserver2CAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IPackageDataObserver2CAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165639G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IPackageDataObserver2CAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.IPackageDeleteObserver2");
        private InitOnce<NakedMethod<Void>> __onUserActionRequired = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165797a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __onPackageDeleted = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165801a.lambda$new$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onUserActionRequired", (Class<?>[]) new Class[]{Intent.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onPackageDeleted", (Class<?>[]) new Class[]{String.class, Integer.TYPE, String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserver2CAGI.G
        public NakedMethod<Void> onPackageDeleted() {
            return this.__onPackageDeleted.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageDataObserver2CAGI.G
        public NakedMethod<Void> onUserActionRequired() {
            return this.__onUserActionRequired.get();
        }
    }
}
