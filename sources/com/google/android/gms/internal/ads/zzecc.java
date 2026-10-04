package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzecc extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzebw zza;
    final /* synthetic */ zzecd zzb;

    public zzecc(zzecd zzecdVar, zzebw zzebwVar) {
        this.zza = zzebwVar;
        Objects.requireNonNull(zzecdVar);
        this.zzb = zzecdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zza() throws RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb(int i10) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() throws RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() throws RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }
}
