package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajr extends zzajz implements zzajg {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajz[] zzg;

    public zzajr(String str, int i10, int i11, long j10, long j11, zzajz[] zzajzVarArr) {
        String str2;
        super("CHAP");
        zzguk.zza(i10 <= i11);
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        int length = zzajzVarArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            zzajz zzajzVar = zzajzVarArr[i12];
            if (zzajzVar instanceof zzake) {
                zzake zzakeVar = (zzake) zzajzVar;
                if (zzakeVar.zzf.equals("TIT2") && !zzakeVar.zzb.isEmpty()) {
                    str2 = (String) zzakeVar.zzb.get(0);
                    break;
                }
            }
            i12++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzajzVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajr.class == obj.getClass()) {
            zzajr zzajrVar = (zzajr) obj;
            if (this.zzb == zzajrVar.zzb && this.zzc == zzajrVar.zzc && this.zzd == zzajrVar.zzd && this.zze == zzajrVar.zze && Objects.equals(this.zza, zzajrVar.zza) && Arrays.equals(this.zzg, zzajrVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + 527;
        String str = this.zza;
        long j10 = this.zze;
        return str.hashCode() + (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31);
    }
}
