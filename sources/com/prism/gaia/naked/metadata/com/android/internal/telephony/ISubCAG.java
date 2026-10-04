package com.prism.gaia.naked.metadata.com.android.internal.telephony;

import W6.c;
import W6.l;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.ISubCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ISubCAG {
    public static Impl_L21 L21 = new Impl_L21();

    @l
    public static final class Impl_L21 implements ISubCAGI.L21 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.telephony.ISub");
        public Impl_Stub Stub = new Impl_Stub();

        @l
        public static final class Impl_Stub implements ISubCAGI.L21.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("com.android.internal.telephony.ISub$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: y9.e
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f241128a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.com.android.internal.telephony.ISubCAGI.L21.Stub
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
