package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabm {
    public final int zza;
    public final zznh[] zzb;
    public final zzabe[] zzc;
    public final zzbn zzd;

    @Nullable
    public final Object zze;

    public zzabm(zznh[] zznhVarArr, zzabe[] zzabeVarArr, zzbn zzbnVar, @Nullable Object obj) {
        int length = zznhVarArr.length;
        zzguk.zza(length == zzabeVarArr.length);
        this.zzb = zznhVarArr;
        this.zzc = (zzabe[]) zzabeVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i10) {
        return this.zzb[i10] != null;
    }

    public final boolean zzb(@Nullable zzabm zzabmVar, int i10) {
        return zzabmVar != null && Objects.equals(this.zzb[i10], zzabmVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzabmVar.zzc[i10]);
    }
}
