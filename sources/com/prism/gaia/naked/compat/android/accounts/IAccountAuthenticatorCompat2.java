package com.prism.gaia.naked.compat.android.accounts;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IAccountAuthenticatorCompat2 {

    public static class Util {
        public static void addAccount(IInterface iInterface, IInterface iInterface2, String str, String str2, String[] strArr, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.addAccount().call(iInterface, iInterface2, str, str2, strArr, bundle);
        }

        public static void addAccountFromCredentials(IInterface iInterface, IInterface iInterface2, Account account, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.addAccountFromCredentials().call(iInterface, iInterface2, account, bundle);
        }

        public static IInterface asInterface(IBinder iBinder) {
            return IAccountAuthenticatorCAG.f165235G.Stub.asInterface().call(iBinder);
        }

        public static void confirmCredentials(IInterface iInterface, IInterface iInterface2, Account account, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.confirmCredentials().call(iInterface, iInterface2, account, bundle);
        }

        public static void editProperties(IInterface iInterface, IInterface iInterface2, String str) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.editProperties().call(iInterface, iInterface2, str);
        }

        public static void finishSession(IInterface iInterface, IInterface iInterface2, String str, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.finishSession().call(iInterface, iInterface2, str, bundle);
        }

        public static void getAccountCredentialsForCloning(IInterface iInterface, IInterface iInterface2, Account account) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.getAccountCredentialsForCloning().call(iInterface, iInterface2, account);
        }

        public static void getAccountRemovalAllowed(IInterface iInterface, IInterface iInterface2, Account account) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.getAccountRemovalAllowed().call(iInterface, iInterface2, account);
        }

        public static void getAuthToken(IInterface iInterface, IInterface iInterface2, Account account, String str, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.getAuthToken().call(iInterface, iInterface2, account, str, bundle);
        }

        public static void getAuthTokenLabel(IInterface iInterface, IInterface iInterface2, String str) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.getAuthTokenLabel().call(iInterface, iInterface2, str);
        }

        public static void hasFeatures(IInterface iInterface, IInterface iInterface2, Account account, String[] strArr) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.hasFeatures().call(iInterface, iInterface2, account, strArr);
        }

        public static void isCredentialsUpdateSuggested(IInterface iInterface, IInterface iInterface2, Account account, String str) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.isCredentialsUpdateSuggested().call(iInterface, iInterface2, account, str);
        }

        public static void startAddAccountSession(IInterface iInterface, IInterface iInterface2, String str, String str2, String[] strArr, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.startAddAccountSession().call(iInterface, iInterface2, str, str2, strArr, bundle);
        }

        public static void startUpdateCredentialsSession(IInterface iInterface, IInterface iInterface2, Account account, String str, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.startUpdateCredentialsSession().call(iInterface, iInterface2, account, str, bundle);
        }

        public static void updateCredentials(IInterface iInterface, IInterface iInterface2, Account account, String str, Bundle bundle) throws RemoteException {
            IAccountAuthenticatorCAG.f165235G.updateCredentials().call(iInterface, iInterface2, account, str, bundle);
        }
    }
}
