package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.telephony.NeighboringCellInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.telephony.NeighboringCellInfoCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class NeighboringCellInfoCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165959G = new Impl_G();

    @l
    public static final class Impl_G implements NeighboringCellInfoCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) NeighboringCellInfo.class);
        private InitOnce<NakedInt> __mLac = new InitOnce<>(new InitOnce.Init() { // from class: j9.y
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214229a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mCid = new InitOnce<>(new InitOnce.Init() { // from class: j9.z
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214230a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mRssi = new InitOnce<>(new InitOnce.Init() { // from class: j9.A
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214204a.lambda$new$2();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$0() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mLac");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mCid");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mRssi");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.NeighboringCellInfoCAGI.G
        public NakedInt mCid() {
            return this.__mCid.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.NeighboringCellInfoCAGI.G
        public NakedInt mLac() {
            return this.__mLac.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.NeighboringCellInfoCAGI.G
        public NakedInt mRssi() {
            return this.__mRssi.get();
        }
    }
}
