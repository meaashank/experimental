package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzri {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzri(zzrh zzrhVar, byte[] bArr) {
        this.zza = zzrhVar.zzi();
        this.zzb = zzrhVar.zzj();
        this.zzc = zzrhVar.zzk();
        this.zze = zzrhVar.zzl();
        this.zzf = zzrhVar.zzm();
        this.zzg = zzrhVar.zzn();
        this.zzh = zzrhVar.zzo();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzri.class == obj.getClass()) {
            zzri zzriVar = (zzri) obj;
            if (this.zza == zzriVar.zza && this.zzb == zzriVar.zzb && this.zzc == zzriVar.zzc && this.zze == zzriVar.zze && this.zzg == zzriVar.zzg && this.zzh == zzriVar.zzh && this.zzf.equals(zzriVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.zza);
        Integer numValueOf2 = Integer.valueOf(this.zzb);
        Integer numValueOf3 = Integer.valueOf(this.zzc);
        Integer numValueOf4 = Integer.valueOf(this.zze);
        zzd zzdVar = this.zzf;
        Integer numValueOf5 = Integer.valueOf(this.zzg);
        Integer numValueOf6 = Integer.valueOf(this.zzh);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, zzdVar, numValueOf5, numValueOf6, bool, bool);
    }
}
