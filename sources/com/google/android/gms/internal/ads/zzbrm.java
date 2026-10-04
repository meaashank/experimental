package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbrm extends zzbeu implements zzbro {
    public zzbrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final zzbrl zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i10, zzbri zzbriVar) throws RemoteException {
        zzbrl zzbrjVar;
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbvuVar);
        parcelZzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbew.zze(parcelZzcZ, zzbriVar);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbrjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbrjVar = iInterfaceQueryLocalInterface instanceof zzbrl ? (zzbrl) iInterfaceQueryLocalInterface : new zzbrj(strongBinder);
        }
        parcelZzda.recycle();
        return zzbrjVar;
    }
}
