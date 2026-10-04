package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellIdentityGsmCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165954G = new Impl_G();

    @l
    public static final class Impl_G implements CellIdentityGsmCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellIdentityGsm.class);
        private InitOnce<NakedConstructor<CellIdentityGsm>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214209a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mMcc = new InitOnce<>(new InitOnce.Init() { // from class: j9.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214210a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mMnc = new InitOnce<>(new InitOnce.Init() { // from class: j9.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214211a.lambda$new$2();
            }
        });
        private InitOnce<NakedInt> __mLac = new InitOnce<>(new InitOnce.Init() { // from class: j9.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214212a.lambda$new$3();
            }
        });
        private InitOnce<NakedInt> __mCid = new InitOnce<>(new InitOnce.Init() { // from class: j9.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214213a.lambda$new$4();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mMcc");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mMnc");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$3() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mLac");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$4() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mCid");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI.G
        public NakedConstructor<CellIdentityGsm> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI.G
        public NakedInt mCid() {
            return this.__mCid.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI.G
        public NakedInt mLac() {
            return this.__mLac.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI.G
        public NakedInt mMcc() {
            return this.__mMcc.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityGsmCAGI.G
        public NakedInt mMnc() {
            return this.__mMnc.get();
        }
    }
}
