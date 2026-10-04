package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbsa extends zzbeu implements IInterface {
    public zzbsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbru zzbruVar, zzbrz zzbrzVar) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zzc(parcelZzcZ, zzbruVar);
        zzbew.zze(parcelZzcZ, zzbrzVar);
        zzdc(2, parcelZzcZ);
    }
}
