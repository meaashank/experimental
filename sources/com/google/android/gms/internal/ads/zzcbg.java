package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcbg extends zzbeu implements zzcbi {
    public zzcbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zze(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzcbvVar);
        zzbew.zze(parcelZzcZ, zzcbmVar);
        zzdb(4, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzf(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzcbvVar);
        zzbew.zze(parcelZzcZ, zzcbmVar);
        zzdb(5, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzg(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzcbvVar);
        zzbew.zze(parcelZzcZ, zzcbmVar);
        zzdb(6, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzh(String str, zzcbm zzcbmVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzcbmVar);
        zzdb(7, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(9, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzj(zzcbe zzcbeVar, zzcbn zzcbnVar) throws RemoteException {
        throw null;
    }
}
