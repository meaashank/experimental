package com.prism.gaia.naked.metadata.android.os;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.os.IDeviceIdentifiersPolicyServiceCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IDeviceIdentifiersPolicyServiceCAG {
    public static Impl_O26 O26 = new Impl_O26();

    @W6.l
    public static final class Impl_O26 implements IDeviceIdentifiersPolicyServiceCAGI.O26 {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.IDeviceIdentifiersPolicyService");
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IDeviceIdentifiersPolicyServiceCAGI.O26.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.os.IDeviceIdentifiersPolicyService$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.os.G
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165868a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.os.IDeviceIdentifiersPolicyServiceCAGI.O26.Stub
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
