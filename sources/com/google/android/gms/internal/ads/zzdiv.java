package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiv implements zzdgv {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbX)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoI)).intValue();

    @e.f0
    public zzdiv() {
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void zzdQ(zzflo zzfloVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbY)).booleanValue()) {
            try {
                zzflg zzflgVar = zzfloVar.zzb.zzb;
                this.zza = zzflgVar.zzc;
                this.zzb = zzflgVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
