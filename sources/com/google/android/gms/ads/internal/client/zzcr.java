package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcr extends zzbev implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
            zzbew.zzh(parcel);
            zza(zzeVar);
        } else if (i10 == 2) {
            zzb();
        } else if (i10 == 3) {
            zzc();
        } else if (i10 == 4) {
            zzd();
        } else {
            if (i10 != 5) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
