package com.prism.gaia.naked.metadata.com.android.internal.telephony;

import W6.c;
import W6.m;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.com.android.internal.telephony.IHwTelephonyCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IHwTelephonyCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165990G = new Impl_G();

    @m
    public static final class Impl_G implements IHwTelephonyCAGI.G {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.internal.telephony.IHwTelephony");
        public Impl_Stub Stub = new Impl_Stub();

        @m
        public static final class Impl_Stub implements IHwTelephonyCAGI.G.Stub {
            private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("com.android.internal.telephony.IHwTelephony$Stub");
            private InitOnceTry<NakedStaticMethod<IInterface>> __asInterface = new InitOnceTry<>(new InitOnce.Init() { // from class: y9.a
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f241124a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.com.android.internal.telephony.IHwTelephonyCAGI.G.Stub
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
