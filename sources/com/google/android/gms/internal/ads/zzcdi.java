package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcdi extends zzbeu implements IInterface {
    public zzcdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzccx zzccxVar, String str, String str2) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, zzccxVar);
        parcelZzcZ.writeString(str);
        parcelZzcZ.writeString(str2);
        zzdb(2, parcelZzcZ);
    }
}
