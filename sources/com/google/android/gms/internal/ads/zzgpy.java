package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgpy implements zzgpx {
    private final zzinq zza;
    private final zzgrh zzb;
    private final long zzc;

    public zzgpy(zzinq zzinqVar, zzgrh zzgrhVar, zzgdq zzgdqVar, long j10) {
        this.zza = zzinqVar;
        this.zzb = zzgrhVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zza(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzggtVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z10 = (zzggtVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z10) {
            this.zzb.zzb(15106);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zzb(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzggtVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
