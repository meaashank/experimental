package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxg implements zzxm, zzxl {
    public final zzxo zza;
    private final long zzb;
    private final zzabp zzc;
    private zzxq zzd;
    private zzxm zze;

    @Nullable
    private zzxl zzf;
    private long zzg = -9223372036854775807L;

    public zzxg(zzxo zzxoVar, zzabp zzabpVar, long j10) {
        this.zza = zzxoVar;
        this.zzc = zzabpVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzg;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        zzxm zzxmVar = this.zze;
        return zzxmVar != null && zzxmVar.zzd(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        zzxm zzxmVar = this.zze;
        return zzxmVar != null && zzxmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j10) {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        zzxmVar.zzf(j10);
    }

    public final void zzg(long j10) {
        this.zzg = j10;
    }

    public final long zzh() {
        return this.zzg;
    }

    public final void zzi(zzxq zzxqVar) {
        zzguk.zzi(this.zzd == null);
        this.zzd = zzxqVar;
    }

    public final void zzj(zzxo zzxoVar) {
        long jZzv = zzv(this.zzb);
        zzxq zzxqVar = this.zzd;
        zzxqVar.getClass();
        zzxm zzxmVarZzH = zzxqVar.zzH(zzxoVar, this.zzc, jZzv);
        this.zze = zzxmVarZzH;
        if (this.zzf != null) {
            zzxmVarZzH.zzl(this, jZzv);
        }
    }

    public final void zzk() {
        zzxm zzxmVar = this.zze;
        if (zzxmVar != null) {
            zzxq zzxqVar = this.zzd;
            zzxqVar.getClass();
            zzxqVar.zzE(zzxmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(zzxl zzxlVar, long j10) {
        this.zzf = zzxlVar;
        zzxm zzxmVar = this.zze;
        if (zzxmVar != null) {
            zzxmVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() throws IOException {
        zzxm zzxmVar = this.zze;
        if (zzxmVar != null) {
            zzxmVar.zzm();
            return;
        }
        zzxq zzxqVar = this.zzd;
        if (zzxqVar != null) {
            zzxqVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzo(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j10) {
        long j11 = this.zzg;
        long j12 = (j11 == -9223372036854775807L || j10 != this.zzb) ? j10 : j11;
        this.zzg = -9223372036854775807L;
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzo(zzabeVarArr, zArr, zzzgVarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(zzxm zzxmVar) {
        zzxl zzxlVar = this.zzf;
        String str = zzfm.zza;
        zzxlVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j10, boolean z10) {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        zzxmVar.zzq(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void zzs(zzzi zzziVar) {
        zzxl zzxlVar = this.zzf;
        String str = zzfm.zza;
        zzxlVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzt(long j10) {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzt(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzu(long j10, zznm zznmVar) {
        zzxm zzxmVar = this.zze;
        String str = zzfm.zza;
        return zzxmVar.zzu(j10, zznmVar);
    }
}
