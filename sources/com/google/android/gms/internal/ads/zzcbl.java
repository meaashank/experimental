package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcbl extends zzbev implements zzcbm {
    public zzcbl() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbew.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbew.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i10 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbew.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbew.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbew.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzcbv zzcbvVar = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
            zzbew.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcbvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
