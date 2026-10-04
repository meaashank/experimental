package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbok extends zzbeu implements zzbom {
    public zzbok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzda = zzda(24, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdgVar);
        zzdb(25, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdcVar);
        zzdb(26, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzD() throws RemoteException {
        zzdb(27, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzE() throws RemoteException {
        zzdb(28, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbms zzF() throws RemoteException {
        zzbms zzbmqVar;
        Parcel parcelZzda = zzda(29, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbmqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmqVar = iInterfaceQueryLocalInterface instanceof zzbms ? (zzbms) iInterfaceQueryLocalInterface : new zzbmq(strongBinder);
        }
        parcelZzda.recycle();
        return zzbmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzda = zzda(30, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        Parcel parcelZzda = zzda(31, zzcZ());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZza = com.google.android.gms.ads.internal.client.zzdw.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzdxVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzdqVar);
        zzdb(32, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, bundle);
        zzdb(33, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final long zzK() throws RemoteException {
        Parcel parcelZzda = zzda(34, zzcZ());
        long j10 = parcelZzda.readLong();
        parcelZzda.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzL(long j10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeLong(j10);
        zzdb(35, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzf() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList arrayListZzf = zzbew.zzf(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzg() throws RemoteException {
        Parcel parcelZzda = zzda(4, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmv zzh() throws RemoteException {
        zzbmv zzbmtVar;
        Parcel parcelZzda = zzda(5, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbmtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmtVar = iInterfaceQueryLocalInterface instanceof zzbmv ? (zzbmv) iInterfaceQueryLocalInterface : new zzbmt(strongBinder);
        }
        parcelZzda.recycle();
        return zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzi() throws RemoteException {
        Parcel parcelZzda = zzda(6, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzj() throws RemoteException {
        Parcel parcelZzda = zzda(7, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final double zzk() throws RemoteException {
        Parcel parcelZzda = zzda(8, zzcZ());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzl() throws RemoteException {
        Parcel parcelZzda = zzda(9, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzm() throws RemoteException {
        Parcel parcelZzda = zzda(10, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel parcelZzda = zzda(11, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzp() throws RemoteException {
        zzdb(13, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmo zzq() throws RemoteException {
        zzbmo zzbmmVar;
        Parcel parcelZzda = zzda(14, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbmmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmmVar = iInterfaceQueryLocalInterface instanceof zzbmo ? (zzbmo) iInterfaceQueryLocalInterface : new zzbmm(strongBinder);
        }
        parcelZzda.recycle();
        return zzbmmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, bundle);
        zzdb(15, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, bundle);
        Parcel parcelZzda = zzda(16, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, bundle);
        zzdb(17, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzu() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(18, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzv() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(19, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzda = zzda(20, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzx(zzboj zzbojVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbojVar);
        zzdb(21, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzy() throws RemoteException {
        zzdb(22, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzz() throws RemoteException {
        Parcel parcelZzda = zzda(23, zzcZ());
        ArrayList arrayListZzf = zzbew.zzf(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzf;
    }
}
