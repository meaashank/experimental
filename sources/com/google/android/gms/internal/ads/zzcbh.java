package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcbh extends zzbev implements zzcbi {
    public zzcbh() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcbm zzcbkVar = null;
        zzcbn zzcbnVar = null;
        zzcbm zzcbkVar2 = null;
        zzcbm zzcbkVar3 = null;
        zzcbm zzcbkVar4 = null;
        switch (i10) {
            case 1:
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzcbj) {
                    }
                }
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcbv zzcbvVar = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbkVar = iInterfaceQueryLocalInterface2 instanceof zzcbm ? (zzcbm) iInterfaceQueryLocalInterface2 : new zzcbk(strongBinder2);
                }
                zzbew.zzh(parcel);
                zze(zzcbvVar, zzcbkVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcbv zzcbvVar2 = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbkVar4 = iInterfaceQueryLocalInterface3 instanceof zzcbm ? (zzcbm) iInterfaceQueryLocalInterface3 : new zzcbk(strongBinder3);
                }
                zzbew.zzh(parcel);
                zzf(zzcbvVar2, zzcbkVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcbv zzcbvVar3 = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbkVar3 = iInterfaceQueryLocalInterface4 instanceof zzcbm ? (zzcbm) iInterfaceQueryLocalInterface4 : new zzcbk(strongBinder4);
                }
                zzbew.zzh(parcel);
                zzg(zzcbvVar3, zzcbkVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbkVar2 = iInterfaceQueryLocalInterface5 instanceof zzcbm ? (zzcbm) iInterfaceQueryLocalInterface5 : new zzcbk(strongBinder5);
                }
                zzbew.zzh(parcel);
                zzh(string, zzcbkVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcbe zzcbeVar = (zzcbe) zzbew.zzb(parcel, zzcbe.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcbnVar = iInterfaceQueryLocalInterface6 instanceof zzcbn ? (zzcbn) iInterfaceQueryLocalInterface6 : new zzcbn(strongBinder6);
                }
                zzbew.zzh(parcel);
                zzj(zzcbeVar, zzcbnVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzbew.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
