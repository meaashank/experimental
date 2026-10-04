package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzyb extends zzabg {
    private final zzbg zza;

    public zzyb(zzabe zzabeVar, zzbg zzbgVar) {
        super(zzabeVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final boolean equals(@Nullable Object obj) {
        if (super.equals(obj) && (obj instanceof zzyb)) {
            return this.zza.equals(((zzyb) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabj
    public final zzv zzb(int i10) {
        return this.zza.zza(zzd().zzf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzabg, com.google.android.gms.internal.ads.zzabe
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
