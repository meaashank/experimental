package com.prism.gaia.naked.metadata.android.content.pm;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.metadata.android.content.pm.IPackageDeleteObserverCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IPackageDeleteObserverCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165641G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IPackageDeleteObserverCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.content.pm.IPackageDeleteObserver");
        private InitOnce<NakedMethod<Void>> __packageDeleted = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.content.pm.B
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165611a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "packageDeleted", (Class<?>[]) new Class[]{String.class, Integer.TYPE});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.content.pm.IPackageDeleteObserverCAGI.G
        public NakedMethod<Void> packageDeleted() {
            return this.__packageDeleted.get();
        }
    }
}
