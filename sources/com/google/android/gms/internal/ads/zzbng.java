package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbng extends zzbev implements zzbnh {
    public zzbng() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper iObjectWrapperZza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZza);
                return true;
            case 3:
                String strZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeString(strZzb);
                return true;
            case 4:
                List listZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeList(listZzc);
                return true;
            case 5:
                String strZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeString(strZzd);
                return true;
            case 6:
                zzbmv zzbmvVarZze = zze();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbmvVarZze);
                return true;
            case 7:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 8:
                double dZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzg);
                return true;
            case 9:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 10:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 11:
                Bundle bundleZzj = zzj();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, bundleZzj);
                return true;
            case 12:
                zzk();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzl = zzl();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzeaVarZzl);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzm(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                boolean zZzn = zzn(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzo(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbmo zzbmoVarZzp = zzp();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbmoVarZzp);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzq = zzq();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZzq);
                return true;
            case 19:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            default:
                return false;
        }
    }
}
