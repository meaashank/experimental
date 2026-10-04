package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzepg extends zzbxm {
    final /* synthetic */ zzeph zza;
    private final zzemt zzb;

    public /* synthetic */ zzepg(zzeph zzephVar, zzemt zzemtVar, byte[] bArr) {
        Objects.requireNonNull(zzephVar);
        this.zza = zzephVar;
        this.zzb = zzemtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(zzbwj zzbwjVar) throws RemoteException {
        this.zza.zzc(zzbwjVar);
        ((zzeof) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(String str) throws RemoteException {
        ((zzeof) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeof) this.zzb.zzc).zzx(zzeVar);
    }
}
