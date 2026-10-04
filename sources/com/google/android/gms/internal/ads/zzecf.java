package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzecf extends zzcdg {
    final /* synthetic */ zzech zza;

    public zzecf(zzech zzechVar) {
        Objects.requireNonNull(zzechVar);
        this.zza = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzk(zzechVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i10) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzl(zzechVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzech zzechVar = this.zza;
        zzechVar.zze().zzl(zzechVar.zzd(), zzeVar.zza);
    }
}
