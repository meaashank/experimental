package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcf extends zzbeu implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeTypedList(list);
        zzbew.zze(parcelZzcZ, zzcbVar);
        zzdb(1, parcelZzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzg(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(3, parcelZzcZ);
        zzcda zzcdaVarZzs = zzccz.zzs(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzcdaVarZzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(4, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzi(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(5, parcelZzcZ);
        zzbgz zzbgzVarZza = zzbgy.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgzVarZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(6, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(7, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzda.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvu zzbvuVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzbvuVar);
        zzdb(8, parcelZzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzbew.zzc(parcelZzcZ, zzfpVar);
        zzbew.zze(parcelZzcZ, zzceVar);
        Parcel parcelZzda = zzda(9, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i10, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(10, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(11, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzda.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzp(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(12, parcelZzcZ);
        zzbgz zzbgzVarZza = zzbgy.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgzVarZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzq(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(13, parcelZzcZ);
        zzcda zzcdaVarZzs = zzccz.zzs(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzcdaVarZzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i10, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(14, parcelZzcZ);
        zzfp zzfpVar = (zzfp) zzbew.zzb(parcelZzda, zzfp.CREATOR);
        parcelZzda.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        Parcel parcelZzda = zzda(15, parcelZzcZ);
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i10, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(16, parcelZzcZ);
        int i11 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i10, String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(17, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i10) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeInt(i10);
        zzdb(18, parcelZzcZ);
    }
}
