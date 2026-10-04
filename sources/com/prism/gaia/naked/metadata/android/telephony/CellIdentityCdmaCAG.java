package com.prism.gaia.naked.metadata.android.telephony;

import W6.c;
import W6.l;
import android.annotation.TargetApi;
import android.telephony.CellIdentityCdma;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.metadata.android.telephony.CellIdentityCdmaCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
@TargetApi(17)
public final class CellIdentityCdmaCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165953G = new Impl_G();

    @l
    public static final class Impl_G implements CellIdentityCdmaCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass((Class<?>) CellIdentityCdma.class);
        private InitOnce<NakedConstructor<CellIdentityCdma>> __ctor = new InitOnce<>(new InitOnce.Init() { // from class: j9.a
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214205a.lambda$new$0();
            }
        });
        private InitOnce<NakedInt> __mNetworkId = new InitOnce<>(new InitOnce.Init() { // from class: j9.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214206a.lambda$new$1();
            }
        });
        private InitOnce<NakedInt> __mSystemId = new InitOnce<>(new InitOnce.Init() { // from class: j9.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214207a.lambda$new$2();
            }
        });
        private InitOnce<NakedInt> __mBasestationId = new InitOnce<>(new InitOnce.Init() { // from class: j9.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f214208a.lambda$new$3();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$1() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mNetworkId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mSystemId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$3() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mBasestationId");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityCdmaCAGI.G
        public NakedConstructor<CellIdentityCdma> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityCdmaCAGI.G
        public NakedInt mBasestationId() {
            return this.__mBasestationId.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityCdmaCAGI.G
        public NakedInt mNetworkId() {
            return this.__mNetworkId.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.telephony.CellIdentityCdmaCAGI.G
        public NakedInt mSystemId() {
            return this.__mSystemId.get();
        }
    }
}
