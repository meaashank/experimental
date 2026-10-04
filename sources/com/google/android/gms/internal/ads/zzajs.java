package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajs extends zzajz {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzajz[] zze;

    public zzajs(String str, boolean z10, boolean z11, String[] strArr, zzajz[] zzajzVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzajzVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajs.class == obj.getClass()) {
            zzajs zzajsVar = (zzajs) obj;
            if (this.zzb == zzajsVar.zzb && this.zzc == zzajsVar.zzc && Objects.equals(this.zza, zzajsVar.zza) && Arrays.equals(this.zzd, zzajsVar.zzd) && Arrays.equals(this.zze, zzajsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i10 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
