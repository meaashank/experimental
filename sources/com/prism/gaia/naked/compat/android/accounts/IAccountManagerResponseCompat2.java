package com.prism.gaia.naked.compat.android.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.prism.gaia.naked.metadata.android.accounts.IAccountManagerResponseCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IAccountManagerResponseCompat2 {

    public static class Util {
        public static IInterface asInterface(IBinder iBinder) {
            return IAccountManagerResponseCAG.f165238G.Stub.asInterface().call(iBinder);
        }

        public static void onError(IInterface iInterface, int i10, String str) throws RemoteException {
            IAccountManagerResponseCAG.f165238G.onError().call(iInterface, Integer.valueOf(i10), str);
        }

        public static void onResult(IInterface iInterface, Bundle bundle) throws RemoteException {
            IAccountManagerResponseCAG.f165238G.onResult().call(iInterface, bundle);
        }
    }
}
