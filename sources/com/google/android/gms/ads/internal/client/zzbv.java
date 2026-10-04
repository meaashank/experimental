package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbvu;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbv extends zzbeu implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i10, int i11) throws RemoteException {
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zzc(parcelZzcZ, zzrVar);
        parcelZzcZ.writeString(str);
        zzbew.zze(parcelZzcZ, zzbvuVar);
        parcelZzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelZzcZ.writeInt(i11);
        Parcel parcelZzda = zzda(2, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        parcelZzda.recycle();
        return strongBinder;
    }
}
