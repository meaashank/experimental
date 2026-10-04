package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zza extends com.google.android.gms.internal.playcore_hsdp.zza implements zzc {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.hsdp.protocol.IHpoaService");
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zzc(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zzd(Bundle bundle, zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzeVar);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zze(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        zzb(2, parcelZza);
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzc
    public final void zzf(Bundle bundle, zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.playcore_hsdp.zzc.zzc(parcelZza, bundle);
        com.google.android.gms.internal.playcore_hsdp.zzc.zzd(parcelZza, zzeVar);
        zzb(1, parcelZza);
    }
}
