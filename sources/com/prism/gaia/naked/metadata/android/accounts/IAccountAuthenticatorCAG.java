package com.prism.gaia.naked.metadata.android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI;
import com.prism.gaia.server.accounts.i;

/* JADX INFO: loaded from: classes6.dex */
@W6.c
public final class IAccountAuthenticatorCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165235G = new Impl_G();

    @W6.l
    public static final class Impl_G implements IAccountAuthenticatorCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.accounts.IAccountAuthenticator");
        private InitOnce<NakedMethod<Void>> __addAccount = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165241a.lambda$new$0();
            }
        });
        private InitOnce<NakedMethod<Void>> __confirmCredentials = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165250a.lambda$new$1();
            }
        });
        private InitOnce<NakedMethod<Void>> __getAuthToken = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.m
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165251a.lambda$new$2();
            }
        });
        private InitOnce<NakedMethod<Void>> __getAuthTokenLabel = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.n
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165252a.lambda$new$3();
            }
        });
        private InitOnce<NakedMethod<Void>> __updateCredentials = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.o
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165253a.lambda$new$4();
            }
        });
        private InitOnce<NakedMethod<Void>> __editProperties = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.p
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165254a.lambda$new$5();
            }
        });
        private InitOnce<NakedMethod<Void>> __hasFeatures = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165242a.lambda$new$6();
            }
        });
        private InitOnce<NakedMethod<Void>> __getAccountRemovalAllowed = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165243a.lambda$new$7();
            }
        });
        private InitOnce<NakedMethod<Void>> __getAccountCredentialsForCloning = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165244a.lambda$new$8();
            }
        });
        private InitOnce<NakedMethod<Void>> __addAccountFromCredentials = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165245a.lambda$new$9();
            }
        });
        private InitOnce<NakedMethod<Void>> __startAddAccountSession = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165246a.lambda$new$10();
            }
        });
        private InitOnce<NakedMethod<Void>> __startUpdateCredentialsSession = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165247a.lambda$new$11();
            }
        });
        private InitOnce<NakedMethod<Void>> __finishSession = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165248a.lambda$new$12();
            }
        });
        private InitOnce<NakedMethod<Void>> __isCredentialsUpdateSuggested = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f165249a.lambda$new$13();
            }
        });
        public Impl_Stub Stub = new Impl_Stub();

        @W6.l
        public static final class Impl_Stub implements IAccountAuthenticatorCAGI.G.Stub {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.accounts.IAccountAuthenticator$Stub");
            private InitOnce<NakedStaticMethod<IInterface>> __asInterface = new InitOnce<>(new InitOnce.Init() { // from class: com.prism.gaia.naked.metadata.android.accounts.q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f165255a.lambda$new$0();
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

            @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G.Stub
            public NakedStaticMethod<IInterface> asInterface() {
                return this.__asInterface.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "addAccount", new String[]{i.p.f166560d, "java.lang.String", "java.lang.String", "[Ljava.lang.String;", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "confirmCredentials", new String[]{i.p.f166560d, "android.accounts.Account", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$10() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startAddAccountSession", new String[]{i.p.f166560d, "java.lang.String", "java.lang.String", "[Ljava.lang.String;", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$11() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "startUpdateCredentialsSession", new String[]{i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$12() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "finishSession", new String[]{i.p.f166560d, "java.lang.String", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$13() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "isCredentialsUpdateSuggested", new String[]{i.p.f166560d, "android.accounts.Account", "java.lang.String"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getAuthToken", new String[]{i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getAuthTokenLabel", new String[]{i.p.f166560d, "java.lang.String"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "updateCredentials", new String[]{i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "editProperties", new String[]{i.p.f166560d, "java.lang.String"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$6() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "hasFeatures", new String[]{i.p.f166560d, "android.accounts.Account", "[Ljava.lang.String;"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$7() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getAccountRemovalAllowed", new String[]{i.p.f166560d, "android.accounts.Account"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$8() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "getAccountCredentialsForCloning", new String[]{i.p.f166560d, "android.accounts.Account"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedMethod lambda$new$9() throws Exception {
            return new NakedMethod((Class<?>) ORG_CLASS(), "addAccountFromCredentials", new String[]{i.p.f166560d, "android.accounts.Account", "android.os.Bundle"});
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> addAccount() {
            return this.__addAccount.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> addAccountFromCredentials() {
            return this.__addAccountFromCredentials.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> confirmCredentials() {
            return this.__confirmCredentials.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> editProperties() {
            return this.__editProperties.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> finishSession() {
            return this.__finishSession.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> getAccountCredentialsForCloning() {
            return this.__getAccountCredentialsForCloning.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> getAccountRemovalAllowed() {
            return this.__getAccountRemovalAllowed.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> getAuthToken() {
            return this.__getAuthToken.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> getAuthTokenLabel() {
            return this.__getAuthTokenLabel.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> hasFeatures() {
            return this.__hasFeatures.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> isCredentialsUpdateSuggested() {
            return this.__isCredentialsUpdateSuggested.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> startAddAccountSession() {
            return this.__startAddAccountSession.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> startUpdateCredentialsSession() {
            return this.__startUpdateCredentialsSession.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAGI.G
        public NakedMethod<Void> updateCredentials() {
            return this.__updateCredentials.get();
        }
    }
}
