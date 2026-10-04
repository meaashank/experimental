package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthGsm;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthGsmCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellSignalStrengthGsmCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165958G = new Impl_G();

    @l
    public static final class Impl_G implements CellSignalStrengthGsmCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellSignalStrengthGsm.class);
        private InitOnce<NakedConstructor<CellSignalStrengthGsm>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.v
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214226a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mSignalStrength = new InitOnce<>(new InitOnce.Init() { // from class: j9.w
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214227a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mBitErrorRate = new InitOnce<>(new InitOnce.Init() { // from class: j9.x
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214228a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mSignalStrength");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mBitErrorRate");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthGsmCAGI.G
        public NakedConstructor<CellSignalStrengthGsm> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthGsmCAGI.G
        public NakedInt mBitErrorRate() {
            return this.__mBitErrorRate.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthGsmCAGI.G
        public NakedInt mSignalStrength() {
            return this.__mSignalStrength.get();
        }
    }
}
