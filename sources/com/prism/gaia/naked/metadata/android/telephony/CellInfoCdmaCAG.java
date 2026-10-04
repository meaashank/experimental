package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.telephony.CellInfoCdmaCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellInfoCdmaCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165955G = new Impl_G();

    @l
    public static final class Impl_G implements CellInfoCdmaCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellInfoCdma.class);
        private InitOnce<NakedConstructor<CellInfoCdma>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214214a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<CellIdentityCdma>> __mCellIdentityCdma = new InitOnce<>(new InitOnce.Init() { // from class: j9.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214215a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<CellSignalStrengthCdma>> __mCellSignalStrengthCdma = new InitOnce<>(new InitOnce.Init() { // from class: j9.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214216a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCellIdentityCdma");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mCellSignalStrengthCdma");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoCdmaCAGI.G
        public NakedConstructor<CellInfoCdma> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoCdmaCAGI.G
        public NakedObject<CellIdentityCdma> mCellIdentityCdma() {
            return this.__mCellIdentityCdma.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellInfoCdmaCAGI.G
        public NakedObject<CellSignalStrengthCdma> mCellSignalStrengthCdma() {
            return this.__mCellSignalStrengthCdma.get();
        }
    }
}
