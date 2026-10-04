package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbni extends zzbev implements zzbnj {
    public zzbni() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 9:
                Bundle bundleZzh = zzh();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, bundleZzh);
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzj = zzj();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzeaVarZzj);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzk(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                boolean zZzl = zzl(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzm(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbmo zzbmoVarZzn = zzn();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzbmoVarZzn);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperZzo = zzo();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZzo);
                return true;
            case 17:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            default:
                return false;
        }
    }
}
