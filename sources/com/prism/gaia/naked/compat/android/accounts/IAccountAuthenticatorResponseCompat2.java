package com.prism.gaia.naked.compat.android.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.accounts.IAccountAuthenticatorResponseCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IAccountAuthenticatorResponseCompat2 {

    public static class Util {
        public static IInterface asInterface(IBinder iBinder) {
            return IAccountAuthenticatorResponseCAG.f165236G.Stub.asInterface().call(iBinder);
        }

        public static void onError(IInterface iInterface, int i10, String str) {
            IAccountAuthenticatorResponseCAG.f165236G.onError().call(iInterface, Integer.valueOf(i10), str);
        }

        public static void onRequestContinued(IInterface iInterface) {
            IAccountAuthenticatorResponseCAG.f165236G.onRequestContinued().call(iInterface, new Object[0]);
        }

        public static void onResult(IInterface iInterface, Bundle bundle) {
            IAccountAuthenticatorResponseCAG.f165236G.onResult().call(iInterface, bundle);
        }
    }
}
