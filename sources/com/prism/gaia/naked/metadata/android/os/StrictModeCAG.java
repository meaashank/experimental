package com.prism.gaia.naked.metadata.android.os;

import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.android.os.StrictModeCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class StrictModeCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165891G = new Impl_G();

    @W6.l
    public static final class Impl_G implements StrictModeCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.StrictMode");
        private InitOnce<NakedStaticInt> __sVmPolicyMask = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.Z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165900a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "sVmPolicyMask");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.os.StrictModeCAGI.G
        public NakedStaticInt sVmPolicyMask() {
            return this.__sVmPolicyMask.get();
        }
    }
}
