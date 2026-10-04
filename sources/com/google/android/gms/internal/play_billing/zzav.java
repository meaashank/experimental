package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.c;

/* JADX INFO: loaded from: classes4.dex */
public class zzav extends Binder implements IInterface {
    private static zzax globalInterceptor;

    public zzav(String str) {
        attachInterface(this, str);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(zzax zzaxVar) {
        if (zzaxVar == null) {
            throw new IllegalArgumentException("null interceptor");
        }
        if (globalInterceptor != null) {
            throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
        }
        globalInterceptor = zzaxVar;
    }

    private boolean routeToSuperOrEnforceInterface(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        return false;
    }

    public void enforceNoDataAvail(Parcel parcel) {
        zzax zzaxVar = globalInterceptor;
        if (zzaxVar != null) {
            zzaxVar.zza();
            return;
        }
        int i10 = zzaw.zza;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(c.a("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i10, parcel, parcel2, i11)) {
            return true;
        }
        zzax zzaxVar = globalInterceptor;
        return zzaxVar == null ? dispatchTransaction(i10, parcel, parcel2, i11) : zzaxVar.zzb();
    }
}
