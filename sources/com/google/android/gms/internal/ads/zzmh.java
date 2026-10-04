package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzmh {
    public final zzxo zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzmh(zzxo zzxoVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzguk.zza(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzguk.zza(z14);
        this.zza = zzxoVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmh.class == obj.getClass()) {
            zzmh zzmhVar = (zzmh) obj;
            if (this.zzb == zzmhVar.zzb && this.zzd == zzmhVar.zzd && this.zze == zzmhVar.zze && this.zzg == zzmhVar.zzg && this.zzh == zzmhVar.zzh && this.zzi == zzmhVar.zzi && Objects.equals(this.zza, zzmhVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j10 = this.zze;
        return (((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzmh zza(long j10, long j11) {
        return (j10 == this.zzb && j11 == this.zzc) ? this : new zzmh(this.zza, j10, j11, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzmh zzb(long j10) {
        return j10 == this.zzd ? this : new zzmh(this.zza, this.zzb, this.zzc, j10, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
