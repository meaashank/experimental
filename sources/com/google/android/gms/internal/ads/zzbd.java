package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbd {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzc zzg = zzc.zza;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zza, zzbdVar.zza) && Objects.equals(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd && this.zzf == zzbdVar.zzf && Objects.equals(this.zzg, zzbdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + DefaultImageHeaderParser.f139854k) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j10 = this.zzd;
        return this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final zzbd zza(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, zzc zzcVar, boolean z10) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = 0L;
        this.zzg = zzcVar;
        this.zzf = z10;
        return this;
    }

    public final int zzb() {
        int i10 = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i10) {
        long j10 = this.zzg.zza(i10).zza;
        return 0L;
    }

    public final int zzd(int i10) {
        return this.zzg.zza(i10).zza(-1);
    }

    public final int zze(long j10) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j10) {
        return -1;
    }

    public final int zzg(int i10) {
        return this.zzg.zza(i10).zzb;
    }

    public final long zzh(int i10, int i11) {
        zza zzaVarZza = this.zzg.zza(i10);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzi() {
        long j10 = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzj(int i10) {
        boolean z10 = this.zzg.zza(i10).zzj;
        return false;
    }
}
