package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzca extends zzbev implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzfp zzfpVar = (zzfp) zzbew.zzb(parcel, zzfp.CREATOR);
            zzbew.zzh(parcel);
            zze(zzfpVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) zzbew.zzb(parcel, zzfp.CREATOR);
            zzbew.zzh(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
