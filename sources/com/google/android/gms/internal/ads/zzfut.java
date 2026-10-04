package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfut implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ zzfvd zzc;

    public zzfut(zzfvd zzfvdVar, long j10, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j10;
        this.zzb = zzdxVar;
        Objects.requireNonNull(zzfvdVar);
        this.zzc = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvd zzfvdVar = this.zzc;
        if (zzfvdVar.zzN() != null) {
            long j10 = this.zza;
            String strZzV = zzfvd.zzV(this.zzb);
            int iZzs = zzfvdVar.zzs();
            int iZzt = zzfvdVar.zzt();
            String strZzM = zzfvdVar.zzM();
            zzfvdVar.zzN().zzi(j10, strZzV, zzfvdVar.zzP(), iZzs, iZzt, strZzM);
        }
    }
}
