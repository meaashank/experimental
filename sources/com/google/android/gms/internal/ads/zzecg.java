package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzecg extends zzcdc {
    final /* synthetic */ zzech zza;

    public zzecg(zzech zzechVar) {
        Objects.requireNonNull(zzechVar);
        this.zza = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzm(zzechVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzo(zzechVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(zzccx zzccxVar) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzp(zzechVar.zzd(), zzccxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(int i10) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzn(zzechVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzn(zzechVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzq(zzechVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzr(zzechVar.zzd());
    }
}
