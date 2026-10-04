package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbzn extends zzbeu implements zzbzp {
    public zzbzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final zzbzm zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i10) throws RemoteException {
        zzbzm zzbzkVar;
        Parcel parcelZzcZ = zzcZ();
        zzbew.zze(parcelZzcZ, iObjectWrapper);
        zzbew.zze(parcelZzcZ, zzbvuVar);
        parcelZzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(1, parcelZzcZ);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbzkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbzkVar = iInterfaceQueryLocalInterface instanceof zzbzm ? (zzbzm) iInterfaceQueryLocalInterface : new zzbzk(strongBinder);
        }
        parcelZzda.recycle();
        return zzbzkVar;
    }
}
