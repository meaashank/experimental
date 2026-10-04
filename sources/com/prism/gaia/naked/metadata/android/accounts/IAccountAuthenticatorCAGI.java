package com.prism.gaia.naked.metadata.android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.server.accounts.i;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IAccountAuthenticatorCAGI {

    @W6.l
    @W6.j("android.accounts.IAccountAuthenticator")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.accounts.IAccountAuthenticator$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @W6.s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }

        @W6.p("addAccount")
        @W6.g({i.p.f166560d, "java.lang.String", "java.lang.String", "[Ljava.lang.String;", "android.os.Bundle"})
        NakedMethod<Void> addAccount();

        @W6.p("addAccountFromCredentials")
        @W6.g({i.p.f166560d, "android.accounts.Account", "android.os.Bundle"})
        NakedMethod<Void> addAccountFromCredentials();

        @W6.p("confirmCredentials")
        @W6.g({i.p.f166560d, "android.accounts.Account", "android.os.Bundle"})
        NakedMethod<Void> confirmCredentials();

        @W6.p("editProperties")
        @W6.g({i.p.f166560d, "java.lang.String"})
        NakedMethod<Void> editProperties();

        @W6.p("finishSession")
        @W6.g({i.p.f166560d, "java.lang.String", "android.os.Bundle"})
        NakedMethod<Void> finishSession();

        @W6.p("getAccountCredentialsForCloning")
        @W6.g({i.p.f166560d, "android.accounts.Account"})
        NakedMethod<Void> getAccountCredentialsForCloning();

        @W6.p("getAccountRemovalAllowed")
        @W6.g({i.p.f166560d, "android.accounts.Account"})
        NakedMethod<Void> getAccountRemovalAllowed();

        @W6.p("getAuthToken")
        @W6.g({i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"})
        NakedMethod<Void> getAuthToken();

        @W6.p("getAuthTokenLabel")
        @W6.g({i.p.f166560d, "java.lang.String"})
        NakedMethod<Void> getAuthTokenLabel();

        @W6.p("hasFeatures")
        @W6.g({i.p.f166560d, "android.accounts.Account", "[Ljava.lang.String;"})
        NakedMethod<Void> hasFeatures();

        @W6.p("isCredentialsUpdateSuggested")
        @W6.g({i.p.f166560d, "android.accounts.Account", "java.lang.String"})
        NakedMethod<Void> isCredentialsUpdateSuggested();

        @W6.p("startAddAccountSession")
        @W6.g({i.p.f166560d, "java.lang.String", "java.lang.String", "[Ljava.lang.String;", "android.os.Bundle"})
        NakedMethod<Void> startAddAccountSession();

        @W6.p("startUpdateCredentialsSession")
        @W6.g({i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"})
        NakedMethod<Void> startUpdateCredentialsSession();

        @W6.p("updateCredentials")
        @W6.g({i.p.f166560d, "android.accounts.Account", "java.lang.String", "android.os.Bundle"})
        NakedMethod<Void> updateCredentials();
    }
}
