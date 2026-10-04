package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbmu extends zzbev implements zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbmv zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbmv ? (zzbmv) iInterfaceQueryLocalInterface : new zzbmt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperZza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, iObjectWrapperZza);
                return true;
            case 2:
                Uri uriZzb = zzb();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, uriZzb);
                return true;
            case 3:
                double dZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzc);
                return true;
            case 4:
                int iZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeInt(iZzd);
                return true;
            case 5:
                int iZze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 6:
                Map mapZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeMap(mapZzf);
                return true;
            default:
                return false;
        }
    }
}
