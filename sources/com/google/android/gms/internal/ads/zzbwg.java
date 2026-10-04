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
public final class zzbwg extends zzbeu implements IInterface {
    public zzbwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList arrayListZzf = zzbew.zzf(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzf;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzda = zzda(4, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final zzbmv zzh() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        zzbmv zzbmvVarZzg = zzbmu.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbmvVarZzg;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzda = zzda(6, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzj() throws RemoteException {
        Parcel parcelZzda = zzda(7, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final void zzk() throws RemoteException {
        zzdb(8, zzcZ());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(9, parcelZzcZ);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(10, parcelZzcZ);
    }

    public final boolean zzn() throws RemoteException {
        Parcel parcelZzda = zzda(11, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel parcelZzda = zzda(12, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel parcelZzda = zzda(13, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(14, parcelZzcZ);
    }

    public final IObjectWrapper zzr() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(15, zzcZ()));
    }

    public final com.google.android.gms.ads.internal.client.zzea zzs() throws RemoteException {
        Parcel parcelZzda = zzda(16, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    public final zzbmo zzt() throws RemoteException {
        Parcel parcelZzda = zzda(19, zzcZ());
        zzbmo zzbmoVarZzi = zzbmn.zzi(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbmoVarZzi;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(20, zzcZ()));
    }

    public final IObjectWrapper zzv() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(21, zzcZ()));
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, iObjectWrapper2);
        zzbew.zze(parcelZzcZ, iObjectWrapper3);
        zzdb(22, parcelZzcZ);
    }
}
