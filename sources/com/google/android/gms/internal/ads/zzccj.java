package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzccj extends zzbev implements zzcck {
    public zzccj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzcco zzccoVar = (zzcco) zzbew.zzb(parcel, zzcco.CREATOR);
            zzbew.zzh(parcel);
            zza(zzccoVar);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            zzccn zzcclVar = null;
            zzcci zzcciVar = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcclVar = iInterfaceQueryLocalInterface instanceof zzccn ? (zzccn) iInterfaceQueryLocalInterface : new zzccl(strongBinder);
                }
                zzbew.zzh(parcel);
                zzc(zzcclVar);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zZzd = zzd();
                        parcel2.writeNoException();
                        int i12 = zzbew.zza;
                        parcel2.writeInt(zZzd ? 1 : 0);
                        break;
                    case 6:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzh(iObjectWrapperAsInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzi(iObjectWrapperAsInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzj(iObjectWrapperAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzk = zzk();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzk);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzbew.zzh(parcel);
                        zzl(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zzbyVarZza = com.google.android.gms.ads.internal.client.zzbx.zza(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzm(zzbyVarZza);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzn = zzn();
                        parcel2.writeNoException();
                        zzbew.zzd(parcel2, bundleZzn);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcciVar = iInterfaceQueryLocalInterface2 instanceof zzcci ? (zzcci) iInterfaceQueryLocalInterface2 : new zzcci(strongBinder2);
                        }
                        zzbew.zzh(parcel);
                        zzt(zzcciVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbew.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzo(iObjectWrapperAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzbew.zzh(parcel);
                        zzp(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzr = zzr();
                        parcel2.writeNoException();
                        int i13 = zzbew.zza;
                        parcel2.writeInt(zZzr ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzs = zzs();
                        parcel2.writeNoException();
                        zzbew.zze(parcel2, zzdxVarZzs);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzq(zZza);
                parcel2.writeNoException();
            }
        } else {
            zzb();
            parcel2.writeNoException();
        }
        return true;
    }
}
