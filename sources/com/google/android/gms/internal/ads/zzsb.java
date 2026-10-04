package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsb {
    public final zzv zza;

    @Deprecated
    public final int zzb = 0;

    @Nullable
    public final zzhbf zzc;
    public final zzbf zzd;

    @Nullable
    public final zzxo zze;

    public /* synthetic */ zzsb(zzsa zzsaVar, byte[] bArr) {
        this.zza = zzsaVar.zze();
        this.zzc = zzsaVar.zzf();
        this.zzd = zzsaVar.zzg();
        this.zze = zzsaVar.zzh();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsb)) {
            return false;
        }
        zzsb zzsbVar = (zzsb) obj;
        int i10 = zzsbVar.zzb;
        return this.zza.equals(zzsbVar.zza) && Objects.equals(this.zzc, zzsbVar.zzc) && this.zzd.equals(zzsbVar.zzd) && Objects.equals(this.zze, zzsbVar.zze);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 961;
        zzhbf zzhbfVar = this.zzc;
        int iHashCode2 = this.zzd.hashCode() + ((iHashCode + (zzhbfVar == null ? 0 : zzhbfVar.hashCode())) * 31);
        zzxo zzxoVar = this.zze;
        return (iHashCode2 * 31) + (zzxoVar != null ? zzxoVar.hashCode() : 0);
    }
}
