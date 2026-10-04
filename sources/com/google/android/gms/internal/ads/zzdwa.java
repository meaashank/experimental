package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwa {
    private final zzddn zza;
    private final zzdew zzb;
    private final zzdfj zzc;
    private final zzdga zzd;
    private final zzdit zze;
    private final zzdlu zzf;
    private final zzeaj zzg;
    private final zzfte zzh;
    private final zzele zzi;
    private final zzcub zzj;

    public zzdwa(zzddn zzddnVar, zzdew zzdewVar, zzdfj zzdfjVar, zzdga zzdgaVar, zzdit zzditVar, zzdlu zzdluVar, zzeaj zzeajVar, zzfte zzfteVar, zzele zzeleVar, zzcub zzcubVar) {
        this.zza = zzddnVar;
        this.zzb = zzdewVar;
        this.zzc = zzdfjVar;
        this.zzd = zzdgaVar;
        this.zze = zzditVar;
        this.zzf = zzdluVar;
        this.zzg = zzeajVar;
        this.zzh = zzfteVar;
        this.zzi = zzeleVar;
        this.zzj = zzcubVar;
    }

    public final void zza(zzdwb zzdwbVar, zzclm zzclmVar) throws Throwable {
        zzdvy zzdvyVarZzb = zzdwbVar.zzb();
        final zzdew zzdewVar = this.zzb;
        Objects.requireNonNull(zzdewVar);
        zzdvyVarZzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvz
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                zzdewVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlN)).booleanValue() || zzclmVar == null || zzclmVar.zzP() == null) {
            return;
        }
        zzcnk zzcnkVarZzP = zzclmVar.zzP();
        zzcub zzcubVar = this.zzj;
        zzele zzeleVar = this.zzi;
        zzcnkVarZzP.zzd(zzcubVar, zzeleVar, this.zzh);
        zzcnkVarZzP.zze(zzcubVar, zzeleVar, this.zzg);
    }
}
