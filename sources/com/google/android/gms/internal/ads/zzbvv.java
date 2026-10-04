package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvv extends zzbeu implements zzbvx {
    public zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzA(boolean z10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        int i10 = zzbew.zza;
        parcelZzcZ.writeInt(z10 ? 1 : 0);
        zzdb(25, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final com.google.android.gms.ads.internal.client.zzea zzB() throws RemoteException {
        Parcel parcelZzda = zzda(26, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwj zzC() throws RemoteException {
        zzbwj zzbwhVar;
        Parcel parcelZzda = zzda(27, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbwhVar = iInterfaceQueryLocalInterface instanceof zzbwj ? (zzbwj) iInterfaceQueryLocalInterface : new zzbwh(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(28, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(30, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzF(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbslVar);
        parcelZzcZ.writeTypedList(list);
        zzdb(31, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(32, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzH() throws RemoteException {
        Parcel parcelZzda = zzda(33, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzI() throws RemoteException {
        Parcel parcelZzda = zzda(34, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(parcelZzda, zzbyi.CREATOR);
        parcelZzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(35, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwd zzK() throws RemoteException {
        zzbwd zzbwbVar;
        Parcel parcelZzda = zzda(36, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbwbVar = iInterfaceQueryLocalInterface instanceof zzbwd ? (zzbwd) iInterfaceQueryLocalInterface : new zzbwb(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(37, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(38, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(39, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwf zzO() throws RemoteException {
        zzbwf zzbwfVar;
        Parcel parcelZzda = zzda(15, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbwfVar = iInterfaceQueryLocalInterface instanceof zzbwf ? (zzbwf) iInterfaceQueryLocalInterface : new zzbwf(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwg zzP() throws RemoteException {
        zzbwg zzbwgVar;
        Parcel parcelZzda = zzda(16, zzcZ());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbwgVar = iInterfaceQueryLocalInterface instanceof zzbwg ? (zzbwg) iInterfaceQueryLocalInterface : new zzbwg(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final IObjectWrapper zzf() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(2, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzi() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzrVar);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(6, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzdb(7, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzm() throws RemoteException {
        zzdb(9, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzccs zzccsVar, String str2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(null);
        zzbew.zze(parcelZzcZ, zzccsVar);
        parcelZzcZ.writeString(str2);
        zzdb(10, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        zzdb(11, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzp() throws RemoteException {
        zzdb(12, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzda = zzda(13, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzmVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzbew.zze(parcelZzcZ, zzbwaVar);
        zzbew.zzc(parcelZzcZ, zzbmkVar);
        parcelZzcZ.writeStringList(list);
        zzdb(14, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(21, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzda = zzda(22, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzy(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzccsVar);
        parcelZzcZ.writeStringList(list);
        zzdb(23, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbnm zzz() throws RemoteException {
        throw null;
    }
}
