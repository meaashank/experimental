package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvs extends zzbeu implements zzbvu {
    public zzbvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbvx zza(String str) throws RemoteException {
        zzbvx zzbvvVar;
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvx ? (zzbvx) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
        }
        parcelZzda.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzb(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzc(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(4, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbxt zzd(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(3, parcelZzcZ);
        zzbxt zzbxtVarZza = zzbxs.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbxtVarZza;
    }
}
