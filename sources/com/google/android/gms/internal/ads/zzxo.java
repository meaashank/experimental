package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzxo(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxo)) {
            return false;
        }
        zzxo zzxoVar = (zzxo) obj;
        return zzc(zzxoVar) && this.zze == zzxoVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzxo zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzxo(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public final boolean zzc(zzxo zzxoVar) {
        if (zzxoVar == null) {
            return false;
        }
        if (this == zzxoVar) {
            return true;
        }
        return this.zza.equals(zzxoVar.zza) && this.zzb == zzxoVar.zzb && this.zzc == zzxoVar.zzc && this.zzd == zzxoVar.zzd;
    }

    public zzxo(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzxo(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzxo(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
