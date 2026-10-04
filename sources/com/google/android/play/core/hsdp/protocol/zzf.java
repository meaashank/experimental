package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.internal.playcore_hsdp.zza implements zzh {
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.hsdp.protocol.IHsdpService");
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzc(String str, String str2, Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzjVar);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzd(Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzjVar);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zze(String str, List list, zzl zzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzlVar);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzh
    public final void zzf(String str, String str2, String str3, Bundle bundle, zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzjVar);
        zzb(2, parcelZza);
    }
}
