package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbj extends zzbev implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zza();
        } else {
            if (i10 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
            zzbew.zzh(parcel);
            zzb(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
