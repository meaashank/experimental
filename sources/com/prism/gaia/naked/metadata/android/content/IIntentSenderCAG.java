package com.prism.gaia.naked.metadata.android.content;

import W6.c;
import W6.m;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.metadata.android.content.IIntentSenderCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IIntentSenderCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165598C = new Impl_C();

    public static final class Impl_C implements IIntentSenderCAGI.C {
        public Impl_Stub Stub = new Impl_Stub();

        public static final class Impl_Stub implements IIntentSenderCAGI.C.Stub {
            public Impl_Proxy Proxy = new Impl_Proxy();

            @m
            public static final class Impl_Proxy implements IIntentSenderCAGI.C.Stub.Proxy {
                private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.content.IIntentSender$Stub$Proxy");

                @Override // com.prism.gaia.naked.core.ClassAccessor
                public Class ORG_CLASS() {
                    return this.__ORG_CLASS.get();
                }
            }
        }
    }
}
