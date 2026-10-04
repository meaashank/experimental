package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbg extends zzbev implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zza();
                break;
            case 2:
                int i12 = parcel.readInt();
                zzbew.zzh(parcel);
                zzb(i12);
                break;
            case 3:
                break;
            case 4:
                zze();
                break;
            case 5:
                zzf();
                break;
            case 6:
                zzg();
                break;
            case 7:
                zzi();
                break;
            case 8:
                zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
                zzbew.zzh(parcel);
                zzc(zzeVar);
                break;
            case 9:
                zzh();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
