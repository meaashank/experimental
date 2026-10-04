package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwh extends zzbeu implements zzbwj {
    public zzbwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzA() throws RemoteException {
        Parcel parcelZzda = zzda(24, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzB() throws RemoteException {
        Parcel parcelZzda = zzda(25, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzC() throws RemoteException {
        zzdb(26, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final List zzf() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList arrayListZzf = zzbew.zzf(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzg() throws RemoteException {
        Parcel parcelZzda = zzda(4, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmv zzh() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        zzbmv zzbmvVarZzg = zzbmu.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbmvVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzi() throws RemoteException {
        Parcel parcelZzda = zzda(6, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzj() throws RemoteException {
        Parcel parcelZzda = zzda(7, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final double zzk() throws RemoteException {
        Parcel parcelZzda = zzda(8, zzcZ());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzl() throws RemoteException {
        Parcel parcelZzda = zzda(9, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzm() throws RemoteException {
        Parcel parcelZzda = zzda(10, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel parcelZzda = zzda(11, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmo zzo() throws RemoteException {
        Parcel parcelZzda = zzda(12, zzcZ());
        zzbmo zzbmoVarZzi = zzbmn.zzi(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbmoVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzp() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(13, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzq() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(14, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzr() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(15, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzda = zzda(16, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzda = zzda(17, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzda = zzda(18, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzv() throws RemoteException {
        zzdb(19, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(20, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, iObjectWrapper2);
        zzbew.zze(parcelZzcZ, iObjectWrapper3);
        zzdb(21, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(22, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzz() throws RemoteException {
        Parcel parcelZzda = zzda(23, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }
}
