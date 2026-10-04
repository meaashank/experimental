package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.telephony.CellInfoGsmCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellInfoGsmCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165956G = new Impl_G();

    @l
    public static final class Impl_G implements CellInfoGsmCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellInfoGsm.class);
        private InitOnce<NakedConstructor<CellInfoGsm>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214217a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<CellIdentityGsm>> __mCellIdentityGsm = new InitOnce<>(new InitOnce.Init() { // from class: j9.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214218a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<CellSignalStrengthGsm>> __mCellSignalStrengthGsm = new InitOnce<>(new InitOnce.Init() { // from class: j9.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214219a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCellIdentityGsm");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCellSignalStrengthGsm");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoGsmCAGI.G
        public NakedConstructor<CellInfoGsm> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoGsmCAGI.G
        public NakedObject<CellIdentityGsm> mCellIdentityGsm() {
            return this.__mCellIdentityGsm.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoGsmCAGI.G
        public NakedObject<CellSignalStrengthGsm> mCellSignalStrengthGsm() {
            return this.__mCellSignalStrengthGsm.get();
        }
    }
}
