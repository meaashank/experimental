package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbvt extends zzbev implements zzbvu {
    public zzbvt() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvu zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            zzbew.zzh(parcel);
            zzbvx zzbvxVarZza = zza(string);
            parcel2.writeNoException();
            zzbew.zze(parcel2, zzbvxVarZza);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzbew.zzh(parcel);
            boolean zZzb = zzb(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzb ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            zzbew.zzh(parcel);
            zzbxt zzbxtVarZzd = zzd(string3);
            parcel2.writeNoException();
            zzbew.zze(parcel2, zzbxtVarZzd);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzbew.zzh(parcel);
            boolean zZzc = zzc(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        }
        return true;
    }
}
