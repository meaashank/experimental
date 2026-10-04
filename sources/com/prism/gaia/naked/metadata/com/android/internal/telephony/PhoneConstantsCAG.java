package com.prism.gaia.naked.metadata.com.android.internal.telephony;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.PhoneConstantsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class PhoneConstantsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165996G = new Impl_G();

    @l
    public static final class Impl_G implements PhoneConstantsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.telephony.PhoneConstants");
        private InitOnce<NakedStaticInt> __GEMINI_SIM_NUM = new InitOnce<>(new InitOnce.Init() { // from class: y9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f241131a.lambda$new$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedStaticInt lambda$new$0() throws Exception {
            return new NakedStaticInt((Class<?>) ORG_CLASS(), "GEMINI_SIM_NUM");
        }

        @Override // com.prism.gaia.naked.metadata.com.android.internal.telephony.PhoneConstantsCAGI.G
        public NakedStaticInt GEMINI_SIM_NUM() {
            return this.__GEMINI_SIM_NUM.get();
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
