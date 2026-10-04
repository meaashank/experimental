package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzctu implements zzhcv {
    final /* synthetic */ zzfte zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcub zzd;

    public zzctu(zzcub zzcubVar, zzfte zzfteVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfteVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcubVar);
        this.zzd = zzcubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(final Throwable th) {
        final zzfte zzfteVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlV)).booleanValue();
                Throwable th2 = th;
                zzctu zzctuVar = this.zza;
                if (zBooleanValue) {
                    zzcub zzcubVar = zzctuVar.zzd;
                    zzcas zzcasVarZzc = zzcaq.zzc(zzcubVar.zzi());
                    zzcubVar.zzb = zzcasVarZzc;
                    zzcasVarZzc.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcub zzcubVar2 = zzctuVar.zzd;
                    zzcas zzcasVarZza = zzcaq.zza(zzcubVar2.zzi());
                    zzcubVar2.zza = zzcasVarZza;
                    zzcasVarZza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfteVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfte zzfteVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcts
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfteVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}
