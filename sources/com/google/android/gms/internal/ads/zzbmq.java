package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbmq extends zzbeu implements zzbms {
    public zzbmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(3, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final IObjectWrapper zzg() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(4, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzh() throws RemoteException {
        Parcel parcelZzda = zzda(5, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzi() throws RemoteException {
        Parcel parcelZzda = zzda(6, zzcZ());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        Parcel parcelZzda = zzda(7, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzda = zzda(8, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzda = zzda(10, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzm(zzboa zzboaVar) throws RemoteException {
        throw null;
    }
}
