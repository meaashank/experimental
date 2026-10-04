package com.prism.gaia.naked.metadata.com.android.internal.telephony;

import W6.c;
import W6.l;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.ISmsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ISmsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165993G = new Impl_G();

    @l
    public static final class Impl_G implements ISmsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.telephony.ISms");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements ISmsCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.telephony.ISms$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: y9.d
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f241127a.lambda$new$0();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedStaticMethod lambda$new$0() throws Exception {
                return new NakedStaticMethod((Class<?>) ORG_CLASS(), "asInterface", (Class<?>[]) new Class[]{IBinder.class});
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.com.android.internal.telephony.ISmsCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }
}
