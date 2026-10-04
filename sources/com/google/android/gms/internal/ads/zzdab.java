package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbil;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdab implements zzdfd, com.google.android.gms.ads.internal.client.zza, zzdgv, zzdej, zzddp, zzdjg {
    private final Clock zza;
    private final zzcfp zzb;

    public zzdab(Clock clock, zzcfp zzcfpVar) {
        this.zza = clock;
        this.zzb = zzcfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(zzcch zzcchVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(zzbil.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(zzbil.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(zzbil.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
