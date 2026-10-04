package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthCdma;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellSignalStrengthCdmaCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165957G = new Impl_G();

    @l
    public static final class Impl_G implements CellSignalStrengthCdmaCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellSignalStrengthCdma.class);
        private InitOnce<NakedConstructor<CellSignalStrengthCdma>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214220a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mCdmaDbm = new InitOnce<>(new InitOnce.Init() { // from class: j9.q
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214221a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mCdmaEcio = new InitOnce<>(new InitOnce.Init() { // from class: j9.r
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214222a.lambda$new$2();
            }
        });
        private InitOnce<NakedInt> __mEvdoDbm = new InitOnce<>(new InitOnce.Init() { // from class: j9.s
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214223a.lambda$new$3();
            }
        });
        private InitOnce<NakedInt> __mEvdoEcio = new InitOnce<>(new InitOnce.Init() { // from class: j9.t
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214224a.lambda$new$4();
            }
        });
        private InitOnce<NakedInt> __mEvdoSnr = new InitOnce<>(new InitOnce.Init() { // from class: j9.u
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214225a.lambda$new$5();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mCdmaDbm");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mCdmaEcio");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$3() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mEvdoDbm");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$4() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mEvdoEcio");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$5() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mEvdoSnr");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedConstructor<CellSignalStrengthCdma> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedInt mCdmaDbm() {
            return this.__mCdmaDbm.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedInt mCdmaEcio() {
            return this.__mCdmaEcio.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedInt mEvdoDbm() {
            return this.__mEvdoDbm.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedInt mEvdoEcio() {
            return this.__mEvdoEcio.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellSignalStrengthCdmaCAGI.G
        public NakedInt mEvdoSnr() {
            return this.__mEvdoSnr.get();
        }
    }
}
