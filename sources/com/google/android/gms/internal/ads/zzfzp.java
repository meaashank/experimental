package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzp extends zzbeu implements IInterface {
    public zzfzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfzn zze(zzfzl zzfzlVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzfzlVar);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        zzfzn zzfznVar = (zzfzn) zzbew.zzb(parcelZzda, zzfzn.CREATOR);
        parcelZzda.recycle();
        return zzfznVar;
    }

    public final void zzf(zzfzi zzfziVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzfziVar);
        zzdb(2, parcelZzcZ);
    }

    public final zzfzw zzg(zzfzu zzfzuVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzfzuVar);
        Parcel parcelZzda = zzda(3, parcelZzcZ);
        zzfzw zzfzwVar = (zzfzw) zzbew.zzb(parcelZzda, zzfzw.CREATOR);
        parcelZzda.recycle();
        return zzfzwVar;
    }
}
