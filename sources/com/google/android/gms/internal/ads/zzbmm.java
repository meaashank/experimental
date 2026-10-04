package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbmm extends zzbeu implements zzbmo {
    public zzbmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final String zza() throws RemoteException {
        Parcel parcelZzda = zzda(2, zzcZ());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final List zzb() throws RemoteException {
        Parcel parcelZzda = zzda(3, zzcZ());
        ArrayList arrayListZzf = zzbew.zzf(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzf;
    }
}
