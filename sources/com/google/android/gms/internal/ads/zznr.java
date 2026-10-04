package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zznr {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;

    @Nullable
    public final zzxo zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;

    @Nullable
    public final zzxo zzh;
    public final long zzi;
    public final long zzj;

    public zznr(long j10, zzbf zzbfVar, int i10, @Nullable zzxo zzxoVar, long j11, zzbf zzbfVar2, int i11, @Nullable zzxo zzxoVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzbfVar;
        this.zzc = i10;
        this.zzd = zzxoVar;
        this.zze = j11;
        this.zzf = zzbfVar2;
        this.zzg = i11;
        this.zzh = zzxoVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznr.class == obj.getClass()) {
            zznr zznrVar = (zznr) obj;
            if (this.zza == zznrVar.zza && this.zzc == zznrVar.zzc && this.zze == zznrVar.zze && this.zzg == zznrVar.zzg && this.zzi == zznrVar.zzi && this.zzj == zznrVar.zzj && Objects.equals(this.zzb, zznrVar.zzb) && Objects.equals(this.zzd, zznrVar.zzd) && Objects.equals(this.zzf, zznrVar.zzf) && Objects.equals(this.zzh, zznrVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
