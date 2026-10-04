package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbm extends zzbev implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzm zzmVar = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
            zzbew.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i10 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i12 = zzbew.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i10 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i10 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
            int i13 = parcel.readInt();
            zzbew.zzh(parcel);
            zzi(zzmVar2, i13);
            parcel2.writeNoException();
        }
        return true;
    }
}
