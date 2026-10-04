package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeew {

    @e.f0
    zzcas zza;

    @e.f0
    zzcas zzb;
    private final Context zzc;
    private final zzeet zzd;
    private final zzeaj zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    public zzeew(zzeet zzeetVar, zzeaj zzeajVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeetVar;
        this.zze = zzeajVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzeet zzeetVar = this.zzd;
            zzeetVar.zza();
            zzeetVar.zzb(new zzeev(this));
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfZ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzcaq.zzc(this.zzc);
                }
                this.zzb.zzh(e10, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzcaq.zza(this.zzc);
                }
                this.zza.zzh(e10, "InstallReferrer.initializeAndReport");
            }
        }
    }

    public final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    public final /* synthetic */ zzeet zzc() {
        return this.zzd;
    }

    public final /* synthetic */ zzeaj zzd() {
        return this.zze;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
