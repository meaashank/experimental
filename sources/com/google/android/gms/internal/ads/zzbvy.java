package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvy extends zzbeu implements zzbwa {
    public zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        zzdb(3, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzi() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzdb(9, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzm(zzbnm zzbnmVar, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbnmVar);
        parcelZzcZ.writeString(str);
        zzdb(10, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzn() throws RemoteException {
        zzdb(11, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo() throws RemoteException {
        zzdb(13, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(zzcct zzcctVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzq() throws RemoteException {
        zzdb(15, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(zzccx zzccxVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzccxVar);
        zzdb(16, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzt() throws RemoteException {
        zzdb(18, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzu() throws RemoteException {
        zzdb(20, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzv(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzw(int i10, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        parcelZzcZ.writeString(str);
        zzdb(22, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzeVar);
        zzdb(23, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzeVar);
        zzdb(24, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzz() throws RemoteException {
        zzdb(25, zzcZ());
    }
}
