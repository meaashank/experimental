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
public final class zzbwf extends zzbeu implements IInterface {
    public zzbwf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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

    public final double zzj() throws RemoteException {
        Parcel parcelZzda = zzda(7, zzcZ());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzda = zzda(8, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzda = zzda(9, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzdb(10, zzcZ());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(11, parcelZzcZ);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(12, parcelZzcZ);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzda = zzda(13, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzda = zzda(14, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzda = zzda(15, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(16, parcelZzcZ);
    }

    public final com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        Parcel parcelZzda = zzda(17, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(18, zzcZ()));
    }

    public final zzbmo zzv() throws RemoteException {
        Parcel parcelZzda = zzda(19, zzcZ());
        zzbmo zzbmoVarZzi = zzbmn.zzi(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbmoVarZzi;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(20, zzcZ()));
    }

    public final IObjectWrapper zzx() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(21, zzcZ()));
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, iObjectWrapper2);
        zzbew.zze(parcelZzcZ, iObjectWrapper3);
        zzdb(22, parcelZzcZ);
    }
}
