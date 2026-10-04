package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwb extends zzbeu implements zzbwd {
    public zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final IObjectWrapper zze() throws RemoteException {
        return com.google.android.gms.ads.internal.client.a.a(zzda(1, zzcZ()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        boolean zZza = zzbew.zza(parcelZzda);
        parcelZzda.recycle();
        return zZza;
    }
}
