package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbht extends zzbeu implements IInterface {
    public zzbht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbho zze(zzbhr zzbhrVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzbhrVar);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        zzbho zzbhoVar = (zzbho) zzbew.zzb(parcelZzda, zzbho.CREATOR);
        parcelZzda.recycle();
        return zzbhoVar;
    }

    public final zzbho zzf(zzbhr zzbhrVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzbhrVar);
        Parcel parcelZzda = zzda(2, parcelZzcZ);
        zzbho zzbhoVar = (zzbho) zzbew.zzb(parcelZzda, zzbho.CREATOR);
        parcelZzda.recycle();
        return zzbhoVar;
    }

    public final long zzg(zzbhr zzbhrVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzbhrVar);
        Parcel parcelZzda = zzda(3, parcelZzcZ);
        long j10 = parcelZzda.readLong();
        parcelZzda.recycle();
        return j10;
    }
}
