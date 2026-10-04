package com.prism.gaia.naked.metadata.android.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAGI;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IAccountManagerResponseCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165238G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IAccountManagerResponseCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.accounts.IAccountManagerResponse");
        private InitOnce<NakedMethod<Void>> __onResult = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.w
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165261a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __onError = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.x
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165262a.lambda$new$1();
            }
        });
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IAccountManagerResponseCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.accounts.IAccountManagerResponse$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.y
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165263a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onResult", (Class<?>[]) new Class[]{Bundle.class});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "onError", (Class<?>[]) new Class[]{Integer.TYPE, String.class});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAGI.G
        public NakedMethod<Void> onError() {
            return this.__onError.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAGI.G
        public NakedMethod<Void> onResult() {
            return this.__onResult.get();
        }
    }
}
