package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzccy extends zzbeu implements zzcda {
    public zzccy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(5, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, zzcdhVar);
        zzdb(1, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzmVar);
        zzbew.zze(parcelZzcZ, zzcdhVar);
        zzdb(14, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzcddVar);
        zzdb(2, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdnVar);
        zzdb(8, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzda = zzda(9, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzg(zzcdo zzcdoVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzcdoVar);
        zzdb(7, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final boolean zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzj(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() throws RemoteException {
        zzccx zzccvVar;
        Parcel parcelZzda = zzda(11, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzccvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccvVar = iInterfaceQueryLocalInterface instanceof zzccx ? (zzccx) iInterfaceQueryLocalInterface : new zzccv(strongBinder);
        }
        parcelZzda.recycle();
        return zzccvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final com.google.android.gms.ads.internal.client.zzdx zzl() throws RemoteException {
        Parcel parcelZzda = zzda(12, zzcZ());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZza = com.google.android.gms.ads.internal.client.zzdw.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzdxVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() throws RemoteException {
        Parcel parcelZzda = zzda(16, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdqVar);
        zzdb(13, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzo(boolean z10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        int i10 = zzbew.zza;
        parcelZzcZ.writeInt(z10 ? 1 : 0);
        zzdb(15, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final long zzp() throws RemoteException {
        Parcel parcelZzda = zzda(17, zzcZ());
        long j10 = parcelZzda.readLong();
        parcelZzda.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzq(long j10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeLong(j10);
        zzdb(18, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzr(zzcdi zzcdiVar) throws RemoteException {
        throw null;
    }
}
