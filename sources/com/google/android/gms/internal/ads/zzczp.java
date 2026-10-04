package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczp {
    private final zzegq zza;
    private final zzflw zzb;
    private final zzfqi zzc;
    private final zzcsj zzd;
    private final zzeqi zze;
    private final zzdje zzf;

    @Nullable
    private zzflo zzg;
    private final zzeib zzh;
    private final zzdcu zzi;
    private final Executor zzj;
    private final zzehm zzk;
    private final zzemv zzl;

    public zzczp(zzegq zzegqVar, zzflw zzflwVar, zzfqi zzfqiVar, zzcsj zzcsjVar, zzeqi zzeqiVar, zzdje zzdjeVar, @Nullable zzflo zzfloVar, zzeib zzeibVar, zzdcu zzdcuVar, Executor executor, zzehm zzehmVar, zzemv zzemvVar) {
        this.zza = zzegqVar;
        this.zzb = zzflwVar;
        this.zzc = zzfqiVar;
        this.zzd = zzcsjVar;
        this.zze = zzeqiVar;
        this.zzf = zzdjeVar;
        this.zzg = zzfloVar;
        this.zzh = zzeibVar;
        this.zzi = zzdcuVar;
        this.zzj = executor;
        this.zzk = zzehmVar;
        this.zzl = zzemvVar;
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfqi zzfqiVar = this.zzc;
            zzfqc zzfqcVar = zzfqc.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfqiVar);
            return zzfpt.zza(zzhcy.zza(this.zzg), zzfqcVar, zzfqiVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfpz zzfpzVarZza = this.zzc.zza(zzfqc.SERVER_TRANSACTION, listenableFuture);
        final zzehm zzehmVar = this.zzk;
        Objects.requireNonNull(zzehmVar);
        return zzfpzVarZza.zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzehmVar.zza((zzcbv) obj);
            }
        }).zzi();
    }

    public final ListenableFuture zzb() {
        zzflw zzflwVar = this.zzb;
        if (!zzflwVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfqi zzfqiVar = this.zzc;
                zzfqc zzfqcVar = zzfqc.PRELOADED_LOADER;
                Objects.requireNonNull(zzfqiVar);
                return zzfpt.zza(this.zza.zza(), zzfqcVar, zzfqiVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final ListenableFuture zzc(ListenableFuture listenableFuture) {
        zzfpz zzfpzVarZzc = this.zzc.zza(zzfqc.RENDERER, listenableFuture).zzb(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzflo zzfloVar = (zzflo) obj;
                this.zza.zzi(zzfloVar);
                return zzfloVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgI)).booleanValue()) {
            zzfpzVarZzc = zzfpzVarZzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS);
        }
        return zzfpzVarZzc.zzi();
    }

    public final zzdje zzd() {
        return this.zzf;
    }

    public final ListenableFuture zze(final zzfns zzfnsVar) {
        zzfpp zzfppVarZzi = this.zzc.zza(zzfqc.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(zzfnsVar, (zzcbv) obj);
            }
        }).zzi();
        zzhcy.zzr(zzfppVarZzi, new zzczk(this), this.zzj);
        return zzfppVarZzi;
    }

    public final ListenableFuture zzf(zzcbv zzcbvVar) {
        zzfpp zzfppVarZzi = this.zzc.zza(zzfqc.NOTIFY_CACHE_HIT, this.zzh.zzb(zzcbvVar)).zzi();
        zzhcy.zzr(zzfppVarZzi, new zzczl(this), this.zzj);
        return zzfppVarZzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzfmy.zzb(th, this.zzl);
    }

    public final void zzh(zzflo zzfloVar) {
        this.zzg = zzfloVar;
    }

    public final /* synthetic */ zzflo zzi(zzflo zzfloVar) throws Exception {
        this.zzd.zza(zzfloVar);
        return zzfloVar;
    }

    public final /* synthetic */ ListenableFuture zzj(zzfns zzfnsVar, zzcbv zzcbvVar) {
        zzcbvVar.zzi = zzfnsVar;
        return this.zzh.zza(zzcbvVar);
    }

    public final /* synthetic */ zzdje zzk() {
        return this.zzf;
    }
}
