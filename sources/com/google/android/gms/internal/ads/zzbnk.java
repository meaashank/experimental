package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnk extends zzbeu implements zzbnm {
    public zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zze(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbmv zzf(String str) throws RemoteException {
        zzbmv zzbmtVar;
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZzcZ);
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

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final List zzg() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzda.createStringArrayList();
        parcelZzda.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zzh() throws RemoteException {
        Parcel parcelZzda = zzda(4, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        parcelZzcZ.writeString(str);
        zzdb(5, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final com.google.android.gms.ads.internal.client.zzea zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final IObjectWrapper zzm() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(9, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        Parcel parcelZzda = zzda(10, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzo() throws RemoteException {
        Parcel parcelZzda = zzda(12, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzda = zzda(13, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzdb(14, parcelZzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzr() throws RemoteException {
        zzdb(15, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbms zzs() throws RemoteException {
        zzbms zzbmqVar;
        Parcel parcelZzda = zzda(16, zzcZ());
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

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        Parcel parcelZzda = zzda(17, parcelZzcZ);
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }
}
